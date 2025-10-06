package Exercices2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TestingJSwing extends JFrame{
    private static final long serialVersionUID = 1L;
    private JPanel panel;
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private buttonHandler bHandler;


    public TestingJSwing(){
        setTitle("DICE GAME");
        setResizable(false);
        setSize(800, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();

        button = new JButton("Submit");
        panel.add(button);

//        fr = new JFrame();
//        panel = new JPanel();
//        panel.setBorder(BorderFactory.createEmptyBorder(10,10,30,10));
//        panel.setLayout(new GridLayout(1,0));
//
//
////        Container pane = getContentPane();
////        pane.setVisible(true);
//       // pane.setLayout(null);
//
//
//        button = new JButton("button");
//    //    button.setBounds(50, 60, 50, 70);
//        bHandler = new buttonHandler();
//        button.addActionListener(bHandler);
//
//        label = new JLabel("Hello", SwingConstants.RIGHT);
//        label.setBounds(50, 60, 50, 70);
//        label.setVisible(true);
//
//        textField = new JTextField();
//        textField.setBounds(5, 6, 5, 7);
//        textField.setVisible(true);
//
//        panel.add(button);
//        panel.add(label);
//        panel.add(textField);

    }

    public class buttonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }

    @SuppressWarnings("unused")
    public static void main(String[] args){
        TestingJSwing gui = new TestingJSwing();
    }
}
