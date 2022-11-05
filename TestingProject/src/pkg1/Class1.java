package pkg1;

import java.util.Scanner;

public class Class1 
{
	public void check()
	{
	 int a=0;
	 do
	 {
		 System.out.println("value of a "+a);
		 a=a+1;
	 }while(a>10);
		  
	}
	public static void main(String[] args)
	{
	  Class1 obj=new Class1();
	  obj.check();
	}

}
