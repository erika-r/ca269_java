import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GroupStudents
{
   public static void main(String [] args)
   {

   	try
   	{
   		String filename = args[0];
   		Scanner in = new Scanner(new File(filename));
   		int len = Integer.parseInt(in.next());

   		Student [] group = new Student[len];

   		for(int i = 0; i < len; i++)
   		{
   			String name = in.next();
   			int mark = Integer.parseInt(in.next());
   			group[i] = new Student(name, mark);
   		}

   		Student.print(group);
   		in.close();
   	}

   	catch (FileNotFoundException e)
   	{
   		System.out.print("");
   	}

   }
}