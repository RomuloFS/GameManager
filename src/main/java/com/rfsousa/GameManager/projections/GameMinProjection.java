package com.rfsousa.GameManager.projections;

public interface GameMinProjection {
	
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	String position();
}
