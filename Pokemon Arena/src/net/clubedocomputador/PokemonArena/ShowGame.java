package net.clubedocomputador.PokemonArena;

import java.util.ArrayList;
import java.util.List;

import model.City;
import model.Game;
import model.Player;
import util.BDtemp;
import view.CityArrayAdapter;
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

public class ShowGame extends Activity{
	
		private Player player;
		private City city;
		private Game game;
		private Context context;
		
		@Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState); 

            player = BDtemp.player;
            context = getBaseContext();
	        game = player.getGame();
	        
	        setContentView(R.layout.activity_startgame);
	        
	        setViewPlayer();
			
			ListView lv = (ListView) findViewById(R.id.listCity);
	        
	        List<City> list = game.getCities(); 
	        
	        if (list == null){
	        	list = new ArrayList<City>();
	        }
	        
	        City[] cityList =  new City[list.size()];
	        int i = 0;
	        for(City t: list){
	        	cityList[i] = t; i++;
	        }
	        
	        CityArrayAdapter adapter = new CityArrayAdapter(getBaseContext(), cityList);
	        
	        lv.setAdapter(adapter);

	        lv.setItemsCanFocus(true);
	        
	        lv.setOnItemClickListener (new OnItemClickListener() {
	        	
	        	public void onItemClick(AdapterView<?> parent, View view, int position,
	        			long id) {
	        		city = (City)parent.getAdapter().getItem(position);
	        		if (city.getId() <= game.getCityClearedId())
	        			goCity();
	        		else
	        			Toast.makeText(context, R.string.cityNotCleared, Toast.LENGTH_SHORT).show();
	        		
	        	}
	        });
	        
		}
		
		public void goCity(){
			BDtemp.player = player;
			BDtemp.city = city;
			Intent intent = new Intent(this, ShowCity.class);
			this.startActivity(intent);
			this.finish();
			onDestroy();
			
		}
		
		@Override
		public boolean onKeyDown(int keyCode, KeyEvent event) {
		    if (keyCode == KeyEvent.KEYCODE_BACK) {
				Intent intent = new Intent(this, ShowPlayer.class);
				this.startActivity(intent);
				this.finish();
				onDestroy();
		        return true;
		    }
		    return super.onKeyDown(keyCode, event);
		}
		
		private void setViewPlayer(){
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
