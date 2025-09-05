package aplication;
import java.util.Scanner;
import entities.Computador;

public class TesteComputador {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Computador c1=new Computador();
	System.out.println("Digite o modelo do computador: ");
	c1.setNome (sc.nextLine());

	System.out.println("Digite a marca do computador: ");
	c1.setMarca (sc.next());
	System.out.println("Digite a quantidade de Memória ram : ");
	sc.nextLine();
	c1.setRam(sc.nextInt());
	System.out.println("Digite a quantidade de memória interna: ");
	c1.setHd(sc.nextInt());
	sc.nextLine();
	System.out.println("Digite o nome do processador: ");
	c1.setProce(sc.nextLine());
	System.out.println();
	
	
	System.out.println("Computador 2");
	Computador c2=new Computador();
	System.out.println("Digite o modelo do computador: ");
	c2.setNome (sc.nextLine());

	System.out.println("Digite a marca do computador: ");
	c2.setMarca (sc.next());
	System.out.println("Digite a quantidade de Memória ram : ");
	c2.setRam(sc.nextInt());
	sc.nextLine();
	System.out.println("Digite a quantidade de memória interna: ");
	c2.setHd(sc.nextInt());
	sc.nextLine();
	System.out.println("Digite o nome do processador: ");
	c2.setProce(sc.nextLine());
	System.out.println();
	
	System.out.println("Computador 3");
	System.out.print("Modelo do computador: ");
    String nome3 = sc.nextLine();
    System.out.print("Marca: ");
    String marca3 = sc.nextLine();
    System.out.print("Memória RAM: ");
    int ram3 = sc.nextInt();
    System.out.print("Memória interna: ");
    int hd3 = sc.nextInt();
    sc.nextLine();
    System.out.print("Processador: ");
    String proce3 = sc.nextLine();
    Computador c3 = new Computador(nome3, marca3, ram3, hd3, proce3);
	System.out.println();
	
    System.out.println("Computador 4");
    System.out.print("Nome do computador: ");
    String nome4 = sc.nextLine();
    System.out.print("Marca: ");
    String marca4 = sc.nextLine();
    System.out.print("Memória RAM: ");
    int ram4 = sc.nextInt();
    System.out.print("Memória interna: ");
    int hd4 = sc.nextInt();
    sc.nextLine();
    System.out.print("Processador: ");
    String proce4 = sc.nextLine();
    Computador c4 = new Computador(nome4, marca4, ram4, hd4, proce4);
    System.out.println();
    
    System.out.println(" Computador 1");
    c1.imprimir();
    System.out.println();
    System.out.println("Computador 2");
    c2.imprimir();
    System.out.println();
    System.out.println(" Computador 3");
    c3.imprimir();
    System.out.println();
    System.out.println(" Computador 4");
    c4.imprimir();

	sc.close();

	}

}
