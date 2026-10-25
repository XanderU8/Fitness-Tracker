import javax.swing.*;
import java.awt.*;

public class ShowPullUpsInformation extends JPanel {

public ShowPullUpsInformation(CardLayout cardLayout, JPanel container){

    setLayout(new BorderLayout());

    JPanel tittlePanel = new JPanel(new BorderLayout());
    tittlePanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

    JPanel exitButtonPanel = new JPanel();
    exitButtonPanel.setLayout(new GridLayout(1,1));
    exitButtonPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

    JPanel comboBoxPanel = new JPanel();
    comboBoxPanel.setLayout(new GridLayout(1,1));
    comboBoxPanel.setBorder(BorderFactory.createEmptyBorder(200,200,200,200));

    JPanel confirmButtonPanel = new JPanel();
    confirmButtonPanel.setLayout(new GridLayout(1,1));
    confirmButtonPanel.setBorder(BorderFactory.createEmptyBorder(45,45,45,45));

    JLabel showPullUpsText = new JLabel("SHOW Pull-Ups");
    showPullUpsText.setHorizontalAlignment(SwingConstants.CENTER);
    showPullUpsText.setFont(new Font("Arial", Font.BOLD, 50));

    JComboBox<String> days = new JComboBox<>();
    days.addItem("Choose a day to know information");
    days.addItem("Monday");
    days.addItem("Tuesday");
    days.addItem("Wednesday");
    days.addItem("Thursday");
    days.addItem("Friday");
    days.addItem("Saturday");
    days.addItem("Sunday");

    JButton exitButton = new JButton("Back>");
    exitButton.addActionListener(event ->{
        cardLayout.show(container, "Pull-Ups");
    });

    JButton confirmButton = new JButton("CONFIRM");
    confirmButton.addActionListener(event ->{
        String question = JOptionPane.showInputDialog("That´s Info");
    });

    exitButtonPanel.add(exitButton);

    tittlePanel.add(exitButtonPanel, BorderLayout.WEST);
    tittlePanel.add(showPullUpsText, BorderLayout.CENTER);

    comboBoxPanel.add(days);

    confirmButtonPanel.add(confirmButton);

    add(tittlePanel, BorderLayout.NORTH);
    add(comboBoxPanel, BorderLayout.CENTER);
    add(confirmButtonPanel, BorderLayout.SOUTH);

    setVisible(true);


}

}
