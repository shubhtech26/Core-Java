package swing;


import java.awt.FlowLayout;

import  javax.swing.JFrame;
import javax.swing.JLabel;
public class applet2{

	public static void main(String[] args) {
		abc1 obj =new abc1();
		//obj.show()
	
	
		
	}
}
class abc1 extends JFrame     //cardlayout
{
	
	public abc1()

	{	
		
		
		setLayout(new FlowLayout());  //flowgridnull
		JLabel abc1 = new JLabel("hello world");
		JLabel def1 = new JLabel("to applet");
		
				
		
		
		add(abc1);
		add(def1);  
		
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	}