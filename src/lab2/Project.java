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

    Project(String nume, String cerinte, int cap) {
        this.nume = nume;
        this.cerinte = cerinte;
        capacity = cap;
    }
public int over_sub(){
 if(capacity<0)
     return -1;
 else
     return 1;
}
}
