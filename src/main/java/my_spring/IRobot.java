package my_spring;

import java.rmi.dgc.DGC;

/**
 * @author Evgeny Borisov
 */
public class IRobot {

    private Speaker speaker = new ConsoleSpeaker();
    private Cleaner cleaner = new CleanerImpl();

    public void cleanRoom() {
        speaker.speak("I started...");
        cleaner.clean();
        speaker.speak("I finished...");

    }
}
