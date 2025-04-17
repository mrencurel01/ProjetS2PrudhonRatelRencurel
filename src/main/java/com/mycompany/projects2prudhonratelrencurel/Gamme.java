package com.mycompany.projects2prudhonratelrencurel;
import java.util.ArrayList;

public class Gamme {
   private ArrayList<Opération> listeOperation = new ArrayList<>(); 
   private ArrayList<Equipement> listeEquipement = new ArrayList<>(); 
   private String refGamme;

   // getters
   public ArrayList<Opération> getListOperation() {
        return listeOperation;
   }
    
   public String getRefGamme() {
        return refGamme;
   }
      
   public ArrayList<Equipement> getListeEquipement() {
        return listeEquipement;
   }

   // setters
   public void setListeOperation(ArrayList<Opération> listeOperation) {
        this.listeOperation = listeOperation;
   }

   public void setListeEquipement(ArrayList<Equipement> listeEquipement) {
        this.listeEquipement = listeEquipement;
   }
   
   public void setRefGamme(String refGamme){
       this.refGamme = refGamme;
   }
   
    // constructeur
    public Gamme(String refGamme, ArrayList<Equipement> listeEquipement, ArrayList<Opération> listeOperation){
    this.refGamme = refGamme;
    this.listeEquipement = listeEquipement;
    this.listeOperation = listeOperation;
    }
}
   
  
