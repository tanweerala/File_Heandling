import java.util.*;
class Cursors
{
 public static void main (String [] args) 
 {

 Vector v1=new Vector();
 v1.add("A");
 v1.add("B");
 v1.add("T");
 v1.add("D");
 v1.add("G");

ListIterator l1=v1.listIterator();
while(l1.hasNext())
{
  System.out.println(l1.next());
}
while(l1.hasPrevious())
{
    System.out.println(l1.previous());

}


 
/* Iterator e1=v1.iterator();

while(e1.hasNext())
{
String s1 =(String)e1.next();
if(s1=="D"  || s1=="A")
{
 e1.remove(); 
}
else
{
System.out.println(s1);
}
     
}*/



/* Enumeration k1=v1.elements();
while(k1.hasMoreElements())
{
  System.out.println(k1.nextElement());
}*/

}
}