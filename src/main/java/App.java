import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws NoSuchFieldException {

        //Java 6 style
        List<String> java6List = new ArrayList<String>();

        //Java 7 style
        List<String> java7List = new ArrayList<>();

        GenericMehodClass genericMehodClass = new GenericMehodClass();

        genericMehodClass.<String>printElement("Hola");

        genericMehodClass.<Integer>printElement(5);

        genericMehodClass.printElement("Hola");

        genericMehodClass.printElement(5);

        //Java 7 warning
        List<String> java7NonDiamondList = new ArrayList();

        java7List.add("Hola");
        // Errpr
        //java7List.add(5);

        GenericClass<String> genericClass1 = new GenericClass<>(5);
        genericClass1.add("Hola");

        GenericClass<Integer> genericClass2 = new GenericClass<>("Hola");
        genericClass2.add(5);

    }
}
