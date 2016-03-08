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
public class Pair {
    Student s=new Student();
Project p=new Project();
Pair(){}
Pair(Student s1,Project p1){
    s=s1;
    p=p1;
}
public Student getS(){
    return s;
}
public Project getP(){
    return p;
}
   @Override
 public boolean equals(Object obj) {
     if (obj == null) return false;
 if (!(obj instanceof Pair)) return false;
 Pair comp = (Pair) obj;
 return ( comp.getP().equals(p) && comp.getS().equals(s));
 }
}
