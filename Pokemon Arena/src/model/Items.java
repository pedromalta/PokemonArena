package model;

import java.io.Serializable;

import enums.ItemType;

public class Items implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2430331937084440143L;

	private Integer id;
	
	private String name;
	
	private ItemType itemType;
	
	private Integer pointCost;
	
	private Integer image;
	
	private Integer description;
	
	public void useItem(Pokemon pokemon){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public Integer getPointCost() {
		return pointCost;
	}

	public void setPointCost(Integer pointCost) {
		this.pointCost = pointCost;
	}

	public Integer getImage() {
		return image;
	}

	public void setImage(Integer image) {
		this.image = image;
	}

	public Integer getDescription() {
		return description;
	}

	public void setDescription(Integer description) {
		this.description = description;
	};
	
	

}
