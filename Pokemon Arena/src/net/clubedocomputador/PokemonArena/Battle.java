package net.clubedocomputador.PokemonArena;

import java.util.HashSet;
import java.util.Random;

import model.Attack;
import model.Gym;
import model.GymLeader;
import model.Player;
import model.Pokemon;
import model.Trainer;
import util.BDtemp;
import util.GenerateAttack;
import util.ParseColor;
import util.PersistUtil;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import enums.Attacks;
import enums.Status;

public class Battle extends Activity {

	private Player player;
	private Trainer opponent;
	private Context context;
	private Pokemon pkmPlayer;
	private Pokemon pkmOpponent;
	private Boolean playerTurn;
	private GenerateAttack ga;
	private Attack attack1;
	private Attack attack2;
	private Attack attack3;
	private Attack attack4;
	private Attack attackO1;
	private Attack attackO2;
	private Attack attackO3;
	private Attack attackO4;
	private Dialog dialogBattle;
	private Dialog dialogPokemon;
	private Dialog dialogLearnAttack;
	private Boolean blockAction;
	private Boolean opponentAttack;
	private String attackName;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		player = BDtemp.player;
		opponent = BDtemp.opponent;
		context = getBaseContext();
		pkmPlayer = BDtemp.pkmPlayer;
		pkmOpponent = BDtemp.pkmOpponent;
		ga = new GenerateAttack();
		blockAction = false;
		if (BDtemp.endBattle)
			goBack();

		if (pkmPlayer == null) {
			if (player.getPokemon6() != null
					&& player.getPokemon6().getLife() > 0)
				pkmPlayer = player.getPokemon6();
			if (player.getPokemon5() != null
					&& player.getPokemon5().getLife() > 0)
				pkmPlayer = player.getPokemon5();
			if (player.getPokemon4() != null
					&& player.getPokemon4().getLife() > 0)
				pkmPlayer = player.getPokemon4();
			if (player.getPokemon3() != null
					&& player.getPokemon3().getLife() > 0)
				pkmPlayer = player.getPokemon3();
			if (player.getPokemon2() != null
					&& player.getPokemon2().getLife() > 0)
				pkmPlayer = player.getPokemon2();
			if (player.getPokemon1() != null
					&& player.getPokemon1().getLife() > 0)
				pkmPlayer = player.getPokemon1();
			BDtemp.pkmPlayer = pkmPlayer;
		}
		if (BDtemp.pkmEvolve == null){
			BDtemp.pkmEvolve = new HashSet<Pokemon>();
		}
		if (BDtemp.pkmUsed == null){
			BDtemp.pkmUsed = new HashSet<Pokemon>();
		}
		BDtemp.pkmUsed.add(pkmPlayer);

		playerTurn = true;
		opponentAttack = true;

		pkmOpponent = selectPokemon();

		if (pkmPlayer.getSpeed() < pkmOpponent.getSpeed())
			playerTurn = false;
		
		setAttacksPlayer();
		setAttacksOpponent();

		setContentView(R.layout.activity_battle);
		setTitle(player.getName() + " x " + opponent.getName());

		setViewStatsPlayer();
		setViewStatsOpponent();

		if (!playerTurn) {
			endTurn();
			playerTurn = true;
		}
		
	}
	
	private void setAttacksPlayer(){
		attack1 = ga.getAttack(pkmPlayer.getAttack1());
		attack2 = ga.getAttack(pkmPlayer.getAttack2());
		attack3 = ga.getAttack(pkmPlayer.getAttack3());
		attack4 = ga.getAttack(pkmPlayer.getAttack4());
	}
	
	private void setAttacksOpponent(){
		attackO1 = ga.getAttack(pkmOpponent.getAttack1());
		attackO2 = ga.getAttack(pkmOpponent.getAttack2());
		attackO3 = ga.getAttack(pkmOpponent.getAttack3());
		attackO4 = ga.getAttack(pkmOpponent.getAttack4());
	}

	private Boolean checkPlayerLife() {
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

		if (sumLife == 0) {
			Toast.makeText(context, "Você perdeu!", Toast.LENGTH_SHORT).show();
			if (opponent instanceof GymLeader)
				opponent.healPokemons();
			else
				player.setPoints(player.getPoints() - opponent.getPoints());
			
			if (player.getPoints() < 0)
				player.setPoints(0l);
			
			return false;
		}
		return true;
	}

	private void opponentAttack() {
		// if (pkmOpponent.getPp1() + pkmOpponent.getPp2() +
		// pkmOpponent.getPp3() + pkmOpponent.getPp4() == 0)
		// return;
		Random randGenerate = new Random();
		int n = 0;
		if (attackO1 != null)
			n++;
		if (attackO2 != null)
			n++;
		if (attackO3 != null)
			n++;
		if (attackO4 != null)
			n++;
		n = randGenerate.nextInt(n);
		boolean critical = false;

		switch (n) {
		case 0:
			// if (pkmOpponent.getPp1() == 0)
			// opponentAttack();
			// pkmOpponent.castPP1();

			critical = attackO1.calculatecriticalHit(pkmOpponent);
			Toast.makeText(context,
					pkmOpponent.getName() + " usou " + attackO1.getName(),
					Toast.LENGTH_SHORT).show();
			if (critical)
				Toast.makeText(context, "It's a critical hit!",
						Toast.LENGTH_SHORT).show();
			attackO1.effect(pkmOpponent, pkmPlayer, critical);
			break;
		case 1:
			// pkmOpponent.castPP2();
			critical = attackO2.calculatecriticalHit(pkmOpponent);
			Toast.makeText(context,
					pkmOpponent.getName() + " usou " + attackO2.getName(),
					Toast.LENGTH_SHORT).show();
			if (critical)
				Toast.makeText(context, "It's a critical hit!",
						Toast.LENGTH_SHORT).show();
			attackO2.effect(pkmOpponent, pkmPlayer, critical);
			break;
		case 2:
			// pkmOpponent.castPP3();
			critical = attackO3.calculatecriticalHit(pkmOpponent);
			Toast.makeText(context,
					pkmOpponent.getName() + " usou " + attackO3.getName(),
					Toast.LENGTH_SHORT).show();
			if (critical)
				Toast.makeText(context, "It's a critical hit!",
						Toast.LENGTH_SHORT).show();
			attackO3.effect(pkmOpponent, pkmPlayer, critical);
			break;
		case 3:
			// pkmOpponent.castPP4();
			critical = attackO4.calculatecriticalHit(pkmOpponent);
			Toast.makeText(context,
					pkmOpponent.getName() + " usou " + attackO4.getName(),
					Toast.LENGTH_SHORT).show();
			if (critical)
				Toast.makeText(context, "It's a critical hit!",
						Toast.LENGTH_SHORT).show();
			attackO4.effect(pkmOpponent, pkmPlayer, critical);
			break;
		}
		
		ImageView img = (ImageView) findViewById(R.id.pokemonOpponent);
		Animation hyperspaceJump = AnimationUtils.loadAnimation(context,
				R.anim.hyperjump);
		hyperspaceJump.setAnimationListener(getAnimationWaitForEnd());
		img.startAnimation(hyperspaceJump);

	}

	private void setViewStatsPlayer() {
		ImageView pokemonImgPlayer = (ImageView) findViewById(R.id.pokemonPlayer);
		ProgressBar lifePlayer = (ProgressBar) findViewById(R.id.lifePlayer);
		TextView nomePokemon = (TextView) findViewById(R.id.nomePlayer);
		TextView lvlPokemon = (TextView) findViewById(R.id.lvlPlayer);
		TextView statusPokemon = (TextView) findViewById(R.id.statusPlayer);
		TextView lifeNPlayer = (TextView) findViewById(R.id.lifeNPlayer);
		ImageView pokeBall1 = (ImageView) findViewById(R.id.pokeBall1);
		ImageView pokeBall2 = (ImageView) findViewById(R.id.pokeBall2);
		ImageView pokeBall3 = (ImageView) findViewById(R.id.pokeBall3);
		ImageView pokeBall4 = (ImageView) findViewById(R.id.pokeBall4);
		ImageView pokeBall5 = (ImageView) findViewById(R.id.pokeBall5);
		ImageView pokeBall6 = (ImageView) findViewById(R.id.pokeBall6);

		pokemonImgPlayer.setImageDrawable(getResources().getDrawable(
				pkmPlayer.getSpecie().getImageBack()));

		lifePlayer.setMax(pkmPlayer.getHp());
		lifePlayer.setProgress(pkmPlayer.getLife());

		nomePokemon.setText(pkmPlayer.getName());
		lvlPokemon.setText("lvl:" + pkmPlayer.getLevel());
		statusPokemon.setText(pkmPlayer.getStatus().name());
		lifeNPlayer.setText(pkmPlayer.getLife() + "/" + pkmPlayer.getHp());

		if (player.getPokemon1() != null) {
			if (player.getPokemon1().getLife() == 0)
				pokeBall1.setImageResource(R.drawable.item_pokeballfainted);
			else if (player.getPokemon1().getStatus().equals(Status.Ok))
				pokeBall1.setImageResource(R.drawable.item_pokeball);
			else
				pokeBall1.setImageResource(R.drawable.item_pokeballnotok);
		}
		if (player.getPokemon2() != null) {
			if (player.getPokemon2().getLife() == 0)
				pokeBall2.setImageResource(R.drawable.item_pokeballfainted);
			else if (player.getPokemon2().getStatus().equals(Status.Ok))
				pokeBall2.setImageResource(R.drawable.item_pokeball);
			else
				pokeBall2.setImageResource(R.drawable.item_pokeballnotok);
		}
		if (player.getPokemon3() != null) {
			if (player.getPokemon3().getLife() == 0)
				pokeBall3.setImageResource(R.drawable.item_pokeballfainted);
			else if (player.getPokemon3().getStatus().equals(Status.Ok))
				pokeBall3.setImageResource(R.drawable.item_pokeball);
			else
				pokeBall3.setImageResource(R.drawable.item_pokeballnotok);
		}
		if (player.getPokemon4() != null) {
			if (player.getPokemon4().getLife() == 0)
				pokeBall4.setImageResource(R.drawable.item_pokeballfainted);
			else if (player.getPokemon4().getStatus().equals(Status.Ok))
				pokeBall4.setImageResource(R.drawable.item_pokeball);
			else
				pokeBall4.setImageResource(R.drawable.item_pokeballnotok);
			
		}
		if (player.getPokemon5() != null) {
			if (player.getPokemon5().getLife() == 0)
				pokeBall5.setImageResource(R.drawable.item_pokeballfainted);
			else if (player.getPokemon5().getStatus().equals(Status.Ok))
				pokeBall5.setImageResource(R.drawable.item_pokeball);
			else
				pokeBall5.setImageResource(R.drawable.item_pokeballnotok);
		}
		if (player.getPokemon6() != null) {
			if (player.getPokemon6().getLife() == 0)
				pokeBall6.setImageResource(R.drawable.item_pokeballfainted);
			else if (player.getPokemon6().getStatus().equals(Status.Ok))
				pokeBall6.setImageResource(R.drawable.item_pokeball);
			else
				pokeBall6.setImageResource(R.drawable.item_pokeballnotok);
		}

	}

	private void setViewStatsOpponent() {

		ImageView pokemonImgOpponent = (ImageView) findViewById(R.id.pokemonOpponent);
		ProgressBar lifeOpponent = (ProgressBar) findViewById(R.id.lifeOpponent);

		TextView nomePokemon = (TextView) findViewById(R.id.nomeOpponent);
		TextView lvlPokemon = (TextView) findViewById(R.id.lvlOpponent);
		TextView statusPokemon = (TextView) findViewById(R.id.statusOpponent);
		TextView lifeNPlayer = (TextView) findViewById(R.id.lifeNOpponent);

		ImageView pokeBall1 = (ImageView) findViewById(R.id.pokeBallO1);
		ImageView pokeBall2 = (ImageView) findViewById(R.id.pokeBallO2);
		ImageView pokeBall3 = (ImageView) findViewById(R.id.pokeBallO3);
		ImageView pokeBall4 = (ImageView) findViewById(R.id.pokeBallO4);
		ImageView pokeBall5 = (ImageView) findViewById(R.id.pokeBallO5);
		ImageView pokeBall6 = (ImageView) findViewById(R.id.pokeBallO6);

		pokemonImgOpponent.setImageDrawable(getResources().getDrawable(
				pkmOpponent.getSpecie().getImage()));

		lifeOpponent.setMax(pkmOpponent.getHp());
		lifeOpponent.setProgress(pkmOpponent.getLife());

		nomePokemon.setText(pkmOpponent.getName());
		lvlPokemon.setText("lvl:" + pkmOpponent.getLevel());
		statusPokemon.setText(pkmOpponent.getStatus().name());
		lifeNPlayer.setText(pkmOpponent.getLife() + "/" + pkmOpponent.getHp());

		if (opponent.getPokemon1() != null) {
			if (opponent.getPokemon1().getLife() == 0)
				pokeBall1.setImageResource(R.drawable.item_pokeballfainted);
			else if (opponent.getPokemon1().getStatus().equals(Status.Ok))
				pokeBall1.setImageResource(R.drawable.item_pokeball);
			else
				pokeBall1.setImageResource(R.drawable.item_pokeballnotok);
		}
		if (opponent.getPokemon2() != null) {
			if (opponent.getPokemon2().getLife() == 0)
				pokeBall2.setImageResource(R.drawable.item_pokeballfainted);
			else if (opponent.getPokemon2().getStatus().equals(Status.Ok))
				pokeBall2.setImageResource(R.drawable.item_pokeball);
			else
				pokeBall2.setImageResource(R.drawable.item_pokeballnotok);
		}
		if (opponent.getPokemon3() != null) {
			if (opponent.getPokemon3().getLife() == 0)
				pokeBall3.setImageResource(R.drawable.item_pokeballfainted);
			else if (opponent.getPokemon3().getStatus().equals(Status.Ok))
				pokeBall3.setImageResource(R.drawable.item_pokeball);
			else
				pokeBall3.setImageResource(R.drawable.item_pokeballnotok);
		}
		if (opponent.getPokemon4() != null) {
			if (opponent.getPokemon4().getLife() == 0)
				pokeBall4.setImageResource(R.drawable.item_pokeballfainted);
			else if (opponent.getPokemon4().getStatus().equals(Status.Ok))
				pokeBall4.setImageResource(R.drawable.item_pokeball);
			else
				pokeBall4.setImageResource(R.drawable.item_pokeballnotok);
		}
		if (opponent.getPokemon5() != null) {
			if (opponent.getPokemon5().getLife() == 0)
				pokeBall5.setImageResource(R.drawable.item_pokeballfainted);
			else if (opponent.getPokemon5().getStatus().equals(Status.Ok))
				pokeBall5.setImageResource(R.drawable.item_pokeball);
			else
				pokeBall5.setImageResource(R.drawable.item_pokeballnotok);
		}
		if (opponent.getPokemon6() != null) {
			if (opponent.getPokemon6().getLife() == 0)
				pokeBall6.setImageResource(R.drawable.item_pokeballfainted);
			else if (opponent.getPokemon6().getStatus().equals(Status.Ok))
				pokeBall6.setImageResource(R.drawable.item_pokeball);
			else
				pokeBall6.setImageResource(R.drawable.item_pokeballnotok);
		}
	}

	public void showPokemonDialog(View view) {
		if (blockAction)
			return;
		dialogPokemon = new Dialog(this);
		dialogPokemon.setOwnerActivity(this);

		dialogPokemon.setContentView(R.layout.dialog_pokemon);
		dialogPokemon.setTitle(getResources().getText(R.string.pokemon));

		TextView nome1 = (TextView) dialogPokemon
				.findViewById(R.id.nomePokemon1);
		TextView nome2 = (TextView) dialogPokemon
				.findViewById(R.id.nomePokemon2);
		TextView nome3 = (TextView) dialogPokemon
				.findViewById(R.id.nomePokemon3);
		TextView nome4 = (TextView) dialogPokemon
				.findViewById(R.id.nomePokemon4);
		TextView nome5 = (TextView) dialogPokemon
				.findViewById(R.id.nomePokemon5);
		TextView nome6 = (TextView) dialogPokemon
				.findViewById(R.id.nomePokemon6);

		TextView level1 = (TextView) dialogPokemon.findViewById(R.id.level1);
		TextView level2 = (TextView) dialogPokemon.findViewById(R.id.level2);
		TextView level3 = (TextView) dialogPokemon.findViewById(R.id.level3);
		TextView level4 = (TextView) dialogPokemon.findViewById(R.id.level4);
		TextView level5 = (TextView) dialogPokemon.findViewById(R.id.level5);
		TextView level6 = (TextView) dialogPokemon.findViewById(R.id.level6);

		TextView hpText1 = (TextView) dialogPokemon.findViewById(R.id.hpText1);
		TextView hpText2 = (TextView) dialogPokemon.findViewById(R.id.hpText2);
		TextView hpText3 = (TextView) dialogPokemon.findViewById(R.id.hpText3);
		TextView hpText4 = (TextView) dialogPokemon.findViewById(R.id.hpText4);
		TextView hpText5 = (TextView) dialogPokemon.findViewById(R.id.hpText5);
		TextView hpText6 = (TextView) dialogPokemon.findViewById(R.id.hpText6);

		TextView status1 = (TextView) dialogPokemon.findViewById(R.id.status1);
		TextView status2 = (TextView) dialogPokemon.findViewById(R.id.status2);
		TextView status3 = (TextView) dialogPokemon.findViewById(R.id.status3);
		TextView status4 = (TextView) dialogPokemon.findViewById(R.id.status4);
		TextView status5 = (TextView) dialogPokemon.findViewById(R.id.status5);
		TextView status6 = (TextView) dialogPokemon.findViewById(R.id.status6);

		ImageView imagem1 = (ImageView) dialogPokemon
				.findViewById(R.id.imageView1);
		ImageView imagem2 = (ImageView) dialogPokemon
				.findViewById(R.id.imageView2);
		ImageView imagem3 = (ImageView) dialogPokemon
				.findViewById(R.id.imageView3);
		ImageView imagem4 = (ImageView) dialogPokemon
				.findViewById(R.id.imageView4);
		ImageView imagem5 = (ImageView) dialogPokemon
				.findViewById(R.id.imageView5);
		ImageView imagem6 = (ImageView) dialogPokemon
				.findViewById(R.id.imageView6);

		ProgressBar hpBar1 = (ProgressBar) dialogPokemon
				.findViewById(R.id.hpBar1);
		ProgressBar hpBar2 = (ProgressBar) dialogPokemon
				.findViewById(R.id.hpBar2);
		ProgressBar hpBar3 = (ProgressBar) dialogPokemon
				.findViewById(R.id.hpBar3);
		ProgressBar hpBar4 = (ProgressBar) dialogPokemon
				.findViewById(R.id.hpBar4);
		ProgressBar hpBar5 = (ProgressBar) dialogPokemon
				.findViewById(R.id.hpBar5);
		ProgressBar hpBar6 = (ProgressBar) dialogPokemon
				.findViewById(R.id.hpBar6);

		RelativeLayout pokemon1 = (RelativeLayout) dialogPokemon
				.findViewById(R.id.pokemon1);
		RelativeLayout pokemon2 = (RelativeLayout) dialogPokemon
				.findViewById(R.id.pokemon2);
		RelativeLayout pokemon3 = (RelativeLayout) dialogPokemon
				.findViewById(R.id.pokemon3);
		RelativeLayout pokemon4 = (RelativeLayout) dialogPokemon
				.findViewById(R.id.pokemon4);
		RelativeLayout pokemon5 = (RelativeLayout) dialogPokemon
				.findViewById(R.id.pokemon5);
		RelativeLayout pokemon6 = (RelativeLayout) dialogPokemon
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
			pokemon1.setOnClickListener(new pokemon(player.getPokemon1()));
		} else {
			pokemon1.setVisibility(View.GONE);
			((RelativeLayout) dialogPokemon.findViewById(R.id.pokemon1empty))
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
			pokemon2.setOnClickListener(new pokemon(player.getPokemon2()));
		} else {
			pokemon2.setVisibility(View.GONE);
			((RelativeLayout) dialogPokemon.findViewById(R.id.pokemon2empty))
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
			pokemon3.setOnClickListener(new pokemon(player.getPokemon3()));
		} else {
			pokemon3.setVisibility(View.GONE);
			((RelativeLayout) dialogPokemon.findViewById(R.id.pokemon3empty))
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
			pokemon4.setOnClickListener(new pokemon(player.getPokemon4()));
		} else {
			pokemon4.setVisibility(View.GONE);
			((RelativeLayout) dialogPokemon.findViewById(R.id.pokemon4empty))
					.setVisibility(View.VISIBLE);
		}
		if (player.getPokemon5() != null) {
			nome5.setText(player.getPokemon5().getName());
			level5.setText("l:" + player.getPokemon5().getLevel());
			hpText5.setText(player.getPokemon5().getLife() + "/"
					+ player.getPokemon5().getHp());
			hpBar5.setProgress(player.getPokemon5().getLife());
			hpBar5.setMax(player.getPokemon5().getHp());
			status5.setText(player.getPokemon5().getStatus().name());
			imagem5.setImageResource(player.getPokemon5().getSpecie()
					.getImage());
			pokemon5.setOnClickListener(new pokemon(player.getPokemon5()));
		} else {
			pokemon5.setVisibility(View.GONE);
			((RelativeLayout) dialogPokemon.findViewById(R.id.pokemon5empty))
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
			pokemon6.setOnClickListener(new pokemon(player.getPokemon6()));
		} else {
			pokemon6.setVisibility(View.GONE);
			((RelativeLayout) dialogPokemon.findViewById(R.id.pokemon6empty))
					.setVisibility(View.VISIBLE);
		}

		dialogPokemon.show();
	}

	public void showBattleDialog(View view) {
		if (blockAction)
			return;
		if (pkmPlayer.getLife() == 0) {
			Toast.makeText(context, "There's no will to battle!",
					Toast.LENGTH_SHORT).show();
			return;
		}

		dialogBattle = new Dialog(this);
		dialogBattle.setOwnerActivity(this);

		dialogBattle.setContentView(R.layout.dialog_attacks);
		dialogBattle.setTitle(getResources().getText(R.string.attacks));

		TextView attackText1 = (TextView) dialogBattle
				.findViewById(R.id.attack1);
		TextView attackText2 = (TextView) dialogBattle
				.findViewById(R.id.attack2);
		TextView attackText3 = (TextView) dialogBattle
				.findViewById(R.id.attack3);
		TextView attackText4 = (TextView) dialogBattle
				.findViewById(R.id.attack4);

		TextView ppText1 = (TextView) dialogBattle.findViewById(R.id.pp1);
		TextView ppText2 = (TextView) dialogBattle.findViewById(R.id.pp2);
		TextView ppText3 = (TextView) dialogBattle.findViewById(R.id.pp3);
		TextView ppText4 = (TextView) dialogBattle.findViewById(R.id.pp4);

		TextView typeText1 = (TextView) dialogBattle.findViewById(R.id.type1);
		TextView typeText2 = (TextView) dialogBattle.findViewById(R.id.type2);
		TextView typeText3 = (TextView) dialogBattle.findViewById(R.id.type3);
		TextView typeText4 = (TextView) dialogBattle.findViewById(R.id.type4);

		RelativeLayout attackCommand1 = (RelativeLayout) dialogBattle
				.findViewById(R.id.attackCommand1);
		RelativeLayout attackCommand2 = (RelativeLayout) dialogBattle
				.findViewById(R.id.attackCommand2);
		RelativeLayout attackCommand3 = (RelativeLayout) dialogBattle
				.findViewById(R.id.attackCommand3);
		RelativeLayout attackCommand4 = (RelativeLayout) dialogBattle
				.findViewById(R.id.attackCommand4);

		if (attack1 != null) {
			attackText1.setText(attack1.getName());
			ppText1.setText(pkmPlayer.getPp1() + "/" + attack1.getPp());
			ppText1.setVisibility(View.VISIBLE);
			typeText1.setText(attack1.getType().name());
			typeText1.setVisibility(View.VISIBLE);
			typeText1.setTextColor(ParseColor.getColorMedium(attack1.getType(),
					context));
			typeText1.setShadowLayer(1, 1, 1,
					ParseColor.getColorDark(attack1.getType(), context));
			attackCommand1.setOnClickListener(new attack(attack1, 1));
		}
		if (attack2 != null) {
			attackText2.setText(attack2.getName());
			ppText2.setText(pkmPlayer.getPp2() + "/" + attack2.getPp());
			ppText2.setVisibility(View.VISIBLE);
			typeText2.setText(attack2.getType().name());
			typeText2.setVisibility(View.VISIBLE);
			typeText2.setTextColor(ParseColor.getColorMedium(attack2.getType(),
					context));
			typeText2.setShadowLayer(1, 1, 1,
					ParseColor.getColorDark(attack2.getType(), context));
			attackCommand2.setOnClickListener(new attack(attack2, 2));
		}
		if (attack3 != null) {
			attackText3.setText(attack3.getName());
			ppText3.setText(pkmPlayer.getPp3() + "/" + attack3.getPp());
			ppText3.setVisibility(View.VISIBLE);
			typeText3.setText(attack3.getType().name());
			typeText3.setVisibility(View.VISIBLE);
			typeText3.setTextColor(ParseColor.getColorMedium(attack3.getType(),
					context));
			typeText3.setShadowLayer(1, 1, 1,
					ParseColor.getColorDark(attack3.getType(), context));
			attackCommand3.setOnClickListener(new attack(attack3, 3));
		}
		if (attack4 != null) {
			attackText4.setText(attack4.getName());
			ppText4.setText(pkmPlayer.getPp4() + "/" + attack4.getPp());
			ppText4.setVisibility(View.VISIBLE);
			typeText4.setText(attack4.getType().name());
			typeText4.setVisibility(View.VISIBLE);
			typeText4.setTextColor(ParseColor.getColorMedium(attack4.getType(),
					context));
			typeText4.setShadowLayer(1, 1, 1,
					ParseColor.getColorDark(attack4.getType(), context));
			attackCommand4.setOnClickListener(new attack(attack4, 4));
		}

		dialogBattle.show();

	}
	
	public void dontLearn(View view){
		dialogLearnAttack.dismiss();
		endTurn();
	}
	
	public void showLearnAttackDialog(Pokemon p, Attacks attack) {
		
		Attack attack1 = ga.getAttack(p.getAttack1());
		Attack attack2 = ga.getAttack(p.getAttack2());
		Attack attack3 = ga.getAttack(p.getAttack3());
		Attack attack4 = ga.getAttack(p.getAttack4());

		dialogLearnAttack = new Dialog(this);
		dialogLearnAttack.setOwnerActivity(this);

		dialogLearnAttack.setContentView(R.layout.dialog_learnattack);
		dialogLearnAttack.setTitle(getResources().getText(R.string.learnAttack));
		
		TextView msg = (TextView) dialogLearnAttack
				.findViewById(R.id.messageAttack);
		
		ImageView pkm = (ImageView) dialogLearnAttack.findViewById(R.id.pokemon);

		TextView attackText1 = (TextView) dialogLearnAttack
				.findViewById(R.id.attack1);
		TextView attackText2 = (TextView) dialogLearnAttack
				.findViewById(R.id.attack2);
		TextView attackText3 = (TextView) dialogLearnAttack
				.findViewById(R.id.attack3);
		TextView attackText4 = (TextView) dialogLearnAttack
				.findViewById(R.id.attack4);

		TextView ppText1 = (TextView) dialogLearnAttack.findViewById(R.id.pp1);
		TextView ppText2 = (TextView) dialogLearnAttack.findViewById(R.id.pp2);
		TextView ppText3 = (TextView) dialogLearnAttack.findViewById(R.id.pp3);
		TextView ppText4 = (TextView) dialogLearnAttack.findViewById(R.id.pp4);

		TextView typeText1 = (TextView) dialogLearnAttack.findViewById(R.id.type1);
		TextView typeText2 = (TextView) dialogLearnAttack.findViewById(R.id.type2);
		TextView typeText3 = (TextView) dialogLearnAttack.findViewById(R.id.type3);
		TextView typeText4 = (TextView) dialogLearnAttack.findViewById(R.id.type4);

		RelativeLayout attackCommand1 = (RelativeLayout) dialogLearnAttack
				.findViewById(R.id.attackCommand1);
		RelativeLayout attackCommand2 = (RelativeLayout) dialogLearnAttack
				.findViewById(R.id.attackCommand2);
		RelativeLayout attackCommand3 = (RelativeLayout) dialogLearnAttack
				.findViewById(R.id.attackCommand3);
		RelativeLayout attackCommand4 = (RelativeLayout) dialogLearnAttack
				.findViewById(R.id.attackCommand4);
		
		msg.setText(p.getName() + " quer aprender " + attackName + ". \nSubstituir por:");
		pkm.setImageResource(p.getSpecie().getImage());
		
		
		if (attack1 != null) {
			attackText1.setText(attack1.getName());
			ppText1.setText(pkmPlayer.getPp1() + "/" + attack1.getPp());
			ppText1.setVisibility(View.VISIBLE);
			typeText1.setText(attack1.getType().name());
			typeText1.setVisibility(View.VISIBLE);
			typeText1.setTextColor(ParseColor.getColorMedium(attack1.getType(),
					context));
			typeText1.setShadowLayer(1, 1, 1,
					ParseColor.getColorDark(attack1.getType(), context));
			attackCommand1.setOnClickListener(new learnAttack(p, 1, attack));
		}
		if (attack2 != null) {
			attackText2.setText(attack2.getName());
			ppText2.setText(pkmPlayer.getPp2() + "/" + attack2.getPp());
			ppText2.setVisibility(View.VISIBLE);
			typeText2.setText(attack2.getType().name());
			typeText2.setVisibility(View.VISIBLE);
			typeText2.setTextColor(ParseColor.getColorMedium(attack2.getType(),
					context));
			typeText2.setShadowLayer(1, 1, 1,
					ParseColor.getColorDark(attack2.getType(), context));
			attackCommand2.setOnClickListener(new learnAttack(p, 2, attack));
		}
		if (attack3 != null) {
			attackText3.setText(attack3.getName());
			ppText3.setText(pkmPlayer.getPp3() + "/" + attack3.getPp());
			ppText3.setVisibility(View.VISIBLE);
			typeText3.setText(attack3.getType().name());
			typeText3.setVisibility(View.VISIBLE);
			typeText3.setTextColor(ParseColor.getColorMedium(attack3.getType(),
					context));
			typeText3.setShadowLayer(1, 1, 1,
					ParseColor.getColorDark(attack3.getType(), context));
			attackCommand3.setOnClickListener(new learnAttack(p, 3, attack));
		}
		if (attack4 != null) {
			attackText4.setText(attack4.getName());
			ppText4.setText(pkmPlayer.getPp4() + "/" + attack4.getPp());
			ppText4.setVisibility(View.VISIBLE);
			typeText4.setText(attack4.getType().name());
			typeText4.setVisibility(View.VISIBLE);
			typeText4.setTextColor(ParseColor.getColorMedium(attack4.getType(),
					context));
			typeText4.setShadowLayer(1, 1, 1,
					ParseColor.getColorDark(attack4.getType(), context));
			attackCommand4.setOnClickListener(new learnAttack(p, 4, attack));
		}

		dialogLearnAttack.show();

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			// Intent intent = new Intent(this, ShowGym.class);
			// this.startActivity(intent);
			// this.finish();
			// onDestroy();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

	private class attack implements View.OnClickListener {
		private Attack attack;
		private int nAttack;

		public attack(Attack attack, int nAttack) {
			this.attack = attack;
			this.nAttack = nAttack;
		}

		public void onClick(View v) {
			switch (nAttack) {
			case 1:
				if (pkmPlayer.getPp1() == 0){
					Toast.makeText(context, attack.getName() + " não tem PP!",
							Toast.LENGTH_SHORT).show();
					return;					
				}					
				pkmPlayer.castPP1();
				break;
			case 2:
				if (pkmPlayer.getPp2() == 0){
					Toast.makeText(context, attack.getName() + " não tem PP!",
							Toast.LENGTH_SHORT).show();
					return;					
				}
				pkmPlayer.castPP2();
				break;
			case 3:
				if (pkmPlayer.getPp3() == 0){
					Toast.makeText(context, attack.getName() + " não tem PP!!",
							Toast.LENGTH_SHORT).show();
					return;					
				}
				pkmPlayer.castPP3();
				break;
			case 4:
				if (pkmPlayer.getPp4() == 0){
					Toast.makeText(context, attack.getName() + " não tem PP!",
							Toast.LENGTH_SHORT).show();
					return;					
				}
				pkmPlayer.castPP4();
				break;
			}

			Toast.makeText(context,
					pkmPlayer.getName() + " usou " + attack.getName(),
					Toast.LENGTH_SHORT).show();

			boolean critical = attackO1.calculatecriticalHit(pkmPlayer);
			if (critical)
				Toast.makeText(context, "Hit Crítico!!",
						Toast.LENGTH_SHORT).show();
			attack.effect(pkmPlayer, pkmOpponent, critical);
			dialogBattle.dismiss();
			playerTurn = false;
			ImageView img = (ImageView) findViewById(R.id.pokemonPlayer);
			Animation hyperspaceJump = AnimationUtils.loadAnimation(context,
					R.anim.hyperjump);
			hyperspaceJump.setAnimationListener(getAnimationWaitForEnd());
			img.startAnimation(hyperspaceJump);

		}
	}
	
	
	private class learnAttack implements View.OnClickListener {
		private Attacks attackToLearn;
		private int attackToForget;
		private Pokemon pokemon;

		public learnAttack(Pokemon pokemon, int attackToForget, Attacks attackToLearn) {
			this.attackToLearn = attackToLearn;
			this.attackToForget = attackToForget;
			this.pokemon = pokemon;
		}

		public void onClick(View v) {
			
			pokemon.learnMoveByLevel(attackToLearn, attackToForget);
			Toast.makeText(context,
					pokemon.getName() + " aprendeu " + attackName,
					Toast.LENGTH_SHORT).show();
			setAttacksPlayer();
			dialogLearnAttack.dismiss();
			playerTurn = false;
			endTurn();
		}
	}

	private class pokemon implements View.OnClickListener {
		private Pokemon pokemon;

		public pokemon(Pokemon pokemon) {
			this.pokemon = pokemon;
		}

		public void onClick(View v) {
			if (pokemon.getLife() == 0) {
				Toast.makeText(context, "Sem vontade de lutar!",
						Toast.LENGTH_SHORT).show();
				return;
			}
			if (pokemon.equals(pkmPlayer)) {
				Toast.makeText(context, pokemon.getName() + " is already out!",
						Toast.LENGTH_SHORT).show();
				return;
			}
			if (pkmPlayer.getLife() == 0){
				playerTurn = false;
				opponentAttack = false;
			}else{
				playerTurn = false;
			}
			BDtemp.pkmPlayer = pokemon;
			dialogPokemon.dismiss();
			pkmPlayer = pokemon; // direciona o próximo ataque ao próximo
									// pokemon
			setViewStatsPlayer();
			endTurn();
		}
	}

	private void endTurn() {
		if (dialogLearnAttack != null && dialogLearnAttack.isShowing()){
			return;
		}
		if (playerTurn){
			setViewStatsPlayer();
			return;
		}
		if (opponentAttack && pkmOpponent.getLife() > 0) {
			setViewStatsOpponent();
			opponentAttack = false;
			opponentAttack();
			return;
		}
		BDtemp.turn++; 
		BDtemp.pkmOpponent = pkmOpponent;
		BDtemp.pkmPlayer = pkmPlayer;
		Intent intent = new Intent(this, Battle.class);
		this.startActivity(intent);
		this.finish();
		onDestroy();
	}

	private void goBack() {
		BDtemp.pkmUsed = new HashSet<Pokemon>();
		opponent.healPokemons();
		BDtemp.endBattle = false;
		PersistUtil pu = new PersistUtil();
		pu.saveGame(this);
		Intent intent = new Intent(this, ShowGym.class);
		this.startActivity(intent);
		this.finish();
		onDestroy();
	}

	private Pokemon selectPokemon() {
		if (pkmOpponent != null && pkmOpponent.getLife() > 0)
			return pkmOpponent;
		if (pkmOpponent != null) {
			Toast.makeText(context, pkmOpponent.getName() + " desmaiou!",
					Toast.LENGTH_SHORT).show();
			computeExperienceGain();
		}

		if (opponent.getPokemon1() != null
				&& opponent.getPokemon1().getLife() > 0)
			return opponent.getPokemon1();
		if (opponent.getPokemon2() != null
				&& opponent.getPokemon2().getLife() > 0)
			return opponent.getPokemon2();
		if (opponent.getPokemon3() != null
				&& opponent.getPokemon3().getLife() > 0)
			return opponent.getPokemon3();
		if (opponent.getPokemon4() != null
				&& opponent.getPokemon4().getLife() > 0)
			return opponent.getPokemon4();
		if (opponent.getPokemon5() != null
				&& opponent.getPokemon5().getLife() > 0)
			return opponent.getPokemon5();
		if (opponent.getPokemon6() != null
				&& opponent.getPokemon6().getLife() > 0)
			return opponent.getPokemon6();

		Toast.makeText(context, "Você ganhou!!", Toast.LENGTH_LONG).show();
		player.setPoints(player.getPoints() + opponent.getPoints());
		if (opponent instanceof GymLeader) {
			BDtemp.player.getGame().cityCleared();
			((GymLeader) opponent).setDefeated(true);
			// ((GymLeader) BDtemp.opponent).setDefeatedGymLeader(); // tenso!
		} else {
			((Gym) BDtemp.place).addNPCsDefeated(opponent);
		}
		BDtemp.endBattle = true;

		if (!(dialogLearnAttack != null && dialogLearnAttack.isShowing())){
			goBack();
		}
		return pkmOpponent;
	}

	private AnimationListener getAnimationWaitForEnd() {
		return new AnimationListener() {
			public void onAnimationStart(Animation a) {
				blockAction = true;
			}

			public void onAnimationRepeat(Animation a) {
			}

			public void onAnimationEnd(Animation a) {
				blockAction = false;
				if (!checkPlayerLife()){
					goBack();
					return;
				}
				endTurn();
			}
		};
	}
	
	private void computeExperienceGain(){
		Float temp = 0f;
		int expGain = 0;
		
		float wild_tammed = 1.5f; // 1.5 - Trainer / 1 - Wild
		float own_traded = 1; //1 - Own pokemon / 1.5 traded pokemon
		int level = pkmOpponent.getLevel();
		int nPokes = 0;
		int baseExp = pkmOpponent.getSpecie().getEffort();
		for (Pokemon p: BDtemp.pkmUsed){
			if (p.getLife() > 0)
				nPokes++;
		}		
		temp = (wild_tammed * own_traded * baseExp * level) / (7*nPokes);
		expGain = temp.intValue();
		
		for (Pokemon p: BDtemp.pkmUsed){
			if (p.getLife() > 0)
				pkmPlayer.addExperience(expGain);
			if (p.changeLevel()){
				Toast.makeText(context,
						p.getName() + " subiu para o level " + p.getLevel(),
						Toast.LENGTH_SHORT).show();
				Attacks attack = p.canLearnMoveByLevel();
				if (attack != null){
					attackName = ga.getAttack(attack).getName();
					if (p.getAttack1() == null || p.getAttack2() == null || p.getAttack3() == null || p.getAttack4() == null){
						p.learnMoveByLevel(attack, null);
						Toast.makeText(context,
								p.getName() + " learned " + attackName,
								Toast.LENGTH_SHORT).show();
					}else{
						showLearnAttackDialog(p, attack);
					}
				}
				if (p.canEvolve())
					BDtemp.pkmEvolve.add(p);
			}
			
			
		}
		
		BDtemp.pkmUsed = new HashSet<Pokemon>();		
		
	}

}
