package model;

import java.util.Random;

public class Banana {
	Random random = new Random();
	int num = random.nextInt(50)+1;
	private int x=num;
	private int y=num;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	private static Banana instance=new Banana();
	private Banana() {
		
	}
	public static Banana getInstance() {
		return instance;
	}
}
