import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
	String num=JOptionPane.showInputDialog("Pick a random number!");
	int N=Integer.parseInt(num);
		if(N%2==0) {
			 JOptionPane.showMessageDialog(null, "NOT PRIME!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Prime!");
		}
	
		
	

}
}
