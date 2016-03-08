/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author tudor
 */
public class Project {
        String nume;
    String cerinte;
    Lecturer lect;
    int capacity;

    Project(){}
    
    Project(String nume, String cerinte,Lecturer lect,int cap) {
        this.nume = nume;
        this.cerinte = cerinte;
        capacity = cap;
        this.lect=lect;
    }
    public Lecturer getLect(){
        return lect;
    }
public int over_sub(){
 return capacity;
}
public void incCap(){
    capacity++;
}
public void decCap(){
    capacity--;
}
@Override
 public boolean equals(Object obj) {
     if (obj == null) return false;
 if (!(obj instanceof Project)) return false;
 Project comp = (Project) obj;
 return ( comp.nume==nume);
 }
}
