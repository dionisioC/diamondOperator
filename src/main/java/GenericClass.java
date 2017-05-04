import java.util.ArrayList;
import java.util.List;

public class GenericClass <U> {
    List<U> list = new ArrayList<>();
    <T> GenericClass(T t) throws NoSuchFieldException {
        System.out.println("T: " + t.getClass().getSimpleName());
    }

    public void add(U element){
        list.add(element);
        System.out.println("U: " + list.get(0).getClass().getSimpleName());
    }

}
