package Baitap2;
import javax.swing.*;
import java.awt.*;


public class DemoFlowLayout extends JFrame {
    public DemoFlowLayout() {
        super("My Windows");
        setTitle("First Swing");
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        //new DemoFlowLayout();
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        JButton btn1 = new JButton("FlowLayout");
        JButton btn2 = new JButton("Add các control");
        JButton btn3 = new JButton("Trên 1 dòng");
        JButton btn4 = new JButton("Hết chỗ chứa");
        JButton btn5 = new JButton("Thì xuống 1 dòng");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);

        Container container = getContentPane();
        container.add(pnFlow);
    }

    public static void main(String[] args) {
        DemoFlowLayout ui=new DemoFlowLayout();
        ui.setSize(400,200);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
    }

