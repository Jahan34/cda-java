package tp5;

import java.util.Scanner;
public class Tp5Exo1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("saisir un entier");
		int nb= sc.nextInt();
		int[] array= new int[nb];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("rentrez une valeur");
			int n=sc.nextInt();
			array[i]=n;
		}
		int maxValue=array[0];
			for (int n : array) {
				if (maxValue<n) {
					maxValue=n;
				}
				
			}
			System.out.println("le max est "+maxValue);
			sc.close();
	}
	

}

