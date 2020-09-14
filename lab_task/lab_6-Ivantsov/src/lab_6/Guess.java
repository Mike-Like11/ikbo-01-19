package lab_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guess extends JFrame {
    private JButton buttonCancel;
    private JButton tryButton= new JButton("Угадать");
    private JTextField textField1=new JTextField(0);
    private  JLabel result= new JLabel("Угадайте загаданное число, у вас есть 3 попытки, Удачи");
    int b = (int) (Math.random() * 19 + 1);
    final int[] i = {0};
    Guess() {
        tryButton.setBounds(0,200,500,20);
        textField1.setBounds(0,180,500,20);
        result.setBounds(70,150,500,20);
        setSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        int b = (int) (Math.random() * 19 + 1);
        final int[] i = {0};
        tryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                i[0]++;
                int a = Integer.parseInt(textField1.getText().toString());
                if (a == b) {
                    result.setText("Вы угадали поздравляю!");
                    tryButton.setVisible(false);
                } else {
                    if (a > b) {
                        result.setText("Загаданное число меньше вашего, Осталось " + (3 - i[0]) + " попыток ");
                    } else {
                        result.setText("Загаданное число больше вашего, Осталось " + (3 - i[0]) + " попыток ");
                    }
                }
                if (i[0] == 3) {
                    result.setText("Загаданное число " + b);
                    tryButton.setVisible(false);
                }
            }
        });
        setLayout(null);
        this.getContentPane().add(tryButton);
        this.getContentPane().add(textField1);
        this.getContentPane().add(result);
    }
    public static void main(String arg[]) {

        new Guess().setVisible(true);
    }


}
