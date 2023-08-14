package doWhileloop;

public class doWhile {
	public static void main(String[] args) {
		doWhile d = new doWhile();
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
		int i=1;
		
		do{
			System.out.print(i+" ");
			i++;
		}while(i<=25);
		System.out.println("\n");
	}
	public void second()
	{
		System.out.println("Print the numbers from 25 to 1");
		int i=25;
		
		do{
			System.out.print(i+" ");
			i--;
		}while(i>=1);
		System.out.println("\n");
	}
	public void third()
	{
		System.out.println("Print the odd numbers from 1 to 100");
		int i=1;
		do{
			if(i%2!=0)
				System.out.print(i+" ");
			i++;
		}while(i<=100);
		System.out.println("\n");
	}
	public void fourth()
	{
		System.out.println("Print the even numbers from 1 to 100");
		int i=1;
		do{
			if(i%2==0)
				System.out.print(i+" ");
			i++;
		}while(i<=100);
		System.out.println("\n");
	}
	public void fifth()
	{
		int sum=0,i=1;
		do{
			if(i%2!=0)
				sum+=i;
			i++;
		}while(i<=50);
		System.out.println("Sum of odd numbers from 1 to 50: "+ sum);
		System.out.println("\n");
	}
	public void sixth()
	{
		int sum=0,i=1;;
	
		do{
			if(i%2==0)
				sum+=i;
			i++;
		}while(i<=50);
		System.out.println("Sum of even numbers from 1 to 50: "+sum);
		System.out.println("\n");
	}
	public void seventh()
	{
		System.out.println("Print the numbers from -45 to 45");
		int i=-45;
		 do{
			System.out.print(i+" ");
			i++;		
		}while(i<=45);
		 System.out.println("\n");
	}
	public void eighth()
	{
		System.out.println("Print the numbers from 50 to 100");
		int i=50;
		
		do{
			System.out.print(i+" ");
			i++;
		}while(i<=100);
		System.out.println("\n");
	}
	public void ninth()
	{
		int n=10;
		int m=100;
		int s1=0,s2=0,i=n;
		do
		{
			if(i%2!=0) {
				s1+=i;
			}
			else
			{
				s2+=i;
			}
			i++;
		}while(i<=m);
		
		System.out.println("Sum of odd numbers from 10 to 100: "+s1);
		System.out.println("Sum of even numbers from 10 to 100: "+s2);
		System.out.println("\n");
	}
	public void tenth()
	{
		int n=10;
		int m=100;
		System.out.println("Even Numbers:");
		int i=n;
		do
		{
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}while(i<=m);
	
		System.out.println("Odd numbers:");
		i=n;
		do
		{
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			i++;
		}while(i<=m);
		System.out.println("\n");
	}
	public void eleventh()
	{
		System.out.println("Print the numbers from 1 to 100");
		int i=1;
		
		do{
			System.out.print(i+" ");
			i++;
		}while(i<=100);
		System.out.println("\n");
		
	}
	public void twelth()
	{
		System.out.println("Print the numbers from 100 to 1");
		int i=100;
		
		do{
			System.out.print(i+" ");
			i--;
		}while(i>=1);
		System.out.println("\n");
	}
	public void thirteenth()
	{
		System.out.println("Print the numbers from 30 to 50");
		int i=30;
		
		do{
			System.out.print(i+" ");
			i++;
		}while(i<=50);
		System.out.println("\n");
	}
	public void fourteenth()
	{
		System.out.println("count the even numbers from 1 to 25");
		int count=0,i=1;
		
		do{
			if(i%2==0)
				count++;
			i++;
		}while(i<=25);
		System.out.print(count+" ");
		System.out.println("\n");
	}
	public void fifteenth()
	{
		System.out.println("count the odd numbers from 1 to 25");
		int count=0,i=1;
		
		do{
			if(i%2!=0)
				count++;
			i++;
		}while(i<=25);
		System.out.print(count+" ");
		System.out.println("\n");
	}
	public void series1()
	{
		System.out.println("series1");
		int i=1;
		
		do{
			if(i%2==0)
				System.out.print(i+ " ");
			i++;
		}while(i<=20);
		System.out.println("\n");
	}
	public void series2()
	{
		System.out.println("series2");
		int i=1;
		
		do{
			if(i%9==0)
				System.out.print(i+ " ");
			i++;
		}while(i<=90);
		System.out.println("\n");
		
	}
	public void series3()
	{
		System.out.println("series3");
		int i=1;
		
		do{
			if(i%2==0)
				System.out.print("-"+i+" ");
			else
				System.out.print(i+" ");
			i++;
		}while(i<=10);
		System.out.println("\n");
	}
	public void series4()
	{
		System.out.println("series4");
		int i=1;
		
		do{
			if(i%5==0)
				System.out.print(i+ " ");
			i++;
		}while(i<=50);
		System.out.println("\n");
	}
	public void series5()
	{
		System.out.println("series5");
		int i=1;
		
		do{
			System.out.print(i+ " ");
			i*=10;
		}while(i<=1000);
		System.out.println("\n");
	}
	public void series6()
	{
		System.out.println("series6");
		int s=0,i=1;
		do
		{
			s+=i;
			System.out.print(s+ " ");
			i++;
		}while(i<10);
		System.out.println("\n");
	}
	public void series7()
	{
		System.out.println("series7");
		int i=1;
		do
		{
			if(i%8==0)
				System.out.print(i+ " ");
			i++;
		}while(i<=80);
		System.out.println("\n");
	}
	public void series8()
	{
		System.out.println("series8");
		int s=0,s1=1,i=2;
		System.out.print(s+" "+s1+" ");
		do
		{
			i=s+s1;
			System.out.print(i+ " ");
			s=s1;
			s1=i;
			i++;
		}while(i<=20);
		System.out.println("\n");
	}
	public void series9()
	{
		System.out.println("series9");
		int i=1;
		
		do{
			System.out.print(i*i+ " ");
			i++;
		}while(i<=10);
		System.out.println("\n");
	}
	public void series10()
	{
		System.out.println("series10");
		int i=1;
		
		do{
			if(i%3==0)
				System.out.print(i+ " ");
			i++;
		}while(i<=30);
		System.out.println("\n");
	}
	public void series11()
	{
		System.out.println("series11");
		int i=1;
		do
		{
			if(i%7==0)
				System.out.print(i+ " ");
			i++;
		}while(i<=70);
		System.out.println("\n");
	}
	public void series12()
	{
		System.out.println("series12");
		int i=1;
		do
		{
			if(i%4==0)
				System.out.print(i+ " ");
			i++;
		}while(i<=40);
		System.out.println("\n");
	}
	public void series13()
	{
		System.out.println("series13");
		int i=1;
		do
		{
			if(i%10==0)
				System.out.print(i+ " ");
			i++;
		}while(i<=100);
		System.out.println("\n");
	}
	public void series14()
	{
		System.out.println("series14");
		int i=1;
		do
		{
			System.out.print(i+ " ");
			i++;
		}while(i<5);
		i=5;
		do
		{
			System.out.print(i+ " ");
			i--;
		}while(i>=1);
		System.out.println("\n");
	}
	public void series15()
	{
		System.out.println("series15");
		int i=1;
		do
		{
			if(i%6==0)
				System.out.print(i+ " ");
			i++;
		}while(i<=60);
		System.out.println("\n");
	}
}

