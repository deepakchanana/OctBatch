package pkg1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;




public class Example 
{
public static void main(String[] args) 
{
  TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
  hm.put(12,"Deepak");
  hm.put(22, "Chanana");
  hm.put(21, "Selenium");
  hm.put(222,"dccc");
  hm.put(344, "Devops");
  hm.put(344, "dccc");
  hm.put(344, "abcd");
  
  Set<Integer> allKeys=hm.keySet(); // it will give all the keys
  for(Integer i: allKeys)
  {
	  System.out.println("key is "+i);
	  System.out.println("Value is "+hm.get(i));
  }
  
  
}
}
