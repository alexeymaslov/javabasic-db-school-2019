package demo;

import lombok.*;
import lombok.experimental.Wither;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Evgeny Borisov
 */
@Builder
@Data
public class Person implements Serializable {



    private String name;
    private transient int age;
    private int salary;
    @Singular("однаРыба")
    private Map<String,Integer> fish;


}
