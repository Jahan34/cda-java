package tp5;
import java.util.Arrays;
import java.util.Scanner;
public class Tp5Exo3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("saisir un nombre de valeurs");
		int nbV= sc.nextInt();
		int[] array= new int[nbV];
		for (int i = 0; i < array.length; i++) {
			System.out.println("rentrez une valeur");
			int v=sc.nextInt();
			array[i]=v;
		
		}
		 	Arrays.sort(array);
		 	
			System.out.println(Arrays.toString(array));
		}
	}


