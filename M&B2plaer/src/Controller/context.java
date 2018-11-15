package Controller;

import java.util.Random;

import model.Banana;
import model.Grid;
import model.Monkey;
import state.state;

public class context {
	private state Curstate;
	Monkey m = Monkey.one;
	Monkey mm= Monkey.two;
	private static int width=50;
	private static int length=50;
	public void setState(Monkey m,state s) {
		//System.out.println("State Change!");
		Curstate = s;
		Curstate.setposition(m);
		eat();
	}
	public void setState(state s) {
		//System.out.println("State Change!");
		Curstate = s;
		Curstate.setposition(m);
		eat();
	}
	Banana b= Banana.getInstance(); 
	//Mnkey eat a banana get 10 score.
	public void eat() {
		if (m.getX()==b.getX()&&m.getY()==b.getY()) {
			m.setScore(10);
			setBanana();
			System.out.println("Another Banana is exsits in:"+b.getX()+","+b.getY()+"!");
			System.out.println("Monkey score is :"+m.getScore()+"!");
		}
		else if (mm.getX()==b.getX()&&mm.getY()==b.getY()) {
			mm.setScore(10);
			setBanana();
			System.out.println("Another Banana is exsits in:"+b.getX()+","+b.getY()+"!");
			System.out.println("Monkey score is :"+mm.getScore()+"!");
		} 
		
	}
	public void setBanana() {
		Random random = new Random();
		int num = random.nextInt(50)+1;
		b.setY(num);
		b.setX(num);
	}
	
}
