package Hashm;
import java.util.*; 

public class Hashmap1 {

 public static void main(String args[]){  
   
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  
  hm.put(1,"TEA");  
  hm.put(2,"COFFEE");  
  hm.put(3,"BISCUITS");  
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  