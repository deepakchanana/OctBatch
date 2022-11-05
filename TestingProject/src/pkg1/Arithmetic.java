package pkg1;

import java.util.Scanner;

public class Arithmetic 
{
   public static void main(String[] args)
   {
	for(int i=1;i<=5;i=i+1)  // outer loop for rows i------3
	{
	  for(int j=1;j<=i;j=j+1) // inner loop for column  j---1 to 3
	  {
		  System.out.print("*");  // 3 star with in same row
	  }
	  System.out.println();  // will move cursor to the next line
	}
   }
   
}
