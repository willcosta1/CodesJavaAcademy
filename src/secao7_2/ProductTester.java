package secao7_2;

import java.util.Scanner;

public class ProductTester {
	public static int getMenuOption(Scanner sc) {
		int optionMenu = -1;
		do {
			try {
				System.out.println(
						"1. Exibir Invent�rio\n2. Adicionar Estoque\n3. Deduzir Estoque\n4. Descontinuar Produto\n0. Sair\nInsira uma op��o de menu: ");
				optionMenu = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Digite uma op��o v�lida! ");
				sc.nextLine();
			}
		} while (optionMenu < 0 || optionMenu > 4);
		return optionMenu;
	}

	public static int getProductNumber(Produto[] produtos, Scanner sc) {
		int productChoice = -1, i;
		do {
			try {
				System.out.println("\n -------------- Produtos --------------\n");
				for (i = 0; i < produtos.length; i++) {
					System.out.println("�ndice: " + i + " Nome: " + produtos[i].getNome() + "\n");
				}
				System.out.println("Digite �ndice do produto: ");
				productChoice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Digite um valor v�lido ");
				sc.nextLine();
			}
			if (productChoice < produtos.length-1 || productChoice > produtos.length-1) {
				System.out.println("Por favor, digite uma op��o correta!");
			}
		} while (productChoice < produtos.length-1 || productChoice > produtos.length-1);

		return productChoice;
	}

	public static void addInventory(Produto[] produtos, Scanner sc) {
		int stockChoice = -1;
		do {
			try {
				System.out.println("1: CD\n2: DVD\nInsira o tipo de produto: \n");
				stockChoice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Digite um valor v�lido");
				sc.nextLine();
			}
			if (stockChoice < 1 || stockChoice > 2) {
				System.out.println("Somente os n�meros 1 ou 2 s�o permitidos!");
			}
		} while (stockChoice < 1 || stockChoice > 2);
		if(stockChoice==1) {
			addCDToInventory(produtos,sc);
		}else {
			addDVDToInventory(produtos,sc);
		}
	}
	
	public static void addToInventory(Produto[] produtos, Scanner sc) {
		int productChoice, updateValue = -1;
		productChoice = getProductNumber(produtos, sc);
		do {
			try {
				System.out.println("Quantos produtos deseja adicionar?");
				updateValue = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Digite um valor v�lido");
				sc.nextLine();
			}
			if (updateValue < 0) {
				System.out.println("Digite um valor superior a zero");
			}
		} while (updateValue < 0);
		produtos[productChoice]=Produto.addToInventory(produtos[productChoice],updateValue);
	}

	public static void deductInventory(Produto[] produtos, Scanner sc) {
		int productChoice, updateValue = -1;
		Produto p;
		productChoice = getProductNumber(produtos, sc);
		do {
			try {
				System.out.println("Quantos produtos deseja deduzir?");
				updateValue = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Digite um valor v�lido");
				sc.nextLine();
			}
			if (updateValue < 0) {
				System.out.println("Digite um valor superior a zero");
			}
			if (produtos[productChoice].getEstoque() < updateValue) {
				System.out.println("Valor superior a dispon�vel em estoque");
			}
		} while (updateValue < 0 && produtos[productChoice].getEstoque() < updateValue);
		p =  new Produto();
		p = produtos[productChoice];
		produtos[productChoice]=(Produto.deductFromInventory(p,updateValue));
	}

	public static void discontinueInventory(Produto[] produtos, Scanner sc) {
		int productChoice;
		productChoice = getProductNumber(produtos, sc);
		produtos[productChoice].setAtivo(false);
	}

	public static void executeMenuChoice(int op, Produto[] produtos, Scanner sc) {
		switch (op) {
		case 1:
			displayInventory(produtos);
			break;
		case 2:
			addToInventory(produtos, sc);
			break;
		case 3:
			deductInventory(produtos, sc);
			break;
		case 4:
			discontinueInventory(produtos, sc);
			break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxSize, menuChoice;
		maxSize = getNumProducts(sc);
		if (maxSize == 0) {
			System.out.println("N�o h� produtos!");
		} else {
			Produto[] produtos = new Produto[maxSize];
			addInventory(produtos, sc);
			do {
				menuChoice = getMenuOption(sc);
				executeMenuChoice(menuChoice, produtos, sc);
			} while (menuChoice != 0);
		}
	}

	public static void displayInventory(Produto[] produtos) {
		for (Produto p : produtos) {
			System.out.println(p.toString());
		}
	}

	public static void addDVDToInventory(Produto[] produtos, Scanner sc) {
		int tempNumber, tempQty, i, tempNumSongs;
		String tempName, tempDuracao, tempFaixa, tempEstudio;
		double tempPrice;
		DVD produto;
		for (i = 0; i < produtos.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do DVD: ");
			tempName = sc.nextLine();
			System.out.println("Digite o do est�dio cinematogr�fico: ");
			tempEstudio = sc.nextLine();
			System.out.println("Digite a classifica��o et�ria: ");
			tempFaixa = sc.nextLine();
			System.out.println("Insira a dura��o em minutos: ");
			tempDuracao = sc.nextLine();
			System.out.println("Digite a quantidade: ");
			tempQty = sc.nextInt();
			System.out.println("Digite o pre�o: ");
			tempPrice = sc.nextDouble();
			System.out.println("Digite o numero: ");
			tempNumber = sc.nextInt();
			produto = new DVD();
			produto.setNome(tempName);
			produto.setNum(tempNumber);
			produto.setEstoque(tempQty);
			produto.setPreco(tempPrice);
			produto.setFaixa(tempFaixa);
			produto.setDuracao(tempDuracao);
			produto.setEstudio(tempEstudio);
			produto.setAtivo(true);
			produtos[i] = produto;
		}
	}

	public static void addCDToInventory(Produto[] produtos, Scanner sc) {
		int tempNumber, tempQty, i, tempNumSongs;
		String tempName, tempArtista, tempSelo;
		double tempPrice;
		CD produto;
		for (i = 0; i < produtos.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do CD: ");
			tempName = sc.nextLine();
			System.out.println("Digite o nome do artista: ");
			tempArtista = sc.nextLine();
			System.out.println("Digite o nome do selo de grava��o: ");
			tempSelo = sc.nextLine();
			System.out.println("Digite o n�mero de m�sicas: ");
			tempNumSongs = sc.nextInt();
			System.out.println("Digite a quantidade: ");
			tempQty = sc.nextInt();
			System.out.println("Digite o pre�o: ");
			tempPrice = sc.nextDouble();
			System.out.println("Digite o numero: ");
			tempNumber = sc.nextInt();
			produto = new CD();
			produto.setNome(tempName);
			produto.setNum(tempNumber);
			produto.setEstoque(tempQty);
			produto.setPreco(tempPrice);
			produto.setArtista(tempArtista);
			produto.setSelo(tempSelo);
			produto.setNumSongs(tempNumSongs);
			produto.setAtivo(true);
			produtos[i] = produto;
		}
	}

	public static int getNumProducts(Scanner sc) {
		int maxSize = -1;
		do {
			try {
				System.out.println(
						"Quantos produtos deseja adicionar?\n(Insira 0 (zero) se n�o quiser adicionar produtos: )");
				maxSize = sc.nextInt();
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Tipo incorreto de dados inserido!");
				System.out.println("Digite um tecla para continuar: ");
				sc.nextLine();
				System.out.println("Max" + maxSize);
			}
			if (maxSize < 0) {
				System.out.println("Valor incorreto inserido");
			}
		} while (maxSize < 0);
		return maxSize;
	}
}
