package laborator12;

import java.util.*;
import java.lang.*;

abstract class Product {
	
	float pret;
	String nume;
	
	public abstract float getPriceReduced();
}

class Book extends Product {

	Book (String nume, float pret) {
		this.pret = pret;
		this.nume = nume;
	}
	
	public float getPriceReduced() {
		float pret = 100 * this.pret;
		pret = pret - 15 * this.pret;
		this.pret = pret / 100;
		return this.pret;
	}
}

class Food extends Product {
	
	Food (String nume, float pret) {
		this.pret = pret;
		this.nume = nume;
	}
	
	public float getPriceReduced() {
		float pret = 100 * this.pret;
		pret = pret - 15 * this.pret;
		this.pret = pret / 100;
		return this.pret;
	}
	
}

class Beverage extends Product {
	
	Beverage (String nume, float pret) {
		this.pret = pret;
		this.nume = nume;
	}
	
	public float getPriceReduced() {
		float pret = 100 * this.pret;
		pret = pret - 15 * this.pret;
		this.pret = pret / 100;
		return this.pret;
	}
	
}

class Computer extends Product {
	
	Computer (String nume, float pret) {
		this.pret = pret;
		this.nume = nume;
	}
	
	public float getPriceReduced() {
		float pret = 100 * this.pret;
		pret = pret - 15 * this.pret;
		this.pret = pret / 100;
		return this.pret;
	}
}

class ProductFactory {
	
	public Product factory(String type, String nameProduct, float productPrice) {
		if (type.equals("Book"))
            return new Book(nameProduct, productPrice);
        if (type.equals("Food"))
            return new Food(nameProduct, productPrice);
        if (type.equals("Beverage"))
            return new Beverage(nameProduct, productPrice);
        if (type.equals("Computer"))
            return new Computer(nameProduct, productPrice);
	}
}

public class Factory {	
	
	public static void main(String[] args) {
		
	}
}