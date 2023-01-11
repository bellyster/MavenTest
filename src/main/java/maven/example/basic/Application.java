package maven.example.basic;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

public class Application {

    //Añadiendo funcionalidad Apache Fun
    public int countWords(String words){
        String[] separateWords = StringUtils.split(words, ' ');
        return (separateWords == null)? 0 : separateWords.length;
    }

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
        //usando Apache Fun countWords
        int count= app.countWords("I have four words");
        System.out.println("HE CONTADO :" + count + " PALABRAS");
    }



}