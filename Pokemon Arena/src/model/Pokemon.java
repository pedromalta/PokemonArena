package model;

import java.io.Serializable;
 
import util.GenerateAttack;
import util.GeneratePokemon;
import util.GenerateSpecies;
import enums.Attacks;
import enums.Status;

public class Pokemon  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Trainer trainer;
	
	private boolean originalTrainer;
	
	private Long exp;
	
	private Integer level;	
	
	private String name;
	
	private Specie specie;
	
	private Integer life;
	
	private Integer hp;	
	private Integer attack;	
	private Integer defense;	
	private Integer speed;	
	private Integer special;

	private Status status;	
	
	private Attacks attack1;
	private Integer pp1;
	private Attacks attack2;
	private Integer pp2;
	private Attacks attack3;
	private Integer pp3;
	private Attacks attack4;
	private Integer pp4;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public Long getExp() {
		return exp;
	}
	public void setExp(Long exp) {
		this.exp = exp;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Specie getSpecie() {
		return specie;
	}
	public void setSpecie(Specie specie) {
		this.specie = specie;
	}
	public Integer getLife() {
		return life;
	}
	public void setLife(Integer life) {
		this.life = life;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getAttack() {
		return attack;
	}
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	public Integer getDefense() {
		return defense;
	}
	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public Integer getSpecial() {
		return special;
	}
	public void setSpecial(Integer special) {
		this.special = special;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Attacks getAttack1() {
		return attack1;
	}
	public void setAttack1(Attacks attack1) {
		this.attack1 = attack1;
	}
	public Integer getPp1() {
		return pp1;
	}
	public void setPp1(Integer pp1) {
		this.pp1 = pp1;
	}
	public Attacks getAttack2() {
		return attack2;
	}
	public void setAttack2(Attacks attack2) {
		this.attack2 = attack2;
	}
	public Integer getPp2() {
		return pp2;
	}
	public void setPp2(Integer pp2) {
		this.pp2 = pp2;
	}
	public Attacks getAttack3() {
		return attack3;
	}
	public void setAttack3(Attacks attack3) {
		this.attack3 = attack3;
	}
	public Integer getPp3() {
		return pp3;
	}
	public void setPp3(Integer pp3) {
		this.pp3 = pp3;
	}
	public Attacks getAttack4() {
		return attack4;
	}
	public void setAttack4(Attacks attack4) {
		this.attack4 = attack4;
	}		
	public boolean isOriginalTrainer() {
		return originalTrainer;
	}
	public void setOriginalTrainer(boolean originalTrainer) {
		this.originalTrainer = originalTrainer;
	}
	public Integer getPp4() {
		return pp4;
	}
	public void setPp4(Integer pp4) {
		this.pp4 = pp4;
	}
	public void castPP1(){
		this.pp1--;
	}
	public void castPP2(){
		this.pp2--;
	}
	public void castPP3(){
		this.pp3--;
	}
	public void castPP4(){
		this.pp4--;
	}	
	public void resetPP1(){
		GenerateAttack ga = new GenerateAttack();
		Attack at = ga.getAttack(attack1);
		if (at != null)
			this.pp1 = at.getPp();
	}
	public void resetPP2(){
		GenerateAttack ga = new GenerateAttack();
		Attack at = ga.getAttack(attack2);
		if (at != null)
			this.pp2 = at.getPp();
	}
	public void resetPP3(){
		GenerateAttack ga = new GenerateAttack();
		Attack at = ga.getAttack(attack3);
		if (at != null)
			this.pp3 = at.getPp();
	}
	public void resetPP4(){
		GenerateAttack ga = new GenerateAttack();
		Attack at = ga.getAttack(attack4);
		if (at != null)
			this.pp4 = at.getPp();
	}
	
	public boolean evolve(Items item){
		if (this.specie.getEvolutionLevel() == null)
			return false;
		if (this.specie.getEvolution() == null)
			return false;
		if (item == null){
			if (this.specie.getEvolutionLevel() <= this.level && this.specie.getEvolutionLevel() > 0){
				GenerateSpecies gs = new GenerateSpecies();
				this.specie = gs.getSpecie(Integer.parseInt(this.specie.getEvolution()));
				this.name = this.specie.getName();
				this.calculateStats();
				return true;
			}
		}
		return false;		
	}
	
	public boolean canEvolve(){
		if (this.specie.getEvolutionLevel() == null)
			return false;
		if (this.specie.getEvolution() == null)
			return false;
		if (this.specie.getEvolutionLevel() <= this.level && this.specie.getEvolutionLevel() > 0)
			return true;
		return false;		
	}
	
	public boolean changeLevel(){
		GeneratePokemon gp = new GeneratePokemon();
		int temp = this.level;
		this.level = gp.calculateLevel(this.exp, this.specie.getGrowth());
		gp.calculateStats(this);
		return (this.level != temp);
	}
	
	public Attacks canLearnMoveByLevel(){
		return this.getSpecie().getMappedAttacks().get(this.level);		
	}
	
	public boolean learnMoveByLevel(Attacks attackToLearn, Integer attackToForget){
		GenerateAttack ga = new GenerateAttack();
		if (this.attack1 == null){
			this.attack1 = attackToLearn;
			this.pp1 = ga.getAttack(attackToLearn).getPp();
			return true;
		}
		if (this.attack2 == null){
			this.attack2 = attackToLearn;
			this.pp2 = ga.getAttack(attackToLearn).getPp();
			return true;
		}
		if (this.attack3 == null){
			this.attack3 = attackToLearn;
			this.pp3 = ga.getAttack(attackToLearn).getPp();
			return true;
		}
		if (this.attack4 == null){
			this.attack4 = attackToLearn;
			this.pp4 = ga.getAttack(attackToLearn).getPp();
			return true;
		}
		
		switch (attackToForget) {
		case 1:
			this.attack1 = attackToLearn;
			this.pp1 = ga.getAttack(attackToLearn).getPp();
			return true;
		case 2:
			this.attack2 = attackToLearn;
			this.pp2 = ga.getAttack(attackToLearn).getPp();
			return true;
		case 3:
			this.attack3 = attackToLearn;
			this.pp3 = ga.getAttack(attackToLearn).getPp();
			return true;
		case 4:
			this.attack4 = attackToLearn;
			this.pp4 = ga.getAttack(attackToLearn).getPp();
			return true;
		}
		return false;
	}
	
	public boolean learnMoveByItem(Items item){
		return false;
	}
	
	public void addExperience(Integer exp){
		this.exp += exp;
	}
	
	public void calculateStats(){
		Specie spc = this.getSpecie();
		Float stat = 0f;
		stat = spc.getMaxHP() / 100f * this.getLevel();
		this.setHp(stat.intValue());
		stat = spc.getMaxAttack() / 100f * this.getLevel();
		this.setAttack(stat.intValue());
		stat = spc.getMaxDefense() / 100f * this.getLevel();
		this.setDefense(stat.intValue());
		stat = spc.getMaxSpeed() / 100f * this.getLevel();
		this.setSpeed(stat.intValue());
		stat = spc.getMaxSpecial() / 100f * this.getLevel();
		this.setSpecial(stat.intValue());		
	}
	
	
	
	

}
