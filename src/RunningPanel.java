import javax.swing.*;
import java.awt.*;

public class RunningPanel extends JPanel {
public RunningPanel(CardLayout cardLayout, JPanel container) {




    JPanel tittlePanel = new JPanel();
    tittlePanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
    tittlePanel.setLayout(new GridLayout(1,1));


    JPanel exitButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    exitButtonPanel.setLayout(new GridLayout(1,1));

    JLabel tittleCalories = new JLabel("CALORIES Menu");
    tittleCalories.setHorizontalAlignment(SwingConstants.CENTER);
    tittleCalories.setFont(new Font("Arial" , Font.BOLD, 30));
    tittleCalories.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

    JButton addStepsButton = new JButton("Add Steps");

    JButton removeSteps = new JButton("Remove Steps");

    JButton showSteps = new JButton("Show Steps");

    JButton showAverageSteps = new JButton("Average Steps");

    JButton exitButton = new JButton("Back>");
    exitButton.addActionListener(event -> {
        cardLayout.show(container, "Main");
    });

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4,1,0,50));
    buttonPanel.setBorder(BorderFactory.createEmptyBorder(90,260,90,260));

    exitButtonPanel.add(exitButton);

    tittlePanel.add(exitButtonPanel, BorderLayout.WEST);
    tittlePanel.add(tittleCalories, BorderLayout.NORTH);

    buttonPanel.add(addStepsButton);
    buttonPanel.add(removeSteps);
    buttonPanel.add(showSteps);
    buttonPanel.add(showAverageSteps);




     add(tittlePanel, BorderLayout.NORTH);
     add(buttonPanel, BorderLayout.CENTER);


     setVisible(true);














}

}
