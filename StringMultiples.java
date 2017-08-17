package skill.test;

import java.util.Arrays;
import java.util.Scanner;

public class StringMultiples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please insert a number: ");
		int n = sc.nextInt();
		sc.close();
		String[] s = new String[n];
		for(int i = 1; i <= n; i++) 
			if(i % 3 == 0 && i % 5 == 0)
				s[i - 1] = "fizzbuzz";
			else if(i % 3 == 0)
				s[i - 1] = "fizz";
			else if(i % 5 == 0)
				s[i - 1] = "buzz";
			else 
				s[i - 1] = Integer.toString(i);
		System.out.println(Arrays.toString(s));
	}//main
}//StringMultiples