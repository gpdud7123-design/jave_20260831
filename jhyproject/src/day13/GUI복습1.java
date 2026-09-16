package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI복습1 extends JFrame{
	public GUI복습1() {
		// TODO Auto-generated constructor stub
		setTitle("복습!");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아예끄게하는거
		Container c = getContentPane();
//		c.setLayout(new FlowLayout()); // 버튼정렬하는거
		c.setLayout(null); // 밑에사이즈랑btn. 직접조정하는거
		
		JButton btn = new JButton("버튼");
//		btn.setSize(50, 20);
//		btn.setLocation(30, 30);
		btn.setBounds(30, 30, 70, 60); // 사이즈한번에조절하는거
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				c.setBackground(Color.cyan);
				c.setBackground(new Color(100, 100, 100)); // 이렇게도 색넣는거가능
			}
		});
		
		c.add(btn);
		
		
		setVisible(true);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI복습1();

	}

}
