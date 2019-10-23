package Sprint3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JFrameDemo extends JFrame {

    // JFrame f = new JFrame("This Frame");
    JPanel panel= new JPanel();
    JLabel label = new JLabel("Hej");
    JButton button = new JButton("Tryck här");

    //lable är den som håller texten
    //pack betyder jag vill packa

    JFrameDemo(){
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        //button.addActionListener(this);
        add(p);
        p.add(new JLabel("Hej1"));
        p.add(new JButton("Tryck här"));
        //p.add(new JLabel("Hej2"));
        p.add(new JButton("Och här"));
        // p.add(new JLabel("Hej3"));
        p.add(new JButton("Och här med"));
        p.add(new JButton("Massa knappar"));

        p.add(label);
        p.add(button);
        setLayout(new FlowLayout());
        add(panel);
        panel.add(label);
        pack();
        setSize(400, 400);
        setLocation(1200, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrameDemo g = new JFrameDemo();
    }

}
