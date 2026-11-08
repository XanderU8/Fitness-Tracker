import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class ShowSteps extends JPanel {

    public ShowSteps(CardLayout cardLayout, JPanel container, int[] addStepsPerWeek) {

        setLayout(new BorderLayout());

        JPanel tittlePanel = new JPanel(new BorderLayout());
        tittlePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel exitButtonPanel = new JPanel();
        exitButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        exitButtonPanel.setLayout(new GridLayout(1, 1));
        exitButtonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new GridLayout(1, 1));
        tablePanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 450, 100));

        JLabel tittle = new JLabel("SHOW steps");
        tittle.setHorizontalAlignment(SwingConstants.CENTER);
        tittle.setFont(new Font("Arial", Font.BOLD, 50));

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
            cardLayout.show(container, "Running");
        });

        String[] data = {
                "Days:",
                "Steps"
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

        JTable table = new JTable(objects, data) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent event) {
                for (int i = 0; i < addStepsPerWeek.length; i++) {
                    table.setValueAt(addStepsPerWeek[i], i, 1);
                }
            }
        });

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
