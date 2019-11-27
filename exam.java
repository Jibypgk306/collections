package set;

import java.util.*;
class exam
{
  public static void main(String [] args)
  {
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int sum=0;
	  int i,j,avg=0;
	  int a[]=new int[n];
	  int max=0;
	  for(i=0;i<n;i++)
	  {
		  a[i]=s.nextInt();
  }
	  for(i=0;i<n;i++)
	  {  
		  for(j=1;j<n;j++)
		  {
			  if(a[i]>a[j])
			  {
				  max=a[i];
			  }
	  sum=sum+a[i]-max;
	 avg=sum/n;
}
	  System.out.println(avg);
  }
  }
}