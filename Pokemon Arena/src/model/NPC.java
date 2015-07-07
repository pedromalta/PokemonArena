package model;



public class NPC extends Trainer{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8995611661791760752L;
	
	
	private boolean defeated;
	private Integer speechStart;
	private Integer speechWon;
	private Integer speechLose;
	
	public static int npcID = -252345;	
	
	public Integer getSpeechStart() {
		return speechStart;
	}
	public void setSpeechStart(Integer speechStart) {
		this.speechStart = speechStart;
	}
	public Integer getSpeechWon() {
		return speechWon;
	}
	public void setSpeechWon(Integer speechWon) {
		this.speechWon = speechWon;
	}
	public Integer getSpeechLose() {
		return speechLose;
	}
	public void setSpeechLose(Integer speechLose) {
		this.speechLose = speechLose;
	}
	public Boolean getDefeated() {
		return defeated;
	}
	public void setDefeated(boolean defeated) {
		this.defeated = defeated;
	}
	
	
	
	
	
	


}
