package calculator;

import java.util.Scanner;
public class calculator
{
 
	public static void main(String[] args) 
	{
		int res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Перше число:");
			int n1 = sc.nextInt();
		System.out.println("Друге число:");
			int n2 = sc.nextInt();
		System.out.println("Що робити?:");
			String op = sc.next();
		sc.close();
		
		switch(op)
		{
		case "+": res = n1 + n2;
							break;
		case "-": res = n1 - n2;
							break;
		case "*": res = n1 * n2;
							break;
		case "/": res = n1 / n2;
							break;
		}
		System.out.println(res);
	}
}