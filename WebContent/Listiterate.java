package iterator;
import java.util.*; 
public class Listiterate {

public static void main(String args[]){  
  
ArrayList<String> al1=new ArrayList<String>();  
al1.add("hcl");  
al1.add("wipro");  
al1.add("electotech");  
al1.add(1,"Supriga");  
  
System.out.println(al1.get(2));  
  
ListIterator<String> itr=al1.listIterator();  
  
System.out.println("forward");  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
  
  
System.out.println("backward");  
while(itr.hasPrevious()){  
System.out.println(itr.previous());  
 }  
}  
}  
