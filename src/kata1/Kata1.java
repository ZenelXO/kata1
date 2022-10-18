package kata1;


import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {     
        Person person = new Person("Ángel", LocalDate.of(2002, 6, 16));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
