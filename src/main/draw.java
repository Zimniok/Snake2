package main;

import java.awt.Color;
import java.awt.Graphics;

public class draw {
	int width = Window.frame.WIDTH/8;
	int height = Window.frame.HEIGHT/8;
	public void render(Graphics g){
		for(int i=0;i<8;i++){
			for (int j = 0; j<8; j++){
				if(Map.map[i][j] == 1){
					g.setColor(Color.BLACK);
					g.fillRect(i*width, j*height, width, height);
				}
			}
		}
	}
}
