package Seção6;

import java.util.Scanner;

public class ProductTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tempNumber, tempQty, maxSize = -1;
		String tempName;
		double tempPrice;
		do {
			try {
				if (maxSize < 0) {
					System.out.println("Valor incorreto inserido");
				}
				System.out.println(
						"Quantos produtos deseja adicionar?\n(Insira 0 (zero) se não quiser adicionar produtos: )");
				maxSize = sc.nextInt();
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Tipo incorreto de dados inserido!");
				System.out.println("Digite um tecla para continuar: ");
				sc.nextLine();
				System.out.println("Max" + maxSize);
			}
		} while (maxSize < 0);
		if(maxSize==0) {
			System.out.println("Não há produtos!");
		}else {
			Produto[] produtos = new Produto[maxSize];
			int i;
			Produto produto;
			for(i=0;i<maxSize;i++) {
				sc.nextLine();
				System.out.println("Digite o nome: ");
				tempName = sc.nextLine();
				System.out.println("Digite a quantidade: ");
				tempQty = sc.nextInt();
				System.out.println("Digite o preço: ");
				tempPrice = sc.nextDouble();
				System.out.println("Digite o numero: ");
				tempNumber = sc.nextInt();
				produto = new Produto();
				produto.setNome(tempName);
				produto.setNum(tempNumber);
				produto.setEstoque(tempQty);
				produto.setPreco(tempPrice);
				produto.setAtivo(true);
				produtos[i]=produto;
				
			}
			for(Produto p: produtos) {
				System.out.println(p.toString());
			}
		}
	}
}
