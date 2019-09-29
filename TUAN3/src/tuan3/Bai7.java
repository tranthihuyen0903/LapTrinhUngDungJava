package tuan3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai7 {
    private JPanel pnMain;
    private JButton btnToSoChan;
    private JButton btnToSoLe;
    private JButton btnXoa;
    private JButton btnTong;
    private JButton btnBo;
    private JButton btnToSoNguyenTo;
    private JButton btnDong;
    private JButton btnNhap;
    private JTextField txtNhap;
    private JCheckBox checkSoAm;
    private JList jlSo;
    DefaultListModel listModel =new DefaultListModel<>();


    public Bai7() {
        jlSo.setModel(listModel);

        btnDong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ret=JOptionPane.showConfirmDialog(null, "Muốn thoát hả?", "Thoát", JOptionPane.YES_NO_OPTION);
                if(ret==JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });
        btnNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n;
                    n=Integer.parseInt(txtNhap.getText());
                    if(checkSoAm.isSelected()==true){
                        listModel.addElement(n);
                        txtNhap.setText("");
                    }
                    else if(n>0){
                        listModel.addElement(n);
                        txtNhap.setText("");
                    }
                    else {
                        JOptionPane.showConfirmDialog(null,"Vui lòng nhập số dương");
                    }

                }
                catch (Exception ex){
                    JOptionPane.showConfirmDialog(null,"Vui Lòng Nhập Đúng Số");
                }
            }
        });
        btnToSoChan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlSo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                int[] select = new int[listModel.size()];
                for(int i=0;i<listModel.size();i++){
                    int chan=Integer.parseInt(listModel.get(i).toString());
                    if(chan%2==0){
                        select[i]=i;
                    }
                    else {
                        select[i]=-1;
                    }
                }
                jlSo.setSelectedIndices(select);
            }
        });
        btnToSoLe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlSo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                int[] select = new int[listModel.size()];
                for(int i=0;i<listModel.size();i++){
                    int chan=Integer.parseInt(listModel.get(i).toString());
                    if(chan%2!=0){
                        select[i]=i;
                    }
                    else {
                        select[i]=-1;
                    }
                }
                jlSo.setSelectedIndices(select);
            }
        });
        btnBo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlSo.clearSelection();
            }
        });
        btnToSoNguyenTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlSo.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                int[] select = new int[listModel.size()];
                for(int i=0;i<listModel.size();i++){
                    int n=Integer.parseInt(listModel.get(i).toString());
                    if(KiemTraSNT(n)==true){
                        select[i]=i;
                    }
                    else {
                        select[i]=-1;
                    }
                }
                jlSo.setSelectedIndices(select);
            }
        });
        btnTong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tong=0;
                for (int i=0;i<listModel.size();i++){
                    int a;
                    a= Integer.parseInt(listModel.get(i).toString());
                    tong=tong+a;
                }

                JOptionPane.showMessageDialog(null,"Tổng là: " +tong);

            }
        });
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jlSo.isSelectionEmpty()==false){
                    for(int i=0;i<listModel.size()+5;i++){
                        int index = jlSo.getSelectedIndex();
                        System.out.println(""+index);
                        if(index >= 0){
                            listModel.removeElementAt(index);
                        }
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Bạn chưa chọn mục để xóa");
                }
            }
        });
    }
public boolean KiemTraSNT(int n){
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Bai7");
        frame.setContentPane(new Bai7().pnMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
