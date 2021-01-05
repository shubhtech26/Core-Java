package swing;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class callingframe 
{

	public static void main(String[] args)
	{
		
		x obj7 = new x();
				
	}
}



class x extends JFrame implements ActionListener
{
	
	int i=0;
	JProgressBar p1;
 public x()
 
 {
	
	 JButton b1 = new JButton("AddForm");
	 add(b1);
	 
	 p1= new JProgressBar();
	 add(p1);
	 
	 Timer t = new Timer(250,this);
	 
	 
	 b1.addActionListener( new ActionListener() 
	 {
		
		
		public void actionPerformed(ActionEvent e) {
				
	t.start();
		}

	 });
	 
	 
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
 }
 
 @Override
	public void actionPerformed(ActionEvent e) {
		
		if (i==25)
		{
			new calc();
			this.dispose();
			
		}
		i++;
		p1.setValue(i);
		
		}
	
}