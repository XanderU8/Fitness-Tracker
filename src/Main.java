import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame("Menu");
        window.setSize(1000, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

///              CardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel container = new JPanel(cardLayout);

///           Push-Ups Panel
        PushUpsPanel pushUpsPanel = new PushUpsPanel(cardLayout,container);
        container.add(pushUpsPanel, "Push-Ups");

///           PullUpsPanel
        PullUpsPanel pullUpsPanel = new PullUpsPanel(cardLayout,container);
        container.add(pullUpsPanel, "Pull-Ups");

        AddPushUps addPushUps = new AddPushUps(cardLayout,container);
        container.add(addPushUps, "Add Push-Ups");

///           CaloriesPanel
        CaloriesPanel caloriesPanel = new CaloriesPanel(cardLayout, container);
        container.add(caloriesPanel, "Calories");

///           RunningPanel
        RunningPanel runningPanel = new RunningPanel(cardLayout, container);
        container.add(runningPanel, "Running");

        RemovePushUps removePushUps = new RemovePushUps(cardLayout, container);
        container.add(removePushUps, "Remove Push-Ups");

        ShowPushUpsInformation showPushUpsInformation = new ShowPushUpsInformation(cardLayout, container);
        container.add(showPushUpsInformation, "Show Push-Ups Information");

///            Panel for Buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 4, 45, 0));
        panel.setBorder(BorderFactory.createEmptyBorder(90, 30, 0, 30)); //A little change by Buttons.


///             Panel for Tabel
        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new GridLayout(1, 1));

//----------------------------------------------------------------------------------

////            String [] dataUps_CalloriesArr  That is just an array for JTable.
        String[] dataUps_CalloriesArr = {
                "Day:",
                "Push-Ups",
                "Pull-Ups",
                "Running",
                "Calories"
        };


        Object[][] data = {
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

///             Buttons and ActionListener
        JButton pushupsButton = new JButton("Push-Ups");
        pushupsButton.addActionListener(event -> {
            cardLayout.show(container, "Push-Ups");
        });

        JButton pullupsButton = new JButton("Pull-Ups");
        pullupsButton.addActionListener(event -> {
            cardLayout.show(container, "Pull-Ups");
        });

        JButton calloriesButton = new JButton("Calories");
        calloriesButton.addActionListener(event -> {
            cardLayout.show(container, "Calories");

        });

            JButton runningButton = new JButton("Running");
            runningButton.addActionListener(event -> {
                cardLayout.show(container, "Running");

        });

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///                 Tracker Table
        JTable trakerTabel = new JTable(data, dataUps_CalloriesArr) { ///Create an Table and adding arrays.

            /// @Override for bannig
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }   ///That is an another thing to cannot change anything in Table
        };

///             And creating an Empty Border.
        JScrollPane scrollPane = new JScrollPane(trakerTabel);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(350, 50, 0, 50));


///          BorderLayout and adding every buttons variable
        panel.add(pushupsButton);
        panel.add(pullupsButton);
        panel.add(calloriesButton);
        panel.add(runningButton);
        secondPanel.add(scrollPane);

//--------------------------------------------------------------------------------------

///          Panel for adding button´s panel and table´s panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(panel, BorderLayout.NORTH);
        mainPanel.add(secondPanel, BorderLayout.CENTER);

//--------------------------------------------------------------------------------------
///           Adding mainPanel in container
        container.add(mainPanel, "Main");
//--------------------------------------------------------------------------------------

///           Finally, adding container in JFrame "window". And show container by "cardLayout"
        window.add(container);
        cardLayout.show(container, "Main");

//////////////////////////////////////////////////////////////////////////////////////////////////////////////



        window.setVisible(true);
    }
}