import javax.swing.*;
import java.awt.*;

public class ShowPushUpsInformation extends JPanel {

    public ShowPushUpsInformation(CardLayout cardLayout, JPanel container) {

        setLayout(new BorderLayout());

        JPanel panelForTittle = new JPanel(new BorderLayout());
        panelForTittle.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JPanel panelForExitButton = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel pushUpsInfo = new JLabel("SHOW Push-Ups INFORMATION");
        pushUpsInfo.setFont(new Font("Arial", Font.BOLD, 40));
        pushUpsInfo.setHorizontalAlignment(SwingConstants.CENTER);

        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {
            cardLayout.show(container, "Push-Ups");
        });

        panelForExitButton.add(exitButton);

        panelForTittle.add(panelForExitButton, BorderLayout.WEST);
        panelForTittle.add(pushUpsInfo, BorderLayout.CENTER);

        JPanel panelForInfo = new JPanel(new GridLayout(1, 1));
        panelForInfo.setBorder(BorderFactory.createEmptyBorder(60, 80, 80, 80));

        String[] columns = {
                "Days",
                "Push-Ups"
        };

        Object[][] objects = {
                {"Monday", 25000},
                {"Tuesday", 12000},
                {"Wednesday", 15600},
                {"Thursday", 9200},
                {"Friday", 25300},
                {"Saturday", 5400},
                {"Sunday", 3502}
        };

        JTable trakerTabel = new JTable(objects, columns) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        trakerTabel.setRowHeight(30);

        JScrollPane scrollPane = new JScrollPane(trakerTabel);

        panelForInfo.add(scrollPane);

        add(panelForTittle, BorderLayout.NORTH);
        add(panelForInfo, BorderLayout.CENTER);
    }
}