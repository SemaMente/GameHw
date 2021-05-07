package Entities;

public class Game {
	
	private int gameId;
	private String gameName;
	private String gameType;
	private double gamePrice;
	public Game(int gameId, String gameName, String gameType, double gamePrice) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameType = gameType;
		this.gamePrice = gamePrice;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public double getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

}
