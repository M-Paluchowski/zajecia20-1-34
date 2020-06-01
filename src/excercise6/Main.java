package excercise6;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Person> filterAdultPersons(List<Person> personsToFilter) {
        return personsToFilter.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());
    }
}
