/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projects2prudhonratelrencurel;

/**
 *
 * @author adrie
 */
import java.util.ArrayList;
public class Gamme {
    
   private ArrayList<Opération> listeOperation = new ArrayList<>(); 
   private ArrayList<Equipement> listeEquipement = new ArrayList<>(); 
   private String refGamme;

    public ArrayList<Opération> getListOperation() {
        return listeOperation;
    }

    public void setListOperation(ArrayList<Opération> listOperation) {
        this.listeOperation = listOperation;
    }

    public ArrayList<Equipement> getListeEquipement() {
        return listeEquipement;
    }

    public void setListeEquipement(ArrayList<Equipement> listeEquipement) {
        this.listeEquipement = listeEquipement;
    }

    public String getRefGamme() {
        return refGamme;
    }

    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }
    
    }
   
  
