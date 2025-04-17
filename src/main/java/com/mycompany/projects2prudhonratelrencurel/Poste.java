package com.mycompany.projects2prudhonratelrencurel;

import java.util.ArrayList;
public class Poste {
    private int refPoste;
    private String dPoste;
    private ArrayList<Machine> listeMachine = new ArrayList<>(); 

    // getters
    public int getRefPoste() {
        return refPoste;
    }

    public String getdPoste() {
        return dPoste;
    }
    
    public ArrayList<Machine> getListeMachine() {
        return listeMachine;
    }
    
    // setters
    public void setRefPoste(int refPoste) {
        this.refPoste = refPoste;
    }

    

    public void setdPoste(String dPoste) {
        this.dPoste = dPoste;
    }


    public void setListeMachine(ArrayList<Machine> listeMachine) {
        this.listeMachine = listeMachine;
    }
    
    
}
