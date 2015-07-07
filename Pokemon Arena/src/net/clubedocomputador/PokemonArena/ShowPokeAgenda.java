package net.clubedocomputador.PokemonArena;

import util.GenerateSpecies;
import view.PokeAgendaArrayAdapter;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.KeyEvent;

public class ShowPokeAgenda extends ListActivity{
	
	public Integer imgSelected;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        this.imgSelected = -1;
        
        setContentView(R.layout.activity_pokeagenda);
        
        
        GenerateSpecies ge = new GenerateSpecies();
        
        PokeAgendaArrayAdapter adapter = new PokeAgendaArrayAdapter(getBaseContext(), ge.getSpecies());

        setListAdapter(adapter);
    }
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    if (keyCode == KeyEvent.KEYCODE_BACK) {
			this.finish();
			onDestroy();
	        return true;
	    }
	    return super.onKeyDown(keyCode, event);
	}

}
