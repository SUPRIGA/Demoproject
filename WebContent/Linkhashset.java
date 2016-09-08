package hash;
import java.util.*;
 class Linkhashset {  
	  
	  public static void main(String args[]){  
	    
	   HashSet<String> al=new HashSet<String>();  
	   al.add("SUP");  
	   al.add("VIVEK");  
	   al.add("SUP");  
	   al.add("VINITHA");  
	   
	   Iterator<String> itr=al.iterator();  
	   while(itr.hasNext()){  
	    System.out.println(itr.next());  
	   }  
	  }  
	 }  
