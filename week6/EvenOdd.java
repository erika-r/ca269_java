import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class EvenOdd
{
	public static void main(String [] args)
	{

		Scanner in = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<Integer>();

		System.out.print("Enter numbers: ");
		int num = in.nextInt();

		while(num != -1)
		{
			numbers.add(num);
			num = in.nextInt();
		}

		String odd = "Odd: ";
		String even = "Even:";

		for(int n : numbers)
		{
			if(n % 2 == 0)
				even += n + " ";
			else
				odd += n + " ";
		}

		System.out.println(odd + "\n" + even);

	}

}
