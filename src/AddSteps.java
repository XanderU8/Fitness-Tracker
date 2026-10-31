import javax.swing.*;
import java.awt.*;

public class AddSteps extends JPanel {

    public AddSteps(CardLayout cardLayout, JPanel container){

        setLayout(new BorderLayout());

        JPanel tittlePanel = new JPanel(new BorderLayout());
        tittlePanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        JPanel exitButtonPanel = new JPanel();
        exitButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        exitButtonPanel.setLayout(new GridLayout(1,1));
        exitButtonPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JPanel jComboBoxPanel = new JPanel();
        jComboBoxPanel.setBorder(BorderFactory.createEmptyBorder(200,200,200,200));
        jComboBoxPanel.setLayout(new GridLayout(1,1));

        JPanel confirmButtonPanel = new JPanel();
        confirmButtonPanel.setLayout(new GridLayout(1,1));
        confirmButtonPanel.setBorder(BorderFactory.createEmptyBorder(25,160,50,160));


        JLabel tittleText = new JLabel("ADD Steps");
        tittleText.setHorizontalAlignment(SwingConstants.CENTER);
        tittleText.setFont(new Font("Arial", Font.BOLD, 50));

        JComboBox<String> days = new JComboBox<>();
        days.addItem("Choose a day to add steps");
        days.addItem("Monday");
        days.addItem("Tuesday");
        days.addItem("Wednesday");
        days.addItem("Thursday");
        days.addItem("Friday");
        days.addItem("Saturday");
        days.addItem("Sunday");

        JButton confirmButton = new JButton("CONFIRM");
        confirmButton.addActionListener(event ->{
            String question = JOptionPane.showInputDialog("How many steps would you like to add?");
        });

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event ->{
            cardLayout.show(container, "Running");
        });

        exitButtonPanel.add(exitButton);

        tittlePanel.add(exitButton, BorderLayout.WEST);
        tittlePanel.add(tittleText, BorderLayout.CENTER);

        jComboBoxPanel.add(days);

        confirmButtonPanel.add(confirmButton);

        add(tittlePanel, BorderLayout.NORTH);
        add(jComboBoxPanel, BorderLayout.CENTER);
        add(confirmButtonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
