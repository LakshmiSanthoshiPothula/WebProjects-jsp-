package com.training.entity;

public class Player {
	private int playerId,noOfMatches,totalRunsScored, noOWickets;
	private boolean captain;
	private String playerName;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public Player(int playerId, String playerName,int noOfMatches, int totalRunsScored,
			int noOWickets, boolean captain) {
		super();
		this.playerId = playerId;
		this.noOfMatches = noOfMatches;
		this.totalRunsScored = totalRunsScored;
		this.noOWickets = noOWickets;
		this.captain = captain;
		this.playerName = playerName;  
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", noOfMatches=" + noOfMatches
				+ ", totalRunsScored=" + totalRunsScored + ", noOWickets="
				+ noOWickets + ", captain=" + captain + ", playerName="
				+ playerName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + playerId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (playerId != other.playerId)
			return false;
		return true;
	}
	public int getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public int getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	public int getNoOWickets() {
		return noOWickets;
	}
	public void setNoOWickets(int noOWickets) {
		this.noOWickets = noOWickets;
	}
	public boolean isCaptain() {
		return captain;
	}
	public void setCaptain(boolean captain) {
		this.captain = captain;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getBattingRating() {
		double average = this.totalRunsScored / this.noOfMatches;
		if (average > 90) {
			return "best";
		}
		else if (average >= 50) {
			return "good";
			}
		 else if (average >= 25) {
			return "average";
		 }
		 else return "poor";
		
	
	}
	

	public String getBowlingRating() {
		double average = this.totalRunsScored / this.noOWickets;
		if (average > 90) {
			return "best";
		}
		else if (average >= 50) {
			return "good";
			}
		 else if (average >= 25) {
			return "average";
		 }
		 else return "poor";
		
	
	}
}
