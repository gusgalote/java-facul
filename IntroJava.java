import javax.swing.*;

class IntroJava
{
	public static void main (String args[])
	{
		int n1, n2;
		double divResult, pow;
		String message = "";

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número (inteiro): "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número (inteiro):"));

		divResult = n1 / n2;
		pow = Math.pow(n1, n2);

		message = n1 + " / " + n2 + " = " + divResult + "\n" + n1 + "^" + n2 +" = " + pow + "\n";

		JOptionPane.showMessageDialog(null, message);

		System.exit(0);
	}
}