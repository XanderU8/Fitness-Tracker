import javax.swing.*;
import java.awt.*;

public class ShowCaloriesInfo extends JPanel {

    public ShowCaloriesInfo(CardLayout cardLayout, JPanel container) {

        setLayout(new BorderLayout());

        JPanel tittlePanel = new JPanel(new BorderLayout());
        tittlePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new GridLayout(1, 1));
        tablePanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 200, 100));

        JPanel exitButtonPanel = new JPanel();
        exitButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        exitButtonPanel.setLayout(new GridLayout(1, 1));
        exitButtonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        JLabel addCaloriesTittle = new JLabel("SHOW Calories information");
        addCaloriesTittle.setHorizontalAlignment(SwingConstants.CENTER);
        addCaloriesTittle.setFont(new Font("Arial", Font.BOLD, 50));

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
            cardLayout.show(container, "Calories");
        });

        String[] data = {
                "Days: ",
                "Calories"
        };

        Object[][] objects = {
                {"Monday", 2500},
                {"Tuesday", 1200},
                {"Wednesday", 1560},
                {"Thursday", 9200},
                {"Friday", 2530},
                {"Saturday", 5400},
                {"Sunday", 3502}
        };

        JTable table = new JTable(objects, data);

        JScrollPane scrollPane = new JScrollPane(table);

        tablePanel.add(scrollPane);

        exitButtonPanel.add(exitButton);

        tittlePanel.add(exitButtonPanel, BorderLayout.WEST);
        tittlePanel.add(addCaloriesTittle, BorderLayout.CENTER);

        add(tittlePanel, BorderLayout.NORTH);
        add(tablePanel, BorderLayout.CENTER);

        setVisible(true);


    }
}
