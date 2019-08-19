package casting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class AnimalDoctor {


    static {

    }
    public void treat(Animal animal) {


        List<Object> list = new ArrayList<>();
        Integer x = Integer.valueOf(2);
        Integer y = new Integer(2);
        list.add(x);
    }


    public static void main(String[] args) {
        Integer x = 12;
        Integer y = 13;
        System.out.println(x+y);
    }












}
