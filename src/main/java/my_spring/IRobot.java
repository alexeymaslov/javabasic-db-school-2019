package my_spring;

import java.rmi.dgc.DGC;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class IRobot {

    private Speaker speaker = ObjectFactory.getInstance().createObject(Speaker.class);
    private Cleaner cleaner = ObjectFactory.getInstance().createObject(Cleaner.class);

    public void cleanRoom() {
        speaker.speak("I started...");
        cleaner.clean();
        speaker.speak("I finished...");



    }
}
