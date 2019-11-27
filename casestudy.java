package set;
import java.util.*;

public class casestudy {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	Set<NewCard> ss=new TreeSet<NewCard>(new Symbol());
	NewCard[]c=new NewCard[40];
	int n=s.nextInt();
	int count = 0;
	while(ss.size()<n)
	{
	String symbol=s.next();
	int number=s.nextInt();
	c[count]=new NewCard();
	c[count].setSymbol(symbol);
	c[count].setNumber(number);
	ss.add(c[count]);
	count++;
	}
System.out.println(n+"Symbols gatherd in"+count+ "cards.");
System.out.println("cards are ");
Iterator<NewCard>itr=ss.iterator();
while(itr.hasNext())
{
	NewCard ca=(NewCard)itr.next();
	System.out.println(ca.getSymbol()+" "+ca.getNumber());
}
}
}
