package net.clubedocomputador.PokemonArena;

import model.Avatar;
import view.PlayersImgsArrayAdapter;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Gallery;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import controller.PlayerController;

public class CreatePlayer extends Activity implements ViewSwitcher.ViewFactory {

	private String name;
	private Integer img;
	private PlayerController control;
	private ImageSwitcher mSwitcher;
	private Dialog dialogNG;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        control = new PlayerController();
        
        
        setContentView(R.layout.activity_newplayer);
        
        Gallery lv = (Gallery) findViewById(R.id.listImgTrainers);
        lv.setHorizontalFadingEdgeEnabled(false);
        lv.setFadingEdgeLength(3);
        lv.setDrawingCacheEnabled(true);
        
        PlayersImgsArrayAdapter adapter = new PlayersImgsArrayAdapter(getBaseContext(), imgs);
        lv.setAdapter(adapter);
        
        lv.setOnItemSelectedListener(new OnItemSelectedListener() {
        	public void onItemSelected(AdapterView<?>  parent, View v, int position, long id) {
        		mSwitcher.setImageResource(imgs[position].getImgBig());
        		img = imgs[position].getImg();
        	}

        	public void onNothingSelected(AdapterView<?> arg0) {
        	}
        });
        
        mSwitcher = (ImageSwitcher) findViewById(R.id.switcher);
        mSwitcher.setFactory(this);
        //mSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,
        //        android.R.anim.fade_in));
        //mSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,
        //        android.R.anim.fade_out));
        
       showNewGameDialog();
        
    }
	
    public View makeView() {
        ImageView i = new ImageView(this);
        //i.setBackgroundColor(0xFF000000);
        i.setScaleType(ImageView.ScaleType.FIT_CENTER);
        i.setLayoutParams(new ImageSwitcher.LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT));
        return i;
    }
    
    public void showNewGameDialog() {
    	dialogNG = new Dialog(this);
		dialogNG.setOwnerActivity(this);

		dialogNG.setContentView(R.layout.dialog_newgame);
		dialogNG.setTitle(getResources().getText(R.string.newGameDialog));
		
		Button btnOk = (Button)dialogNG.findViewById(R.id.btnOk);
		btnOk.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				dialogNG.dismiss();
				
			}
		});
		
		TextView msg = (TextView) dialogNG.findViewById(R.id.msg);
		msg.setText("Sua aventura Pokémon está começando!\n\nPrepare-se!");

		dialogNG.show();
	}
    
	public void criar(View view) {
		EditText et = (EditText) findViewById(R.id.nomeTrainer);

		name = et.getText().toString();
		boolean nameSet = false, imgSet = false; 
		if (this.name.equals(""))
			nameSet = true;
		if (img == null)
			imgSet = true;
		if (nameSet && imgSet){
			Toast.makeText(getBaseContext(), R.string.imgname, Toast.LENGTH_SHORT).show();
			return;
		}
		else{
			if (nameSet){
				Toast.makeText(getBaseContext(), R.string.name, Toast.LENGTH_SHORT).show();
				return;
			}
			if (imgSet){
				Toast.makeText(getBaseContext(), R.string.img, Toast.LENGTH_SHORT).show();
				return;	
			}
		}		
		
		
		this.control.newPlayer(name, img);
		Intent intent = new Intent(this, ShowPlayer.class);
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

	private Avatar[] imgs = {
		new Avatar(R.drawable.charactersprite_ash, R.drawable.characterbig_ash2),
		new Avatar(R.drawable.charactersprite_bertha, R.drawable.characterbig_bertha),
		new Avatar(R.drawable.charactersprite_buck, R.drawable.characterbig_buck),
		new Avatar(R.drawable.charactersprite_caitlin, R.drawable.characterbig_caitlin),
		new Avatar(R.drawable.charactersprite_candice, R.drawable.characterbig_candice),
		new Avatar(R.drawable.charactersprite_cheryl, R.drawable.characterbig_cheryl),
		new Avatar(R.drawable.charactersprite_cynthia, R.drawable.characterbig_cynthia),
		new Avatar(R.drawable.charactersprite_dawn, R.drawable.characterbig_dawn),
		new Avatar(R.drawable.charactersprite_fantina, R.drawable.characterbig_fantina),
		new Avatar(R.drawable.charactersprite_flint, R.drawable.characterbig_flint),
		new Avatar(R.drawable.charactersprite_juan, R.drawable.characterbig_juan),
		new Avatar(R.drawable.charactersprite_lucas, R.drawable.characterbig_lucas),
		new Avatar(R.drawable.charactersprite_lucian, R.drawable.characterbig_lucian),
		new Avatar(R.drawable.charactersprite_marley, R.drawable.characterbig_marley),
		new Avatar(R.drawable.charactersprite_mars, R.drawable.characterbig_mars),
		new Avatar(R.drawable.charactersprite_spenser, R.drawable.characterbig_maven_spenser),
		new Avatar(R.drawable.charactersprite_mira, R.drawable.characterbig_mira),
		new Avatar(R.drawable.charactersprite_noland, R.drawable.characterbig_noland),
		new Avatar(R.drawable.charactersprite_professor_birch, R.drawable.characterbig_professor_birch),
		new Avatar(R.drawable.charactersprite_roark, R.drawable.characterbig_roark)
	};
	
}
