package Seção4;

public class ProductTester {
	public static void main(String[] args) {		
		Produto[] produtos = new Produto[6];
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto(3,"Google Chrome",3,9.34);
		Produto p4 = new Produto(4,"Mozilla",3,7.65);
		Produto p5 = new Produto(5,"Explorer",3,6.32);
		Produto p6 = new Produto(6,"Opera",3,5.87);
		produtos[0]=p1;
		produtos[1]=p2;
		produtos[2]=p3;
		produtos[3]=p4;
		produtos[4]=p5;
		produtos[5]=p6;
		for(Produto p : produtos) {
			System.out.println(p.toString());
		}
	}
}
