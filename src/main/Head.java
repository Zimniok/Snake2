package main;

public class Head {
	private static int body_parts_count = 2;
	private static int posX = 6,posY = 1, lastposX=6, lastposY=1;
	private static int direction=3;

	public static void move(){
		switch(direction){
			case 0:
				lastposY = posY;
				posY++;
				break;
			case 1:
				lastposX = posX;
				posX++;
				break;
			case 2:
				lastposY = posY;
				posY--;
				break;
			case 3:
				lastposX = posX;
				posX--;
				break;
		}
	}
	public static int getposX(){
		return posX;
	}
	public static int getposY(){
		return posY;
	}
	public static int getlastposX(){
		return lastposX;
	}
	public static int getlastposY(){
		return lastposY;
	}
}
