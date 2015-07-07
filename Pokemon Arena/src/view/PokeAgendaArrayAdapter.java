package view;

import model.Specie;
import net.clubedocomputador.PokemonArena.R;
import util.ParseColor;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PokeAgendaArrayAdapter extends ArrayAdapter<Specie> {
	private final Context context;
	private final Specie[] values;
	
	public PokeAgendaArrayAdapter(Context context, Specie[] values) {
		super(context, R.layout.row_pokeagenda, values); 
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Specie spc = values[position];
		
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.row_pokeagenda, parent, false);
		
		LinearLayout container = (LinearLayout) rowView.findViewById(R.id.containerPokeAgenda);
		
		container.setBackgroundColor(ParseColor.getColorLight(spc.getTypes().get(0), context));		
		
		TextView nome = (TextView) rowView.findViewById(R.id.nomePokeAgenda);
		TextView id = (TextView) rowView.findViewById(R.id.idPokeAgenda);
		TextView tipo1 = (TextView) rowView.findViewById(R.id.tipo1PokeAgenda);
		TextView tipo2 = (TextView) rowView.findViewById(R.id.tipo2PokeAgenda);
		ImageView imagem = (ImageView) rowView.findViewById(R.id.imgPokeAgenda); 
		
		nome.setText(spc.getName());
		id.setText("#" + spc.getId().toString());
		
		if (spc.getTypes().size() > 1){
			tipo1.setText(spc.getTypes().get(0).name());
			tipo1.setTextColor(ParseColor.getColorMedium(spc.getTypes().get(0), context));
			tipo1.setShadowLayer(1, 1, 1, ParseColor.getColorDark(spc.getTypes().get(0), context));
			
			tipo2.setText(spc.getTypes().get(1).name());
			tipo2.setTextColor(ParseColor.getColorMedium(spc.getTypes().get(1), context));
			tipo2.setShadowLayer(1, 1, 1, ParseColor.getColorDark(spc.getTypes().get(1), context));
		}else{
			tipo1.setText(spc.getTypes().get(0).name());
			tipo1.setTextColor(ParseColor.getColorMedium(spc.getTypes().get(0), context));
			tipo1.setShadowLayer(1, 1, 1, ParseColor.getColorDark(spc.getTypes().get(0), context));
			
			tipo2.setText("");
			
		}
		
		imagem.setImageResource(spc.getImage());


		return rowView;
	}
	

} 