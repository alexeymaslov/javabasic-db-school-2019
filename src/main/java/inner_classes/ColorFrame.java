package inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {

    public ColorFrame(int[] counter) throws HeadlessException {
        JButton button = new JButton("click to change color");
        JLabel label = new JLabel("java");
        getContentPane().add(button, BorderLayout.NORTH);
        label.setBackground(Color.BLACK);
        button.setBackground(Color.BLACK);
        getContentPane().add(label, BorderLayout.CENTER);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(Color.RED);
                System.out.println(counter[0]++);
            }
        });
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorFrame(new int[]{1});
    }
}
