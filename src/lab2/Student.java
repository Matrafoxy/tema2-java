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
    LinkedList<Project> pref_p=new LinkedList<Project>();
    int has_project = 0;
Student(){}
    Student(String name,String lname,String nr_mat,String mail) {
    first_name=name;
    last_name=lname;
    nr_matricol=nr_mat;
   email=mail;
   
    }
   
    public void setPref(LinkedList<Project> pref){
       
        pref_p=pref;
   }
 public void setStud_state(int state){
     has_project=state;
 }   

@Override
    public int isFree() {
        return has_project;
        }
    
public LinkedList<Project> getPref(){
    return pref_p;
}
@Override
 public boolean equals(Object obj) {
     if (obj == null) return false;
 if (!(obj instanceof Student)) return false;
 Student comp = (Student) obj;
 return ( comp.nr_matricol==nr_matricol);

 } 
}
