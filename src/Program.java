import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		conta cc = new contaCorrent();
        conta poupanca = new contaPoupanca();
        
        System.out.print("Insira o titular da conta: ");
		String nome = sc.nextLine();
	    System.out.print("Tem algum deposito para fazer(s/n)? ");
	    char res = sc.next().charAt(0);
	    if(res == 's') {
	    System.out.print("Corrente ou Poupança?  ");
	    char cont = sc.next().charAt(0);
	    if(cont == 'p') {
	    	System.out.print("Insira o valor do deposito:  ");
	    	double valor = sc.nextDouble();
	    	poupanca.depositar(valor);
	    	poupanca.imprimirExtrato();
	        }
	        else {
	    	System.out.print("Insira o valor do deposito:  ");
	    	double valor = sc.nextDouble();
	    	cc.depositar(valor);
	    	cc.imprimirExtrato();
	        }
	    }
	    else {
	    	poupanca.imprimirExtrato();
	    	cc.imprimirExtrato();
	    }
	   
        
        sc.close();
	}

}
