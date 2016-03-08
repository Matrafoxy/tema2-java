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
public class Solver {
    Problem problem;

Stable_Matching sm=new Stable_Matching();
Solver(Problem pm){
problem=pm;

}

public void solve_spa(){
  int g=0;
  Student sr=new Student();
  Lecturer lect=new Lecturer();
  Project p=new Project();
  LinkedList<Project> p_list=new LinkedList<Project>();
  
    Student[] st=problem.getStud();
   // System.out.println(st.length);
 Pair pair;
 int g2=0;
 
 
 
    while(g<3){
        //System.out.println(st.length);
     g++;g2=0;
      for (Student st1 : st) {
          System.out.println(st1.getPref().isEmpty()+st1.first_name);
          //System.out.println(st1.getPref().size());
          if (st1.isFree()==0) {
             
              p_list = st1.getPref();
              
                if(!(p_list.isEmpty())) {
                  g=1;g2=1;
                  p=p_list.removeFirst();
                  lect=p.getLect();
                   System.out.println(st1.first_name);
                   System.out.println(p.nume);
                   sm.add(st1,p);
                   System.out.println(p.capacity);
                    System.out.println(p.getLect().capacity);
                    System.out.println("/");
                  //sm.add(st1,p);
              
                  if(p.over_sub()<0){
                      sr=sm.worstSp(p);
                      sm.deletePair(sr, p);
                  }
                  else if(lect.isFree()<0){
                      pair=sm.worstSl(lect);
                      sm.deletePair(pair.getS(), pair.getP());
                  }
                  if(p.over_sub()==0){
                      sr=sm.worstSp(p);
                      sm.forEach_pj(sr,p);
                      
                      
                  }
                  if(lect.isFree()==0){
                      pair=sm.worstSl(lect);
                      sm.forEach_lk(pair.getS(), lect);
                  }
                }     
          }
          }
      
          
}
}
public void print(){
    sm.print();
}
}