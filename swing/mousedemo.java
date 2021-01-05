package swing;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class mousedemo {
	public static void main(String[] args) {
		
		mouseworks obj6 =new mouseworks();
		
	}

}
   

class mouseworks extends JFrame

{
	
	public mouseworks()
	
	
	
	{
	
		

	
	addMouseListener(new MouseAdapter()
			
			{
			
			public void mousePressed(MouseEvent e)
			
			{
				
			int x = e.getX();
			int y = e.getY();
			System.out.println(x +"      " +y );
			
			
			
			}  
			
			
			
			});
	
		
		
		
		

		
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






	}	


}