/// I´m sorry, i did a lot of mistakes, but now i´d fix it.

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel.*; ///using a new import class! "DefaultTabelModel"


public class PushUpsPanel extends JPanel {




    public PushUpsPanel() {
        setLayout(new BorderLayout());




        JPanel panelForPushUpsTitle = new JPanel(new BorderLayout());

        panelForPushUpsTitle.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));


        JPanel exitButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

    ///At first i made set an BorderLayout, and an pushUps Panel. And now i have to create buttons for "Add, delete, show push-Ups.
        /// But at first of cource do not forget about Label


        JLabel pushUpsLabelTitle = new JLabel("PUSH-Ups MENU");
        pushUpsLabelTitle.setFont(new Font("Arial", Font.BOLD, 30)); /// It´s made for the Title beauty
        pushUpsLabelTitle.setHorizontalAlignment(SwingConstants.CENTER);



        ///And here we go with buttons creating...

        JButton addPushUpsButton = new JButton("Add Push-Ups");
        JButton removePushUpsButton = new JButton("Remove Push-Ups");
        JButton showPushUpsInfo = new JButton("Show Push-Ups Information");
        JButton showAveragePushUpsInfo = new JButton("Show average Push-Ups training"); ///Bonus button)))

        JButton exitButton = new JButton("Back>");
        exitButtonPanel.add(exitButton);

        panelForPushUpsTitle.add(exitButtonPanel, BorderLayout.WEST);
        panelForPushUpsTitle.add(pushUpsLabelTitle, BorderLayout.CENTER); /// Also I didn´t know that it´s possible to add an BordeLayout inside adding an variable.


        JPanel panelForButtons = new JPanel(); ///A new Panel for Buttons.
        panelForButtons.setLayout(new GridLayout(4,1,0,50));
        panelForButtons.setBorder(BorderFactory.createEmptyBorder(90,260,90,260));



        panelForButtons.add(addPushUpsButton);
        panelForButtons.add(removePushUpsButton);
        panelForButtons.add(showPushUpsInfo);
        panelForButtons.add(showAveragePushUpsInfo);


        add(panelForPushUpsTitle, BorderLayout.NORTH);
        add(panelForButtons, BorderLayout.CENTER);




    }
}

