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
public class Poste {
    private int refPoste;
    private String dPoste;
    private ArrayList<Machine> listeMachine = new ArrayList<>(); 

    public int getRefPoste() {
        return refPoste;
    }

    public void setRefPoste(int refPoste) {
        this.refPoste = refPoste;
    }

    public String getdPoste() {
        return dPoste;
    }

    public void setdPoste(String dPoste) {
        this.dPoste = dPoste;
    }

    public ArrayList<Machine> getListeMachine() {
        return listeMachine;
    }

    public void setListeMachine(ArrayList<Machine> listeMachine) {
        this.listeMachine = listeMachine;
    }
    
    
}
