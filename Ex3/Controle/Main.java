package Ex3.Controle;
import Ex3.Dominio.ContaC;
import Ex3.Dominio.ContaP;
import java.util.Scanner;
import java.util.Random;



public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand= new Random();
		boolean fim=true;
		ContaC c1=null;
		ContaP c2=null;

		while (fim)
		{
			System.out.print("Menu\n(1)Criar conta poupança\n(2)Criar conta corrente\n(3)Realizar um saque\n(4)Cheque especial\nOpcao:");
			int menu=sc.nextInt();
			sc.nextLine();
			switch (menu) {
				case 1:
					
					c2=cadastarContaP(sc,rand);
				case 2:
					c1=cadastarContaC(sc,rand);
				break;
				case 3:
					realizaSaque(sc,c2);
				case 4:
					chequeEspecial(sc, c1);
				default:
					fim=false;
					break;
			}			

		}
		sc.close();
	}

	public static ContaP cadastarContaP(Scanner sc, Random rand)
	{
		 System.out.print("Nome:");
		 String nome=sc.nextLine();
		 System.out.print("Saldo:");
		 double saldo=sc.nextDouble();
		 sc.nextLine();
		 int taxa=rand.nextInt(10);
		 ContaP c1=new ContaP(nome,saldo, taxa);	
		 return c1;				
	}

	public static ContaC cadastarContaC(Scanner sc,Random rand)
	{
		System.out.print("Nome:");
		String nome=sc.nextLine();
		System.out.print("Saldo:");
		Double saldo=sc.nextDouble();
		double limite=rand.nextInt(2000)+saldo;
		
		sc.nextLine();
		ContaC c2=new ContaC(nome, saldo,limite);
		return c2;
	}
	public static void realizaSaque(Scanner sc,ContaP c2)
	{	
		System.out.print("Saque:");
		double valorSaque=sc.nextDouble();
		sc.nextLine();
		c2.saque(valorSaque);
	}
	public static void chequeEspecial(Scanner sc,ContaC c1)
	{
		System.out.print("Valor gasto:");
			int valorGasto=sc.nextInt();
			sc.nextLine();
			c1.chequeEspecial(valorGasto);
	}
}
