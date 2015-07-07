package view;

import model.Pokemon;
import model.Specie;
import net.clubedocomputador.PokemonArena.R;
import net.clubedocomputador.PokemonArena.ShowGym;
import util.BDtemp;
import util.GenerateSpecies;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class DlgEvolution extends Dialog{
	
	private Pokemon pkm;
	private Context context;
	private Activity activity;
	private ImageView pokemonEvolve;
	private ImageView pokemonEvolved;
	private TextView evolvedInto;
	
	public DlgEvolution(Context context, Activity activity) {
		super(context);
		this.context = context;
		this.activity = activity;
		this.pkm = BDtemp.pkmEvolve.iterator().next();
		BDtemp.pkmEvolve.remove(pkm);
		this.setTitle(pkm.getName() + " is evolving!");		
		this.setContentView(R.layout.dialog_evolve);
		
		GenerateSpecies ge = new GenerateSpecies();
		Specie evo = ge.getSpecie(Integer.parseInt(pkm.getSpecie().getEvolution()));

		evolvedInto = (TextView) this.findViewById(R.id.evolvedInto);
		
		pokemonEvolve = (ImageView) this.findViewById(R.id.pokemonEvolve);
		pokemonEvolve.setImageResource(pkm.getSpecie().getImageBig());
		
		pokemonEvolved = (ImageView) this.findViewById(R.id.pokemonEvolved);
		pokemonEvolved.setImageResource(evo.getImageBig());
		pokemonEvolve.setVisibility(View.VISIBLE);
		pokemonEvolved.setVisibility(View.INVISIBLE);
		
		Animation blinkfadein = AnimationUtils.loadAnimation(context,
				R.anim.blinkfadein);
		Animation blinkfadeout = AnimationUtils.loadAnimation(context,
				R.anim.blinkfadeout);
		blinkfadein.setAnimationListener(getAnimationListener());
		pokemonEvolve.startAnimation(blinkfadeout);
		pokemonEvolved.startAnimation(blinkfadein);
		
		
		
		//msgTV.setText(msg);

	}
	
	private AnimationListener getAnimationListener() {
		return new AnimationListener() {
			public void onAnimationStart(Animation a) {
			}

			public void onAnimationRepeat(Animation a) {
			}

			public void onAnimationEnd(Animation a) {
				//System.out.println("teste!");
				String poke = pkm.getName();
				pkm.evolve(null);
				if (BDtemp.pkmEvolve != null && BDtemp.pkmEvolve.size() > 0){
					//p.evolve(null);
					DlgEvolution evolve = new DlgEvolution(context, activity);
					evolve.setOwnerActivity(activity);
					evolve.show();
				}
				pokemonEvolve.setVisibility(View.INVISIBLE);
				pokemonEvolved.setVisibility(View.VISIBLE);
				evolvedInto.setText(poke + " evolved into " + pkm.getName());
				((ShowGym)activity).setViewPlayer();
			}
		};
	}

}
