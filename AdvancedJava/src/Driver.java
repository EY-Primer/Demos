import java.util.ArrayList;
import java.util.stream.Stream;

public class Driver {

    public static void main(String[] args) {

        //instantiating a few Threads to see them race
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        //to make a Thread actually start/run you call .start()
        t1.start();
        t2.start();
        t3.start();

        //classic example of a commonly used lambda: forEach() in collections
        ArrayList<String> ar = new ArrayList<String>();

        ar.add("Boy");
        ar.add("I");
        ar.add("Sure");
        ar.add("LooooOOOOOoove");
        ar.add("Java");

        //for each element in the ArrayList (which we'll call "word"), print it out
        ar.forEach(word -> System.out.println(word));

        //same thing, but manipulate each string then print it out.
        //lambdas with multiple expressions must be wrapped in curly braces (like any other code block)
        ar.forEach(word -> {
            word += "OOGABOOGA";
            System.out.println(word);
        });

        //messing with some streams--------------------

        //streams allow us to perform functions/procedures on collections of data
        //NOT a collection, not really meant to store data like a ArrayList, HashSet, etc.

    }

}
