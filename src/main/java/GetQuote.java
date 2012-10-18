package main.java;

/**
 * Created with IDEA.
 * User: Alan Derrick
 * Date: 10/13/12
 * Time: 5:10 PM
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GetQuote extends JFrame {

    public GetQuote() {
        initUI();
    }

    public final void initUI() {

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(null);

        JButton quitButton = new JButton("Quit");
        quitButton.setBounds(50, 60, 80, 30);
        quitButton.setToolTipText("Exit the application");
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        JButton getButton = new JButton("Quote");
        getButton.setBounds(150, 60, 80, 30);
        getButton.setToolTipText("Pulls stock quote");
        getButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });



        panel.add(quitButton);
        panel.add(getButton);

        setTitle("StockQuote v 1.0");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GetQuote ex = new GetQuote();
                ex.setVisible(true);
            }
        });
    }
}
