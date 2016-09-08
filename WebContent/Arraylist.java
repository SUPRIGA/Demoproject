package demo1;

import java.util.*;
 class Arraylist {

	public static void main(String[] args) {
		
  ArrayList<String> al1=new ArrayList<String>();  
  al1.add("sup");  
  al1.add("Vivek");  
  al1.add("vinitha");  
    
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("aravind");  
  al2.add("sup");  
    
  al1.removeAll(al2);  
  
  System.out.println("iterator remove");  
  Iterator itr=al1.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
  
  }  
}  