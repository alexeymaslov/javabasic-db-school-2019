package home_made_junit;

/**
 * @author Evgeny Borisov
 */
public class TestClass {


    public void init(){
        System.out.println("init");
    }

    @MyTest
    public void simpleTest() {
        System.out.println("2222222222");
    }

    public void test1(){
        System.out.println("11111111111");
    }
}
