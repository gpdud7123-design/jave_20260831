package day13;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Repaint extends JFrame{
	public Repaint() {
		// TODO Auto-generated constructor stub
		setTitle("컴포넌트!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				Random ran = new Random();
				JButton btn = new JButton("버튼");
				btn.setSize(50, 30);
				btn.setLocation(30, 30);
				c.add(btn);
				
				c.revalidate(); 
				c.repaint(); //적절한위치에배치
				
				
			}
			
		});
		
		

		setSize(300, 300);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	public static void main(String[] args) {
		new Repaint();
	}
	
}
