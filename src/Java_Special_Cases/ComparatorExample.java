package Java_Special_Cases;

import java.util.*;

class student{
    int age;
    String name;

    public student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


public class ComparatorExample{
    public static void main(String[] args) {


        List<student>list=new ArrayList<>();
        list.add(new student(24,"Jack"));
        list.add(new student(21,"James"));
        list.add(new student(19,"John"));
        list.add(new student(25,"Jack"));
        list.add(new student(19,"Boha"));

        Comparator<student> com=new Comparator<student>(){

            public int compare(student s1, student s2) {
                if(s1.age>s2.age)
                {
                    return 1;
                }
                else if(s1.age<s2.age){
                    return -1;
                }
                else {
                    return s1.name.compareTo(s2.name);  // lexicographically check 2 strings
                }
            }
        };
        Collections.sort(list,com);


        // we can also do this by lambda expresion :

        /*
        Collections.sort(list,(s1,s2)->{
            if(s1.age!=s2.age){
                return Integer.compare(s1.age,s2.age);
            }
            else{
                return s1.name.compareTo(s2.name);
            }
        });

        */

        System.out.println(list);




        // Sorting integers based on second number
        List<Integer>list1=new ArrayList<>();
        list1.add(24);
        list1.add(31);
        list1.add(28);
        list1.add(25);
        list1.add(19);
        list1.add(25);

        System.out.println("\nBefore Sorting : "+ list1);

        Comparator<Integer> com1=new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2) {
                if(i1%10>i2%10)
                {
                    return 1;
                }
                else if(i1%10<i2%10)
                {
                    return -1;
                }
                else{
                    return Integer.compare(i1,i2);
                }
            }
        };

        Collections.sort(list1,com1);

        //  We can also do this by lambda expresion in one line  :
       //   Collections.sort(list1,(num1,num2)->Integer.compare(num1%10,num2%10));
        System.out.println("\nAfter Sorting : "+ list1);







    }
}

