package excercise24;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    static List<String> convertToNames(List<Person> persons) {
        return persons.stream()
                .map(Person::getFirstName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
