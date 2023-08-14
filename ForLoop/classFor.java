package Forloop;

public class classFor {
	public static void main(String[] args) {
		classFor d = new classFor();
		d.first();
		d.second();
		d.third();
		d.fourth();
		d.fifth();
		d.sixth();
		d.seventh();
		d.eighth();
		d.ninth();
		d.tenth();
		d.eleventh();
		d.twelth();
		d.thirteenth();
		d.fourteenth();
		d.fifteenth();
		d.series1();
		d.series2();
		d.series3();
		d.series4();
		d.series5();
		d.series6();
		d.series7();
		d.series8();
		d.series9();
		d.series10();
		d.series11();
		d.series12();
		d.series13();
		d.series14();
		d.series15();
	}
	public void first()
	{
		System.out.println("Print the numbers from 1 to 25");
		for (int i = 1; i <= 25; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	public void second()
	{
		System.out.println("Print the numbers from 25 to 1");
		for(int i=25;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	public void third()
	{
		System.out.println("Print the odd numbers from 1 to 100");
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	public void fourth()
	{
		System.out.println("Print the even numbers from 1 to 100");
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	public void fifth()
	{
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			if(i%2!=0)
				sum+=i;
		}
		System.out.println("Sum of odd numbers from 1 to 50: "+ sum);
		System.out.println("\n");
	}
	public void sixth()
	{
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
				sum+=i;
		}
		System.out.println("Sum of even numbers from 1 to 50: "+sum);
		System.out.println("\n");
	}
	public void seventh()
	{
		System.out.println("Print the numbers from -45 to 45");
		for(int i=-45;i<=45;i++) {
			System.out.print(i+" ");
				
		}
		 System.out.println("\n");
	}
	public void eighth()
	{
		System.out.println("Print the numbers from 50 to 100");
		for(int i=50;i<=100;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	public void ninth()
	{
		int n=10;
		int m=100;
		int s1=0,s2=0;
		for(int i=n;i<=m;i++)
		{
			if(i%2!=0) {
				s1+=i;
			}
			else
			{
				s2+=i;
			}
		}
		
		System.out.println("Sum of odd numbers from 10 to 100: "+s1);
		System.out.println("Sum of even numbers from 10 to 100: "+s2);
		System.out.println("\n");
	}
	public void tenth()
	{
		
		int n=10;
		int m=100;
		System.out.println("Even Numbers:");
		for(int i=n;i<=m;i++)
		{
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("Odd numbers:");
		for(int i=n;i<=m;i++)
		{
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n");
	}
	public void eleventh()
	{
		System.out.println("Print the numbers from 1 to 100");
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
		
	}
	public void twelth()
	{
		System.out.println("Print the numbers from 100 to 1");
		for(int i=100;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	public void thirteenth()
	{
		System.out.println("Print the numbers from 30 to 50");
		for(int i=30;i<=50;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	public void fourteenth()
	{
		System.out.println("count the even numbers from 1 to 25");
		int count=0;
		for(int i=1;i<=25;i++)
		{
			if(i%2==0)
				count++;
		}
		System.out.print(count+" ");
		System.out.println("\n");
	}
	public void fifteenth()
	{
		System.out.println("count the odd numbers from 1 to 25");
		int count=0;
		for(int i=1;i<=25;i++)
		{
			if(i%2!=0)
				count++;
		}
		System.out.print(count+" ");
		System.out.println("\n");
	}
	public void series1()
	{
		System.out.println("series1");
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
				System.out.print(i+ " ");
		}
		System.out.println("\n");
	}
	public void series2()
	{
		System.out.println("series2");
		for(int i=1;i<=90;i++)
		{
			if(i%9==0)
				System.out.print(i+ " ");
		}
		System.out.println("\n");
		
	}
	public void series3()
	{
		System.out.println("series3");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				System.out.print("-"+i+" ");
			else
				System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	public void series4()
	{
		System.out.println("series4");
		for(int i=1;i<=50;i++)
		{
			if(i%5==0)
				System.out.print(i+ " ");
		}
		System.out.println("\n");
	}
	public void series5()
	{
		System.out.println("series5");
		for(int i=1;i<=1000;i*=10)
		{
			System.out.print(i+ " ");
		}
		System.out.println("\n");
	}
	public void series6()
	{
		System.out.println("series6");
		int s=0;
		for(int i=1;i<10;i++)
		{
			s+=i;
			System.out.print(s+ " ");
		}
		System.out.println("\n");
	}
	public void series7()
	{
		System.out.println("series7");
		for(int i=1;i<=80;i++)
		{
			if(i%8==0)
				System.out.print(i+ " ");
		}
		System.out.println("\n");
	}
	public void series8()
	{
		System.out.println("series8");
		int s=0,s1=1;
		System.out.print(s+" "+s1+" ");
		for(int i=2;i<=20;i++)
		{
			i=s+s1;
			System.out.print(i+ " ");
			s=s1;
			s1=i;
		}
		System.out.println("\n");
	}
	public void series9()
	{
		System.out.println("series9");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i*i+ " ");
		}
		System.out.println("\n");
	}
	public void series10()
	{
		System.out.println("series10");
		for(int i=1;i<=30;i++)
		{
			if(i%3==0)
				System.out.print(i+ " ");
		}
		System.out.println("\n");
	}
	public void series11()
	{
		System.out.println("series11");
		for(int i=1;i<=70;i++)
		{
			if(i%7==0)
				System.out.print(i+ " ");
		}
		System.out.println("\n");
	}
	public void series12()
	{
		System.out.println("series12");
		for(int i=1;i<=40;i++)
		{
			if(i%4==0)
				System.out.print(i+ " ");
		}
		System.out.println("\n");
	}
	public void series13()
	{
		System.out.println("series13");
		for(int i=1;i<=100;i++)
		{
			if(i%10==0)
				System.out.print(i+ " ");
		}
		System.out.println("\n");
	}
	public void series14()
	{
		System.out.println("series14");
		for(int i=1;i<5;i++)
		{
			System.out.print(i+ " ");
		}
		for(int i=5;i>=1;i--)
		{
			System.out.print(i+ " ");
		}
		System.out.println("\n");
	}
	public void series15()
	{
		System.out.println("series15");
		for(int i=1;i<=60;i++)
		{
			if(i%6==0)
				System.out.print(i+ " ");
		}
		System.out.println("\n");
	}
}



