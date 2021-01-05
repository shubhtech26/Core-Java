package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calcapplet {
public static void main(String[] args) {
	

	calc obj2 = new calc();
}

}
class calc extends JFrame 
{
	JLabel l ,l1;
	JTextField a1 ,a2;
	JButton c ,d;
	public calc()
	{
		
	 l = new JLabel("calculator");
	
	 a1= new JTextField(20);
	 a2= new JTextField(20);
	 c = new JButton("ADD");
	 d = new JButton("SUBTRACT");
	 l1 = new JLabel("RESULT");
	add(l);
	add(a1);
	add(a2);
	add(c);
	add(l1);
	
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
//		ActionListener a11 = new ActionListener()
//				{
//	public void actionPerformed(ActionEvent ae)
//	{
//		
//		int num1 =Integer.parseInt(a1.getText());
//		int num2= Integer.parseInt(a2.getText());
//		int value= num1+num2;
//		l1.setText(value+ "");
//	}
//			
//	};	
//		c.addActionListener(a11);
		
		// lambda expresssion calculation solve problem
		c.addActionListener( ae ->
		{
		 
			int num1 =Integer.parseInt(a1.getText());
			int num2= Integer.parseInt(a2.getText());
			int value= num1+num2;
			l1.setText(value+ "");
				});
	
	}
	
} 