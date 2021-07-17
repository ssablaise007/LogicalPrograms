package LogicalPrograms;
import Utility.java.Utility;
public class Prime {

		public static void main(String[] args) {
			Utility utility = new Utility();
			System.out.print("Enter the num to check prime or not : ");
			int n = utility.getIntValue();
			utility.Prime(n);
		}
	}

