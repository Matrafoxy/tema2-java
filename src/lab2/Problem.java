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
public class Problem {
 Lecturer[] lect;
 Student[] st;
 
    
    
    Problem(Lecturer[] l1,Student[] s1){
    lect=l1;
    st=s1;
    }
   public Lecturer[] getLect(){
   
       return lect;
   }
   public Student[] getStud(){
       return st;
   }
   public void print(){
       System.out.println(lect.length);
       System.out.println(st.length);
   }
}
