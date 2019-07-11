package day4;

import java.util.Scanner;

public class BlueMuffins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int general = 55;
		int number = 0;
		double check = 1.0; 
		float boat = 32.5f;
		long money = 80; 
		boolean lang = true;
		String rope = "whats up"; 
		String name = "";
		String color = "";
		Scanner cat = new Scanner(System.in);
		 
		System.out.println("Enter your name?");
		name = cat.next();
		
		System.out.println(" What's your favorite color?");
		color = cat.next();
		
		System.out.println("How many siblings do you have?");
		number = cat.nextInt();
		
		System.out.println(name + " favorite color is "+ color + ", he has " + number + "siblings");
		
		float sum = (float) (check + boat); 
		System.out.println(sum);
		
		System.out.println();
		
		
		cat.close();
			}

}
