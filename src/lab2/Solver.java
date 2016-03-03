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


Solver(Problem pm){
problem=pm;
}

public void solve_spa(){
  int g=1;
  LinkedList<Project> p_list=new LinkedList();
  
    Student[] st=problem.getStud();
 while(g==1){
     g=0;
  for(int i=0;i<st.length;i++){
   if(st[i].isFree()){
       g=1;
      p_list=st[i].getPref();
   if(p_list.size()>0x0) {
      g=1;}
   }
      
 }}
}
}