import javax.swing.*;
import java.awt.*;

public class RemovePullUps extends JPanel {

    public RemovePullUps(CardLayout cardLayout, JPanel container, int [] pullUpsPerWeek){

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

            if (day.equalsIgnoreCase("Choose a day...")){
                JOptionPane.showMessageDialog(this,"Please choose a day!");
                return;
            }

            String question = JOptionPane.showInputDialog("How many Pull-Ups would you like to remove?");

            try {
                int removePullUps = Integer.parseInt(question);

                if (day.equalsIgnoreCase("Monday")){
                    pullUpsPerWeek[0] -= removePullUps;
                }
                else if (day.equalsIgnoreCase("Tuesday")){
                    pullUpsPerWeek[1] -= removePullUps;
                }
                else if (day.equalsIgnoreCase("Wednesday")){
                    pullUpsPerWeek[2] -= removePullUps;
                }
                else if (day.equalsIgnoreCase("Thursday")){
                    pullUpsPerWeek[3] -= removePullUps;
                }
                else if (day.equalsIgnoreCase("Friday")){
                    pullUpsPerWeek[4] -= removePullUps;
                }
                else if (day.equalsIgnoreCase("Saturday")){
                    pullUpsPerWeek[5] -= removePullUps;
                }
                else if (day.equalsIgnoreCase("Sunday")){
                    pullUpsPerWeek[6] -= removePullUps;
                }
                    JOptionPane.showMessageDialog(this,"Great!!! You removed: " + removePullUps + " Pull-Ups");

            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(this,"Please write Pull-Ups amount!");
            }
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
