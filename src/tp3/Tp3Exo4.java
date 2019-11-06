package tp3;
import java.util.Scanner;
public class Tp3Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner algo=new
	Scanner(System.in);
		
	int seconde=1;//System.out.println("Saisir des secondes : ");
	//seconde =algo.nextInt();
	//System.out.println("Entier saisi = "+seconde);

	int minute= seconde*60;System.out.println("Saisir des minutes : ");
	minute =algo.nextInt();
	System.out.println("resultat = "+minute*60+" secondes");
	
	int heure= seconde*60*60;System.out.println("Saisir des heures : ");
	heure =algo.nextInt();
	System.out.println("resultat = "+heure*60*60+" secondes");
	
	
	algo.close();
	}

}
