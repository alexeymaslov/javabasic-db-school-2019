package inner_classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class MyButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(213);
    }
}
