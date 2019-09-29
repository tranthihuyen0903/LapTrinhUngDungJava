package tuan3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class testmaytinh {
    private JPanel pnMain;
    private JButton btn3;
    private JButton btnChia;
    private JButton btn9;
    private JButton btnNhan;
    private JButton btn6;
    private JButton btnTru;
    private JButton btnXoa;
    private JButton btnCong;
    private JButton btnCan;
    private JButton btnPhanTram;
    private JButton btnX;
    private JButton btnBang;
    private JButton btn2;
    private JButton btn5;
    private JButton btn8;
    private JButton btnCongTru;
    private JButton btn0;
    private JButton btn7;
    private JButton btn4;
    private JButton btn1;
    private JLabel lblHienThi;
    long a=0;
    private String phepToan="";
    double pt;

    public testmaytinh() {

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NhapSo(btn1);
            }

        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NhapSo(btn2);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NhapSo(btn3);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NhapSo(btn4);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NhapSo(btn5);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NhapSo(btn6);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NhapSo(btn7);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NhapSo(btn8);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NhapSo(btn9);
            }
        });


        btnChia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Long.parseLong(lblHienThi.getText());
                if(a!=0){
                    phepToan="/";
                    lblHienThi.setText("0");
                }
            }
        });
        btnNhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Long.parseLong(lblHienThi.getText());
                if(a!=0) {
                    phepToan = "*";
                    lblHienThi.setText("0");
                }
            }
        });
        btnTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Long.parseLong(lblHienThi.getText());
                if(a!=0) {
                    phepToan = "-";
                    lblHienThi.setText("0");
                }
            }
        });
        btnCong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Long.parseLong(lblHienThi.getText());
                if(a!=0) {
                    phepToan = "+";
                    lblHienThi.setText("0");
                }
            }
        });
        btnBang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if (phepToan.length()>0){
                if(phepToan.equals("/")) {
                    long b = Long.parseLong(lblHienThi.getText());
                    long kq = a / b;
                    lblHienThi.setText("" +kq);
                }
                 else if(phepToan.equals("*")){
                        long b=Long.parseLong(lblHienThi.getText());
                        long kq=a * b;
                        lblHienThi.setText(""+kq);
                }
                else if(phepToan.equals("-")){
                    long b=Long.parseLong(lblHienThi.getText());
                    long kq=a - b;
                    lblHienThi.setText(""+kq);
                }
                else if(phepToan.equals("+")){
                    long b=Long.parseLong(lblHienThi.getText());
                    long kq=a + b;
                    lblHienThi.setText(""+kq);

                }
                else if(phepToan.equals("%")){

                    double kq=(pt/100);
                    lblHienThi.setText(""+kq);
                }

            }
            }
        });
        btnCan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Long.parseLong(lblHienThi.getText());
                if(a>0){
                    lblHienThi.setText("" + Math.sqrt(a));
                }
            }
        });
        btnPhanTram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pt=Double.parseDouble(lblHienThi.getText());
                if(pt!=0) {
                    phepToan = "%";
                    lblHienThi.setText(pt+"%");
                }
            }
        });
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblHienThi.setText("0");
            }
        });
        btnX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Long.parseLong(lblHienThi.getText());
                if(a!=0){
                    double kq=1/(double) a;
                    lblHienThi.setText("" + kq);
                }
            }
        });
        btnCongTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Long.parseLong(lblHienThi.getText());
                System.out.println(a);
                if(a!=0){
                    if(a>0){
                        lblHienThi.setText("-"+a);
                    }
                    else if(a<0){

                        lblHienThi.setText(""+(a*-1));
                    }
                }
            }
        });
    }

    public void NhapSo(JButton button){
        try {
            String gt=lblHienThi.getText();
            if(gt.length()<12){
                if(gt.equals("0")){
                    gt="";
                }
                long so=Long.parseLong(gt+button.getText());
                lblHienThi.setText(String.valueOf(so));
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Vui lòng xóa dữa liệu củ");
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("testmaytinh");
        frame.setContentPane(new testmaytinh().pnMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

}
