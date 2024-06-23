package defaultandstatic;

import java.util.List;

@FunctionalInterface
interface Printable{
    void print();
    default void scan(){
        System.out.println("Hello from Default Method");
    }

    static void play(){
        System.out.println("Let's Play");
    }
}

class Printer implements Printable{

    public void print() {
        System.out.println("Hello World");
    }


    @Override
    public void scan() {
        System.out.println("Scanning..");
    }
}

public class DefaultAndStaticMethodExample {
    public static void main(String[] args) {
        Printable printable = new Printer();
        printable.print();
        printable.scan();

        Printable.play();

        // Real example of static method

        List<String> users = List.of("James","Suhas","Vishnu");


    }
}
