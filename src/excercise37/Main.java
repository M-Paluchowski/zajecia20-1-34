package excercise37;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(new Person(17), new Person(19)));

//        for (Person person : people) {
//            if (person.getAge() >= 18) {
//                people.remove(person);
//            }
//        }

//        people.removeIf(person -> person.getAge() >= 18);

        Iterator<Person> iterator = people.iterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getAge() >= 18) {
                iterator.remove();
            }
        }
    }
}
