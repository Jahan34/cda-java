package tp5;

import java.util.Scanner;
public class Tp5Exo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir un Palindrome");
		String pal=sc.next();
		String invers = "";
		
		
		for (int i = pal.length()-1; i>=0; i--) {
			invers+=pal.charAt(i); 
			
			
			
		}
		System.out.println(invers);
		System.out.println(pal);
		if (invers.equals(pal))
			System.out.println("c'est un palindrome ");
		else
			System.out.println("ce n'est pas un palindrome");
		
	}

}
