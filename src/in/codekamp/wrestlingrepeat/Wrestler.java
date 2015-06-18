package in.codekamp.wrestlingrepeat;

public class Wrestler {
	
	private String name;
	private int rank;
	private double height;
	private double weight;
	private int matchesWon;
	private int matchesLost;
	private int totalMatches;
	
	public Wrestler(String name, int rank, double height, double weight, int matchesWon, int matchesLost){
		this.name = name;
		this.rank = rank;
		this.height = height;
		this.weight = weight;
		this.matchesWon = matchesWon;
		this.matchesLost = matchesLost;
		this.totalMatches = matchesWon + matchesLost;
	}

}
