package def_pkg;

import javax.swing.*;

public class BM_System {
	
	public static void main(String[] args) {
		JFrame frame=new JFrame("Bank Managment System");
		//System.out.println("Image path: "+System.getProperty("user.dir") + "\\src\\def_pkg\\ddot.png");
		//frame.setIconImage(  new ImageIcon(System.getProperty("user.dir") + "\\BM_System\\src\\def_pkg\\anchor.png").getImage() );
		
		GUI interf = new GUI();
		Login_Account user = new Login_Account();
	    interf.openSignInForm(frame, user);
		frame.setSize(2800,2500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
	}
}
