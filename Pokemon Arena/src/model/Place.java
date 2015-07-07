package model;

import java.io.Serializable;

public class Place implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 190627029796798028L;

	private Integer id;
	
	private String name;
	
	private City city;
	
	private Integer backgroundColor;
	
	private Integer welcomeText;
	
	private Integer background;
	
	private Integer building;

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

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Integer getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Integer backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public Integer getWelcomeText() {
		return welcomeText;
	}

	public void setWelcomeText(Integer welcomeText) {
		this.welcomeText = welcomeText;
	}

	public Integer getBackground() {
		return background;
	}

	public void setBackground(Integer background) {
		this.background = background;
	}

	public Integer getBuilding() {
		return building;
	}

	public void setBuilding(Integer building) {
		this.building = building;
	}


	

}
