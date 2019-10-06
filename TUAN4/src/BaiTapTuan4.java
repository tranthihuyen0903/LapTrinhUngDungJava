import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaiTapTuan4 {
    private JPanel pnMain;
    private JLabel lblTen;
    private JTextField txt1;
    private JTextField txt2;
    private JTextField txt3;
    private JTextField txt4;
    private JTextField txt5;
    private JLabel lblID;
    private JLabel lblName;
    private JLabel lblType;
    private JLabel lblAddress;
    private JLabel lblContact;
    private JLabel lblRemarks;
    private JCheckBox chb1;
    private JCheckBox chb2;
    private JCheckBox chb3;
    private JButton btnNew;
    private JButton btnSave;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextArea areaRemark;
    private JTabbedPane tabbedPane1;
    private JTable tableThongTin;

    public BaiTapTuan4() {
        ButtonGroup btg =new ButtonGroup();
        btg.add(chb1);
        btg.add(chb2);
        btg.add(chb3);
        hienTable();
        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMacDinh();
            }
        });
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strName,strsupplierType = "",strAddress,strcontactNo,stremail,strremarks;
                strName=txt2.getText();
                strAddress=txt3.getText();
                strcontactNo=txt4.getText();
                stremail=txt5.getText();
                strremarks=areaRemark.getText();
                if(chb1.isSelected()==true){
                    strsupplierType="Books";
                }else if(chb3.isSelected()==true){
                    strsupplierType="Journals And Magazine";
                }else if(chb2.isSelected()==true){
                    strsupplierType="New Paper";
                }
                if(strAddress.length()==0&&strcontactNo.length()==0&&stremail.length()==0
                        &&strName.length()==0&&strremarks.length()==0&&strsupplierType.length()==0){
                    JOptionPane.showMessageDialog(null,"Vui Lòng Điền Đầy Đủ Thông Tin");
                }
                else
                {
                    try {
                        ConnectionClass connectionClass = new ConnectionClass();
                        Connection connection = connectionClass.getConnection();
                        String sql = " insert into BT4 values('"+strName+"','"+strsupplierType+"','"+strAddress+"','"+strcontactNo+"','"+stremail+"','"+strremarks+"')";
                        Statement statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(sql);

                    }
                    catch (Exception ex){

                    }
                    JOptionPane.showMessageDialog(null,"Lưu Thành Công");
                    setMacDinh();
                    hienTable();

                }
            }
        });
    }
public  void hienTable(){
    tableThongTin.removeAll();
    DefaultTableModel tableModel = new DefaultTableModel();
    String []colsName = {"Id", "Name","Supplier Type","Address","Contact No","Email","Remarks"};
    tableModel.setColumnIdentifiers(colsName);
    tableThongTin.setModel(tableModel);
    try {
        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnection();
        String sql = "SELECT supID,supName,supType, address,contactNo,emailID,remarks  from BT4";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while(rs.next()) {
            int row1 = rs.getInt("supID");
            String row2 = rs.getString("supName");
            String row3 = rs.getString("supType");
            String row4 = rs.getString("address");
            String row5 = rs.getString("contactNo");
            String row6 = rs.getString("emailID");
            String row7 = rs.getString("remarks");
            Object[] row = {row1, row2, row3,row4,row5,row6,row7};
            tableModel.addRow(row);
        }

    }
    catch (Exception ex){
        System.out.println("Kiem Tra Lại Thong Tin");
    }
}
public void setMacDinh(){
    txt1.setText("");
    txt2.setText("");
    txt3.setText("");
    txt4.setText("");
    txt5.setText("");
    chb1.setSelected(false);
    chb2.setSelected(false);
    chb3.setSelected(false);
    areaRemark.setText("");

}
    public static void main(String[] args) {
        JFrame frame = new JFrame("BaiTapTuan4");
        frame.setContentPane(new BaiTapTuan4().pnMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
