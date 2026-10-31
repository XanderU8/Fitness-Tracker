import javax.swing.*;
import java.awt.*;

public class ShowSteps extends JPanel {

    public ShowSteps(CardLayout cardLayout, JPanel container) {

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


        JLabel tittle = new JLabel("SHOW steps");
        tittle.setHorizontalAlignment(SwingConstants.CENTER);
        tittle.setFont(new Font("Arial", Font.BOLD, 50));

        JComboBox<String> days = new JComboBox<>();
        days.addItem("Choose a day to know information");
        days.addItem("Monday");
        days.addItem("Tuesday");
        days.addItem("Wednesday");
        days.addItem("Thursday");
        days.addItem("Friday");
        days.addItem("Saturday");
        days.addItem("Sunday");


        JButton confirmButton = new JButton("CONFIRM");
        confirmButton.addActionListener(event -> {
            String question = JOptionPane.showInputDialog("So many steps have done");
        });

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
            cardLayout.show(container, "Running");
        });
        exitButtonPanel.add(exitButton);

        tittlePanel.add(exitButtonPanel, BorderLayout.WEST);
        tittlePanel.add(tittle, BorderLayout.CENTER);

        jComboBoxPanel.add(days);
        confirmButtonPanel.add(confirmButton);


        add(tittlePanel, BorderLayout.NORTH);
        add(jComboBoxPanel, BorderLayout.CENTER);
        add(confirmButtonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
