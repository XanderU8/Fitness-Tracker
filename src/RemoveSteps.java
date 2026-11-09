import javax.swing.*;
import java.awt.*;

public class RemoveSteps extends JPanel {

    public RemoveSteps(CardLayout cardLayout, JPanel container, int[] stepsPerWeek) {

        setLayout(new BorderLayout());

        JPanel tittlePanel = new JPanel(new BorderLayout());
        tittlePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel exitButtonPanel = new JPanel();
        exitButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        exitButtonPanel.setLayout(new GridLayout(1, 1));
        exitButtonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel jComboBoxPanel = new JPanel();
        jComboBoxPanel.setLayout(new GridLayout(1, 1));
        jComboBoxPanel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));

        JPanel confirmButtonPanel = new JPanel();
        confirmButtonPanel.setLayout(new GridLayout(1, 1));
        confirmButtonPanel.setBorder(BorderFactory.createEmptyBorder(25, 160, 50, 160));


        JLabel addCaloriesTittle = new JLabel("REMOVE Steps");
        addCaloriesTittle.setHorizontalAlignment(SwingConstants.CENTER);
        addCaloriesTittle.setFont(new Font("Arial", Font.BOLD, 50));

        JComboBox<String> days = new JComboBox<>();
        days.addItem("Choose a day...");
        days.addItem("Monday");
        days.addItem("Tuesday");
        days.addItem("Wednesday");
        days.addItem("Thursday");
        days.addItem("Friday");
        days.addItem("Saturday");
        days.addItem("Sunday");


        JButton confirmButton = new JButton("CONFIRM");
        confirmButton.addActionListener(event -> {

            String day = days.getSelectedItem().toString();

            if (day.equalsIgnoreCase("Choose a day...")) {
                JOptionPane.showMessageDialog(this, "Please choose a day!");
                return;
            }

            String question = JOptionPane.showInputDialog("How many steps would you like to remove?");

            try {
                int removeSteps = Integer.parseInt(question);

                if (day.equalsIgnoreCase("Monday")) {
                    stepsPerWeek[0] -= removeSteps;
                } else if (day.equalsIgnoreCase("Tuesday")) {
                    stepsPerWeek[1] -= removeSteps;
                } else if (day.equalsIgnoreCase("Wednesday")) {
                    stepsPerWeek[2] -= removeSteps;
                } else if (day.equalsIgnoreCase("Thursday")) {
                    stepsPerWeek[3] -= removeSteps;
                } else if (day.equalsIgnoreCase("Friday")) {
                    stepsPerWeek[4] -= removeSteps;
                } else if (day.equalsIgnoreCase("Saturday")) {
                    stepsPerWeek[5] -= removeSteps;
                } else if (day.equalsIgnoreCase("Sunday")) {
                    stepsPerWeek[6] -= removeSteps;
                }
                JOptionPane.showMessageDialog(this, "Great!!! You removed: " + removeSteps + " steps");

            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(this, "Please write steps amount!");
            }
        });

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
            cardLayout.show(container, "Running");
        });
        exitButtonPanel.add(exitButton);

        tittlePanel.add(exitButtonPanel, BorderLayout.WEST);
        tittlePanel.add(addCaloriesTittle, BorderLayout.CENTER);

        jComboBoxPanel.add(days);
        confirmButtonPanel.add(confirmButton);


        add(tittlePanel, BorderLayout.NORTH);
        add(jComboBoxPanel, BorderLayout.CENTER);
        add(confirmButtonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
