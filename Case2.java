package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Case2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Set<Book> ss=new HashSet<Book>();
		Book[]c=new Book[40];
		do
		{int i=1;
			System.out.println("Menu");
			System.out.println("1.Book\n 2.Check ststus\n 3.Exit");
			int n=s.nextInt();
			switch(n)
			{
			case 1:{
		int count = 0;
		String ac=s.next();
		String cable=s.next();
		String wifi=s.next();
		String laundry=s.next();
		String cot=s.next();
		int number=s.nextInt();
		c[count]=new Book();
		c[count].setAc(ac);
		c[count].setCable(cable);
		c[count].setWifi(wifi);
		c[count].setLaundry(laundry);
		c[count].setCot(cot);
		ss.add(c[count]);
		count++;
	Iterator<Book>itr=ss.iterator();
	while(itr.hasNext())
	{
		Book ca=(Book)itr.next();
		System.out.println(ca.getAc()+" "+ca.getCable());
	}
	}

}
