/*
 * Fibonacci.java
 * Copyright 2024 Gui Victor <Gui Victor@DESKTOP-M15AELM>
 */
 
import java.util.Scanner;

public class Fibonacci {
	
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite um numero inteiro: ");
	int num = sc.nextInt();
	
	boolean pertenceFibonacci = false;
	int a = 0,
	    b = 1,
	    c = 0;
	while (b <= num) {
		if (num == b) {
			pertenceFibonacci = true;
			break;
		}
		c = a + b;
		a = b;
		b = c;
	}
	
	if (pertenceFibonacci) {
		System.out.println(num + " pertence a sequencia de Fibonacci.");
	} else {
		System.out.println(num + " nao pertence a sequencia de Fibonacci.");
	}
	}
}
