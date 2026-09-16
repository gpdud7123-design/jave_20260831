package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	public TextFieldEx() {
		// TODO Auto-generated constructor stub
		setTitle("체크박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(20));
		c.add(new JLabel("주소"));
		c.add(new JTextField(20));
		
		c.add(new JLabel("취미"));
		JCheckBox game = new JCheckBox("게임");
		JCheckBox movie = new JCheckBox("영화감상");
		JCheckBox read = new JCheckBox("독서");
		JCheckBox coding = new JCheckBox("코딩");
		
		c.add(new JLabel("성별"));
		
		
		
		JButton btn = new JButton("저장");
		c.add(btn);
		
		
		
		setSize(300, 300);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
