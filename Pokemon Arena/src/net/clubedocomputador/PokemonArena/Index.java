package net.clubedocomputador.PokemonArena;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Index extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_index);

	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		getMenuInflater().inflate(R.menu.activity_index, menu);
//		return true;
//	}

	public void onClickPokeAgenda(View view) {
		Intent intent = new Intent(this, ShowPokeAgenda.class);
		this.startActivity(intent);

	}

	public void onClickPlayer(View view) {
		Intent intent = new Intent(this, ShowPlayer.class);
		this.startActivity(intent);

	}

}
