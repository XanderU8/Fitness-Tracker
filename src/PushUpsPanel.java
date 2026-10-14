/// I´m sorry, i did a lot of mistakes, but now i´d fix it.

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel.*; ///using a new import class! "DefaultTabelModel"


public class PushUpsPanel extends JPanel {



///         Add public
    public PushUpsPanel() {

///     Add a CardLayout and a Panel for cardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel container = new JPanel(cardLayout);


        setLayout(new BorderLayout());

///         Panel for Title, and set Border for empty Border
        JPanel panelForPushUpsTitle = new JPanel(new BorderLayout());
        panelForPushUpsTitle.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

///         Panel for "Exit/Back" button
        JPanel exitButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

///         Label for Title: "Push-Ups Menu"
        JLabel pushUpsLabelTitle = new JLabel("PUSH-Ups MENU");
        pushUpsLabelTitle.setFont(new Font("Arial", Font.BOLD, 30)); /// It´s made for the Title beauty
        pushUpsLabelTitle.setHorizontalAlignment(SwingConstants.CENTER);


///         Push-Ups Buttons: Add, remove, show and average buttons
        JButton addPushUpsButton = new JButton("Add Push-Ups");
        JButton removePushUpsButton = new JButton("Remove Push-Ups");
        JButton showPushUpsInfo = new JButton("Show Push-Ups Information");
        JButton showAveragePushUpsInfo = new JButton("Show average Push-Ups training"); ///Bonus button)))

///         Exit button. Adding "Exit" button in "exitButtonPanel"
        JButton exitButton = new JButton("Back>");
        exitButton.addActionListener(event -> {

        });
        exitButtonPanel.add(exitButton);

///         Add variabels in Panel and setting sides by "BorderLayout"
        panelForPushUpsTitle.add(exitButtonPanel, BorderLayout.WEST);
        panelForPushUpsTitle.add(pushUpsLabelTitle, BorderLayout.CENTER); /// Also I didn´t know that it´s possible to add an BordeLayout inside adding an variable.

///         Panel for buttons
        JPanel panelForButtons = new JPanel(); ///A new Panel for Buttons.
        panelForButtons.setLayout(new GridLayout(4,1,0,50));
        panelForButtons.setBorder(BorderFactory.createEmptyBorder(90,260,90,260));


///         Adding variabels in panel for buttons
        panelForButtons.add(addPushUpsButton);
        panelForButtons.add(removePushUpsButton);
        panelForButtons.add(showPushUpsInfo);
        panelForButtons.add(showAveragePushUpsInfo);

///        Just add and set sides with "BorderLayout"
        add(panelForPushUpsTitle, BorderLayout.NORTH);
        add(panelForButtons, BorderLayout.CENTER);
    }
}

