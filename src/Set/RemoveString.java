package Set;

import java.util.*;

public class RemoveString
{
     public static void main(String[] args)
     {
	    Set<String>  s =new HashSet<String>();
	    
	    s.add("Naveen");
	    s.add("Yashpal");
	    s.add("Dipesh");
	    s.add("Intiyaz");
	    s.add("SAGAR");
	    s.add("Aditya");
	    
     Iterator<String> itr= s.iterator();
     
     while(itr.hasNext())
     {
    	 String i = itr.next(); 
    	              
    	 if(i.contains("SA"))
    	 {
    		itr.remove();
    	 }
    	 System.out.println(i);
     }
     System.out.println(s);
     
	 }
}
