package org.Collections_exercise;

import org.Collections_exercise.Model.Car;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Task 1");
        List<String> List_DaysOfTheWeek = new ArrayList<String>();

        List_DaysOfTheWeek.add( "Monday");
        List_DaysOfTheWeek.add( "Tuesday");
        List_DaysOfTheWeek.add( "Wednesday");
        List_DaysOfTheWeek.add( "Thursday");
        List_DaysOfTheWeek.add( "Friday");
        List_DaysOfTheWeek.add( "Saturday");
        List_DaysOfTheWeek.add( "Sunday");


        //Task 1 Collections
        System.out.println(List_DaysOfTheWeek);
        System.out.println();
        System.out.println("Task 2");

        //Task 2 collections
        Iterator itr = List_DaysOfTheWeek.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


       // Task 3 collections
        List<String> List_DaysOfTheWeek2 = new ArrayList<String>();

        List_DaysOfTheWeek2.add( "Monday");
        List_DaysOfTheWeek2.add( "Tuesday");
        List_DaysOfTheWeek2.add( "Wednesday");
        List_DaysOfTheWeek2.add( "Friday");
        List_DaysOfTheWeek2.add( "Saturday");
        List_DaysOfTheWeek2.add( "Sunday");

        System.out.println();
        System.out.println("Task 3");
        List_DaysOfTheWeek2.add( 3,"Thursday");

        System.out.println(List_DaysOfTheWeek2);
        //Task 4 collections exercise
        System.out.println();
        System.out.println("Task 4");
        List<String> subList = List_DaysOfTheWeek2.subList(0, 3);
        System.out.println(subList);

        //Task 5 collections exercise
        System.out.println();
        System.out.println("Task 5");
        HashSet<String> set = new HashSet<String>();
        set.add("Monday");
        set.add("Tuesday");
        set.add("Wednesday");
        set.add("Thursday");
        set.add("Friday");
        set.add("Saturday");
        set.add("Sunday");

        System.out.println(set);

        //Task 5 collections exercise
        System.out.println();
        System.out.println("Task 6");
        HashSet<String> set2 = new HashSet<String>();
        set2.add("Monday");
        set2.add("Tuesday");
        set2.add("Wednesday");
        set2.add("Thursday");
        set2.add("Friday");
        set2.add("Saturday");
        set2.add("Sunday");

        // convert to Arraylist
        ArrayList<String> daysOfWeek = new ArrayList<>(set2);
        System.out.println(daysOfWeek);

        //Task 5 collections exercise
        System.out.println();
        System.out.println("Task 7");
        HashSet<String> RandomNames = new HashSet<String>();
        RandomNames.add("Martin");
        RandomNames.add("Nelly");
        RandomNames.add("Steve");
        RandomNames.add("Trevor");
        RandomNames.add("Chloe");

        // Sorting HashSet using List
        List<String> list = new ArrayList<String>(RandomNames);
        Collections.sort(list);
        System.out.println(list);

        System.out.println();
        System.out.println("Task 8");
        Set<String> treeSet = new TreeSet<String>(RandomNames);

        // After Sorting
        System.out.println("\n\nAfter Sorting :\n");
        for(String names : treeSet) {
            System.out.println(names);
        }

        System.out.println();
        System.out.println("Task 9");
        HashMap<Integer,String> cars = new HashMap<Integer,String>();
        //key --- Value
        cars.put(1,"Benz");
        cars.put(2,"Mazda");
        cars.put(3,"Masserati");
        cars.put(4,"VolksWagen");
        cars.put(5,"Peugeout");

        System.out.println(cars);


        System.out.println("Task 10");
        System.out.println();

        for (Map.Entry m : cars.entrySet()){
            System.out.println("Keys: "+m.getKey());
        }

        System.out.println("Task 11");
        System.out.println();

        for (Map.Entry m : cars.entrySet()){
            System.out.println("Values: "+m.getValue());
        }

        System.out.println();
        System.out.println("Task 12");;

        HashMap<Integer,Car> hashCar = new HashMap<Integer,Car>();

        Car c2 = new Car(450,"VW","SEDAN");
        Car c3 = new Car(390,"BENZ","COMBI");
        hashCar.put(c2.getId(), c2);
        hashCar.put(c3.getId(),c3);

        for (Integer m : hashCar.keySet()){
            System.out.println("Value: "+hashCar.get(m).getModel());
        }












    }
}
