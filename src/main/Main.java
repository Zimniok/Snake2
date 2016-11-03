package main;

public class Main {
	
	public static void main (String args[]){
		Segment seg1 = new Segment();
		Segment seg2 = new Segment();
		Player.init(seg1);
		Player.init(seg2);
		Game game = new Game();
	}
	
}
