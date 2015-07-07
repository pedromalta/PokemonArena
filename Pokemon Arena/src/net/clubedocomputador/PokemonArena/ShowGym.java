package net.clubedocomputador.PokemonArena;

import model.Gym;
import model.NPC;
import model.Player;
import util.BDtemp;
import util.GenerateGym;
import view.DlgEvolution;
import view.NPCArrayAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ShowGym extends Activity{
	
		private Player player;
		private Gym gym;
		private Context context;
		private NPC npc;
		
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState); 

            player = BDtemp.player;
            context = getBaseContext();
	        gym = (Gym)BDtemp.place;
	        setTitle(gym.getName());
			
			/* SETTERS para BATTLE */
			if (BDtemp.pkmEvolve != null && BDtemp.pkmEvolve.size() > 0){
					//p.evolve(null);
					DlgEvolution evolve = new DlgEvolution(this, this);
					evolve.setOwnerActivity(this);
					evolve.show();
			}	
			
			BDtemp.pkmEvolve = null;
			BDtemp.pkmUsed = null;
			BDtemp.turn = 0;
			BDtemp.opponent = null;
			BDtemp.pkmPlayer = null;
			BDtemp.pkmOpponent = null;
			
			
			/* SETTERS para BATTLE */
			
			
	        super.onCreate(savedInstanceState); 

            player = BDtemp.player;
            context = getBaseContext();
	        gym = (Gym)BDtemp.place;
	        setTitle(gym.getName());
	        
	        GenerateGym gg = new GenerateGym();
	        
	        
	        setContentView(R.layout.activity_gym);
	        
	        setViewPlayer();
			
			ListView lv = (ListView) findViewById(R.id.listNPCs);
	        
	        NPC[] list = gg.getNPCs(gym);
	        
	        NPCArrayAdapter adapter = new NPCArrayAdapter(context, list);
	        
	        lv.setAdapter(adapter);

	        lv.setItemsCanFocus(true);
	        
	        lv.setOnItemClickListener (new OnItemClickListener() {
	        	
	        	public void onItemClick(AdapterView<?> parent, View view, int position,
	        			long id) {
	        		npc = (NPC)parent.getAdapter().getItem(position);
	        		if (npc.getDefeated()){
	        			Toast.makeText(context, npc.getSpeechWon(), Toast.LENGTH_SHORT).show();
	        			return;
	        		}
	        		if (position > 0)
		        		if (!((NPC)parent.getAdapter().getItem(position -1)).getDefeated()){
		        			Toast.makeText(context, "Você ainda não chegou nesse treinador!", Toast.LENGTH_SHORT).show();
		        			return;
		        		}
	        			
	        		int sumLife = 0;
	        		if (player.getPokemon1() != null)
	        			sumLife += player.getPokemon1().getLife();
	        		if (player.getPokemon2() != null)
	        			sumLife += player.getPokemon2().getLife();
	        		if (player.getPokemon3() != null)
	        			sumLife += player.getPokemon3().getLife();
	        		if (player.getPokemon4() != null)
	        			sumLife += player.getPokemon4().getLife();
	        		if (player.getPokemon5() != null)
	        			sumLife += player.getPokemon5().getLife();
	        		if (player.getPokemon6() != null)
	        			sumLife += player.getPokemon6().getLife();
	        		
	        		if (sumLife > 0)
	        			goBattle();
	        		else
	        			Toast.makeText(context, R.string.atLeastPokemonForBattle, Toast.LENGTH_SHORT).show();
	        		
	        	}
	        });
	        
		}
		
		public void goBattle(){
			BDtemp.player = player;
			BDtemp.opponent = npc;
			BDtemp.turn = 0;
			Intent intent = new Intent(this, Battle.class);
			this.startActivity(intent);
			this.finish();
			onDestroy();
			
		}
		
		@Override
		public boolean onKeyDown(int keyCode, KeyEvent event) {
		    if (keyCode == KeyEvent.KEYCODE_BACK) {
				Intent intent = new Intent(this, ShowCity.class);
				this.startActivity(intent);
				this.finish();
				onDestroy();
		        return true;
		    }
		    return super.onKeyDown(keyCode, event);
		}
		
		public void setViewPlayer(){
			View viewPlayer = (View) findViewById(R.id.viewplayer);
			
			TextView nome = (TextView) findViewById(R.id.nomePlayer);
			TextView points = (TextView) findViewById(R.id.pointsPlayer);

			ImageView imagemPlayer = (ImageView) viewPlayer.findViewById(R.id.imagePlayer);
			ImageView imagemPoke1 = (ImageView) viewPlayer.findViewById(R.id.imagePoke1);
			ImageView imagemPoke2 = (ImageView) viewPlayer.findViewById(R.id.imagePoke2);
			ImageView imagemPoke3 = (ImageView) viewPlayer.findViewById(R.id.imagePoke3);
			ImageView imagemPoke4 = (ImageView) viewPlayer.findViewById(R.id.imagePoke4);
			ImageView imagemPoke5 = (ImageView) viewPlayer.findViewById(R.id.imagePoke5);
			ImageView imagemPoke6 = (ImageView) viewPlayer.findViewById(R.id.imagePoke6);

			imagemPlayer.setImageResource(player.getModel());

			if (player.getPokemon1() != null)
				imagemPoke1.setImageResource(player.getPokemon1().getSpecie()
						.getImage());
			else
				imagemPoke1.setImageResource(R.drawable.p0);
			if (player.getPokemon2() != null)
				imagemPoke2.setImageResource(player.getPokemon2().getSpecie()
						.getImage());
			else
				imagemPoke2.setImageResource(R.drawable.p0);
			if (player.getPokemon3() != null)
				imagemPoke3.setImageResource(player.getPokemon3().getSpecie()
						.getImage());
			else
				imagemPoke3.setImageResource(R.drawable.p0);
			if (player.getPokemon4() != null)
				imagemPoke4.setImageResource(player.getPokemon4().getSpecie()
						.getImage());
			else
				imagemPoke4.setImageResource(R.drawable.p0);
			if (player.getPokemon5() != null)
				imagemPoke5.setImageResource(player.getPokemon5().getSpecie()
						.getImage());
			else
				imagemPoke5.setImageResource(R.drawable.p0);
			if (player.getPokemon6() != null)
				imagemPoke6.setImageResource(player.getPokemon6().getSpecie()
						.getImage());
			else
				imagemPoke6.setImageResource(R.drawable.p0);

			nome.setText(player.getName());
			points.setText(player.getPoints().toString());
		}

		

}
