package view;

import model.Gym;
import model.Market;
import model.Place;
import model.Pokecenter;
import net.clubedocomputador.PokemonArena.R;
import util.ParseColor;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PlacesArrayAdapter extends ArrayAdapter<Place> {
			private final Context context;
			private final Place[] values;

			public PlacesArrayAdapter(Context context, Place[] values) {
				super(context, R.layout.activity_city, values);
				this.context = context;
				this.values = values;
			}

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				Place pl = values[position];
				LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				View rowView = new View(context);
				if (pl instanceof Gym){
					rowView = inflater.inflate(R.layout.row_pokegym, parent, false);
					Gym gym = (Gym)pl;
					ImageView imagem = (ImageView) rowView.findViewById(R.id.imgBadge);
					imagem.setImageResource(gym.getGymLeader().getItems().get(0).getImage());
					
					TextView nome = (TextView) rowView.findViewById(R.id.nomePlace);				
					nome.setTextColor(ParseColor.getColorMedium(gym.getBaseType1(), context));
					nome.setShadowLayer(1, 1, 1, ParseColor.getColorDark(gym.getBaseType1(), context));
					TextView level = (TextView) rowView.findViewById(R.id.level);				
					level.setText(context.getText(R.string.level) + " " + pl.getCity().getLevel().toString());
					level.setTextColor(ParseColor.getColorMedium(gym.getBaseType1(), context));
					level.setShadowLayer(1, 1, 1, ParseColor.getColorDark(gym.getBaseType1(), context));
				}
				if (pl instanceof Pokecenter)
					rowView = inflater.inflate(R.layout.row_pokecenter, parent, false);
				if (pl instanceof Market)
					rowView = inflater.inflate(R.layout.row_pokemart, parent, false);

				RelativeLayout container = (RelativeLayout) rowView.findViewById(R.id.containerPlace);
				container.setBackgroundColor(context.getResources().getColor(pl.getBackgroundColor()));

				ImageView imagem = (ImageView) rowView.findViewById(R.id.imgPlace);
				imagem.setImageResource(pl.getBuilding());
				
				TextView nome = (TextView) rowView.findViewById(R.id.nomePlace);				
				nome.setText(pl.getName());
				
				
				//nome.setTextColor(getColorMedium(ct.getType()));
				//nome.setShadowLayer(1, 1, 1, getColorDark(ct.getType()));		
				
				return rowView;

			}
			
			


}
