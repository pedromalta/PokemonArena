package view;

import model.City;
import model.Gym;
import model.Place;
import net.clubedocomputador.PokemonArena.R;
import util.BDtemp;
import util.ParseColor;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CityArrayAdapter extends ArrayAdapter<City> {
			private final Context context;
			private final City[] values;
			//private final Player player;


			public CityArrayAdapter(Context context, City[] values) {
				super(context, R.layout.row_startgamecities, values);
				this.context = context;
				this.values = values;
				//this.player = BDtemp.player;
			}

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				City ct = values[position];
				LayoutInflater inflater = (LayoutInflater) context
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				View rowView = inflater.inflate(R.layout.row_startgamecities, parent,
						false);
				

				RelativeLayout container = (RelativeLayout) rowView
						.findViewById(R.id.containerCity);
				
				//if (ct.getId() <= player.getGame().getCityClearedId())
					container.setBackgroundColor(ParseColor.getColorLight(ct.getType(), context));

				ImageView imagem = (ImageView) rowView.findViewById(R.id.imgCity);
				ImageView defeated = (ImageView) rowView.findViewById(R.id.defeated);
        		if (ct.getId() < BDtemp.player.getGame().getCityClearedId())
        			defeated.setVisibility(View.VISIBLE);
				TextView nome = (TextView) rowView.findViewById(R.id.nomeCity);
				Gym gym = new Gym();
				for (Place place : ct.getPlaces()){
					if (place instanceof Gym)
						gym = (Gym)place;
				}
				

				imagem.setImageResource(gym.getGymLeader().getModel());
				nome.setText(ct.getName());
				nome.setTextColor(ParseColor.getColorMedium(ct.getType(), context));
				nome.setShadowLayer(1, 1, 1, ParseColor.getColorDark(ct.getType(), context));

				return rowView;

			}
			
}
