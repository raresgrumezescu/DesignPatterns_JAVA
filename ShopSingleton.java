package laborator12;

import java.util.*;
import java.lang.*;

class Product {
	float pret;
	String nume;
	
	Product (String nume, float pret) {
		this.pret = pret;
		this.nume = nume;
	}
}

class Test {
	
	ShopSingleton shop;
	
	public void addProduct (Product produs) {
		shop.products.add(produs);
	}
	
	public void removeProduct (Product produs) {
		Iterator it = shop.products.iterator();
		int k = 0;
		while (it.hasNext()) {
			Product prod = (Product) it.next();
			if (prod.equals(produs) == true)
				break;
			k++;
		}
		shop.products.remove(k);
	}
	
	public void getCheapestProduct () {
		Iterator it = shop.products.iterator();
		Product minim = shop.products.get(0);
		while (it.hasNext()) {
			Product prod = (Product) it.next();
			if (prod.pret < minim.pret)
				minim = prod;
		}
		System.out.print("Produsul de pret minim este: " + minim.nume + " " + minim.pret + "\n");
	}
}

public class ShopSingleton {	
	
	private static ShopSingleton obj = null;
	
	String name;
	List<Product> products;
	
	private ShopSingleton (String name, List<Product> products) {
		this.name = name;
		this.products = products;
	}

	public static ShopSingleton getInstance(String name, List<Product> products) {
         // daca clasa nu a fost instantiata inainte, o facem acum
         if (obj == null)
             obj = new ShopSingleton(name, products); 
         return obj;
     }
	
	public void showProducts () {
		Iterator it = products.iterator();
		while (it.hasNext()) {
			Product prod = (Product) it.next();
			System.out.print (prod.nume + " : " + prod.pret + "\n");
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Product> produse = new ArrayList<Product>();
		Product rosii = new Product("Rosii", 10);
		Product mere = new Product("Mere", 6);
		Product castraveti = new Product("Castraveti", 5);
		produse.add(rosii);
		produse.add(mere);
		produse.add(castraveti);
		ShopSingleton shop = new ShopSingleton("Magazin" , produse);
		shop.getInstance(shop.name, shop.products);
		System.out.println ("Lista initiala este:\n");
		shop.showProducts();
		System.out.print ("\n");
		Test test = new Test();
		test.shop = shop;
		Product portocale = new Product ("Portocale", 12);
		Product cirese = new Product ("Cirese", 5);
		test.addProduct(portocale);
		test.addProduct(cirese);
		System.out.println ("Lista actualizata este:\n");
		test.shop.showProducts();
		System.out.print ("\n");
		test.getCheapestProduct();
		System.out.print ("\n");
		test.removeProduct(rosii);
		test.removeProduct(portocale);
		System.out.println ("Lista finala este:\n");
		test.shop.showProducts();
	}

}
