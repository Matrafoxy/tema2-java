/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.*;
/**
 *
 * @author tudor
 */
public class Student extends Person{
   



    String nr_matricol;
    String email;
    //Project[] prefered_proj;
    LinkedList<Project> pref_p;
    Boolean has_project = false;

    Student(String name,String lname,String nr_mat,String mail) {
    first_name=name;
    last_name=lname;
    nr_matricol=nr_mat;
   email=mail;
   
    }
   
    public void setPref(LinkedList<Project> pref){
       
        pref_p=pref;
   }
 public void setStud_state(Boolean state){
     has_project=state;
 }   

@Override
    public Boolean isFree() {
        return has_project;
        }
    
public LinkedList<Project> getPref(){
    return pref_p;
}
}
