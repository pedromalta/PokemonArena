package model;

import java.util.List;
import java.util.Random;

import android.view.animation.Animation;
import enums.Attacks;
import enums.Base;
import enums.Modifier;
import enums.Status;
import enums.Types;

public class Attack {

	private Attacks id;
	
	private String name;
	
	private Types type;
	
	private Integer power;
	
	private Integer accuracy;
	
	private Base base;
	
	private Integer pp;
	
	private Integer maxPP;
	
	private Boolean critical;
	
	private Modifier modifier;
	
	private Status statusChange;
	
	private Integer statusChangeMeter;
	
	private List<Types> strongAgainst;
	private List<Types> weakAgainst;
	private List<Types> innefectiveAgainst;
	
	private Animation animation;
	
	
	public Attacks getId() {
		return id;
	}
	public void setId(Attacks id) {
		this.id = id;
	}
	public Types getType() {
		return type;
	}
	public void setType(Types type) {
		this.type = type;
	}
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	public Integer getPp() {
		return pp;
	}
	public void setPp(Integer pp) {
		this.pp = pp;
	}
	public Boolean getCritical() {
		return critical;
	}
	public void setCritical(Boolean critical) {
		this.critical = critical;
	}
	public Status getStatusChange() {
		return statusChange;
	}
	public void setStatusChange(Status statusChange) {
		this.statusChange = statusChange;
	}
	public Integer getStatusChangeMeter() {
		return statusChangeMeter;
	}
	public void setStatusChangeMeter(Integer statusChangeMeter) {
		this.statusChangeMeter = statusChangeMeter;
	}
	public Integer getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(Integer accuracy) {
		this.accuracy = accuracy;
	}
	public Base getBase() {
		return base;
	}
	public void setBase(Base base) {
		this.base = base;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Modifier getModifier() {
		return modifier;
	}
	public void setModifier(Modifier modifier) {
		this.modifier = modifier;
	}	
	public Integer getMaxPP() {
		return maxPP;
	}
	public void setMaxPP(Integer maxPP) {
		this.maxPP = maxPP;
	}
	public List<Types> getStrongAggainst() {
		return strongAgainst;
	}
	public void setStrongAggainst(List<Types> strongAggainst) {
		this.strongAgainst = strongAggainst;
	}
	public List<Types> getWeakAggainst() {
		return weakAgainst;
	}
	public void setWeakAggainst(List<Types> weakAggainst) {
		this.weakAgainst = weakAggainst;
	}
	public List<Types> getInnefectiveAggainst() {
		return innefectiveAgainst;
	}
	public void setInnefectiveAggainst(List<Types> innefectiveAggainst) {
		this.innefectiveAgainst = innefectiveAggainst;
	}	
	
	public List<Types> getStrongAgainst() {
		return strongAgainst;
	}
	public void setStrongAgainst(List<Types> strongAgainst) {
		this.strongAgainst = strongAgainst;
	}
	public List<Types> getWeakAgainst() {
		return weakAgainst;
	}
	public void setWeakAgainst(List<Types> weakAgainst) {
		this.weakAgainst = weakAgainst;
	}
	public List<Types> getInnefectiveAgainst() {
		return innefectiveAgainst;
	}
	public void setInnefectiveAgainst(List<Types> innefectiveAgainst) {
		this.innefectiveAgainst = innefectiveAgainst;
	}
	public Animation getAnimation() {
		return animation;
	}
	public void setAnimation(Animation animation) {
		this.animation = animation;
	}
	public void effect (Pokemon attacker, Pokemon defender, boolean criticalHit){
		Random randGenerate = new Random();
		
		Integer attack = 0;
		Integer defense = 0;
		Integer level = attacker.getLevel();
		Float sameType = 1f;
		Float typeModifier = getTypeModifier(this.getType(), defender.getSpecie());
		Types type1 = attacker.getSpecie().getTypes().get(0);
		Types type2 = null;
		if (attacker.getSpecie().getTypes().size() == 2)
			type2 = attacker.getSpecie().getTypes().get(1);
		Float damage = 0f;
		
		if (this.getBase() == Base.Physical){
			attack = attacker.getAttack();
			defense = defender.getDefense();
		}
		if (this.getBase() == Base.Special){
			attack = attacker.getSpecial();
			defense = defender.getSpecial();
		}		
		if (criticalHit)
			level *= 2;
		
		if (type1.equals(this.getType()))
			sameType = 1.5f;
		if (type2 != null && type2.equals(this.getType()))
			sameType = 1.5f;

		damage = (((((2 * level / 5 + 2f) * attack * this.getPower()) / defense /50 + 2) * sameType * typeModifier) * (randGenerate.nextInt(39) + 217)) / 255;
		
		defender.setLife(defender.getLife() - damage.intValue());
		if (defender.getLife() < 0)
			defender.setLife(0);
	}
	
	
	private float getTypeModifier(Types attack, Specie defender){
		
		float mod = 1f;
		
		boolean strongType1 = this.getStrongAggainst().contains(defender.getTypes().get(0));
		boolean weakType1 = this.getWeakAggainst().contains(defender.getTypes().get(0));
		boolean innefectiveType1 = this.getInnefectiveAggainst().contains(defender.getTypes().get(0));
		boolean strongType2 = false;
		boolean weakType2 = false;
		boolean innefectiveType2 = false;

		if (defender.getTypes().size() > 1){
			strongType2 = this.getStrongAggainst().contains(defender.getTypes().get(1));
			weakType2 = this.getWeakAggainst().contains(defender.getTypes().get(1));
			innefectiveType2 = this.getInnefectiveAggainst().contains(defender.getTypes().get(1));
		}
		
		if (strongType1) // strong against type 1
			mod *= 2;
		if (strongType2) // strong against type 2
			mod *= 2;
		if (weakType1) // weak against type 1
			mod *= 0.5;
		if (weakType2) // weak against type 2
			mod *= 0.5;
		if (innefectiveType1) // innefective against type 1
			mod *= 0;
		if (innefectiveType2) // innefective against type 2
			mod *= 0;
		
		System.out.println("Type Effective: " + mod);
		
		return mod;		
	}
	
	public boolean calculatecriticalHit(Pokemon attacker){
		boolean criticalHit = false;
		
		Random randGenerate = new Random();
		
		float criticalModifier = 0;
		if (this.getCritical())
			criticalModifier = attacker.getSpeed() / 64f;
		else
			criticalModifier = attacker.getSpeed() / 512f;
		
		System.out.println("Critical Modifier:" + criticalModifier);
		if (criticalModifier > 99.6)
			criticalModifier = 99.6f;
		
		Float temp = randGenerate.nextInt(100) + 1 + criticalModifier;
		
		criticalHit = (temp.intValue() >= 100);
		System.out.println("Critical hit: " + temp);
		
		return criticalHit;
	}

	
	
	
	

	
	
	

}
