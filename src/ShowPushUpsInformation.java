import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ShowPushUpsInformation extends JPanel {

    public ShowPushUpsInformation(CardLayout cardLayout, JPanel container, int [] pushUpsPerWeek) {

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
                {"Monday", pushUpsPerWeek[0]},
                {"Tuesday", pushUpsPerWeek[1]},
                {"Wednesday", pushUpsPerWeek[2]},
                {"Thursday", pushUpsPerWeek[3]},
                {"Friday", pushUpsPerWeek[4]},
                {"Saturday", pushUpsPerWeek[5]},
                {"Sunday", pushUpsPerWeek[6]}
        };

        JTable trakerTabel = new JTable(objects, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        trakerTabel.setRowHeight(30);

        addComponentListener(new ComponentAdapter() {

            @Override /// Why do i need to have this method. It isn´t even used!!!
            public void componentShown(ComponentEvent event) {
                for (int i = 0; i < pushUpsPerWeek.length; i++) {
                    trakerTabel.setValueAt(pushUpsPerWeek[i], i, 1);/// Also "1" bedeutet, dass es eine Zeile von Tabel ist.
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(trakerTabel);

        panelForInfo.add(scrollPane);

        add(panelForTittle, BorderLayout.NORTH);
        add(panelForInfo, BorderLayout.CENTER);
    }
}
