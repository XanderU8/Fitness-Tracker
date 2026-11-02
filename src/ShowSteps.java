import javax.swing.*;
import java.awt.*;

public class ShowSteps extends JPanel {

    public ShowSteps(CardLayout cardLayout, JPanel container) {

        setLayout(new BorderLayout());

        JPanel tittlePanel = new JPanel(new BorderLayout());
        tittlePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel exitButtonPanel = new JPanel();
        exitButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        exitButtonPanel.setLayout(new GridLayout(1, 1));
        exitButtonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new GridLayout(1,1));
        tablePanel.setBorder(BorderFactory.createEmptyBorder(50,100,450,100));

        JLabel tittle = new JLabel("SHOW steps");
        tittle.setHorizontalAlignment(SwingConstants.CENTER);
        tittle.setFont(new Font("Arial", Font.BOLD, 50));

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
            cardLayout.show(container, "Running");
        });

        String [] data = {
          "Days:",
          "Steps"
        };

        Object [] [] objects = {
                {"Monday", 25000},
                {"Tuesday", 12000},
                {"Wednesday", 15600},
                {"Thursday", 9200},
                {"Friday", 25300},
                {"Saturday", 5400},
                {"Sunday", 3502}
        };

        JTable table = new JTable(objects, data);

        JScrollPane scrollPane = new JScrollPane(table);

        tablePanel.add(scrollPane);

        exitButtonPanel.add(exitButton);

        tittlePanel.add(exitButtonPanel, BorderLayout.WEST);
        tittlePanel.add(tittle, BorderLayout.CENTER);

        add(tittlePanel, BorderLayout.NORTH);
        add(tablePanel, BorderLayout.CENTER);

        setVisible(true);
    }
}
