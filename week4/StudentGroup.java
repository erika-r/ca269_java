
public class StudentGroup
{
   public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].name);
   }

   public static void printHonours(Student [] student)
   {
        for(int i = 0; i < student.length; i++)
        {
            if(student[i].getMark() >= 55)
                System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
        }
   }    

   public static void printForties(Student [] student)
   {
        for(int i = 0; i < student.length; i++)
        {
            if(student[i].getMark() >= 40 && student[i].getMark() < 50)
                System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
        }
   }

   public static int numberPasses(Student [] student)
   {
        int count = 0; 
        for(int i = 0; i < student.length; i++)
        {
            if(student[i].getMark() >= 40)
                count++;
        }
        return count;
   }

   public static Student getBestStudent(Student [] student)
   {
        Student best = student[0];
        for(int i = 0; i < student.length; i++)
        {
            if(student[i].getMark() > best.getMark())
                best = student[i];
        }
        return best;
   }

   public static double getPassingAverage(Student [] student)
   {
        int count = 0; 
        double sum =0;
        for(int i = 0; i < student.length; i++)
        {
            if(student[i].getMark() >= 40)
            {
                count++;
                sum += student[i].getMark();
            }
        }
        return sum / count;
   }

}