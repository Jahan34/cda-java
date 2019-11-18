package tp4;
import java.util.Scanner;
public class Tp4Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner algo=new
				Scanner(System.in);
					
				int nb_note=1;System.out.println("Saisir le nb de note : ");
				nb_note =algo.nextInt();
				System.out.println("Entier saisi = "+nb_note+" notes");
				

				float note= 1;System.out.println("Saisir la note  : ");
				note =algo.nextFloat();
				
				float tnot;
				tnot=algo.nextFloat();
				
				float moyenne= tnot/nb_note;
				moyenne =algo.nextFloat();
				System.out.println("resultat = "+moyenne+" de moyenne");
				
				for (note=0;note<nb_note+1;note++)
				{
					System.out.println(note);
				}
				algo.close();
				}

			}