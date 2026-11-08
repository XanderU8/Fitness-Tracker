import javax.swing.*;
import java.awt.*;
public class AddCalories extends JPanel {

    public int[] addCaloriesPerWeek = new int[7];

    public AddCalories(CardLayout cardLayout, JPanel container) {

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


        JLabel addCaloriesTittle = new JLabel("ADD Calories");
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
            String day = (String) days.getSelectedItem();

            if (day.equalsIgnoreCase("Choose a day...")) {
                JOptionPane.showMessageDialog(this, "Please choose a day!");
                return;
            }

            String question = JOptionPane.showInputDialog("How many calories have you done?");

            try {

                int addCalories = Integer.parseInt(question);

                if (day.equalsIgnoreCase("Monday")) {
                    addCaloriesPerWeek[0] += addCalories;
                } else if (day.equalsIgnoreCase("Tuesday")) {
                    addCaloriesPerWeek[1] += addCalories;
                } else if (day.equalsIgnoreCase("Wednesday")) {
                    addCaloriesPerWeek[2] += addCalories;
                } else if (day.equalsIgnoreCase("Thursday")) {
                    addCaloriesPerWeek[3] += addCalories;
                } else if (day.equalsIgnoreCase("Friday")) {
                    addCaloriesPerWeek[4] += addCalories;
                } else if (day.equalsIgnoreCase("Saturday")) {
                    addCaloriesPerWeek[5] += addCalories;
                } else if (day.equalsIgnoreCase("Sunday")) {
                    addCaloriesPerWeek[6] += addCalories;
                }
                JOptionPane.showMessageDialog(this, "Great!!! You added: " + addCalories + "calories");

            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(this, "Please write calories amount!");
            }
        });

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
            cardLayout.show(container, "Calories");
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
