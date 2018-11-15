package TimeTools;

import java.util.*;
import java.util.concurrent.TimeUnit;

import view.GameGUI;

 
public class CutDownTime {
	private int limitSec;
	static private int curSec;
	public int getCursec() {
		return curSec;
	}
	public void setCursec(int i) {
		this.curSec=i;
	}
	@SuppressWarnings("static-access")
	public CutDownTime(int limitSec) throws InterruptedException{
		this.limitSec = limitSec;
		this.curSec = limitSec;
		System.out.println("count down from "+limitSec+" s ");
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			public void run(){
				System.out.println("Time remians "+ --curSec +" s");
			}
		},0,1000);
		TimeUnit.SECONDS.sleep(limitSec);
		timer.cancel();
	}

	public CutDownTime() {
		// TODO Auto-generated constructor stub
	}
 
}
 
