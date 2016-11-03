package main;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Game {
	public static boolean isAlive;
	public Game(){
		isAlive = true;
		while(isAlive){
			try {
				TimeUnit.MILLISECONDS.sleep(1500);
			} catch (InterruptedException e) {
				isAlive = false;
				JFrame frame = new JFrame();
				
				JOptionPane.showMessageDialog(frame,
					    "An error occured! :c",
					    "ERROR",
					    JOptionPane.ERROR_MESSAGE);
			}
			tick();
			
		}
	}
	private void tick() {
		Head.move();
	}
}
