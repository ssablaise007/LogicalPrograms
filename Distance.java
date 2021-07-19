package day6_q3;

import java.util.Scanner;

import Utility.java.Utility;

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
/*
 * Utility Class for Distance 
 */
public void getEuclidianDist(int x, int y) {
	double distance;
	distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	System.out.println("Euclidian distance from points = "+distance);
}
/*
 * Main Class For Distance 
 */
public class Distance {

public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.print("Enter point x : ");
		int x = utility.getIntValue();
		System.out.print("Enter point y : ");
		int y = utility.getIntValue();
		utility.getEuclidianDist(x, y);
	}

}
