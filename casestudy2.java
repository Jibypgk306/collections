package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class casestudy2 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		HashSet<String>set=new HashSet<String>();
		do
		{int i=1;
			System.out.println("Menu");
			System.out.println("1.Book\n 2.Check ststus\n 3.Exit");
			int n=s.nextInt();
			switch(n)
			{
			case 1:{
		System.out.println("Booking");
		System.out.println("Please choose the service required(AC/NAC)");
		String ac=s.next();
		set.add(ac);
		System.out.println("Cot:(Single/Double)");
		String cot=s.next();
		set.add(cot);
		System.out.println("Cable connection");
		String cable=s.next();
		set.add(cable);
		System.out.println("Wifi Needed or not?");
		String wifi=s.next();
		set.add(wifi);
		System.out.println("Laundry service");
		String laun=s.next();
		set.add(laun);
		System.out.println("Successfully booked");
		if(ac=="ac")
		{
			int acc=500;
			int cott=300;
			int cab=200;
			int w=150;
			int l=100;
		int total=acc+cott+cab+w+l;
		System.out.println("The total charge is"+total);
		}
		else
		{
			int cott=300;
			int cab=200;
			int w=150;
			int l=100;
		int total=cott+cab+w+l;
		System.out.println("The total charge is"+total);
		}
		Iterator<String>itr=set.iterator();
		int j=1;
		while(itr.hasNext()) {
		System.out.println(j+ " "+itr.next());
		j++;
		}
		System.out.println("Do u want to proceed(y/n)");
String pr=s.next();
if((pr=="yes")||(pr=="no"))
{
	System.out.println("Thankyou ..Your room number is"+i);	
	i++;
}
}	break;
			case 2:
			{	
				System.out.println("Check Status");
				int index=s.nextInt();
				if(index!=i)
						{
					System.out.println("Not booked");
						}
				else if(index==i)
				{
					System.out.println("booked");
				}
	}
			break;
			case 3:
			{
				System.out.println("Successfully Exited");
				System.exit(0);
			}
}
	}while(true) ;
}
}