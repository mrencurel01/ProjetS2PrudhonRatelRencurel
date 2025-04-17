package com.mycompany.projects2prudhonratelrencurel;

public class Machine {
    private String refMachine;
    private String dMachine;
    private String type;
    private float cout;
    private float x;
    private float y;
    
    // getters
    public String getRefMachine() {
        return refMachine;
    }
    
    public String getDMachine() {
        return dMachine;
    }
    
     public String getType() {
        return type;
    }
    
    public float getCout() {
        return cout;
    }
    
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
    
    // setters
    public void setRefMachine(String refMachine) {
        this.refMachine = refMachine;
    }
   
    public void setDMachine(String dMachine) {
        this.dMachine = dMachine;
    }
   
    public void setType(String type) {
        this.type = type;
    }
    
    public void setCout(float cout) {
        this.cout = cout;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    // constructeur
    public Machine(String refMachine, String dMachine, String type, float cout, float x, float y){
        this.refMachine = refMachine;
        this.dMachine = dMachine;
        this.type = type;
        this.x = x;
        this.y = y;
        this.cout = cout;
    }
 
}
