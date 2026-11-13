import javax.swing.*;
import java.awt.*;

public class RunningPanel extends JPanel {
public RunningPanel(CardLayout cardLayout, JPanel container) {

    setLayout(new BorderLayout());

    JPanel tittlePanel = new JPanel(new BorderLayout());
    tittlePanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

    JPanel exitButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    exitButtonPanel.setLayout(new GridLayout(1,1));
    exitButtonPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,350));

    JLabel tittleCalories = new JLabel("STEPS Menu");
    tittleCalories.setHorizontalAlignment(SwingConstants.CENTER);
    tittleCalories.setFont(new Font("Arial" , Font.BOLD, 30));
    tittleCalories.setBorder(BorderFactory.createEmptyBorder(25,15,15,15));

    JButton addStepsButton = new JButton("Add Steps");
    addStepsButton.addActionListener(event ->{
        cardLayout.show(container,"Add steps");
    });

    JButton removeSteps = new JButton("Remove Steps");
    removeSteps.addActionListener(event ->{
        cardLayout.show(container,"Remove steps");
    });

    JButton showSteps = new JButton("Show Steps");
    showSteps.addActionListener(event ->{
        cardLayout.show(container,"Show steps");
    });



    JButton exitButton = new JButton("Back>");
    exitButton.addActionListener(event -> {
        cardLayout.show(container, "Main");
    });

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(3,1,0,50));
    buttonPanel.setBorder(BorderFactory.createEmptyBorder(90,260,90,260));

    exitButtonPanel.add(exitButton);

    tittlePanel.add(exitButtonPanel, BorderLayout.WEST);
    tittlePanel.add(tittleCalories, BorderLayout.NORTH);

    buttonPanel.add(addStepsButton);
    buttonPanel.add(removeSteps);
    buttonPanel.add(showSteps);





     add(tittlePanel, BorderLayout.NORTH);
     add(buttonPanel, BorderLayout.CENTER);


     setVisible(true);














}

}
