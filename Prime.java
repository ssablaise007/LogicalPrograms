package Utility.java;
import java.util.Scanner;

/*
 * *********************** Utility Class ****************************
 */
public class Utility {
	Scanner scanner;
	
	public Utility() {
		/*
		 * Scanner class instance for scanner 
		 */
		scanner = new Scanner(System.in);
	}
/*
 * input function to take integer from user
 */
	public int getIntValue() {
		return scanner.nextInt();
	}

public void Prime(int num) {
	boolean flag = true;{
		if(num != 0 && num != 1) {
			
			for(int i=2; i<=num/2; i++) {
				if(num % i == 0)
					flag = false;
			}
			if(flag)
				System.out.println(num+" is prime number");
			else
				System.out.println(num+" is not prime number");
		}
		else
			System.out.println(num+" is not prime number");
	}
	}
}
	
