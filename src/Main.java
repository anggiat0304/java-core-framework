
import javacore.People;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        People people1 = new People("Anggiat Pangaribuan",25, "M",164);
        People people2 = new People("Anggiat Simanjuntak",25, "M",164);
        People people3 = new People("Anggiat Lu",25, "M",164);

        List<People> peoples = Arrays.asList(people1, people2, people3);
        for (People people : peoples) {
            System.out.println(people.getId() + " " + people.getName() + " " + people.getAge());
        }

    }
}