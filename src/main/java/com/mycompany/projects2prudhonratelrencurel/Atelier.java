package com.mycompany.projects2prudhonratelrencurel;
import java.util.ArrayList;


public class Atelier {
    private int idAtelier;
    private ArrayList<Equipement> listeEquipement = new ArrayList<>(); 

    // getters
    public int getIdAtelier() {
        return idAtelier;
    }

    public ArrayList<Equipement> getListeEquipement() {
        return listeEquipement;
    }
    
    // setters
    public void setIdAtelier(int idAtelier) {
        this.idAtelier = idAtelier;
    }

    public void setListeEquipement(ArrayList<Equipement> listeEquipement) {
        this.listeEquipement = listeEquipement;
    }
    
    // constructeur
    public Atelier(int idAtelier, ArrayList<Equipement> listeEquipement) {
    this.idAtelier = idAtelier;
    this.listeEquipement = listeEquipement;
    }
    
}
