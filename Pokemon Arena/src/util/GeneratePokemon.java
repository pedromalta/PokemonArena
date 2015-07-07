package util;

import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

import model.Pokemon;
import model.Specie;
import model.Trainer;
import enums.Attacks;
import enums.Growth;
import enums.Status;
import enums.Types;

public class GeneratePokemon { 
	
	GenerateSpecies gs = new GenerateSpecies();
	GenerateAttack ga = new GenerateAttack();
	Random randomGenerator = new Random();
	
	public Pokemon getPokemon(Integer id){
		id *= -1;
		
		switch (id) {
		case 1:
			return brockGeodude();
		case 2:
			return brockOnix();
		case 3:
			return mistyStaryu();
		case 4:
			return mistyStarmie();
		case 5:
			return surgeRaichu();
		default:
			return null;
		}
	}
	
	public Pokemon newPokemon(String name, Integer level, Specie specie){
		Pokemon pkm = new Pokemon();
		pkm.setName(name);
		pkm.setLevel(level);
		pkm.setSpecie(specie);
		pkm.setTrainer(new Trainer());
		pkm.setOriginalTrainer(true);
		pkm.setExp(calculateExperience(level, specie.getGrowth()));
		pkm.setId(null);
		pkm.setStatus(Status.Ok);		
		pkm.calculateStats();
		
		for(Entry<Integer, Attacks> at: pkm.getSpecie().getMappedAttacks().entrySet()){
			if (at.getKey() > level)
				continue;
			if (pkm.getAttack1() == null){
				pkm.setAttack1(at.getValue());
				pkm.setPp1(ga.getAttack(at.getValue()).getPp());
				continue;
			}
			if (pkm.getAttack2() == null){
				pkm.setAttack2(at.getValue());
				pkm.setPp2(ga.getAttack(at.getValue()).getPp());
				continue;
			}
			if (pkm.getAttack3() == null){
				pkm.setAttack3(at.getValue());
				pkm.setPp3(ga.getAttack(at.getValue()).getPp());
				continue;
			}
			if (pkm.getAttack4() == null){
				pkm.setAttack4(at.getValue());
				pkm.setPp4(ga.getAttack(at.getValue()).getPp());
				continue;
			}
			
			break;
		}
		
		pkm.setLife(pkm.getHp());
		
		return pkm;
	}
	
	public void calculateStats(Pokemon pkm){
		Specie spc = pkm.getSpecie();
		Float stat = 0f;
		stat = spc.getMaxHP() / 100f * pkm.getLevel();
		pkm.setHp(stat.intValue());
		stat = spc.getMaxAttack() / 100f * pkm.getLevel();
		pkm.setAttack(stat.intValue());
		stat = spc.getMaxDefense() / 100f * pkm.getLevel();
		pkm.setDefense(stat.intValue());
		stat = spc.getMaxSpeed() / 100f * pkm.getLevel();
		pkm.setSpeed(stat.intValue());
		stat = spc.getMaxSpecial() / 100f * pkm.getLevel();
		pkm.setSpecial(stat.intValue());		
	}
	
	private Pokemon brockGeodude(){
		Pokemon pkm = newPokemon("Geodude", 12, gs.getSpecie(74));		
		return pkm;
	}
	
	private Pokemon brockOnix(){
		Pokemon pkm = newPokemon("Geodude", 16, gs.getSpecie(95));		
		return pkm;
	}
	
	private Pokemon mistyStaryu(){
		Pokemon pkm = newPokemon("Staryu", 16, gs.getSpecie(120));		
		return pkm;
	}
	
	private Pokemon mistyStarmie(){
		Pokemon pkm = newPokemon("Starmie", 22, gs.getSpecie(121));		
		return pkm;
	}
	
	private Pokemon surgeRaichu(){
		Pokemon pkm = newPokemon("Raichu", 32, gs.getSpecie(26));		
		return pkm;
	}
	
	public Pokemon getGenericPokemon(List<Types> types, Integer level, Integer maxEffort){
		int i = randomGenerator.nextInt(types.size());
		Specie specie = gs.getGenericSpecie(types.get(i), maxEffort);		
		return newPokemon(specie.getName(), level, specie);
	}
	
	public Long calculateExperience(Integer level, Growth growthType){
		Double exp = 0d;
		switch (growthType) {
		case Fast:
			exp = 0.8 * Math.pow(level, 3.0);			
			break;
			
		case Slow:
			exp = 1.25 * Math.pow(level, 3.0);			
			break;
			
		case Medium:
			exp = 1.0 * Math.pow(level, 3.0);
			System.out.println("Level: " + level);
			System.out.println("Exp: " + exp);
			break;
			
		case Parabolic:
			exp = 1.25 * Math.pow(level, 3.0); 
			//exp = 1.2 * (level^3) - 15 * (level^2) + 100 * level - 140;
			System.out.println("Level: " + level);
			System.out.println("Exp: " + exp);
			break;
		}
		
		
		return exp.longValue();
	}
	
	public Integer calculateLevel(Long exp, Growth growthType){
		if (growthType.equals(Growth.Fast)){
			Double level = Math.pow(exp/0.8, 1.0/3);
			return level.intValue();
		}
		if (growthType.equals(Growth.Medium)){
			Double level = Math.pow(exp/1.0, 1.0/3);
			System.out.println("Exp: " + exp);
			System.out.println("Level: " + level);
			return level.intValue();
		}
		if (growthType.equals(Growth.Parabolic)){
			Double level = Math.pow(exp/1.25, 1.0/3);
			return level.intValue();
		}
		if (growthType.equals(Growth.Slow)){
			Double level = Math.pow(exp/1.25, 1.0/3);
			return level.intValue();
		}
		return null;
	}

}
