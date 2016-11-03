package main;

public class Map {
	static int map[][]={
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,1,0},
			{0,0,0,0,0,0,2,0},
			{0,0,0,0,0,0,2,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
	};

	public static void update() {
		map[Head.getposX()][Head.getposY()] = 1;
	}
}
