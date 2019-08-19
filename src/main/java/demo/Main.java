package demo;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.WeakHashMap;

import static java.lang.Math.*;

/**
 * @author Evgeny Borisov
 */
public class Main {

    private WeakHashMap<String,Integer> map;



    public static void main(String[] args) {

        String s = "Женя";
        String s1 = "женя";
        System.out.println(s.equalsIgnoreCase(s1));



    }
}
