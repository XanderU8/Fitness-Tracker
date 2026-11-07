import javax.swing.*;
import java.awt.*;

public class AddPullUps extends JPanel {

    public int [] pullUpsPerWeek = new int[7];

    public AddPullUps(CardLayout cardLayout, JPanel container) {

        setLayout(new BorderLayout());

        JPanel tittlePanel = new JPanel(new BorderLayout());
        tittlePanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JPanel backButtonPanel = new JPanel();
        backButtonPanel.setLayout(new GridLayout(1, 1));
        backButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        backButtonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel comboBoxPanel = new JPanel();
        comboBoxPanel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
        comboBoxPanel.setLayout(new GridLayout(1, 1));

        JPanel confirmButtonPanel = new JPanel();
        confirmButtonPanel.setBorder(BorderFactory.createEmptyBorder(60, 100, 30, 100));
        confirmButtonPanel.setLayout(new GridLayout(1, 1));


        JLabel addPullUpsTittle = new JLabel("ADD Pull-Ups");
        addPullUpsTittle.setFont(new Font("Arial", Font.BOLD, 50));
        addPullUpsTittle.setHorizontalAlignment(SwingConstants.CENTER);

        JComboBox<String> pullUpsDays = new JComboBox<>();
        pullUpsDays.addItem("Choose a day...");
        pullUpsDays.addItem("Monday");
        pullUpsDays.addItem("Tuesday");
        pullUpsDays.addItem("Wednesday");
        pullUpsDays.addItem("Thursday");
        pullUpsDays.addItem("Friday");
        pullUpsDays.addItem("Saturday");
        pullUpsDays.addItem("Sunday");

        JButton confirmButton = new JButton("CONFIRM");
        confirmButton.addActionListener(event -> {

            String day = (String) pullUpsDays.getSelectedItem();

            if (day.equalsIgnoreCase("Choose a day...")){
                JOptionPane.showMessageDialog(this,"Please choose a day!");
                return;
            }

            String question = JOptionPane.showInputDialog("How many Pull-Ups have you done?");

            try {

                int addPullUps = Integer.parseInt(question);

                if (addPullUps <= 0) {
                    JOptionPane.showMessageDialog(this, "Please write positive numbers!");
                    return;
                }
                if (day.equalsIgnoreCase("Monday")) {
                    pullUpsPerWeek[0] += addPullUps;
                } else if (day.equalsIgnoreCase("Tuesday")) {
                    pullUpsPerWeek[1] += addPullUps;
                } else if (day.equalsIgnoreCase("Wednesday")) {
                    pullUpsPerWeek[2] += addPullUps;
                } else if (day.equalsIgnoreCase("Thursday")) {
                    pullUpsPerWeek[3] += addPullUps;
                } else if (day.equalsIgnoreCase("Friday")) {
                    pullUpsPerWeek[4] += addPullUps;
                } else if (day.equalsIgnoreCase("Saturday")) {
                    pullUpsPerWeek[5] += addPullUps;
                } else if (day.equalsIgnoreCase("Sunday")) {
                    pullUpsPerWeek[6] += addPullUps;
                }

                JOptionPane.showMessageDialog(this, "Great!!! You added: " + addPullUps + " Pull-Ups");

            } catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(this,"Please write Pull-Ups amount!");
            }
            });

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
            cardLayout.show(container, "Pull-Ups");
        });

        backButtonPanel.add(exitButton);

        tittlePanel.add(backButtonPanel, BorderLayout.WEST);
        tittlePanel.add(addPullUpsTittle, BorderLayout.CENTER);

        comboBoxPanel.add(pullUpsDays);
        confirmButtonPanel.add(confirmButton);

        add(tittlePanel, BorderLayout.NORTH);
        add(comboBoxPanel, BorderLayout.CENTER);
        add(confirmButtonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
