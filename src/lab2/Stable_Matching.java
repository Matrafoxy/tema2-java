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
/*class pair{
Student s;
Project p;
pair(Student s1,Project p1){
    s=s1;
    p=p1;
}
public Student getS(){
    return s;
}
public Project getP(){
    return p;
}
}*/
public class Stable_Matching {
    LinkedList<Pair> v=new LinkedList<Pair>();
    
     Stable_Matching(){
     
     }
     public void add(Student s1,Project p1){
         Pair p=new Pair(s1,p1);
         v.add(p);
         p1.getLect().decCap();
         p1.decCap();
         s1.setStud_state(1);
         
         
    
    }  
     public void print(){
        for(int i=0;i<v.size();i++){
         System.out.println(v.get(i).getP().nume);
        System.out.println(v.get(i).getS().first_name);
        System.out.println(v.get(i).getP().capacity);
        System.out.println("*****");
        
     }}
     public void deletePair(Student s1,Project p1){
         Pair p=new Pair(s1,p1);Boolean t;
         Iterator i=v.listIterator(0);
         while(i.hasNext())
             if(i.next().equals(p)){
                i.remove();
              //System.out.println(+"55"+p.s.first_name);
         s1.setStud_state(0);
         p1.incCap();
         p1.getLect().incCap();}
     }
     public LinkedList<Pair> getSM(){
         return v;
     }
     
     public Student worstSp(Project p){
        int n=0,max=0;
        Student s,worst=new Student();
         Pair pair=new Pair();
        for (Pair v1 : v) {
            pair = v1;
        
         if(pair.getP().equals(p))
              n=p.getLect().getStudents_pref().size();
             for(int i=0;i<n;i++){
                s=p.getLect().getStudents_pref().get(i);
                 if(s.equals(pair.getS()))
                     if(i>max)
                     {
                         max=i;
                         worst=s;
                     }
             }   
     }
           System.out.println("worstSP");  System.out.println(worst.first_name);System.out.println("WorstSP");
return worst;
     }
    public Pair worstSl(Lecturer l){
        int n=l.getStudents_pref().size(),max=0;
        Pair worst=new Pair();
       Project p=new Project();
        for(Pair v1: v){
            p=v1.getP();
            if(p.getLect().equals(l))
                for(int j=0;j<n;j++)
                    if(v1.getS().equals(l.getStudents_pref().get(j)))
                        if(j>max)
                        {
                            max=j;
                            worst=new Pair(v1.getS(),p);
                        }
        }
        System.out.println("worstSL");  System.out.println(worst.s.first_name);System.out.println("worstSL");
    return worst;
    }
public void forEach_pj(Student s1,Project p1){
    //int n=p1.getLect().getStudents_pref();
    int g=0;
    Student s2=new Student();
     Lecturer lect=p1.getLect();
    /*for(Student s2 :lect.getStudents_pref()){
        if(g==1)
        {System.out.println(",,,");  System.out.println(s2.first_name);System.out.println(",,,,");
            s2.getPref().remove(p1);}
        
        if(s2.equals(s1))
            g=1;
      
           }   */
     Iterator i=lect.getStudents_pref().listIterator(0);
     Iterator j;
     while(i.hasNext()){
         s2=(Student)i.next();
         if(g==1){
         j=s2.getPref().listIterator(0);
         while(j.hasNext()){
             if(p1.equals(j.next()))
                 j.remove();
         }
         
         }
         if(s1.equals(s2))
             g=1;
     }
           
}
public void forEach_lk(Student s1,Lecturer lect){
    int g=0;
    Project p2=new Project();
    //Lecturer lect=p1.getLect();
    
    for(Student st : lect.getStudents_pref()){
        if(g==1){
            System.out.println(";;");  System.out.println(st.first_name);System.out.println(";;");
            //for(Project p3 :st.getPref())
              Iterator i=st.getPref().listIterator(0);
             while(i.hasNext()) 
            //if(i.next().getLect().equals(lect))
                 p2=(Project)i.next();
               if(lect.equals(p2.getLect()))
                     i.remove();             // st.getPref().remove(p2);
        }
        if(s1.equals(st)){
            g=1;
        }
            
    }
    
    
}

}
