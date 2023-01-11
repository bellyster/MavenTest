package maven.example.basic;
import java.util.stream.Stream;
public class Application {

    //Añadiendo un método que utiliza funcionalidades de Java 9 +
    public void excecuteStream(){
        long sum= Stream.iterate(0, i -> i<=1000, i-> i+1)
                .mapToInt(s -> s)
                .sum();
        System.out.println("SERIAL SUM REDUCTION USANDO SUM: " + sum);
    }
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
        System.out.println ("Starting Application");
        Application app = new Application();
        app.excecuteStream();
    }
}