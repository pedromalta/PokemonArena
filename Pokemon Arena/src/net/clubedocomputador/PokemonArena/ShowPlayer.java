package net.clubedocomputador.PokemonArena;

import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Trainer;
import util.BDtemp;
import util.PersistUtil;
import view.PlayersArrayAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class ShowPlayer extends Activity {
	
	private Player player;
	private Context context;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        context = getBaseContext();
        PersistUtil pu = new PersistUtil();
        if (BDtemp.players == null){
        	pu.loadGame(this);
        	if (BDtemp.players == null)
        		BDtemp.players = new ArrayList<Player>();
        }
    	pu.saveGame(this);
        
        
        setContentView(R.layout.activity_player);
        
        ListView lv = (ListView) findViewById(R.id.listTrainers);
        lv.setItemsCanFocus(true);

        lv.setOnItemClickListener (new OnItemClickListener() {
            
            public void onItemClick(AdapterView<?> parent, View view, int position,
                    long id) {
            	player = (Player)parent.getAdapter().getItem(position);
            	BDtemp.player = player;
            	goStartGame();
                
            }
        });
        
        lv.setOnItemLongClickListener(new OnItemLongClickListener() {
        	public boolean onItemLongClick(AdapterView<?> parent, View view,
        			int position, long id) {
        		player = (Player)parent.getAdapter().getItem(position);
        		BDtemp.players.remove(player);
        		BDtemp.player = null;
        		Toast.makeText(context, player.getName() + " removido!", Toast.LENGTH_LONG).show();
        		player = null;
        		goReload();
        		return false;
        	}
		});
        
        List<Player> list = BDtemp.players;
        Trainer[] trainersList =  new Trainer[list.size()];
        int i = 0;
        for(Trainer t: list){
        	trainersList[i] = t; i++;
        }
        
        PlayersArrayAdapter adapter = new PlayersArrayAdapter(getBaseContext(), trainersList);
        lv.setAdapter(adapter);
    }
	

	private void goStartGame(){
		BDtemp.player = player;
		Intent intent = new Intent(this, ShowGame.class);
		this.startActivity(intent);
		this.finish();
		onDestroy();
	}
	
	private void goReload(){
		Intent intent = new Intent(this, ShowPlayer.class);
		this.startActivity(intent);
		this.finish();
		onDestroy();
	}

	public void newTrainer(View view) {
		Intent intent = new Intent(this, CreatePlayer.class);
		this.startActivity(intent);
		this.finish();
		onDestroy();
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
