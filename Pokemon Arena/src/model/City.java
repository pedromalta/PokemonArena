package model;

import java.io.Serializable;
import java.util.List;

import enums.Types;

public class City implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 917916824219990212L;

	private Integer id;

	private String name;
	
	private Types type;
	
	private Integer img1;
	
	private Integer img2;
	
	private Integer level;

	private List<Place> places;

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

	public Types getType() {
		return type;
	}

	public void setType(Types type) {
		this.type = type;
	}

	public Integer getImg1() {
		return img1;
	}

	public void setImg1(Integer img1) {
		this.img1 = img1;
	}

	public Integer getImg2() {
		return img2;
	}

	public void setImg2(Integer img2) {
		this.img2 = img2;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public List<Place> getPlaces() {
		return places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}

	



	
	
	
	
	

}
