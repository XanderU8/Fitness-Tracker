import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


        public class CaloriesPanel extends JPanel {

        public CaloriesPanel(CardLayout cardLayout, JPanel container) {


        setLayout(new BorderLayout());


        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 1, 0, 50));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(90, 260, 90, 260));


        JPanel exitPanel = new JPanel();
        exitPanel.setLayout(new FlowLayout(FlowLayout.LEFT));


        JLabel caloriesTittle = new JLabel("CALORIES Menu");
        caloriesTittle.setFont(new Font("Arial", Font.BOLD, 30));
        caloriesTittle.setHorizontalAlignment(SwingConstants.CENTER);
        titlePanel.add(caloriesTittle);


        JButton addCaloriesButton = new JButton("Add calories");

        JButton removeCaloriesButton = new JButton("Remove calories");

        JButton showCaloriesButton = new JButton("Show calories");

        JButton averageCaloriesButton = new JButton("Show average calories");

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
            cardLayout.show(container, "Main");
        });
        exitPanel.add(exitButton);

        titlePanel.add(exitPanel, BorderLayout.WEST);
        titlePanel.add(caloriesTittle, BorderLayout.NORTH);


        buttonPanel.add(addCaloriesButton);
        buttonPanel.add(removeCaloriesButton);
        buttonPanel.add(showCaloriesButton);
        buttonPanel.add(averageCaloriesButton);


        add(titlePanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);

    }
}
