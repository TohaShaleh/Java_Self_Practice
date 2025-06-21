package Java_Streams;
import java.util.*;
public class java_selfComparator {

    public static <T> void disp(List<T> list)
    {
        for(T u:list)
        {
            System.out.println(u);
        }
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        list.add(32);
        list.add(13);
        list.add(54);
        list.add(55);
        list.add(43);
        list.add(25);

        Comparator<Integer>com1=(Integer o1,Integer o2)->{

                if(o1%10>o2%10)
                {
                    return 1;
                }
                else if(o1%10<o2%10)
                {
                    return -1;
                }
                else {
                    return Integer.compare(o1,o2);
                }

        };

        Collections.sort(list);

        System.out.println("First Sorting : ");
        disp(list);


        Collections.sort(list,com1);


        System.out.println("Second Sorting : ");
        disp(list);
        input.close();

        System.out.println("Before sorting the strings : ");
        List<String>str=Arrays.asList("Toha","Afrin","Tarinaaa","abc","ab");
        disp(str);



        Comparator<String>com2=new Comparator<String>() {
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length())
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };

        Comparator<String>com3=(o1,o2)->Integer.compare(o1.length(),o2.length());

        Collections.sort(str,com2);
        System.out.println("After sorting the strings : ");
        disp(str);






    }


}
