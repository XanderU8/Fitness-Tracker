import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ShowPullUpsInformation extends JPanel {

    public ShowPullUpsInformation(CardLayout cardLayout, JPanel container, int[] pullUpsPerWeek) {

        setLayout(new BorderLayout());

        JPanel tittlePanel = new JPanel(new BorderLayout());
        tittlePanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JPanel exitButtonPanel = new JPanel();
        exitButtonPanel.setLayout(new GridLayout(1, 1));
        exitButtonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new GridLayout(1, 1));
        tablePanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 450, 100));

        JLabel showPullUpsText = new JLabel("SHOW Pull-Ups");
        showPullUpsText.setHorizontalAlignment(SwingConstants.CENTER);
        showPullUpsText.setFont(new Font("Arial", Font.BOLD, 50));


        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
            cardLayout.show(container, "Pull-Ups");
        });

        String[] data = {
                "Days:",
                "Pull-Ups"
        };

        Object[][] objects = {
                {"Monday", 0},
                {"Tuesday", 0},
                {"Wednesday", 0},
                {"Thursday", 0},
                {"Friday", 0},
                {"Saturday", 0},
                {"Sunday", 0}
        };

        JTable infoTable = new JTable(objects, data) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent event) {

                for (int i = 0; i < pullUpsPerWeek.length; i++) {
                    infoTable.setValueAt(pullUpsPerWeek[i], i, 1);
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(infoTable);

        tablePanel.add(scrollPane);

        exitButtonPanel.add(exitButton);

        tittlePanel.add(exitButtonPanel, BorderLayout.WEST);
        tittlePanel.add(showPullUpsText, BorderLayout.CENTER);

        add(tittlePanel, BorderLayout.NORTH);
        add(tablePanel, BorderLayout.CENTER);

        setVisible(true);
    }
}

