package model;


public class Avatar {
	private Integer img;
	private Integer imgBig;
	private Boolean selected;
	
	public Avatar(Integer img, Integer imgBig){
		super();
		this.img = img;
		this.imgBig = imgBig;
		this.selected = false;
		
	}
	
	public Integer getImg() {
		return img;
	}
	public void setImg(Integer img) {
		this.img = img;
	}
	public Boolean getSelected() {
		return selected;
	}
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	public Integer getImgBig() {
		return imgBig;
	}

	public void setImgBig(Integer imgBig) {
		this.imgBig = imgBig;
	}
	
	

}
