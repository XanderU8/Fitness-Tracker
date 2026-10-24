import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class RemovePushUps extends JPanel {



    public RemovePushUps(CardLayout cardLayout, JPanel container ){




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
        days.addItem("Choose a day to remove Push-Ups");
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

            String question = JOptionPane.showInputDialog("So many Push you have done?\nHow many would you like to remove?");
                    if (question != null){
                        int removePushUps = Integer.parseInt(question);
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
