package excercise15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    }

    static List<Person> removeDuplicates(List<Person> persons) {
        Set<Person> people = new HashSet<>(persons);
        return new ArrayList<>(people);
    }
}
