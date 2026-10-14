import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("Menu");
        window.setSize(1000,800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ///       CardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel container = new JPanel(cardLayout);

///           Push-Ups Panel
        PushUpsPanel pushUpsPanel = new PushUpsPanel();

        container.add(pushUpsPanel, "Push-Ups");


        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(1, 4,45,0));

        panel.setBorder(BorderFactory.createEmptyBorder(90,30,0,30));
                        ///A little change by Buttons.

        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new GridLayout(1,1));

//----------------------------------------------------------------------------------




        String [] dataUps_CalloriesArr = {
                "Day:",
                "Push-Ups",
                "Pull-Ups",
                "Running",
                "Calories"
        };    //// String [] dataUps_CalloriesArr  That is just an array for JTable.


        Object [][] data  = {
                {"          MONDAY", 20, 12, 2000, 3000},
                {"          TUESDAY", 25, 28, 1500, 4500},
                {"          WEDNESDAY", 30, 10, 3500, 5000},
                {"          THURSDAY", 50, 23, 3020, 3500},
                {"          FRIDAY", 80, 50, 4000, 2000},
                {"          SATURDAY", 75, 45, 3800, 2300},
                {"          SUNDAY", 30, 15, 1800, 3500}
        }; //// That is also an array for JTable.
            ///And of cource i have added days for beauty

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        ////Nothing much, just a simple buttons.


        JButton pushupsButton = new JButton("Push-Ups");
        pushupsButton.addActionListener(event -> {
            cardLayout.show(container, "Push-Ups");

        });

        JButton pullupsButton = new JButton("Pull-Ups");
        JButton runningButton = new JButton("Running");
        JButton calloriesButton = new JButton("Calories");


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        JTable trakerTabel = new JTable(data, dataUps_CalloriesArr ){ ///Create an Table and adding arrays.

        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
             }   ///That is an another thing to cannot change anything in Table
        };

        JScrollPane scrollPane = new JScrollPane(trakerTabel);       ///And creating a Empty Border.
        scrollPane.setBorder(BorderFactory.createEmptyBorder(350,50,0,50));

        window.setLayout(new BorderLayout());
        panel.add(pushupsButton);
        panel.add(pullupsButton);
        panel.add(calloriesButton);
        panel.add(runningButton);
        secondPanel.add(scrollPane);
//------------------------------------------------------------------------------------

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(panel, BorderLayout.NORTH);
        mainPanel.add(secondPanel, BorderLayout.CENTER);
//--------------------------------------------------------------------------------------

        container.add(mainPanel, "Main");
        container.add(pushUpsPanel, "Push-Ups");
//--------------------------------------------------------------------------------------

        window.add(container);

        cardLayout.show(container, "Main");



//////////////////////////////////////////////////////////////////////////////////////////////////////////////


        window.setVisible(true);


        }

}