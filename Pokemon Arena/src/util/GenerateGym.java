package util;

import java.util.ArrayList;

import model.Gym;
import model.NPC;
import model.Pokemon;
import net.clubedocomputador.PokemonArena.R;
import enums.Types;

public class GenerateGym {
	
	GenerateGymLeader ggl = new GenerateGymLeader();
	GenerateNPC gnpc = new GenerateNPC();
	
	public Gym getGym(Integer id){
		switch (id) {	
		case 1:
			return boulder();
		case 2:
			return cascade();
		case 3:
			return thunder();
		case 4:
			return rainbow();
		case 5:
			return soul();
		case 6:
			return marsh();
		case 7:
			return volcano();
		case 8:
			return earth();

		default:
			return null;
		}
	}
	
	public NPC[] getNPCs(Gym gym){
		int n = gym.getNumeroNPCs();
		int level = gym.getCity().getLevel();
		ArrayList<Types> types = new ArrayList<Types>();
		types.add(gym.getBaseType1());
		types.add(gym.getBaseType2());
		types.add(gym.getBaseType3());
		types.add(gym.getBaseType4());
		types.add(gym.getBaseType5());
		
		NPC[] list = new NPC[n+1];
		
		int i = 0;
		if (!gym.getNPCsDefeated().equals("")){
			String[] npcs = gym.getNPCsDefeated().split(";");
			
			for (String npc: npcs){
				NPC t = new NPC();
				String data[] = npc.split(":");
				t.setName(data[0]);
				t.setModel(Integer.parseInt(data[1]));
				t.setSpeechWon(Integer.parseInt(data[2]));
				t.setDefeated(true);
				list[i] = t;
				i++;
			}
		}
		
		
		for (; i < n; i++){
			list[i] = gnpc.genericNPC(types, level + i/2);
		}
		list[n] = gym.getGymLeader();
		
		
		return list;
	}
	
	private Gym boulder(){
		
		Gym gy = new Gym();		
		gy.setId(1);
		gy.setName("Boulder Gym");
		gy.setBuilding(R.drawable.place_pokegym);
		gy.setBackground(R.drawable.gym_boulder);
		gy.setBackgroundColor(Integer.valueOf(R.color.rocklight));
		gy.setBaseType1(Types.Rock);
		gy.setBaseType2(Types.Rock);
		gy.setBaseType3(Types.Rock);
		gy.setBaseType4(Types.Ground);
		gy.setBaseType5(Types.Fighting);
		gy.setLose(false);
		gy.setPokemonBonus(new Pokemon());
		gy.setNumeroNPCs(14);
		gy.setNPCsDefeated("");
		gy.setGymLeader(ggl.getGymLeader(1));
		
		return gy;
	}
	
	private Gym cascade(){
		
		Gym gy = new Gym();		
		gy.setId(2);
		gy.setName("Cascade Gym");
		gy.setBuilding(R.drawable.place_pokegym);
		gy.setBackground(R.drawable.gym_boulder);
		gy.setBackgroundColor(Integer.valueOf(R.color.waterlight));
		gy.setBaseType1(Types.Water);
		gy.setBaseType3(Types.Water);
		gy.setBaseType2(Types.Psychic);
		gy.setBaseType4(Types.Ice);
		gy.setBaseType5(Types.Electric);
		gy.setLose(false);
		gy.setPokemonBonus(new Pokemon());
		gy.setNumeroNPCs(20);
		gy.setNPCsDefeated("");
		gy.setGymLeader(ggl.getGymLeader(2));
		
		return gy;
	}
	
	private Gym thunder(){
		
		Gym gy = new Gym();		
		gy.setId(3);
		gy.setName("Thunder Gym");
		gy.setBuilding(R.drawable.place_pokegym);
		gy.setBackground(R.drawable.gym_boulder);
		gy.setBackgroundColor(Integer.valueOf(R.color.electriclight));
		gy.setBaseType1(Types.Electric);
		gy.setBaseType3(Types.Electric);
		gy.setBaseType2(Types.Electric);
		gy.setBaseType4(Types.Poison);
		gy.setBaseType5(Types.Poison);
		gy.setLose(false);
		gy.setPokemonBonus(new Pokemon());
		gy.setNumeroNPCs(26);
		gy.setNPCsDefeated("");
		gy.setGymLeader(ggl.getGymLeader(3));
		
		return gy;
	}
	
	private Gym rainbow(){
		
		Gym gy = new Gym();		
		gy.setId(4);
		gy.setName("Rainbow Gym");
		gy.setBuilding(R.drawable.place_pokegym);
		gy.setBackground(R.drawable.gym_boulder);
		gy.setBackgroundColor(Integer.valueOf(R.color.grasslight));
		gy.setBaseType1(Types.Grass);
		gy.setBaseType3(Types.Grass);
		gy.setBaseType2(Types.Grass);
		gy.setBaseType4(Types.Poison);
		gy.setBaseType5(Types.Psychic);
		gy.setLose(false);
		gy.setPokemonBonus(new Pokemon());
		gy.setNumeroNPCs(32);
		gy.setNPCsDefeated("");
		gy.setGymLeader(ggl.getGymLeader(4));
		
		return gy;
	}
	
	private Gym soul(){
		
		Gym gy = new Gym();		
		gy.setId(5);
		gy.setName("Soul Gym");
		gy.setBuilding(R.drawable.place_pokegym);
		gy.setBackground(R.drawable.gym_boulder);
		gy.setBackgroundColor(Integer.valueOf(R.color.poisonlight));
		gy.setBaseType1(Types.Poison);
		gy.setBaseType3(Types.Poison);
		gy.setBaseType2(Types.Bug);
		gy.setBaseType4(Types.Bug);
		gy.setBaseType5(Types.Fighting);
		gy.setLose(false);
		gy.setPokemonBonus(new Pokemon());
		gy.setNumeroNPCs(38);
		gy.setNPCsDefeated("");
		gy.setGymLeader(ggl.getGymLeader(5));
		
		return gy;
	}
	
	private Gym marsh(){
		
		Gym gy = new Gym();		
		gy.setId(6);
		gy.setName("Marsh Gym");
		gy.setBuilding(R.drawable.place_pokegym);
		gy.setBackground(R.drawable.gym_boulder);
		gy.setBackgroundColor(Integer.valueOf(R.color.psychiclight));
		gy.setBaseType1(Types.Psychic);
		gy.setBaseType3(Types.Psychic);
		gy.setBaseType2(Types.Psychic);
		gy.setBaseType4(Types.Ghost);
		gy.setBaseType5(Types.Ghost);
		gy.setLose(false);
		gy.setPokemonBonus(new Pokemon());
		gy.setNumeroNPCs(44);
		gy.setNPCsDefeated("");
		gy.setGymLeader(ggl.getGymLeader(6));
		
		return gy;
	}
	
	private Gym volcano(){
		
		Gym gy = new Gym();		
		gy.setId(7);
		gy.setName("Volcano Gym");
		gy.setBuilding(R.drawable.place_pokegym);
		gy.setBackground(R.drawable.gym_boulder);
		gy.setBackgroundColor(Integer.valueOf(R.color.firelight));
		gy.setBaseType1(Types.Fire);
		gy.setBaseType3(Types.Fire);
		gy.setBaseType2(Types.Fire);
		gy.setBaseType4(Types.Dragon);
		gy.setBaseType5(Types.Dragon);
		gy.setLose(false);
		gy.setPokemonBonus(new Pokemon());
		gy.setNumeroNPCs(50);
		gy.setNPCsDefeated("");
		gy.setGymLeader(ggl.getGymLeader(7));
		
		return gy;
	}
	
	private Gym earth(){
		
		Gym gy = new Gym();		
		gy.setId(8);
		gy.setName("Earth Gym");
		gy.setBuilding(R.drawable.place_pokegym);
		gy.setBackground(R.drawable.gym_boulder);
		gy.setBackgroundColor(Integer.valueOf(R.color.groundlight));
		gy.setBaseType1(Types.Ground);
		gy.setBaseType3(Types.Ground);
		gy.setBaseType2(Types.Ground);
		gy.setBaseType4(Types.Normal);
		gy.setBaseType5(Types.Rock);
		gy.setLose(false);
		gy.setPokemonBonus(new Pokemon());
		gy.setNumeroNPCs(56);
		gy.setNPCsDefeated("");
		gy.setGymLeader(ggl.getGymLeader(8));
		
		return gy;
	}

}
