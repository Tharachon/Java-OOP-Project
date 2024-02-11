package charactor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Khumanthong {
	public int x, y, ghostSize;
	private int speed_walk = 100;
	private int high_jump = 100;
	
	public Khumanthong(int x,int y,int ghostSize) {
		this.x = x;
		this.y = y;
		this.ghostSize = ghostSize;
	}
	
	public void walk() {
		this.x += speed_walk;
	}
	
	public void jump(JPanel page) {
		this.y -= high_jump;
		page.repaint();
		//--- fall ---
		Timer timer =new Timer(450,(ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//					y += 10;
					page.repaint();
			}
		});
		timer.setRepeats(false);
		timer.start();
	}
	
	public void hit() {
		
	}

}
