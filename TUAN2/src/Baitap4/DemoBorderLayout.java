package Baitap4;
import javax.swing.*;
import java.awt.*;
public class DemoBorderLayout extends JFrame {
    public DemoBorderLayout() {
        super("My Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        pnNorth.setBackground(Color.RED);
        pnBorder.add(pnNorth, BorderLayout.NORTH);
        JPanel pnsouth = new JPanel();
        pnsouth.setBackground(Color.RED);
        pnBorder.add(pnsouth, BorderLayout.SOUTH);
        JPanel pnWest = new JPanel();
        pnWest.setBackground(Color.BLUE);
        pnBorder.add(pnWest, BorderLayout.WEST);
        JPanel pnEast = new JPanel();
        pnEast.setBackground(Color.BLUE);
        pnBorder.add(pnEast, BorderLayout.EAST);
        JPanel pnCenter = new JPanel();
        pnCenter.setBackground(Color.YELLOW);
        pnBorder.add(pnCenter, BorderLayout.CENTER);
        getContentPane().add(pnBorder);

    }

    public static void main(String[] args) {
        DemoBorderLayout ui = new DemoBorderLayout();
        ui.setSize(400, 200);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}