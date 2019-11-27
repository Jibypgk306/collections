package set;
import java.util.*;
import java.util.HashSet;


public class Sett {

	public static void main(String[] args)
	{
HashSet<String>set=new HashSet<String>();
set.add("Jiby");
set.add("Solly");
set.add("Juby");
set.add("Diya");
set.add("Solly");
set.add("Sony");
Iterator<String>itr=set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}
}
