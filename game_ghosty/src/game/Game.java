package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import charactor.Khumanthong;

public class Game extends JPanel implements KeyListener {
	
	private long lastPress = 0;
	Khumanthong khumanthong = new Khumanthong(50,300,50);
	public Game() {
		this.setBounds(0, 0, 1000, 600);
		this.addKeyListener(this);
		this.setFocusable(true);
		this.setLayout(null);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.RED);
		g2.drawRect(khumanthong.x, khumanthong.y, khumanthong.ghostSize, khumanthong.ghostSize);
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println("Hello");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(System.currentTimeMillis() - lastPress > 600) {
			if(e.getKeyCode()==32||e.getKeyCode()==38) {
					khumanthong.jump(this);
					lastPress = System.currentTimeMillis();
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
