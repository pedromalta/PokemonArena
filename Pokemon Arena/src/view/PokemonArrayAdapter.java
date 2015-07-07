package view;

import model.Attack;
import model.Pokemon;
import net.clubedocomputador.PokemonArena.R;
import util.GenerateAttack;
import util.ParseColor;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PokemonArrayAdapter extends ArrayAdapter<Pokemon> {
			private final Context context;
			private final Pokemon[] values;
			private final GenerateAttack ga;

			public PokemonArrayAdapter(Context context, Pokemon[] values) {
				super(context, R.layout.activity_market, values);
				this.context = context;
				this.values = values;
				this.ga = new GenerateAttack();
			}

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				Pokemon pkm = values[position];
				LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				View rowView = new View(context);
				rowView = inflater.inflate(R.layout.row_pokemondetail, parent, false);				
				
				RelativeLayout container = (RelativeLayout) rowView.findViewById(R.id.containerPokemon);
				
				container.setBackgroundColor(ParseColor.getColorLight(pkm.getSpecie().getTypes().get(0), context));		
				
				TextView nome = (TextView) rowView.findViewById(R.id.nomePokemon);
				TextView level = (TextView) rowView.findViewById(R.id.levelPokemon);
				TextView tipo1 = (TextView) rowView.findViewById(R.id.tipo1Pokemon);
				TextView tipo2 = (TextView) rowView.findViewById(R.id.tipo2Pokemon);
				TextView attack1 = (TextView) rowView.findViewById(R.id.attack1Pokemon);
				TextView attack2 = (TextView) rowView.findViewById(R.id.attack2Pokemon);
				TextView attack3 = (TextView) rowView.findViewById(R.id.attack3Pokemon);
				TextView attack4 = (TextView) rowView.findViewById(R.id.attack4Pokemon);
				TextView attack = (TextView) rowView.findViewById(R.id.attackPokemon);
				TextView defense = (TextView) rowView.findViewById(R.id.defensePokemon);
				TextView speed = (TextView) rowView.findViewById(R.id.speedPokemon);
				TextView special = (TextView) rowView.findViewById(R.id.specialPokemon);
				ImageView imagem = (ImageView) rowView.findViewById(R.id.imgPokemon); 
				
				nome.setText(pkm.getSpecie().getName());
				level.setText(context.getText(R.string.level) + " " + pkm.getLevel().toString());
				
				if (pkm.getSpecie().getTypes().size() > 1){
					tipo1.setText(pkm.getSpecie().getTypes().get(0).name());
					tipo1.setTextColor(ParseColor.getColorMedium(pkm.getSpecie().getTypes().get(0), context));
					tipo1.setShadowLayer(1, 1, 1, ParseColor.getColorDark(pkm.getSpecie().getTypes().get(0), context));
					
					tipo2.setText(pkm.getSpecie().getTypes().get(1).name());
					tipo2.setTextColor(ParseColor.getColorMedium(pkm.getSpecie().getTypes().get(1), context));
					tipo2.setShadowLayer(1, 1, 1, ParseColor.getColorDark(pkm.getSpecie().getTypes().get(1), context));
				}else{
					tipo1.setText(pkm.getSpecie().getTypes().get(0).name());
					tipo1.setTextColor(ParseColor.getColorMedium(pkm.getSpecie().getTypes().get(0), context));
					tipo1.setShadowLayer(1, 1, 1, ParseColor.getColorDark(pkm.getSpecie().getTypes().get(0), context));					
					tipo2.setText("");					
				}
				
				
				
				
				
				
				if (pkm.getAttack1() != null){
					Attack att = ga.getAttack(pkm.getAttack1());
					attack1.setText(att.getName());
					attack1.setTextColor(ParseColor.getColorMedium(att.getType(), context));
					attack1.setShadowLayer(1, 1, 1, ParseColor.getColorDark(att.getType(), context));	
				}
				if (pkm.getAttack2() != null){
					Attack att = ga.getAttack(pkm.getAttack2());
					attack2.setText(att.getName());
					attack2.setTextColor(ParseColor.getColorMedium(att.getType(), context));
					attack2.setShadowLayer(1, 1, 1, ParseColor.getColorDark(att.getType(), context));	
				}
				if (pkm.getAttack3() != null){
					Attack att = ga.getAttack(pkm.getAttack3());
					attack3.setText(att.getName());
					attack3.setTextColor(ParseColor.getColorMedium(att.getType(), context));
					attack3.setShadowLayer(1, 1, 1, ParseColor.getColorDark(att.getType(), context));	
				}
				if (pkm.getAttack4() != null){
					Attack att = ga.getAttack(pkm.getAttack4());
					attack4.setText(att.getName());
					attack4.setTextColor(ParseColor.getColorMedium(att.getType(), context));
					attack4.setShadowLayer(1, 1, 1, ParseColor.getColorDark(att.getType(), context));
				}
				
				attack.setText("Attack: " + pkm.getAttack());
				defense.setText("Defense: " + pkm.getDefense());
				speed.setText("Speed: " + pkm.getSpeed());
				special.setText("Special: " + pkm.getSpecial());
				
				
				imagem.setImageResource(pkm.getSpecie().getImage());
				
				return rowView;

			}
			
			


}
