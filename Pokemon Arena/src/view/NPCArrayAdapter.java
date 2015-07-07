package view;

import model.Gym;
import model.GymLeader;
import model.NPC;
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

public class NPCArrayAdapter extends ArrayAdapter<NPC> {
			private final Context context;
			private final NPC[] values;
			private final Gym gym;

			public NPCArrayAdapter(Context context, NPC[] values) {
				super(context, R.layout.activity_gym, values);
				this.context = context;
				this.values = values;
				this.gym = (Gym)BDtemp.place;
			}

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				NPC npc = values[position];
				LayoutInflater inflater = (LayoutInflater) context
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				View rowView = inflater.inflate(R.layout.row_npcs, parent,
						false);

				RelativeLayout container = (RelativeLayout) rowView
						.findViewById(R.id.containerNPC);
				
				if (position % 2 == 0)
					container.setBackgroundColor(context.getResources().getColor(R.color.row1));
				else
					container.setBackgroundColor(context.getResources().getColor(R.color.row2));
				

				ImageView imagem = (ImageView) rowView.findViewById(R.id.imgNPC);
				ImageView defeated = (ImageView) rowView.findViewById(R.id.defeated);
				TextView nome = (TextView) rowView.findViewById(R.id.nomeNPC);
				
				imagem.setImageResource(npc.getModel());
				nome.setText(npc.getName());
				nome.setTextColor(context.getResources().getColor(android.R.color.white));
				nome.setShadowLayer(1, 1, 1, context.getResources().getColor(android.R.color.black));
				
				if (npc.getDefeated())
					defeated.setVisibility(View.VISIBLE);
				
				if (npc instanceof GymLeader){
					container.setBackgroundColor(ParseColor.getColorLight(gym.getBaseType1(), context));
					nome.setText(npc.getName());
					nome.setTextColor(ParseColor.getColorMedium(gym.getBaseType1(), context));
					nome.setShadowLayer(1, 1, 1, ParseColor.getColorDark(gym.getBaseType1(), context));
				}

				return rowView;

			}
			
			


}
