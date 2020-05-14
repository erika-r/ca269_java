import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

@SuppressWarnings({"unchecked"})
public class MakeMap
{
    public static Map makeMap(Scanner in) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        while(in.hasNext())
        {
        	map.put(in.next(), in.nextInt());
        }
        return map;
    }
}