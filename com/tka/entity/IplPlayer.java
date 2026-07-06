package com.tka.entity;

public class IplPlayer {
	
	    private int jerseyNo;
	    private String playerName;
	    private String teamName;
	    private int runs;
	    private int wickets;

	    public IplPlayer() {

	    }

	    public IplPlayer(int jerseyNo, String playerName, String teamName, int runs, int wickets) {
	        this.jerseyNo = jerseyNo;
	        this.playerName = playerName;
	        this.teamName = teamName;
	        this.runs = runs;
	        this.wickets = wickets;
	    }

	    public int getJerseyNo() {
	        return jerseyNo;
	    }

	    public void setJerseyNo(int jerseyNo) {
	        this.jerseyNo = jerseyNo;
	    }

	    public String getPlayerName() {
	        return playerName;
	    }

	    public void setPlayerName(String playerName) {
	        this.playerName = playerName;
	    }

	    public String getTeamName() {
	        return teamName;
	    }

	    public void setTeamName(String teamName) {
	        this.teamName = teamName;
	    }

	    public int getRuns() {
	        return runs;
	    }

	    public void setRuns(int runs) {
	        this.runs = runs;
	    }

	    public int getWickets() {
	        return wickets;
	    }

	    public void setWickets(int wickets) {
	        this.wickets = wickets;
	    }

	    @Override
	    public String toString() {
	        return "Player [Jersey No=" + jerseyNo + ", Name=" + playerName +
	                ", Team=" + teamName + ", Runs=" + runs +
	                ", Wickets=" + wickets + "]";
	    }

	}

