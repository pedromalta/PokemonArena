package view;

import model.Trainer;
import net.clubedocomputador.PokemonArena.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PlayersArrayAdapter extends ArrayAdapter<Trainer> {
	private final Context context;
	private final Trainer[] values;

	public PlayersArrayAdapter(Context context, Trainer[] values) {
		super(context, R.layout.row_trainer, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Trainer trn = values[position];
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.row_trainer, parent,
				false);
		

		RelativeLayout container = (RelativeLayout) rowView
				.findViewById(R.id.containerTrainer);

		if (position % 2 == 0)
			container.setBackgroundColor(context.getResources().getColor(
					R.color.row1));
		else
			container.setBackgroundColor(context.getResources().getColor(
					R.color.row2));

		ImageView imagem = (ImageView) rowView.findViewById(R.id.imgTrainer);
		TextView nome = (TextView) rowView.findViewById(R.id.nomeTrainer);
		TextView points = (TextView) rowView.findViewById(R.id.pointsTrainer);
		

		imagem.setImageResource(trn.getModel());
		nome.setText(trn.getName());
		points.setText(trn.getPoints().toString());

		return rowView;

	}

	

}