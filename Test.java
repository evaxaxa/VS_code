import java.util.*;

public class Test{
    
    public static void main(String a[]) {

        // String str = "hello";

        // char c[] =str.toCharArray();

     //   List<Character> a1 = Arrays.asList('h','e','l','l','l','o');

        String s = "hellkkssso";

       char a1[]=s.toCharArray();

        // Character[] a1 = new String(charArr).chars()
        //         .mapToObj(c -> (char) c)
        //         .toArray(Character[]::new);

       
        Map<Character,Integer> m = new HashMap<>();

        for(char c : a1)
        {
            if(m.containsKey(c))
            m.put(c,m.get(c)+1);
            else
            m.put(c,1);

        }
    
        for(Map.Entry<Character,Integer> e : m.entrySet())
        {
            if(e.getValue()>1)
            {
                System.out.println(e.getKey()+" "+e.getValue());
           }
        }


        
    }
}