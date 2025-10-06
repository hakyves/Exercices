package Exercices2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

        private int count=0;
        private JLabel label;
        private JLabel label2;
        private JFrame frame;
        private JPanel panel;



        public GUI() {
            frame=new JFrame();
            JTextField textfield=new JTextField(0);
            JTextField textfield2=new JTextField(80);

            textfield.setBounds(50, 30, 30, 15);
            textfield2.setBounds(10, 10, 30, 15);
            JButton button=new JButton("Roll");
            button.addActionListener(this);
            label=new JLabel("Number of face :");
            label2=new JLabel("Number of dice :");

            panel=new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
            panel.setLayout(new GridLayout(0,1));
            panel.add(textfield);
            panel.add(button);
            panel.add(label);
            panel.add(label2);


            frame.add(panel,BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Dice roller project");
            frame.pack();
            frame.setVisible(true);






        }

        public static void main(String[] args) {

            new GUI();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            label.setText("Number of clicks:"+count);

        }



}
