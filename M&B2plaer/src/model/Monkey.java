package model;

import java.util.Random;

public class Monkey {
	
	private int score=0;
	Random random = new Random();
	int num = random.nextInt(50)+1;
	private int x=num;
	private int y=num;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x += x;
		//range is limited in 0-50
		if(this.x>50) {this.x = 50;}
		if(this.x<0) {this.x=0;}
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y += y;
		//range is limited in 0-50
		if(this.y>50) {this.y = 50;}
		if(this.y<0) {this.y=0;}
	}
	public void setScore(int i) {
		this.score+=i;
		if(this.score<0) this.score=0;
	}
	public int getScore() {
		return score;
	}
	public Monkey() {
		
	}
	public static Monkey one = new Monkey();
	public static Monkey two = new Monkey();
}
