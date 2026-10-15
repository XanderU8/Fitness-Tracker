import javax.swing.*;
import java.awt.*;



public class AddPushUps {


        public AddPushUps(){


        JFrame window = new JFrame("Add push ups");
        window.setSize(1000,800);


        JPanel panelForTitle = new JPanel(new BorderLayout());
        panelForTitle.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JPanel panelForJCombo = new JPanel();
        panelForJCombo.setLayout(new GridLayout(2,1,30,0));

        JPanel panelForExit = new JPanel();
        panelForExit.setLayout(new FlowLayout(FlowLayout.LEFT));


        JLabel tittleAddPushUps = new JLabel("Add PUSH-Ups Menu");
        tittleAddPushUps.setFont(new Font("Arial", Font.BOLD,45));

        JLabel dayQuestionLabel = new JLabel("What Day would you like ");


        JComboBox<String> days = new JComboBox<>();
        days.addItem("Choose a day...");
        days.addItem("Monday");
        days.addItem("Tuesday");
        days.addItem("Wednesday");
        days.addItem("Thursday");
        days.addItem("Friday");
        days.addItem("Saturday");
        days.addItem("Sunday");


        JButton exitButton = new JButton("Back>");

        panelForTitle.add(panelForExit, BorderLayout.WEST);
        panelForTitle.add(tittleAddPushUps, BorderLayout.CENTER);

        panelForJCombo.add(dayQuestionLabel, BorderLayout.NORTH);
        panelForJCombo.add(days, BorderLayout.CENTER);


        panelForExit.add(exitButton);


        window.add(panelForTitle, BorderLayout.NORTH);
        window.add(panelForJCombo, BorderLayout.CENTER);



        window.setVisible(true);

    }

}
