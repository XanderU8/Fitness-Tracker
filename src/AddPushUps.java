import javax.swing.*;
import java.awt.*;



        public class AddPushUps extends JPanel {

                public int [] pushUpsPerWeek = new int[7];

        public AddPushUps(CardLayout cardLayout, JPanel container){

                setLayout(new BorderLayout());

        JPanel panelForTitle = new JPanel(new BorderLayout());
        panelForTitle.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JPanel panelForJCombo = new JPanel();
        panelForJCombo.setLayout(new GridLayout(2,1,30,0));
        panelForJCombo.setBorder(BorderFactory.createEmptyBorder(350,120,100,120));

        JPanel panelForExit = new JPanel();
        panelForExit.setLayout(new GridLayout(1,1));
        panelForExit.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panelForExit.setLayout(new FlowLayout(FlowLayout.LEFT));

        JPanel panelForComfirmButton = new JPanel();
        panelForComfirmButton.setLayout(new GridLayout(1,1 ));
        panelForComfirmButton.setBorder(BorderFactory.createEmptyBorder(25,160,50,160));


        JLabel tittleAddPushUps = new JLabel("Add PUSH-Ups Menu");
        tittleAddPushUps.setHorizontalAlignment(SwingConstants.CENTER);
        tittleAddPushUps.setFont(new Font("Arial", Font.BOLD,45));


        JComboBox<String> days = new JComboBox<>();
        days.addItem("Choose a day...");
        days.addItem("Monday");
        days.addItem("Tuesday");
        days.addItem("Wednesday");
        days.addItem("Thursday");
        days.addItem("Friday");
        days.addItem("Saturday");
        days.addItem("Sunday");


        JButton confirmButton = new JButton("Confirm");
        confirmButton.setBorder(BorderFactory.createEmptyBorder(45,45,45,45));
        confirmButton.addActionListener(event -> {

                String day = (String) days.getSelectedItem();

                if (day.equalsIgnoreCase("Choose a day...")){
                        JOptionPane.showMessageDialog(this,"Please choose a day!");
                        return;
                }

                String question = JOptionPane.showInputDialog("How many Push-Ups have you done?");

                try {

                        int pushUps = Integer.parseInt(question); /// Also das heißt dass diese parseInt nimmt die Wörter und macht in Zahlen

                        if (pushUps <= 0) {
                                JOptionPane.showMessageDialog(this, "Please write positive numbers!");
                                return;
                        }

                        if (day.equalsIgnoreCase("Monday")) {
                                pushUpsPerWeek[0] += pushUps;
                        } else if (day.equalsIgnoreCase("Tuesday")) {
                                pushUpsPerWeek[1] += pushUps;
                        } else if (day.equalsIgnoreCase("Wednesday")) {
                                pushUpsPerWeek[2] += pushUps;
                        } else if (day.equalsIgnoreCase("Thursday")) {
                                pushUpsPerWeek[3] += pushUps;
                        } else if (day.equalsIgnoreCase("Friday")) {
                                pushUpsPerWeek[4] += pushUps;
                        } else if (day.equalsIgnoreCase("Saturday")) {
                                pushUpsPerWeek[5] += pushUps;
                        } else if (day.equalsIgnoreCase("Sunday")) {
                                pushUpsPerWeek[6] += pushUps;
                        }

                        JOptionPane.showMessageDialog(this, "Great!!! You added: " + pushUps + " Push-Ups");

                } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(this,"Please write Push-Ups amount!");
                }
                });

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
                cardLayout.show(container, "Push-Ups");
        });
                panelForExit.add(exitButton);

        panelForTitle.add(panelForExit, BorderLayout.WEST);
        panelForTitle.add(tittleAddPushUps, BorderLayout.CENTER);

         panelForJCombo.add(days);

         add(panelForTitle, BorderLayout.NORTH);
         add(panelForJCombo, BorderLayout.CENTER);
         add(confirmButton, BorderLayout.SOUTH);

         setVisible(true);

    }

}
