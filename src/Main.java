import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("Menu");
        window.setSize(1000,800);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4,45,0));

        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new GridLayout(1,1));

//----------------------------------------------------------------------------------

        String [] dataUps_CalloriesArr = {
                "Push-Ups",
                "Pull-Ups",
                "Running",
                "Calories"
        };    //// String [] dataUps_CalloriesArr  That is just an array for JTable.


        Object [][] data  = {
                {20, 12, 2000, 5000},
                {25, 28, 1500, 4500}
        }; //// That is also an array for JTable.



        JButton pushupsButton = new JButton("Push-Ups");
        JButton pullupsButton = new JButton("Pull-Ups");
        JButton runningButton = new JButton("Running");
        JButton calloriesButton = new JButton("Calories");
                    ////Nothing much, just a simple buttons.




        JTable trakerTabel = new JTable(data, dataUps_CalloriesArr );///Create an Table and adding arrays.
        JScrollPane scrollPane = new JScrollPane(trakerTabel);       ///And creating a Empty Border.
        scrollPane.setBorder(BorderFactory.createEmptyBorder(350,50,0,50));


        window.setLayout(new BorderLayout());
         panel.add(pushupsButton);
         panel.add(pullupsButton);
         panel.add(calloriesButton);
         panel.add(runningButton);
         secondPanel.add(scrollPane);

        window.add(panel, BorderLayout.NORTH);
        window.add(secondPanel, BorderLayout.CENTER);

/// Just a litle change)
        window.setVisible(true);

        }
}