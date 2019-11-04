package tp2;

import javax.swing.JOptionPane;

public class Tp2Exo2 {
	public static void main(String[] args) {
		
	String texte=JOptionPane.showInputDialog(null, "saisir un entier :"); //saisie1
	String texte2=JOptionPane.showInputDialog(null, "saisir un second entier :"); // saisie2
	
	int valeur=Integer.parseInt(texte); //valeur de la saisie1 parseint pour transfo en int
	int valeur2=Integer.parseInt(texte2); // valeur de la saisie2 parseint pour transfo en int
	int somme= valeur+valeur2; // valeur de l'addtion
	int produit= valeur*valeur2; // valeur de la multiplication
	JOptionPane.showMessageDialog(null, somme); // boite de dialog du resultat 
	JOptionPane.showMessageDialog(null, produit); // boite de dialog du resultat
	
		
	//String texte2=JOptionPane.showInputDialog(null, "saisir un second entier :");
	//JOptionPane.showInternalMessageDialog(null, texte2);
	
	//int valeur;
	
	//int valeur2;
	//valeur2 = texte2.nextInt(valeur2 = Integer.parseInt(texte2));
	
	//int somme = valeur+valeur2;System.out.print("la somme des deux valeurs est : "+somme);
	//somme= texte.nextInt();System.out.print(valeur+valeur2);
		
	}
}