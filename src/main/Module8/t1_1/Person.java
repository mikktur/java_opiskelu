package Module8.t1_1;

import java.util.ArrayList;
import java.util.Comparator;

public class Person {

        String name;
        String city;
        int age;
        public Person(String name, String city, int age){
            this.name = name;
            this.city = city;
            this.age = age;
        }
        public int getAge(){
            return age;
        }
        public String getName(){
            return name;
        }
        public String getCity(){
            return city;
        }
    public static void main(String[]args){
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Reeni","Savonlinna",25));
        //different persons
        persons.add(new Person("Taisto","Helsinki",15));
        persons.add(new Person("Pentti","Helsinki",26));
        persons.add(new Person("Satu","Espoo",39));
        persons.add(new Person("Jerry","Helsinki",10));
        persons.add(new Person("Kauko","Vantaa",55));

        System.out.println("Original list");
        persons.forEach(person -> System.out.println(person.name + " " + person.age+" "+person.city));
        Comparator<Person> ageComparator = (person1, person2) -> Integer.compare(person1.getAge(), person2.getAge());
        persons.sort(ageComparator);
        System.out.println("After sorting by age");
        persons.forEach(person -> System.out.println(person.name + " " + person.age));
        persons.removeIf(person -> !person.getCity().equals("Helsinki"));
        System.out.println("After removing persons not from Helsinki");
        persons.forEach(person -> System.out.println(person.name + " " + person.city));


    }

    }



