package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.Items;
import model.NPC;
import net.clubedocomputador.PokemonArena.R;
import enums.Types;

public class GenerateNPC {

	GeneratePokemon gp = new GeneratePokemon();
	Random randomGenerator = new Random();

	public NPC genericNPC(List<Types> types, Integer level) {
		NomeModel nm = this.genericModel();
		NPC npc = new NPC();		
		npc.setId(NPC.npcID);
		npc.setName(nm.nome);
		npc.setSpeechStart(R.string.speechStart);
		npc.setSpeechWon(R.string.speechWon);
		npc.setSpeechLose(R.string.speechLose);
		npc.setModel(nm.model);
		npc.setItems(new ArrayList<Items>());
		npc.setPoints((level.longValue() * 100));
		int nPokemons = randomGenerator.nextInt(5) + 1; // gerar Método randomico e ajusta Level de acordo com essa resposta;
		Float acertoLevel = (level / nPokemons) + level * (nPokemons/18f);

		switch (nPokemons) {
		case 6:
			npc.setPokemon6(gp.getGenericPokemon(types, acertoLevel.intValue() + randomGenerator.nextInt(5) - 1, null));
		case 5:
			npc.setPokemon5(gp.getGenericPokemon(types, acertoLevel.intValue() + randomGenerator.nextInt(5) - 1, null));
		case 4:
			npc.setPokemon4(gp.getGenericPokemon(types, acertoLevel.intValue() + randomGenerator.nextInt(5) - 1, null));
		case 3:
			npc.setPokemon3(gp.getGenericPokemon(types, acertoLevel.intValue() + randomGenerator.nextInt(5) - 1, null));
		case 2:
			npc.setPokemon2(gp.getGenericPokemon(types, acertoLevel.intValue() + randomGenerator.nextInt(5) - 1, null));
		case 1:
			npc.setPokemon1(gp.getGenericPokemon(types, acertoLevel.intValue() + randomGenerator.nextInt(5) - 1, null));

		}

		return npc;
	}

	private NomeModel genericModel() {
		int key = randomGenerator.nextInt(25);
		NomeModel nm = new NomeModel();
		switch (key) {
		case 0:
			nm.nome = "Ace Trainer♂";
			nm.model = R.drawable.charactersprite_generic_ace_trainer_m;
			return nm;
		case 1:
			nm.nome = "Ace Trainer♀";
			nm.model = R.drawable.charactersprite_generic_ace_trainer_f;
			return nm;
		case 2:
			nm.nome = "Beauty";
			nm.model = R.drawable.charactersprite_generic_beauty;
			return nm;
		case 3:
			nm.nome = "Biker";
			nm.model = R.drawable.charactersprite_generic_biker;
			return nm;
		case 4:
			nm.nome = "Bird Keeper";
			nm.model = R.drawable.charactersprite_generic_bird_keeper;
			return nm;
		case 5:
			nm.nome = "Black Belt";
			nm.model = R.drawable.charactersprite_generic_black_belt;
			return nm;
		case 6:
			nm.nome = "Boarder";
			nm.model = R.drawable.charactersprite_generic_boarder;
			return nm;
		case 7:
			nm.nome = "Camper";
			nm.model = R.drawable.charactersprite_generic_camper1;
			return nm;
		case 8:
			nm.nome = "Fisherman";
			nm.model = R.drawable.charactersprite_generic_fisherman;
			return nm;
		case 9:
			nm.nome = "Gentleman";
			nm.model = R.drawable.charactersprite_generic_gentleman;
			return nm;
		case 10:
			nm.nome = "Psychic";
			nm.model = R.drawable.charactersprite_generic_psychic_f3;
			return nm;
		case 11:
			nm.nome = "Poke Maniac";
			nm.model = R.drawable.charactersprite_generic_poke_maniac;
			return nm;
		case 12:
			nm.nome = "School Kid";
			nm.model = R.drawable.charactersprite_generic_beauty;
			return nm;
		case 13:
			nm.nome = "Gamer";
			nm.model = R.drawable.charactersprite_generic_gamer;
			return nm;
		case 14:
			nm.nome = "Engineer";
			nm.model = R.drawable.charactersprite_generic_engineer;
			return nm;
		case 15:
			nm.nome = "Lass";
			nm.model = R.drawable.charactersprite_generic_lass2;
			return nm;
		case 16:
			nm.nome = "Scientist♀";
			nm.model = R.drawable.charactersprite_generic_scientist_f;
			return nm;
		case 17:
			nm.nome = "Scientist♂";
			nm.model = R.drawable.charactersprite_generic_scientist_m;
			return nm;
		case 18:
			nm.nome = "Lady";
			nm.model = R.drawable.charactersprite_generic_lady;
			return nm;
		case 19:
			nm.nome = "Channeler";
			nm.model = R.drawable.charactersprite_generic_channeler;
			return nm;
		case 20:
			nm.nome = "Hiker";
			nm.model = R.drawable.charactersprite_generic_hiker2;
			return nm;
		case 21:
			nm.nome = "Sailor";
			nm.model = R.drawable.charactersprite_generic_sailor;
			return nm;
		case 22:
			nm.nome = "Sister and Brother";
			nm.model = R.drawable.charactersprite_generic_sis_and_bro;
			return nm;
		case 23:
			nm.nome = "Cue Ball";
			nm.model = R.drawable.charactersprite_generic_cue_ball1;
			return nm;
		case 24:
			nm.nome = "Juggler";
			nm.model = R.drawable.charactersprite_generic_juggler;
			return nm;
		case 25:
			nm.nome = "Schoolboy";
			nm.model = R.drawable.charactersprite_generic_schoolboy;
			return nm;
		default:
			return null;
					
		}

	}
	
	private class NomeModel{
		public String nome;
		public Integer model;
	}

}
