package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class appletadd2way {
public static void main(String[] args)
{
	calcu obj4 = new calcu();
}

}
class calcu extends JFrame 
{
	JLabel l ,l1;
	JTextField a1 ,a2;
	JButton c ,d;
	public calcu()
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
	add(d);
	add(l1);
	
	

	c.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) {
		
			int num1 =Integer.parseInt(a1.getText());
			int num2= Integer.parseInt(a2.getText());
			int value= num1+num2;
			l1.setText(value+ "");
	
	
	}
	});
			
			

	d.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) {
		
			int num1 =Integer.parseInt(a1.getText());
			int num2= Integer.parseInt(a2.getText());
			int value= num1-num2;
			l1.setText(value+ "");
	
	
	}
	});
			
			
	
			
			
			
			
			
			
			
	
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
	
	
			
	
	
	
	
	}
	
} 