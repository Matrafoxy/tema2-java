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




public class Lab2 {
     /*
     * @param args the command line arguments
     */
   
   /* public String toString(Project[] p2){   
    StringBuilder sb=new StringBuilder();
        for (Project p21 : p2) {
            sb.append(p21);
        }
    return sb.toString();
    }
    public String toString(Student[] s2){   
         StringBuilder sb=new StringBuilder();
        for (Student s21 : s2) {
            sb.append(s21);
        }
    return sb.toString();}*/
        
    
    //public boolean equals(){}
    public static void main(String[] args) {
        // TODO code application logic here
    int n1=7,n2=3,n3=8;
    Student[] students=new Student[n1];
    Lecturer[] lecturers=new Lecturer[n2];
    Project[] projects=new Project[n3];
    for(int i=0;i<n1;i++)
        students[i]=new Student("nume"+i,"prenume"+i,""+i,"email"+i);
    for(int i=0;i<n2;i++){
        if(i==0)
        lecturers[i]=new Lecturer("nume_prof"+i,"prenume_prof"+i,"gr"+i,"site"+i,3);
        else
             lecturers[i]=new Lecturer("nume_prof"+i,"prenume_prof"+i,"gr"+i,"site"+i,2);
    } 
    for(int i=0;i<n3;i++)
        if(i==0)
           projects[i]=new Project("Nume_p"+i,"Cerinta"+i,2);
       else
            projects[i]=new Project("Nume_p"+i,"Cerinta"+i,1);
    
  /* student pref*/
    LinkedList<Project> p1=new LinkedList();
       p1.addFirst(projects[0]);p1.addFirst(projects[6]);
      students[0].setPref(p1);
      
      p1=new LinkedList();
       p1.addFirst(projects[0]);p1.addFirst(projects[1]);p1.addFirst(projects[2]);p1.addFirst(projects[3]);
       p1.addFirst(projects[4]);p1.addFirst(projects[5]);
      students[1].setPref(p1);
    
     p1=new LinkedList();
       p1.addFirst(projects[1]);p1.addFirst(projects[0]);p1.addFirst(projects[3]);
      students[2].setPref(p1);
      
       p1=new LinkedList();
       p1.addFirst(projects[1]);
      students[3].setPref(p1);
      
       p1=new LinkedList();
       p1.addFirst(projects[0]);p1.addFirst(projects[1]);p1.addFirst(projects[2]);p1.addFirst(projects[3]);
     students[4].setPref(p1);
      
     p1=new LinkedList();
       p1.addFirst(projects[1]);p1.addFirst(projects[2]);p1.addFirst(projects[3]);
       p1.addFirst(projects[4]);p1.addFirst(projects[5]);
      students[5].setPref(p1);
       
      p1=new LinkedList();
       p1.addFirst(projects[4]);p1.addFirst(projects[2]);p1.addFirst(projects[7]);
      students[1].setPref(p1);
    /*  end*/
    
      /* lect pref*/
      LinkedList<Student> p2=new LinkedList();
      p2.addFirst(students[6]);p2.addFirst(students[3]);p2.addFirst(students[0]);p2.addFirst(students[2]);
       p2.addFirst(students[1]);p2.addFirst(students[4]);p2.addFirst(students[5]);
       lecturers[0].setPref_s(p2);
       
      p2=new LinkedList();
      p2.addFirst(students[6]);p2.addFirst(students[2]);
       p2.addFirst(students[1]);p2.addFirst(students[4]);p2.addFirst(students[5]);
      lecturers[1].setPref_s(p2);
        
      p2=new LinkedList();
      p2.addFirst(students[0]);p2.addFirst(students[6]);
     lecturers[2].setPref_s(p2);
        
       Problem p=new Problem(lecturers,students);
       Solver solv=new Solver(p);
    }}
