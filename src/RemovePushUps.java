import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class RemovePushUps extends JPanel {

    public RemovePushUps(CardLayout cardLayout, JPanel container, int [] pushUpsPerWeek){




         setLayout(new BorderLayout());

        JPanel panelForTitle = new JPanel(new BorderLayout());
        panelForTitle.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JPanel panelForExitButton = new JPanel();
        panelForExitButton.setLayout(new GridLayout(1,1));
        panelForExitButton.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelForExitButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JPanel panelForComboBox = new JPanel();
        panelForComboBox.setLayout(new GridLayout(1,1));
        panelForComboBox.setBorder(BorderFactory.createEmptyBorder(200,200,200,200));

        JPanel panelForConfirmButton = new JPanel();
        panelForConfirmButton.setLayout(new GridLayout(1,1));
        panelForConfirmButton.setBorder(BorderFactory.createEmptyBorder(60,100,30,100));

        JLabel removePushUpsTittle = new JLabel("REMOVE Push-Ups");
        removePushUpsTittle.setHorizontalAlignment(SwingConstants.CENTER);
        removePushUpsTittle.setFont(new Font("Arial", Font.BOLD, 50));


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
        confirmButton.setBorder(BorderFactory.createEmptyBorder(45,45,45,45));
        confirmButton.addActionListener(event -> {

            String day = days.getSelectedItem().toString();

            if (day.equalsIgnoreCase("Choose a day...")){
                JOptionPane.showMessageDialog(this,"Please choose a day!");
                return;
            }

            String question = JOptionPane.showInputDialog("How many Push-Ups would you like to remove?");

            try{

                int removePushUps = Integer.parseInt(question);

                if (day.equalsIgnoreCase("Monday")){
                    pushUpsPerWeek[0] -= removePushUps;
                }
                else if (day.equalsIgnoreCase("Tuesday")){
                    pushUpsPerWeek[1] -= removePushUps;
                }
                else if (day.equalsIgnoreCase("Wednesday")){
                    pushUpsPerWeek[2] -= removePushUps;
                }
                else if (day.equalsIgnoreCase("Thursday")){
                    pushUpsPerWeek[3] -= removePushUps;
                }
                else if (day.equalsIgnoreCase("Friday")){
                    pushUpsPerWeek[4] -= removePushUps;
                }
                else if (day.equalsIgnoreCase("Saturday")){
                    pushUpsPerWeek[5] -= removePushUps;
                }
                else if (day.equalsIgnoreCase("Sunday")){
                    pushUpsPerWeek[6] -= removePushUps;
                }

                    JOptionPane.showMessageDialog(this,"Great!!! You removed: " + removePushUps + " Push-Ups");

            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(this,"Please write Push-Ups amount!");
            }
        });

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
            cardLayout.show(container, "Push-Ups");
        });

        panelForExitButton.add(exitButton);

        panelForTitle.add(panelForExitButton, BorderLayout.WEST);
        panelForTitle.add(removePushUpsTittle, BorderLayout.CENTER);

        panelForComboBox.add(days);

        panelForConfirmButton.add(confirmButton);

        add(panelForTitle, BorderLayout.NORTH);
        add(panelForComboBox, BorderLayout.CENTER);
        add(panelForConfirmButton, BorderLayout.SOUTH);

        setVisible(true);
    }
}
