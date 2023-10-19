package TASK;
import java.util.*;
class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,r,a=0;
		Random random = new Random(); 
		r=random.nextInt(101);
		System.out.println("GENERATE A RANDOM NUMBER  ="+r);
		for(i=1;i<6;i++)
		{
		System.out.println("ENTER ANY NUMBER");
		int num=sc.nextInt();
		a++;
		if(num==r)
		{
			
			System.out.println("CORRECT NUMBER");
			
			break;
		}
		else if(num>r&&num<=100)
		{
			System.out.println(" TO HIGH");
			
		}
		else
		{
			System.out.println("TOO LOW");
			
		}

	}
		System.out.println("USER SCORE");
		System.out.println("NO OF ATTEMPT ="+a);
	}
	

}
