class BatsMan{
	String team, playersName;
	int matchPlayed,totalRuns,noOfBallsFaced;
	public void calculateAverage(){
		System.out.println("");
		 
	}
	public void findStrikeRate(){
		double strikeRate = (totalRuns/noOfBallsFaced) * 100;
		System.out.println("Strike Rate\t" + strikeRate);
	}
	public void displayDetails(){
		System.out.println("Team\t"+ team);
		System.out.println("Player Name\t" +  playersName);
		System.out.println("" +team);
		calculateAverage();
		findStrikeRate();
	}
	
}
class MainClass{
	public static void main(String [] args){
		BatsMan b1 = new BatsMan();
		b1.team = "INDIA";
		b1.playersName = "Virat Kohli";
		b1.matchPlayed = 1230;
		b1.totalRuns = 7000;
		b1.noOfBallsFaced = 2000;
		b1.displayDetails();
		
	}
	
}