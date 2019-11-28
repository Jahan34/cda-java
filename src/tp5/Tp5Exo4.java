package tp5;
import java.util.Arrays;
import java.util.Scanner;
public class Tp5Exo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("combien de notes : ");
		int nbN= sc.nextInt();
		float[] array= new float[nbN];
		float somme=0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("rentrez une note");
			float v=sc.nextFloat();
			array[i]=v;
			somme+=v;
		}
		 	Arrays.sort(array);
		 	
			System.out.println(Arrays.toString(array));
			float moyenne= (float) somme/array.length;
			System.out.println("la moyenne des notes = "+moyenne);


	}

}
