
public class Reverse
{
	public static void reverse(int [] array)
	{
		for(int i=0; i < array.length /2; i++)
		{
			int tmp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = tmp;
		}
	}

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers: ");

        int num = in.nextInt();

        System.out.print("Enter " + num + " numbers: ");
        int [] array = new int [num];

        for(int i=0; i < num; i++)
        {
        	array[i] = in.nextInt();
        }

        System.out.print("The numbers reversed are:");
        for(int i= array.length-1; i >= 0; i-- )
        {
        	System.out.print(" " + array[i]);
        }
        System.out.println();
    }
	
	    
}
