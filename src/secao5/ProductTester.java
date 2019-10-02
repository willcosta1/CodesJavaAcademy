package secao5;
import java.util.Scanner;

public class ProductTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tempNumber,tempQty;
		String tempName;
		double tempPrice;
		System.out.println("Digite o nome: ");
		tempName = sc.nextLine();
		System.out.println("Digite a quantidade: ");
		tempQty = sc.nextInt();
		System.out.println("Digite o preço: ");
		tempPrice = sc.nextDouble();
		System.out.println("Digite o numero: ");
		tempNumber = sc.nextInt();
		Produto p1 = new Produto(tempNumber,tempName,tempQty,tempPrice);
		sc.nextLine();
		System.out.println("Digite o nome: ");
		tempName = sc.nextLine();
		System.out.println("Digite a quantidade: ");
		tempQty = sc.nextInt();
		System.out.println("Digite o preço: ");
		tempPrice = sc.nextDouble();
		System.out.println("Digite o numero: ");
		tempNumber = sc.nextInt();
		Produto p2 = new Produto(tempNumber,tempName,tempQty,tempPrice);
		sc.close();
		Produto p6 = new Produto();
		p6.setAtivo(false);
		System.out.println(p6.toString());
		//Test for totalInventario
		System.out.println(p1.toString());
	}
}
