package linkedlist1;
import java.util.*; 

public class Linklist {

	public static void main(String[] args) {
		
  List<String> al1=new ArrayList<String>();    
  al1.add("sup");   
  al1.add("Viivek");    
  al1.add("aravind");    
  al1.add("vinihat");    
    
  List<String> al2=new LinkedList<String>();   
  al2.add("vishnu");    
  al2.add("priya");    
  al2.add("vivek");    
  al2.add("sup");    
    
  System.out.println("arraylist: "+al1);  
  System.out.println("linkedlist: "+al2);  
 }    
}    