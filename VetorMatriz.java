import javax.swing.*;

class VetorMatriz
{
	public static int produtoria(int vet[])
	{
		int resultado = 1;
		for(int i = 0; i < 5; i++) {
		  resultado *= vet[i];
		}
		return resultado;
	}

	public static int somatoria(int vet[])
	{
		int resultado = 0;
		for(int i = 0; i < 5; i++) {
		  resultado += vet[i];
		}
		return resultado;
	}

  	public static void main (String args[])
	{
		int somat=0, prod = 0, vetor[] = new int[5];

		for(int i = 0; i < 5; i++) {
		  int cardinal = i + 1;
		  vetor[i] = Integer.parseInt(JOptionPane.showInputDialog( cardinal +"º número (inteiro): "));
		}

		somat = somatoria(vetor);
		prod = produtoria(vetor);
		
		JOptionPane.showMessageDialog(null, "Somatória: " + somat + "\nProdutória: " + prod);

		System.exit(0);
	}
}