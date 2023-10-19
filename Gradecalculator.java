package TASK;
import java.util.*;
public class Gradecalculator {

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int a;
       float p, total=0,avg=0;
       int m[]=new int[6];
       System.out.print("enter no of subject ");
       a=sc.nextInt();
       for(int i=1;i<=a;i++)
       {
    	   System.out.print("enter the marks"+i+" :");
    	    m[i]=sc.nextInt();
    	    total=total+m[i];
       }
       avg=total/a;
       p=avg *100;
       System.out.println("TOTAL MARKS ="+total);
    		   System.out.println("AVERAGE PERCENTAGE ="+p);
    		   System.out.print("The student Grade is: ");
    	        if(avg>=80)
    	        {
    	            System.out.print("A");
    	        }
    	        else if(avg>=60 && avg<80)
    	        {
    	           System.out.print("B");
    	        } 
    	        else if(avg>=40 && avg<60)
    	        {
    	            System.out.print("C");
    	        }
    	        else
    	        {
    	            System.out.print("D");
    	        }

	}
}


