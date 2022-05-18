package day1;

public class Whileloop {

	public static void main(String[] args) {

		int i = 1;

		while (i <= 15) 
		{

			System.out.println(i);
			i++;
		}

		// even number between 1to15
		i = 2;

		while (i <= 15) 
		{
			System.out.println("-----------------------------------------------------");
			System.out.println(i);
			i = i + 2;
		}

		// print 1 to 10 decrement

		i = 10;

		while (i > 0) 
		{
			System.out.println("========");
			System.out.println(i);
			i = i - 2;
		}
	}

}
