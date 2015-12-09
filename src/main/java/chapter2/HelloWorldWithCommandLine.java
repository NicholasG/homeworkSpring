package chapter2;

/**
 * Created by yar65 on 09.12.2015.
 */
public class HelloWorldWithCommandLine {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello World!");
        }
    }

}
