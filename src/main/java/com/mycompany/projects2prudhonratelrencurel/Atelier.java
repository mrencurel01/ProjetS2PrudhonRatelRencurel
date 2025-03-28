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
public class Atelier {
    private int idAtelier;
    private ArrayList<Equipement> listeEquipement = new ArrayList<>(); 

    public int getIdAtelier() {
        return idAtelier;
    }

    public void setIdAtelier(int idAtelier) {
        this.idAtelier = idAtelier;
    }

    public ArrayList<Equipement> getListeEquipement() {
        return listeEquipement;
    }

    public void setListeEquipement(ArrayList<Equipement> listeEquipement) {
        this.listeEquipement = listeEquipement;
    }
    
    
}
