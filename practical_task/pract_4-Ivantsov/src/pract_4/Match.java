package pract_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match extends JFrame {
    private JButton acMilanButton=new JButton("Ac Milan");
    private JButton realMadridButton=new JButton("Real Madrid");
    private JLabel scorer=new JLabel("Last Scorer:");
    private JLabel result=new JLabel("Result 0 X 0");
    private JLabel winner =new JLabel("Winner");
    public Match()  {
        setSize(new Dimension(600, 600));
        acMilanButton.setBounds(0,300,300,20);
        realMadridButton.setBounds(300,300,300,20);
        result.setBounds(10,250,200,20);
        winner.setBounds(250,250,200,20);
        scorer.setBounds(400,250,200,20);
        final int[] a = {0};
        final int[] b = {0};
        acMilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                a[0]++;
                scorer.setText("Last Scorer: Milan");
                result.setText("Result " + a[0] + " X " + b[0]);
                if (a[0] > b[0]) {
                    winner.setText("Winner: Milan");
                }
                if (a[0] < b[0]) {
                    winner.setText("Winner: Real Madrid");
                }
                if (a[0] == b[0]) {
                    winner.setText("Winner: Draw");
                }
            }
        });
        realMadridButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                b[0]++;
                scorer.setText("Last Scorer: Real Madrid");
                result.setText("Result " + a[0] + " X " + b[0]);
                if (a[0] > b[0]) {
                    winner.setText("Winner: Milan");
                }
                if (a[0] < b[0]) {
                    winner.setText("Winner: Real Madrid");
                }
                if (a[0] == b[0]) {
                    winner.setText("Winner: Draw");
                }

            }
        });
        setLayout(null);
        this.getContentPane().add(realMadridButton);
        this.getContentPane().add(acMilanButton);
        this.getContentPane().add(scorer);
        this.getContentPane().add(winner);
        this.getContentPane().add(result);
    }
    public static void main(String arg[])
    {
        new Match().setVisible(true);
    }
}
