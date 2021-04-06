package com.wolken.wolkenapp.dto;

public class TeamsDTO {
	private int noForiegnPlayers;
	private String name;
	private String homeGround;

	public TeamsDTO(int i, String s, String s2) {
		this.noForiegnPlayers = i;
		this.name = s;
		this.homeGround= s2;

	}

	public int getNoForiegnPlayers() {
		return noForiegnPlayers;
	}

	public void setNoForiegnPlayers(int noForiegnPlayers) {
		this.noForiegnPlayers = noForiegnPlayers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeGround() {
		return homeGround;
	}

	public void setHomeGround(String homeGround) {
		this.homeGround = homeGround;
	}

}
