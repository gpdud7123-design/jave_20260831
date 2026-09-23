package day18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class KeyAlert extends JFrame {

	KeyAlert() {
		super("숫자가 아닌 키가 입력되는 경우 경고장만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JTextField tf = new JTextField(15);
		c.add(new JLabel("학번 : "));

		c.add(tf);
		
		tf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyChar() < '0' || e.getKeyChar() > '9') {// 숫자 키 아님
					char c = e.getKeyChar();
					JOptionPane.showMessageDialog(
							null, 
							c + "는 숫자 키가 아닙니다.\n숫자를 입력하세요.", 
							"경고", 
							JOptionPane.ERROR_MESSAGE
					);
					e.consume(); 
				}
			}
		});

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyAlert();

	}

}
