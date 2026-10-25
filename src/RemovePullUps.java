import javax.swing.*;
import java.awt.*;

public class RemovePullUps extends JPanel {

    public RemovePullUps(CardLayout cardLayout, JPanel container){

        setLayout(new BorderLayout());

        JPanel tittlePanel = new JPanel(new BorderLayout());
        tittlePanel.setLayout(new BorderLayout());
        tittlePanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JPanel exitButtonPanel = new JPanel();
        exitButtonPanel.setLayout(new GridLayout(1,1));
        exitButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        exitButtonPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JPanel comboBoxDaysPanel = new JPanel();
        comboBoxDaysPanel.setLayout(new GridLayout(1,1));
        comboBoxDaysPanel.setBorder(BorderFactory.createEmptyBorder(200,200,200,200));

        JPanel confirmButtonPanel = new JPanel();
        confirmButtonPanel.setLayout(new GridLayout(1,1));
        confirmButtonPanel.setBorder(BorderFactory.createEmptyBorder(45,45,45,45));


        JLabel removePullUpsTittle = new JLabel("REMOVE Pull-Ups");
        removePullUpsTittle.setHorizontalAlignment(SwingConstants.CENTER);
        removePullUpsTittle.setFont(new Font("Arial", Font.BOLD,50));

        JComboBox<String> days = new JComboBox<>();
        days.addItem("Choose a day to remove Pull-Ups");
        days.addItem("Monday");
        days.addItem("Tuesday");
        days.addItem("Wednesday");
        days.addItem("Thursday");
        days.addItem("Friday");
        days.addItem("Saturday");
        days.addItem("Sunday");

        JButton confirmButton = new JButton("CONFIRM");
        confirmButton.addActionListener(event -> {
            String question = JOptionPane.showInputDialog("How many Pull-Ups would you like to remove?");
        });

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event ->{
            cardLayout.show(container, "Pull-Ups");
        });

        exitButtonPanel.add(exitButton);

        tittlePanel.add(exitButtonPanel, BorderLayout.WEST);
        tittlePanel.add(removePullUpsTittle, BorderLayout.CENTER);

        comboBoxDaysPanel.add(days);
        confirmButtonPanel.add(confirmButton);

        add(tittlePanel, BorderLayout.NORTH);
        add(comboBoxDaysPanel, BorderLayout.CENTER);
        add(confirmButtonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
