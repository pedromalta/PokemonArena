package net.clubedocomputador.PokemonArena;

import java.util.List;

import model.Market;
import model.Player;
import model.Pokemon;
import model.Specie;
import util.BDtemp;
import util.GeneratePokemon;
import view.PokemonArrayAdapter;
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

public class ShowMarket extends Activity {

	private Player player;
	private Market market;
	private Pokemon pkm;
	private Context context;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		player = BDtemp.player;
		market = (Market)BDtemp.place;
		context = getBaseContext();
		setTitle(market.getName());

		setContentView(R.layout.activity_market);
		
		setViewPlayer();

		ListView lv = (ListView) findViewById(R.id.listItems);

		List<Specie> list = market.getSpecies();
		Pokemon[] pokemonList = new Pokemon[list.size()];

		GeneratePokemon gp = new GeneratePokemon();

		for (int i = 0; i < list.size(); i++)
			pokemonList[i] = gp.newPokemon(list.get(i).getName(),
					10, list.get(i));

		PokemonArrayAdapter adapter = new PokemonArrayAdapter(getBaseContext(),
				pokemonList);

		lv.setAdapter(adapter);

		lv.setItemsCanFocus(true);

		lv.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				pkm = (Pokemon) parent.getAdapter().getItem(position);
				if (player.getPoints() >= pkm.getSpecie().getPointCost()) {
					buyPokemon();					
					goMarket();
				}else{
					Toast.makeText(context, R.string.pointsNotEnough, Toast.LENGTH_SHORT).show();
				}

			}
		});

	}

	private void buyPokemon() {
		pkm.setId(BDtemp.idPokemon); BDtemp.idPokemon++;
		
		if (player.getPokemon1() == null) {
			Toast.makeText(context, R.string.SeuNovoPokemon, Toast.LENGTH_SHORT).show();
			player.setPokemon1(pkm);
			player.setPoints(player.getPoints()
					- pkm.getSpecie().getPointCost());
			return;
		}
		if (player.getPokemon2() == null) {
			Toast.makeText(context, R.string.SeuNovoPokemon, Toast.LENGTH_SHORT).show();
			player.setPokemon2(pkm);
			player.setPoints(player.getPoints()
					- pkm.getSpecie().getPointCost());
			return;
		}
		if (player.getPokemon3() == null) {
			Toast.makeText(context, R.string.SeuNovoPokemon, Toast.LENGTH_SHORT).show();
			player.setPokemon3(pkm);
			player.setPoints(player.getPoints()
					- pkm.getSpecie().getPointCost());
			return;
		}
		if (player.getPokemon4() == null) {
			Toast.makeText(context, R.string.SeuNovoPokemon, Toast.LENGTH_SHORT).show();
			player.setPokemon4(pkm);
			player.setPoints(player.getPoints()
					- pkm.getSpecie().getPointCost());
			return;
		}
		if (player.getPokemon5() == null) {
			Toast.makeText(context, R.string.SeuNovoPokemon, Toast.LENGTH_SHORT).show();
			player.setPokemon5(pkm);
			player.setPoints(player.getPoints()
					- pkm.getSpecie().getPointCost());
			return;
		}
		if (player.getPokemon6() == null) {
			Toast.makeText(context, R.string.SeuNovoPokemon, Toast.LENGTH_SHORT).show();
			player.setPokemon6(pkm);
			player.setPoints(player.getPoints()
					- pkm.getSpecie().getPointCost());
			return;
		}
		Toast.makeText(context, R.string.SeuNovoPokemonEnviadoAoPokecenter, Toast.LENGTH_SHORT).show();
		player.getPokemons().add(pkm);
		player.setPoints(player.getPoints() - pkm.getSpecie().getPointCost());
		return;
	}

	private void goMarket() {
		BDtemp.player = player;
		BDtemp.place = market;
		Intent intent = new Intent(this, ShowMarket.class);
		this.startActivity(intent);
		this.finish();
		onDestroy();

	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    if (keyCode == KeyEvent.KEYCODE_BACK) {
	    	BDtemp.player = player;
			Intent intent = new Intent(this, ShowCity.class);
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
