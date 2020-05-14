import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class HasPrevious
{
	public static void main(String [] args)
	{

		Scanner in = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<Integer>();

		System.out.println("Enter some numbers (-1 to end)");
		int num = in.nextInt();

		while(num != -1)
		{
			numbers.add(num);
			num = in.nextInt();
		}

		System.out.print("Previous: ");

		for(int n : numbers)
		{
			if(Collections.frequency(numbers, n) > 1)
				System.out.println(n);
		}

	}

}
