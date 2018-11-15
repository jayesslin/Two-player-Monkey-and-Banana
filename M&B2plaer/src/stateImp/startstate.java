package stateImp;

import com.sun.javafx.tools.packager.Log;

import Controller.GameThread;
import Controller.TimeThread;
import model.Monkey;
import state.state;

public class startstate extends state {


	public void setposition(Monkey m) {
		//Run 2 Thread Tasks
		
		GameThread Game = new GameThread();
		TimeThread Time = new TimeThread();
		Time.start();
		Game.start();
		
	}
	
}
