package ua.lviv.lgs;

public class Aplication {
public static void main(String[] args) {
	byte a1 = 100;
	short a2 = 30000;
	int a3 = 0;
	long a4 = 50555555L;
	float b1 = 2.65236F;
	double b2 = 9.12;
	char c = 'a';
	boolean d = true;
	
	int[] array = { 20, 3, -200, 8, -1, 25, 5, 4, 18, -10 };
	int max = array[0];
	int min = array[0];
	for (int i = 0; i < array.length; i++) {
		if (array[i] > max)
			max = array[i];
		if (array[i] < min)
			min = array[i];
	}
	
	System.out.println(a1 + ";" + a2 + ";" + a3 + ";" + a4 + ";" + b1 + ";" + b2 + ";" + c + ";" + d);
	System.out.print("byte min = " + Byte.MIN_VALUE + "; ");
	System.out.println("byte max = " + Byte.MAX_VALUE);
	System.out.print("chort min = " + Short.MIN_VALUE + "; ");
	System.out.println("chort max = " + Short.MAX_VALUE);
	System.out.print("int min = " + Integer.MIN_VALUE + "; ");
	System.out.println("int max = " + Integer.MAX_VALUE);
	System.out.print("long min = " + Long.MIN_VALUE + "; ");
	System.out.println("long max = " + Long.MAX_VALUE);
	System.out.print("float min = " + Float.MIN_VALUE + "; ");
	System.out.println("float max = " + Float.MAX_VALUE);
	System.out.print("double min = " + Double.MIN_VALUE + "; ");
	System.out.println("double max = " + Double.MAX_VALUE);
	System.out.println("Максимальне значення в масиві: " + max);
	System.out.println("Мінімальне значення в масиві: " + min);
}
}
