package swing;

import java.awt.FlowLayout;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
public class jbutton {
   public static void main(String[] args) {
	 radiodemo obj6= new radiodemo();
	
}
}
class radiodemo extends JFrame
{
	JTextField t1;
	JButton c;
	JRadioButton 	r1 ,r2;
	JLabel l ;
	JCheckBox c1,c2;
	public radiodemo()
	
	{
		 t1= new JTextField(20);
		 c = new JButton("ok");
		 r1 = new JRadioButton("MALE");
		 r2 = new JRadioButton("FEMALE");
		 c1= new JCheckBox("DANCING");
		 c2= new JCheckBox("SINGING");
		 l = new JLabel("Greeting");
	
	add(t1);
	add(c);
	add(r1);
	add(r2);
	add(l);
	add(c1);
	add(c2);
	ButtonGroup bg = new ButtonGroup ();
	bg.add(r1);
	bg.add(r2);
	
	ButtonGroup cg = new ButtonGroup();
	cg.add(c1);
   	cg.add(c2);
	
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(400,400);
	
	c.addActionListener( new ActionListener() {
		
		public void actionPerformed(ActionEvent ae) {
		
			
		String name = t1.getText();
		
		if (r1.isSelected())
		{
		 name = "Mr"+"     "  +name;
		}
		else
		
		{
		name = "Mrs" +    "     "+ name;
		
		}
	
		
		if (c1.isSelected())
		{
		 name = "Master"+"     " + name;
		}
		else
		
		{
		name = "Misses"+"      "+  name;
		
		}
		
		l.setText(name);
		
		}

	});	
	
	
	
	c2.addItemListener(new ItemListener() {@Override
	public void itemStateChanged(ItemEvent e) {
	
		
		System.out.println("dancer");
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	});
	
	

	}
	}