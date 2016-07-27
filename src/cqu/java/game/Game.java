package cqu.java.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MyPanel mPanel;
	private MyPanel mPanel1;
	
	private JButton button;
	private Thread thread;
	private Thread thread1;
	
	public static void main(String[] args) {
		new Game();
	}
	
	public Game() {
		this.setTitle("移动的小球");
		this.setSize(600, 600);
		this.setLocation(200,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		button = new JButton("移动小球");
		button.addActionListener(new BtnClick());
		this.add(button,BorderLayout.NORTH);
		
		mPanel = new MyPanel(40, 40);
		mPanel1 = new MyPanel(40, 200);
		
		//把线程加入到Thread线程中去
		thread = new Thread(mPanel);
		thread1 = new Thread(mPanel1);
		this.add(mPanel);
		this.add(mPanel1);
		
		this.setVisible(true);
	}
	
	class BtnClick implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				thread.start();
				thread1.start();
			}
		}
	}
	
	class MyPanel extends JPanel implements Runnable{
		int x,y;
		
		@Override
		public void run() {
			try {
				for(int i =0;i<100;i++){
					this.x += 5;
					this.repaint();
					Thread.sleep(100);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public MyPanel(int x,int y) {
			this.x = x;
			this.y = y;
		}
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(Color.RED);
			g.fillOval(x, y, 50, 50);
		}
	}
}
