import javax.swing.*;
import java.awt.*;

public class ShowPullUpsInformation extends JPanel {

public ShowPullUpsInformation(CardLayout cardLayout, JPanel container){

    setLayout(new BorderLayout());

    JPanel tittlePanel = new JPanel(new BorderLayout());
    tittlePanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

    JPanel exitButtonPanel = new JPanel();
    exitButtonPanel.setLayout(new GridLayout(1,1));
    exitButtonPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

    JPanel tablePanel = new JPanel();
    tablePanel.setLayout(new GridLayout(1,1));
    tablePanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 450,100));

    JLabel showPullUpsText = new JLabel("SHOW Pull-Ups");
    showPullUpsText.setHorizontalAlignment(SwingConstants.CENTER);
    showPullUpsText.setFont(new Font("Arial", Font.BOLD, 50));


    JButton exitButton = new JButton("Back>");
    exitButton.addActionListener(event ->{
        cardLayout.show(container, "Pull-Ups");
    });

    String [] data = {
            "Days:",
            "Pull-Ups"
    };

    Object [] [] objects =  {
            {"Monday", 250},
            {"Tuesday", 12},
            {"Wednesday", 15},
            {"Thursday", 9},
            {"Friday", 23 },
            {"Saturday", 54},
            {"Sunday", 35}

    };


    JTable infoTable = new JTable(objects, data);

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
