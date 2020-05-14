public class Functions
{

	public static int getSum(int [] array)
	{
		int total = 0;
		for(int i=0; i < array.length ; i++)
		{
			total = total + array[i];
		}

		return total;
	}

	public static int countFives(int [] array)
	{
		int total = 0;
		for(int i=0; i < array.length ; i++)
		{
			if(array[i] == 5)
				total++;
		}

		return total ;
	}

	public static int countEven(int [] array)
	{
		int total = 0;
		for(int i=0; i < array.length ; i++)
		{
			if(array[i] % 2 == 0)
				total++;
		}

		return total ;
	}

}