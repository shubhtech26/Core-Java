package swing;
import  javax.swing.JFrame;
import javax.swing.JLabel;
public class applet {

	public static void main(String[] args) {
		abc obj =new abc();
		//obj.show()
		
	}
}
class abc extends JFrame
{
	
	public abc()

	{		
		JLabel abc = new JLabel("hello world");
		add(abc);
		setVisible(true);
		setSize(400, 400);
	}
	
	}