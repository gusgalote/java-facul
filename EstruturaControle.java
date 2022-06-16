import javax.swing.*;

class EstruturaControle
{
  	public static void main (String args[])
	{
		int n1, n2, result = 0;
		String message = "";
		char op;

		n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número (inteiro): "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número (inteiro):"));

		do {
		  op = (JOptionPane.showInputDialog("Insira 1 para multiplicar OU 2 para exibir os números")).charAt(0);
		} while (op != '1' && op != '2');

		if(op == '1') {
		  if (n1 >= 0 && n2 >= 0) {
		    result = n1 * n2;
		    for (int i = 0; i < n2; i++) {
		      if(i == 0) {
		        result = n1;
		      }
		      result = result * n1;
		    }
		    message = n1 + " X " + " n2 " + " = " + result + "\n" + n1 + "^" + n2 + " = " + result;
		  }
		    
		}

		if(op == '2') {
		 message = "Primeiro número: " + n1 + "\n" + "Segundo número: " + n2;
		}

		System.out.println(message);

		JOptionPane.showMessageDialog(null, message);
		
		System.exit(0);
	}
}