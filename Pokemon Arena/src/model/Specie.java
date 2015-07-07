package model;

import java.io.Serializable;
import java.util.ArrayList; 
import java.util.Map;

import enums.Attacks;
import enums.Growth;
import enums.Types;

@SuppressWarnings("serial")
public class Specie  implements Serializable {
	
	
	private String id;
	
	private ArrayList<Types> types;
	
	private String name;
	
	private Integer image;
	private Integer imageBack;
	private Integer imagePremium;
	private Integer imagePremiumBack;
	private Integer imageBig;
	
	private Integer pointCost;
	
	private Integer maxHP;
	private Integer maxAttack;
	private Integer maxDefense;
	private Integer maxSpeed;
	private Integer maxSpecial;
	
	private Growth growth;	
	private Integer effort;
	
	private String evolution;
	
	private Integer evolutionLevel;
	
	private Map<Integer, Attacks> MappedAttacks; //attack - level

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Types> getTypes() {
		return types;
	}

	public void setTypes(ArrayList<Types> types) {
		this.types = types;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getImage() {
		return image;
	}

	public void setImage(Integer image) {
		this.image = image;
	}

	public Integer getImageBack() {
		return imageBack;
	}

	public void setImageBack(Integer imageBack) {
		this.imageBack = imageBack;
	}

	public Integer getImagePremium() {
		return imagePremium;
	}

	public void setImagePremium(Integer imagePremium) {
		this.imagePremium = imagePremium;
	}

	public Integer getImagePremiumBack() {
		return imagePremiumBack;
	}

	public void setImagePremiumBack(Integer imagePremiumBack) {
		this.imagePremiumBack = imagePremiumBack;
	}

	public Integer getImageBig() {
		return imageBig;
	}

	public void setImageBig(Integer imageBig) {
		this.imageBig = imageBig;
	}

	public Integer getPointCost() {
		return pointCost;
	}

	public void setPointCost(Integer pointCost) {
		this.pointCost = pointCost;
	}

	public Integer getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(Integer maxHP) {
		this.maxHP = maxHP;
	}

	public Integer getMaxAttack() {
		return maxAttack;
	}

	public void setMaxAttack(Integer maxAttack) {
		this.maxAttack = maxAttack;
	}

	public Integer getMaxDefense() {
		return maxDefense;
	}

	public void setMaxDefense(Integer maxDefense) {
		this.maxDefense = maxDefense;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Integer getMaxSpecial() {
		return maxSpecial;
	}

	public void setMaxSpecial(Integer maxSpecial) {
		this.maxSpecial = maxSpecial;
	}

	public Map<Integer, Attacks> getMappedAttacks() {
		return MappedAttacks;
	}

	public void setMappedAttacks(Map<Integer, Attacks> mappedAttacks) {
		MappedAttacks = mappedAttacks;
	}

	public String getEvolution() {
		return evolution;
	}

	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}

	public Integer getEvolutionLevel() {
		return evolutionLevel;
	}

	public void setEvolutionLevel(Integer evolutionLevel) {
		this.evolutionLevel = evolutionLevel;
	}

	public Growth getGrowth() {
		return growth;
	}

	public void setGrowth(Growth growth) {
		this.growth = growth;
	}

	public Integer getEffort() {
		return effort;
	}

	public void setEffort(Integer effort) {
		this.effort = effort;
	}

	
	
	
	
	
	
	
	
	
	

	
	
	

}
