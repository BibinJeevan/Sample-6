import java.util.*;
public class Hashset
{
 public static void main(String args[])
 {
  HashSet<String> arrset1=new HashSet<String>();
  arrset1.add("A");
  arrset1.add("B");
  arrset1.add("C");
  arrset1.add("D");
  arrset1.add("E");
  System.out.println("First Hashset:"+arrset1);
  HashSet<String>arrset2=new HashSet<String>();
  arrset2.add("A");
  arrset2.add("B");
  arrset2.add("C");
  arrset2.add("D");
  arrset2.add("E");
  System.out.println("Second Hashset:"+arrset2);
  boolean value=arrset1.equals(arrset2);
  System.out.println("Are both set equal:"+value);
 }
}
   