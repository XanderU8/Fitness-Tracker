import javax.swing.*;
import java.awt.*;

public class AddPullUps extends JPanel {
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
        pullUpsDays.addItem("Choose a day to add Pull-Ups");
        pullUpsDays.addItem("Monday");
        pullUpsDays.addItem("Tuesday");
        pullUpsDays.addItem("Wednesday");
        pullUpsDays.addItem("Thursday");
        pullUpsDays.addItem("Friday");
        pullUpsDays.addItem("Saturday");
        pullUpsDays.addItem("Sunday");

        JButton confirmButton = new JButton("CONFIRM");
        confirmButton.addActionListener(event -> {
            String question = JOptionPane.showInputDialog("How many Pull-Ups would you like to add?");
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
