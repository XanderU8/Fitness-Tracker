import javax.swing.*;
import java.awt.*;



        public class AddPushUps extends JPanel {


        public AddPushUps(CardLayout cardLayout, JPanel container){





        JPanel panelForTitle = new JPanel(new BorderLayout());
        panelForTitle.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JPanel panelForJCombo = new JPanel();
        panelForJCombo.setLayout(new GridLayout(2,1,30,0));
        panelForJCombo.setBorder(BorderFactory.createEmptyBorder(350,120,100,120));

        JPanel panelForExit = new JPanel();
        panelForExit.setLayout(new FlowLayout(FlowLayout.LEFT));


        JPanel panelForComfirmButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelForComfirmButton.setBorder(BorderFactory.createEmptyBorder(25,160,50,160));


        JLabel tittleAddPushUps = new JLabel("Add PUSH-Ups Menu");
        tittleAddPushUps.setFont(new Font("Arial", Font.BOLD,45));

//        JLabel dayQuestionLabel = new JLabel("What Day would you like to choose? ");


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
        confirmButton.addActionListener(event -> {

                String questionText = JOptionPane.showInputDialog("How many Push-Ups?");

                if (questionText != null){
                        int pushUps = Integer.parseInt(questionText);
                }




        });

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
                cardLayout.show(container, "Push-Ups");
        });


        panelForTitle.add(panelForExit, BorderLayout.WEST);
        panelForTitle.add(tittleAddPushUps, BorderLayout.CENTER);

//        panelForJCombo.add(dayQuestionLabel, BorderLayout.NORTH);
        panelForJCombo.add(days, BorderLayout.CENTER);


        panelForExit.add(exitButton);


         add(panelForTitle, BorderLayout.NORTH);
         add(panelForJCombo, BorderLayout.CENTER);
         add(confirmButton, BorderLayout.SOUTH);

         setVisible(true);

    }

}
