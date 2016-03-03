/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.lang.*;
import java.util.*;
/**
 *
 * @author tudor
 */
public class Lecturer extends Person{
    
    String rank;
    String site_web;
    Project[] projects;
    Student[] students_pref;
    LinkedList<Student> s_p=new LinkedList();
    int capacity = 0;

    Lecturer(String num, String prenum, String gr, String site,  int cap) {
        first_name = num;
        last_name = prenum;
        rank = gr;
        site_web = site;
        capacity = cap;
     
        
        /*for (int i = 0; i < n; i++) {
            projects[i] = p1[i];}*/
       
        
        
    }
    public void setPref_s(LinkedList<Student> s){
        
        
        s_p=s;
    }
  public void setProj(Project[] p){
     projects=new Project[p.length];
      projects=p;
  }
    @Override
    public Boolean isFree() {
        if (capacity > 0) {
            return true;
        } else {
            return false;
        }
    }

    
    public Project[] getProjects(){
        return projects;
    }
    public LinkedList<Student> getStudents_pref(){
        return s_p;
    }
}
