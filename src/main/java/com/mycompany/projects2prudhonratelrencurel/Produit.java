package com.mycompany.projects2prudhonratelrencurel;
import java.util.Scanner;


public class Produit {
    private int codeProduit;
    private String dProduit;

    // getters
    public int getCodeProduit() {
        return codeProduit;
    }

    public String getDProduit() {
        return dProduit;
    }
    
    // setters
    public void setCodeProduit(int codeProduit) {
        this.codeProduit = codeProduit;
    }

    public void setDProduit(String dProduit) {
        this.dProduit = dProduit;
    }
    
    // Constructeur
    public Produit(int codeProduit, String dProduit) {
        this.dProduit = dProduit;
        this.codeProduit = codeProduit;
    }
    
    // Méthode d'affichage d'un produit
    public void afficheProduit() {
        System.out.println("Voici les attributs du produit");
        System.out.println("ID : " + dProduit);
        System.out.println("Code : " + codeProduit );
    }
    
    // Méthode pour modifier les attributs du produit
    public void modifierProduit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nouvel ID : ");
        dProduit = scanner.nextLine();       
        System.out.print("Nouveau code : ");
        codeProduit = scanner.nextInt();
        System.out.println("Produit modifié avec succès !");
    }
    
    // Méthode pour supprimer un Produit
    public void supprimerProduit() {
        dProduit = null;
        codeProduit = 0;
        System.out.println("Produit supprimé avec succès !");
    }
}
