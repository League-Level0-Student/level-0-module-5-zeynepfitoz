import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
	String num=JOptionPane.showInputDialog("Pick a random number!");
	int N=Integer.parseInt(num);
	boolean notPrime = false;
	
	for (int i = 2; i < N; i++) {
		
		if( (N%i) == 0) {
			 JOptionPane.showMessageDialog(null, "NOT PRIME!");
			 notPrime = true;
			 break;
		}
	}
	
	if (notPrime==false)
	{
		JOptionPane.showMessageDialog(null, "Prime!");
	}
	
	

}
}
