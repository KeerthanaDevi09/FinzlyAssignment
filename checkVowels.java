package Assignments;

import java.util.Scanner;

public class checkVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] s=str.toCharArray();
		int a=0,b=0,c=0,d=0,e=0;
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i]=='a' || s[i]=='A')
				a=1;
			else if(s[i]=='e' || s[i]=='E')
				b=1;
			else if(s[i]=='i' || s[i]=='I')
				c=1;
			else if(s[i]=='o' || s[i]=='O')
				d=1;
			else if(s[i]=='u' || s[i]=='U')
				e=1;
		}
		if(a==1 && b==1 && c==1 && d==1 && e==1)
			System.out.println("Given word contains all the vowels");
		else
			System.out.println("Given word dose not contains all the vowels");
			
	}

}

