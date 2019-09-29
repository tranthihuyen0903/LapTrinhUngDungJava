package tuan3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class testTroChoiSo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        String title=JOptionPane.showInputDialog("Nhập tên");
        frame.setTitle(title);
        frame.setContentPane(new testTroChoiSo().pnMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public testTroChoiSo() {
        btnBatDau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enBtn();
                ganSo();
                btn0.setText("");
                win();
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra2btn(btn0,btn1,btn4);
                win();
            }
        });
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra2btn(btn15,btn11,btn14);
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra3btn(btn1,btn2,btn5,btn0);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra3btn(btn2,btn3,btn6,btn1);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra2btn(btn3,btn7,btn2);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra3btn(btn4,btn0,btn5,btn8);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra4btn(btn5,btn1,btn6,btn9,btn4);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra4btn(btn6,btn2,btn7,btn10,btn5);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra3btn(btn7,btn3,btn6,btn11);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra3btn(btn8,btn4,btn9,btn12);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra4btn(btn9,btn5,btn10,btn13,btn8);
            }
        });
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra4btn(btn10,btn6,btn11,btn9,btn14);
            }
        });
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra3btn(btn11,btn10,btn7,btn15);
            }
        });
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kiemTra2btn(btn12,btn8,btn13);

            }
        });
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              kiemTra3btn(btn13,btn12,btn9,btn14);
            }
        });
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               kiemTra3btn(btn14,btn13,btn10,btn15);
            }
        });
    }
    public void kiemTra3btn(JButton buttonan, JButton button1, JButton button2,JButton button3){

        if(button1.getText().length()==0){
            button1.setText(buttonan.getText());

            buttonan.setText("");

        }
        if(button2.getText().length()==0){
            button2.setText(buttonan.getText());
            button2.setBackground(null);
            buttonan.setText("");

        }
        if(button3.getText().length()==0){
            button3.setText(buttonan.getText());

            buttonan.setText("");

        }

    }

    public void win(){
        if(btn15.getText().equals("15") && btn14.getText().equals("14") && btn14.getText().equals("14")
                && btn13.getText().equals("13")
                && btn12.getText().equals("12") && btn11.getText().equals("11") && btn10.getText().equals("10")
                && btn9.getText().equals("9") && btn8.getText().equals("8") && btn7.getText().equals("7")
                && btn6.getText().equals("6")
                && btn5.getText().equals("5")
                && btn4.getText().equals("4")
                && btn3.getText().equals("3")
                && btn2.getText().equals("2")
                && btn1.getText().equals("1"))

        {
           JOptionPane.showMessageDialog(null, "Win");
        }
    }
    public void kiemTra2btn(JButton buttonan, JButton button1, JButton button2){

        if(button1.getText().length()==0 ){
            button1.setText(buttonan.getText());

            buttonan.setText("");

        }
        if(button2.getText().length()==0){
            button2.setText(buttonan.getText());

            buttonan.setText("");

        }
    }

    public void kiemTra4btn(JButton buttonan, JButton button1, JButton button2,JButton button3,JButton button4){

        if(button1.getText().length()==0){
            button1.setText(buttonan.getText());

            buttonan.setText("");

        }
        if(button2.getText().length()==0){
            button2.setText(buttonan.getText());

            buttonan.setText("");

        }
        if(button3.getText().length()==0){
            button3.setText(buttonan.getText());

            buttonan.setText("");

        }
        if(button4.getText().length()==0){
            button4.setText(buttonan.getText());

            buttonan.setText("");

        }

    }
    public void tronMang(int[] ar) {

        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);

            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
    public void ganSo(){
        int []a={15,2,3,4,5,6,7,8,9,10,11,12,13,14,1};
        tronMang(a);

        btn1.setText(""+a[1]);
        btn2.setText(""+a[2]);
        btn3.setText(""+a[3]);
        btn4.setText(""+a[4]);
        btn5.setText(""+a[5]);
        btn6.setText(""+a[6]);
        btn7.setText(""+a[7]);
        btn8.setText(""+a[8]);
        btn9.setText(""+a[9]);
        btn10.setText(""+a[10]);
        btn11.setText(""+a[11]);
        btn12.setText(""+a[12]);
        btn13.setText(""+a[13]);
        btn14.setText(""+a[14]);
        btn15.setText(""+a[0]);






    }
    public void enBtn(){
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn0.setEnabled(true);
    }


    private JPanel pnMain;
    private JButton btnBatDau;
    private JLabel lblTen;
    private JButton btn15;
    private JButton btn14;
    private JButton btn13;
    private JButton btn12;
    private JButton btn11;
    private JButton btn10;
    private JButton btn9;
    private JButton btn8;
    private JButton btn7;
    private JButton btn6;
    private JButton btn5;
    private JButton btn4;
    private JButton btn3;
    private JButton btn2;
    private JButton btn1;
    private JButton btn0;
}
