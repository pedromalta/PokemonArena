package view;

import model.Pokemon;
import net.clubedocomputador.PokemonArena.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PokemonWithdrawArrayAdapter extends ArrayAdapter<Pokemon> {

	private final Context context;
	private final Pokemon[] values;
	//private final GenerateAttack ga;

	public PokemonWithdrawArrayAdapter(Context context, Pokemon[] values) {
		super(context, R.layout.activity_market, values);
		this.context = context;
		this.values = values;
		//this.ga = new GenerateAttack();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Pokemon pkm = values[position];
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = new View(context);
		rowView = inflater.inflate(R.layout.row_pokemon, parent, false);

		RelativeLayout container = (RelativeLayout) rowView
				.findViewById(R.id.containerPokemon);

		if (position % 2 == 0)
			container.setBackgroundResource(R.color.row2);
		else
			container.setBackgroundResource(R.color.row1);

		TextView nome = (TextView) rowView.findViewById(R.id.nomePokemon);

		TextView level = (TextView) rowView.findViewById(R.id.level);
		TextView hpText = (TextView) rowView.findViewById(R.id.hpText);
		TextView status = (TextView) rowView.findViewById(R.id.status);
		ImageView imagem = (ImageView) rowView.findViewById(R.id.imageView);
		ProgressBar hpBar = (ProgressBar) rowView.findViewById(R.id.hpBar);

		//RelativeLayout pokemon = (RelativeLayout) rowView
		//		.findViewById(R.id.pokemon);
		nome.setText(pkm.getName());
		level.setText("l:" + pkm.getLevel());
		hpText.setText(pkm.getLife() + "/" + pkm.getHp());
		hpBar.setMax(pkm.getHp());
		hpBar.setProgress(pkm.getLife());
		status.setText(pkm.getStatus().name());
		imagem.setImageResource(pkm.getSpecie().getImage());
		// pokemon.setOnClickListener(new depositPokemonListener(1));
		
		return rowView;

	}

}
