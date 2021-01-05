package swing;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class additionapplet {
public static void main(String[] args)
{
	add1 obj1 = new add1();
}

}
class add1 extends JFrame implements ActionListener
{
	JLabel l ,l1;
	JTextField a1 ,a2;
	JButton c ;
	public add1()
	{
		
	 l = new JLabel("addition");
	
	 a1= new JTextField(20);
	 a2= new JTextField(20);
	 c = new JButton("ok");
	 l1 = new JLabel("RESULT");
	 
	add(l);
	add(a1);
	add(a2);
	add(c);
	add(l1);
	
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		c.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
	int num1 =Integer.parseInt(a1.getText());
	int num2= Integer.parseInt(a2.getText());
	int value= num1+num2;
	l1.setText(value+ "");
	
	}
	
	
}