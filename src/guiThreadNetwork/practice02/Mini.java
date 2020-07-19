package guiThreadNetwork.practice02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Mini extends JFrame {
	JFrame jf = new JFrame();
	
	public Mini() {}
	
	public void gui() {
		
		jf.setLayout(new BorderLayout());
		jf.setSize(500, 300);
		jf.setResizable(false);
		
		JButton button = new JButton("누르기");
		
		JTextArea ta = new JTextArea();
		
		jf.add(button,"North");
		jf.add(ta,"Center");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String str = "버튼이 눌렸습니다.\n";
				ta.append(str);
			}
		});
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(new JFrame().EXIT_ON_CLOSE);
		
	}
	
}
