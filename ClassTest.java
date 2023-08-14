import java.util.*;
public class armstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n,sum=0;
		while(n>0)
		{
			int unitd=n%10;
			sum=sum+(unitd*unitd*unitd);
			n/=10;
		}
		if(sum==m)
		{
			System.out.println(m + " is Armstrong number");
		}
		else
		{
			System.out.println(m + " is not an Armstrong number");
		}
	}

}
