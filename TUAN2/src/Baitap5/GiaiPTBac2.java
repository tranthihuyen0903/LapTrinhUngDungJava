package Baitap5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class GiaiPTBac2 {
    private JPanel pnMain;
    private JPanel pnNhap;
    private JPanel pnThaotac;
    private JTextField txtSoa;
    private JTextField txtSob;
    private JTextField txtSoc;
    private JTextField txtKetQua;
    private JButton btnGiai;
    private JButton btnXoaTrang;
    private JButton btnThoat;

    public GiaiPTBac2() {
        btnGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a,b,c;
                a = Double.parseDouble(txtSoa.getText());
                b = Double.parseDouble(txtSob.getText());
                c = Double.parseDouble(txtSoc.getText());
                //JOptionPane.showMessageDialog(null,giaiPTB2(a,b,c));
                txtKetQua.setText(giaiPTB2(a,b,c));
            }
        });
        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnXoaTrang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSoa.setText("");
                txtSob.setText("");
                txtSoc.setText("");


            }
        });
    }
    public String giaiPTB2(double a,double b,double c){
        double delta,x,x1,x2,canDelta;
        String kq;

        if(a==0) {
            kq="hệ số a phải >0.";
            return kq;
        }
        else {
            delta = Math.pow(b,2)-4*a*c;
            if(delta<0) {
                kq="Phương trình vô nghiệm.";
                return kq;
            }
            if(delta==0) {
                x=-b/(2*a);
                kq="nghiệm kép: x ="+ x;
                return kq;
            }
            if(delta>0) {
                canDelta=Math.sqrt(delta);
                x1= (-b+canDelta)/(2*a);
                x2 = (-b-canDelta)/(2*a);
                kq="Phương trình có 2 nghiệm: x1= "+x1+"; x2= "+x2;
                return kq;
            }
            return "Error";
    }}

    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setContentPane(new GiaiPTBac2().pnMain);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
}
