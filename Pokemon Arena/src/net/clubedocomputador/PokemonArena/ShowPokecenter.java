package net.clubedocomputador.PokemonArena;

import java.util.ArrayList;
import java.util.List;

import model.Place;
import model.Player;
import model.Pokemon;
import util.BDtemp;
import view.PokemonWithdrawArrayAdapter;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ShowPokecenter extends Activity {

	private Player player;
	private Place place;
	private Dialog dialogDeposit;
	private Dialog dialogWithdraw;
	private Context context;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		player = BDtemp.player;
		place = BDtemp.place;
		context = getBaseContext();

		setTitle(place.getName());

		setContentView(R.layout.activity_pokecenter);
		
		setViewPlayer();
		
	

	}

	public void heal(View view) {
		Toast.makeText(this, "Seus pokemons foram curados!", Toast.LENGTH_SHORT)
				.show();
		player.healPokemons();
	}

	public void deposit(View view) {
		dialogDeposit = new Dialog(this);
		dialogDeposit = new Dialog(this);
		dialogDeposit.setOwnerActivity(this);

		dialogDeposit.setContentView(R.layout.dialog_pokemon);
		dialogDeposit.setTitle(getResources().getText(R.string.pokemon));

		TextView nome1 = (TextView) dialogDeposit
				.findViewById(R.id.nomePokemon1);
		TextView nome2 = (TextView) dialogDeposit
				.findViewById(R.id.nomePokemon2);
		TextView nome3 = (TextView) dialogDeposit
				.findViewById(R.id.nomePokemon3);
		TextView nome4 = (TextView) dialogDeposit
				.findViewById(R.id.nomePokemon4);
		TextView nome5 = (TextView) dialogDeposit
				.findViewById(R.id.nomePokemon5);
		TextView nome6 = (TextView) dialogDeposit
				.findViewById(R.id.nomePokemon6);

		TextView level1 = (TextView) dialogDeposit.findViewById(R.id.level1);
		TextView level2 = (TextView) dialogDeposit.findViewById(R.id.level2);
		TextView level3 = (TextView) dialogDeposit.findViewById(R.id.level3);
		TextView level4 = (TextView) dialogDeposit.findViewById(R.id.level4);
		TextView level5 = (TextView) dialogDeposit.findViewById(R.id.level5);
		TextView level6 = (TextView) dialogDeposit.findViewById(R.id.level6);

		TextView hpText1 = (TextView) dialogDeposit.findViewById(R.id.hpText1);
		TextView hpText2 = (TextView) dialogDeposit.findViewById(R.id.hpText2);
		TextView hpText3 = (TextView) dialogDeposit.findViewById(R.id.hpText3);
		TextView hpText4 = (TextView) dialogDeposit.findViewById(R.id.hpText4);
		TextView hpText5 = (TextView) dialogDeposit.findViewById(R.id.hpText5);
		TextView hpText6 = (TextView) dialogDeposit.findViewById(R.id.hpText6);

		TextView status1 = (TextView) dialogDeposit.findViewById(R.id.status1);
		TextView status2 = (TextView) dialogDeposit.findViewById(R.id.status2);
		TextView status3 = (TextView) dialogDeposit.findViewById(R.id.status3);
		TextView status4 = (TextView) dialogDeposit.findViewById(R.id.status4);
		TextView status5 = (TextView) dialogDeposit.findViewById(R.id.status5);
		TextView status6 = (TextView) dialogDeposit.findViewById(R.id.status6);

		ImageView imagem1 = (ImageView) dialogDeposit
				.findViewById(R.id.imageView1);
		ImageView imagem2 = (ImageView) dialogDeposit
				.findViewById(R.id.imageView2);
		ImageView imagem3 = (ImageView) dialogDeposit
				.findViewById(R.id.imageView3);
		ImageView imagem4 = (ImageView) dialogDeposit
				.findViewById(R.id.imageView4);
		ImageView imagem5 = (ImageView) dialogDeposit
				.findViewById(R.id.imageView5);
		ImageView imagem6 = (ImageView) dialogDeposit
				.findViewById(R.id.imageView6);

		ProgressBar hpBar1 = (ProgressBar) dialogDeposit
				.findViewById(R.id.hpBar1);
		ProgressBar hpBar2 = (ProgressBar) dialogDeposit
				.findViewById(R.id.hpBar2);
		ProgressBar hpBar3 = (ProgressBar) dialogDeposit
				.findViewById(R.id.hpBar3);
		ProgressBar hpBar4 = (ProgressBar) dialogDeposit
				.findViewById(R.id.hpBar4);
		ProgressBar hpBar5 = (ProgressBar) dialogDeposit
				.findViewById(R.id.hpBar5);
		ProgressBar hpBar6 = (ProgressBar) dialogDeposit
				.findViewById(R.id.hpBar6);

		RelativeLayout pokemon1 = (RelativeLayout) dialogDeposit
				.findViewById(R.id.pokemon1);
		RelativeLayout pokemon2 = (RelativeLayout) dialogDeposit
				.findViewById(R.id.pokemon2);
		RelativeLayout pokemon3 = (RelativeLayout) dialogDeposit
				.findViewById(R.id.pokemon3);
		RelativeLayout pokemon4 = (RelativeLayout) dialogDeposit
				.findViewById(R.id.pokemon4);
		RelativeLayout pokemon5 = (RelativeLayout) dialogDeposit
				.findViewById(R.id.pokemon5);
		RelativeLayout pokemon6 = (RelativeLayout) dialogDeposit
				.findViewById(R.id.pokemon6);

		if (player.getPokemon1() != null) {
			nome1.setText(player.getPokemon1().getName());
			level1.setText("l:" + player.getPokemon1().getLevel());
			hpText1.setText(player.getPokemon1().getLife() + "/"
					+ player.getPokemon1().getHp());
			hpBar1.setMax(player.getPokemon1().getHp());
			hpBar1.setProgress(player.getPokemon1().getLife());
			status1.setText(player.getPokemon1().getStatus().name());
			imagem1.setImageResource(player.getPokemon1().getSpecie()
					.getImage());
			pokemon1.setOnClickListener(new depositPokemonListener(1));
		} else {
			pokemon1.setVisibility(View.GONE);
			((RelativeLayout) dialogDeposit.findViewById(R.id.pokemon1empty))
					.setVisibility(View.VISIBLE);
		}

		if (player.getPokemon2() != null) {
			nome2.setText(player.getPokemon2().getName());
			level2.setText("l:" + player.getPokemon2().getLevel());
			hpText2.setText(player.getPokemon2().getLife() + "/"
					+ player.getPokemon2().getHp());
			hpBar2.setMax(player.getPokemon2().getHp());
			hpBar2.setProgress(player.getPokemon2().getLife());
			status2.setText(player.getPokemon2().getStatus().name());
			imagem2.setImageResource(player.getPokemon2().getSpecie()
					.getImage());
			pokemon2.setOnClickListener(new depositPokemonListener(2));
		} else {
			pokemon2.setVisibility(View.GONE);
			((RelativeLayout) dialogDeposit.findViewById(R.id.pokemon2empty))
					.setVisibility(View.VISIBLE);
		}
		if (player.getPokemon3() != null) {
			nome3.setText(player.getPokemon3().getName());
			level3.setText("l:" + player.getPokemon3().getLevel());
			hpText3.setText(player.getPokemon3().getLife() + "/"
					+ player.getPokemon3().getHp());
			hpBar3.setMax(player.getPokemon3().getHp());
			hpBar3.setProgress(player.getPokemon3().getLife());
			status3.setText(player.getPokemon3().getStatus().name());
			imagem3.setImageResource(player.getPokemon3().getSpecie()
					.getImage());
			pokemon3.setOnClickListener(new depositPokemonListener(3));
		} else {
			pokemon3.setVisibility(View.GONE);
			((RelativeLayout) dialogDeposit.findViewById(R.id.pokemon3empty))
					.setVisibility(View.VISIBLE);

		}
		if (player.getPokemon4() != null) {
			nome4.setText(player.getPokemon4().getName());
			level4.setText("l:" + player.getPokemon4().getLevel());
			hpText4.setText(player.getPokemon4().getLife() + "/"
					+ player.getPokemon4().getHp());
			hpBar4.setMax(player.getPokemon4().getHp());
			hpBar4.setProgress(player.getPokemon4().getLife());
			status4.setText(player.getPokemon4().getStatus().name());
			imagem4.setImageResource(player.getPokemon4().getSpecie()
					.getImage());
			pokemon4.setOnClickListener(new depositPokemonListener(4));
		} else {
			pokemon4.setVisibility(View.GONE);
			((RelativeLayout) dialogDeposit.findViewById(R.id.pokemon4empty))
					.setVisibility(View.VISIBLE);
		}
		if (player.getPokemon5() != null) {
			nome5.setText(player.getPokemon5().getName());
			level5.setText("l:" + player.getPokemon5().getLevel());
			hpText5.setText(player.getPokemon5().getLife() + "/"
					+ player.getPokemon5().getHp());
			hpBar5.setMax(player.getPokemon5().getHp());
			hpBar5.setProgress(player.getPokemon5().getLife());
			status5.setText(player.getPokemon5().getStatus().name());
			imagem5.setImageResource(player.getPokemon5().getSpecie()
					.getImage());
			pokemon5.setOnClickListener(new depositPokemonListener(5));
		} else {
			pokemon5.setVisibility(View.GONE);
			((RelativeLayout) dialogDeposit.findViewById(R.id.pokemon5empty))
					.setVisibility(View.VISIBLE);
		}
		if (player.getPokemon6() != null) {
			nome6.setText(player.getPokemon6().getName());
			level6.setText("l:" + player.getPokemon6().getLevel());
			hpText6.setText(player.getPokemon6().getLife() + "/"
					+ player.getPokemon6().getHp());
			hpBar6.setMax(player.getPokemon6().getHp());
			hpBar6.setProgress(player.getPokemon6().getLife());
			status6.setText(player.getPokemon6().getStatus().name());
			imagem6.setImageResource(player.getPokemon6().getSpecie()
					.getImage());
			pokemon6.setOnClickListener(new depositPokemonListener(6));
		} else {
			pokemon6.setVisibility(View.GONE);
			((RelativeLayout) dialogDeposit.findViewById(R.id.pokemon6empty))
					.setVisibility(View.VISIBLE);
		}

		dialogDeposit.show();
	}

	private class depositPokemonListener implements View.OnClickListener {
		private int slot;

		public depositPokemonListener(int slot) {
			this.slot = slot;

		}

		public void onClick(View v) {
			Pokemon pokemon = null;

			switch (slot) {
			case 1:
				pokemon = player.getPokemon1();
				player.setPokemon1(null);
				break;
			case 2:
				pokemon = player.getPokemon2();
				player.setPokemon2(null);
				break;
			case 3:
				pokemon = player.getPokemon3();
				player.setPokemon3(null);
				break;
			case 4:
				pokemon = player.getPokemon4();
				player.setPokemon4(null);
				break;
			case 5:
				pokemon = player.getPokemon5();
				player.setPokemon5(null);
				break;
			case 6:
				pokemon = player.getPokemon6();
				player.setPokemon6(null);
				break;
			}
			player.getPokemons().add(pokemon);
			dialogDeposit.dismiss();

			setViewPlayer();

		}
	}

	public void reload() {
		BDtemp.player = player;
		Intent intent = new Intent(this, ShowPokecenter.class);
		this.startActivity(intent);
		this.finish();
		onDestroy();
	}

	public void withdraw(View view) {
		dialogWithdraw = new Dialog(this);
		dialogWithdraw = new Dialog(this);
		dialogWithdraw.setOwnerActivity(this);

		dialogWithdraw.setContentView(R.layout.dialog_withdraw);
		dialogWithdraw.setTitle(getResources().getText(R.string.pokemon));

		ListView lv = (ListView) dialogWithdraw.findViewById(R.id.listPokemon);
        
        List<Pokemon> list = player.getPokemons(); 
        
        if (list == null){
        	list = new ArrayList<Pokemon>();
        }
        
        Pokemon[] pokemonList =  new Pokemon[list.size()];
        int i = 0;
        for(Pokemon p: list){
        	pokemonList[i] = p; i++;
        }
        
        PokemonWithdrawArrayAdapter adapter = new PokemonWithdrawArrayAdapter(getBaseContext(), pokemonList);
        
        lv.setAdapter(adapter);

        lv.setItemsCanFocus(true);
        
        lv.setOnItemClickListener (new OnItemClickListener() {
        	
        	public void onItemClick(AdapterView<?> parent, View view, int position,
        			long id) {
				Pokemon pkm = (Pokemon) parent.getAdapter().getItem(position);
        		if (player.getPokemon1() == null){
        			player.setPokemon1(pkm);
        			player.getPokemons().remove(pkm);        			
        		
        		}else
        		
        			if (player.getPokemon2() == null){
        				player.setPokemon2(pkm);
        				player.getPokemons().remove(pkm);        			
        		
        		}else
        			
        			if (player.getPokemon3() == null){
        				player.setPokemon3(pkm);
        				player.getPokemons().remove(pkm);        			
        		
        		}else
        			
        			if (player.getPokemon4() == null){
        				player.setPokemon4(pkm);
        				player.getPokemons().remove(pkm);        			
        		
        		}else 
        			
        			if (player.getPokemon5() == null){
        				player.setPokemon5(pkm);
        				player.getPokemons().remove(pkm);        			
        		}else
        			
        			if (player.getPokemon6() == null){
        				player.setPokemon6(pkm);
        				player.getPokemons().remove(pkm);    
        				
        		}
        		else{
    					Toast.makeText(context, "Deposite um pokemon primeiro!", Toast.LENGTH_SHORT).show();
    			}
        			
        		dialogWithdraw.dismiss();
        		setViewPlayer();
        		
        	}
        });

		dialogWithdraw.show();
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
