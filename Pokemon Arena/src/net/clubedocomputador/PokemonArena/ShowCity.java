package net.clubedocomputador.PokemonArena;

import java.util.ArrayList;
import java.util.List;

import model.City;
import model.Gym;
import model.Market;
import model.Place;
import model.Player;
import model.Pokecenter;
import util.BDtemp;
import view.PlacesArrayAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ShowCity  extends Activity{

	private Player player;
	private City city;
	private Place place;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        player = BDtemp.player;
        city = BDtemp.city;
        setTitle(city.getName());
        
        setContentView(R.layout.activity_city);
        
		setViewPlayer();
		
		ListView lv = (ListView) findViewById(R.id.listPlaces);
        
        List<Place> list = city.getPlaces(); 
        
        if (list == null){
        	list = new ArrayList<Place>();
        }
        
        Place[] placeList =  new Place[list.size()];
        int i = 0;
        for(Place p: list){
        	placeList[i] = p; i++;
        }
        
        PlacesArrayAdapter adapter = new PlacesArrayAdapter(getBaseContext(), placeList);
        
        lv.setAdapter(adapter);

        lv.setItemsCanFocus(true);
        
        lv.setOnItemClickListener (new OnItemClickListener() {
        	
        	public void onItemClick(AdapterView<?> parent, View view, int position,
        			long id) {
        		place = (Place)parent.getAdapter().getItem(position);
        		goPlace();
        		
        	}
        });
        
	}
	
	private void goPlace(){
		BDtemp.player = player;
		BDtemp.place = place;
		Intent intent = new Intent(this, ShowCity.class);
		if (place instanceof Market)
			intent.setClass(this, ShowMarket.class);
		if (place instanceof Gym)
			intent.setClass(this, ShowGym.class);
		if (place instanceof Pokecenter){
			//Toast.makeText(this, "Seus pokemons foram curados!", Toast.LENGTH_SHORT).show();
			//player.healPokemons();
			intent.setClass(this, ShowPokecenter.class);

		}			
		this.startActivity(intent);
		this.finish();
		onDestroy();		
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    if (keyCode == KeyEvent.KEYCODE_BACK) {
			Intent intent = new Intent(this, ShowGame.class);
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
