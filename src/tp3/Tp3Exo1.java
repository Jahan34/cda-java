package tp3;
import java.util.Scanner;
public class Tp3Exo1 {
	public static <prooch> void main(String[]args){
	Scanner verif = new Scanner (System.in);
	boolean valeur;
	System.out.println("saisir un booleen: ");
	valeur = verif.nextBoolean();
	System.out.println("booleen saisi = "+valeur);
	
	byte byby;
	System.out.println("saisir un byte: ");
	byby = verif.nextByte();
	System.out.println("byte saisi = "+byby);
	
	short tourist;
	System.out.println("saisir un short: ");
	tourist = verif.nextShort();
	System.out.println("short saisi = "+tourist);
	
	int inte;
	System.out.println("saisir un int: ");
	inte = verif.nextInt();
	System.out.println("int saisi = "+inte);
	
	long lo;
	System.out.println("saisir un long: ");
	lo = verif.nextLong();
	System.out.println("long saisi = "+lo);

	float reel;
	System.out.println("saisir un reel: ");
	reel = verif.nextFloat();
	System.out.println("reel saisi = "+reel);
	
	double db;
	System.out.println("saisir un double: ");
	db = verif.nextDouble();
	System.out.println("double saisi= "+db);
	
	char cha;
	System.out.println("saisir un char: ");
	cha = verif.next().charAt(0);
	System.out.println("char saisi = "+cha);
	
	verif.close();
	}
}

