package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Controller.GameController;
import view.GameGUI.MyPanel;

public class WelcomeGUI extends JFrame{
	static MyPanel mp1= null;
	Image image = Toolkit.getDefaultToolkit().getImage("C:/Users/49396/Desktop/monkey.png");
	Image image1 = Toolkit.getDefaultToolkit().getImage("images/monkey.png");
	public WelcomeGUI() {
		{
		
			mp1 = new MyPanel();
			this.add(mp1);
			this.setSize(800,600);
			this.setIconImage(image);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.addKeyListener((KeyListener) mp1);
		}
	}
	//Draw Scenes
	class MyPanel extends JPanel implements KeyListener
	{
		public void paint(Graphics g)
		{
			//ini with super class function
			super.paint(g);	
			g.setColor(Color.BLUE);
			g.setFont(new Font("TimesRoman",Font.BOLD,30));
			g.drawString("Capture Banana!", 250, 200);
			g.setColor(Color.BLACK);
			g.setFont(new Font("TimesRoman",Font.BOLD,30));
			g.drawString("Start <Enter>", 275, 250);
			g.drawString("Exit <esc>", 275, 300);
			
		} 
		public void keyPressed(KeyEvent e) {
			GameController GC = new GameController();
			String msg = null;
			switch(e.getKeyCode())
			{
				case KeyEvent.VK_ESCAPE:
					
					System.exit(0);
					break;
				case KeyEvent.VK_ENTER:
					
					GC.Changestate("start");
				
					break;
				
			}
}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
}
