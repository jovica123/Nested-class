package com.pluralsight.objectequals;

public class Main {

    public static void main(String[] args) {
	Let a1 = new Let(234,'A');
	Let a2 = new Let(234,'A');
	//Let a2 = a1; znaci da pokazuju na isti objekt. Shallow copy

		if (a1==a2)
	    System.out.println("Jovica");
	else
		System.out.println("false");


		if (a1.equals(a2))
			System.out.println("Svaka cast.");
		else
			System.out.println("Opet greska");

		Putnici p = new Putnici();
		if (a1.equals(p))
			System.out.println("Jahu");
		else
			System.out.println("Nista");
    }

}
