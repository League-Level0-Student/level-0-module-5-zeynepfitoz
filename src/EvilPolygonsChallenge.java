import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot r2d2= new Robot();
		//2. Set the speed to 100
r2d2.setSpeed(100);
r2d2.moveTo(250, 200 );
		int e=JOptionPane.showOptionDialog(null, "Choose a Color", "COLOR", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Blue","Pink", "Mint","Green","Yellow","Light Blue", "Orange","Purple"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(e==0) {
			r2d2.setPenColor(30, 218, 249);
		}
		else if (e==1) {
			r2d2.setPenColor(217,50 , 117);
		}
		else if(e==2) {
			r2d2.setPenColor(78, 255, 150);
		}
		else if(e==3) {
			r2d2.setPenColor(0,255 ,0 );
		}		
		else if(e==4) {
			r2d2.setPenColor(215, 255, 0);
		}		
		else if(e==5) {
			r2d2.setPenColor(207, 255, 255);
		}
		else if(e==6) {
			r2d2.setPenColor(255, 140, 0);
		}
		else if(e==7) {
			r2d2.setPenColor(207, 140, 255);
		}
		else if(e==8) {
			r2d2.setPenColor(0, 0, 0);
		}
	
		//4. Ask the use how many polygons they want to be drawn.
		String a=JOptionPane.showInputDialog("How many Triangles do you want?");
		//5. Use the robot to draw the number of polygons the user requested.
		int num= Integer.parseInt(a);
		
	
		for (int i = 0; i < num; i++) {
			
			r2d2.turn(35);
			r2d2.penDown();
			r2d2.move(100);
			r2d2.turn(115);
			r2d2.move(100);
			r2d2.turn(120);
			r2d2.move(100);
			r2d2.penUp();
			r2d2.turn(180);
			r2d2.move(150);
			r2d2.turn(170);
		
		}{
			
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

