package view;

import net.clubedocomputador.PokemonArena.R;
import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

public class DlgConfirmacao extends Dialog {

	public DlgConfirmacao(Context context, CharSequence title, CharSequence msg) {
		super(context);
		this.setTitle(title);
		this.setContentView(R.layout.dialog_message);

		TextView msgTV = (TextView) this.findViewById(R.id.msg);
		msgTV.setText(msg);

	}
	
	
	

}
