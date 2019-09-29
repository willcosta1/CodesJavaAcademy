package Seção4;
import java.util.ArrayList;

public class ProductTester {
	public static void main(String[] args) {		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto(3,"Google Chrome",3,9.34);
		Produto p4 = new Produto(4,"Mozilla",3,7.65);
		Produto p5 = new Produto(5,"Explorer",3,6.32);
		Produto p6 = new Produto(6,"Opera",3,5.87);
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		produtos.add(p6);
		for(Produto p : produtos) {
			System.out.println(p.toString());
		}
	}
}
