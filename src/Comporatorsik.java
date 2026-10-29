import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Comporatorsik {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("tom"));
        treeSet.add(new Person("Andret"));
        treeSet.add(new Person("UK"));
        System.out.println(treeSet);
    }
    static class Person implements Comparable<Person>{
        private final String _name;
        Person(String name) {
            this._name = name;
        }

        public String getName() {
            return _name;
        }

        @Override
        public int compareTo(Person p) {
            return _name.compareTo(p.getName());
        }

        @Override
        public String toString() {
            return _name;
        }

    }
    static class PersonComporator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }

    }
}
