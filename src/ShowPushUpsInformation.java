import javax.swing.*;
import java.awt.*;

public class ShowPushUpsInformation extends JPanel {


    public ShowPushUpsInformation(CardLayout cardLayout, JPanel container) {


        setLayout(new BorderLayout());


        JPanel panelForTittle = new JPanel(new BorderLayout());
        panelForTittle.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel panelForExitButton = new JPanel();
        panelForExitButton.setLayout(new GridLayout(1, 1));
        panelForExitButton.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelForTittle.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel panelForJCombo = new JPanel();
        panelForJCombo.setLayout(new GridLayout(1, 1));
        panelForJCombo.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));

        JPanel panelForConfirmButton = new JPanel();
        panelForConfirmButton.setLayout(new GridLayout(1, 1));
        panelForConfirmButton.setBorder(BorderFactory.createEmptyBorder( 60,100,30,100));


        JLabel pushUpsInfo = new JLabel("SHOW Push-Ups INFORMATION");
        pushUpsInfo.setFont(new Font("Arial", Font.BOLD, 50));
        pushUpsInfo.setHorizontalAlignment(SwingConstants.CENTER);


        JComboBox<String> daysInfo = new JComboBox<>();
        daysInfo.addItem("Choose a day to know information...");
        daysInfo.addItem("Monday");
        daysInfo.addItem("Tuesday");
        daysInfo.addItem("Wednesday");
        daysInfo.addItem("Thursday");
        daysInfo.addItem("Friday");
        daysInfo.addItem("Saturday");
        daysInfo.addItem("Sunday");


        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
            cardLayout.show(container, "Push-Ups");
        });

        JButton confirmButton = new JButton("CONFIRM");
        confirmButton.setBorder(BorderFactory.createEmptyBorder(45,45,45,45));
        confirmButton.addActionListener(event -> {
            String question = JOptionPane.showInputDialog("So many Push-Ups you did.");
        });

        panelForExitButton.add(exitButton);

        panelForTittle.add(panelForExitButton, BorderLayout.WEST);
        panelForTittle.add(pushUpsInfo, BorderLayout.CENTER);

        panelForJCombo.add(daysInfo);
        panelForConfirmButton.add(confirmButton);

        add(panelForTittle, BorderLayout.NORTH);
        add(panelForJCombo, BorderLayout.CENTER);
        add(panelForConfirmButton, BorderLayout.SOUTH);

        setVisible(true);
    }
}