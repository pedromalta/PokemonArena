package util;

import android.content.Context;
import net.clubedocomputador.PokemonArena.R;
import enums.Types;

public class ParseColor {
	
	public static int getColorLight(Types type, Context context){
		int color = context.getResources().getColor(R.color.normallight);
		switch (type) {
		case Grass:
			color = context.getResources().getColor(R.color.grasslight);
			break;
		case Fire:
			color = context.getResources().getColor(R.color.firelight);
			break;
		case Normal:
			color = context.getResources().getColor(R.color.normallight);
			break;
		case Electric:
			color = context.getResources().getColor(R.color.electriclight);
			break;
		case Water:
			color = context.getResources().getColor(R.color.waterlight);
			break;
		case Flying:
			color = context.getResources().getColor(R.color.flyinglight);
			break;
		case Poison:
			color = context.getResources().getColor(R.color.poisonlight);
			break;
		case Fighting:
			color = context.getResources().getColor(R.color.fightinglight);
			break;
		case Psychic:
			color = context.getResources().getColor(R.color.psychiclight);
			break;
		case Ice:
			color = context.getResources().getColor(R.color.icelight);
			break;
		case Dragon:
			color = context.getResources().getColor(R.color.dragonlight);
			break;
		case Ground:
			color = context.getResources().getColor(R.color.groundlight);
			break;
		case Rock:
			color = context.getResources().getColor(R.color.rocklight);
			break;
		case Bug:
			color = context.getResources().getColor(R.color.buglight);
			break;
		case Ghost:
			color = context.getResources().getColor(R.color.ghostlight);
			break;
		}
		return color;
	}
	
	public static int getColorMedium(Types type, Context context){
		int color = context.getResources().getColor(R.color.normalmedium);
		switch (type) {
		case Grass:
			color = context.getResources().getColor(R.color.grassmedium);
			break;
		case Fire:
			color = context.getResources().getColor(R.color.firemedium);
			break;
		case Normal:
			color = context.getResources().getColor(R.color.normalmedium);
			break;
		case Electric:
			color = context.getResources().getColor(R.color.electricmedium);
			break;
		case Water:
			color = context.getResources().getColor(R.color.watermedium);
			break;
		case Flying:
			color = context.getResources().getColor(R.color.flyingmedium);
			break;
		case Poison:
			color = context.getResources().getColor(R.color.poisonmedium);
			break;
		case Fighting:
			color = context.getResources().getColor(R.color.fightingmedium);
			break;
		case Psychic:
			color = context.getResources().getColor(R.color.psychicmedium);
			break;
		case Ice:
			color = context.getResources().getColor(R.color.icemedium);
			break;
		case Dragon:
			color = context.getResources().getColor(R.color.dragonmedium);
			break;
		case Ground:
			color = context.getResources().getColor(R.color.groundmedium);
			break;
		case Rock:
			color = context.getResources().getColor(R.color.rockmedium);
			break;
		case Bug:
			color = context.getResources().getColor(R.color.bugmedium);
			break;
		case Ghost:
			color = context.getResources().getColor(R.color.ghostmedium);
			break;
		}
		return color;
	}
	
	public static int getColorDark(Types type, Context context){
		int color = context.getResources().getColor(R.color.normaldark);
		switch (type) {
		case Grass:
			color = context.getResources().getColor(R.color.grassdark);
			break;
		case Fire:
			color = context.getResources().getColor(R.color.firedark);
			break;
		case Normal:
			color = context.getResources().getColor(R.color.normaldark);
			break;
		case Electric:
			color = context.getResources().getColor(R.color.electricdark);
			break;
		case Water:
			color = context.getResources().getColor(R.color.waterdark);
			break;
		case Flying:
			color = context.getResources().getColor(R.color.flyingdark);
			break;
		case Poison:
			color = context.getResources().getColor(R.color.poisondark);
			break;
		case Fighting:
			color = context.getResources().getColor(R.color.fightingdark);
			break;
		case Psychic:
			color = context.getResources().getColor(R.color.psychicdark);
			break;
		case Ice:
			color = context.getResources().getColor(R.color.icedark);
			break;
		case Dragon:
			color = context.getResources().getColor(R.color.dragondark);
			break;
		case Ground:
			color = context.getResources().getColor(R.color.grounddark);
			break;
		case Rock:
			color = context.getResources().getColor(R.color.rockdark);
			break;
		case Bug:
			color = context.getResources().getColor(R.color.bugdark);
			break;
		case Ghost:
			color = context.getResources().getColor(R.color.ghostdark);
			break;

		}
		return color;
	}

}
