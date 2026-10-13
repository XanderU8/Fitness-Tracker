/// I´m sorry, i did a lot of mistakes, but now i´d fix it.

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel.*; ///using a new import class! "DefaultTabelModel"


public class PushUpsPanel extends JPanel {



    public PushUpsPanel() {

        JFrame secondPushUpsWindow = new JFrame();
        secondPushUpsWindow.setSize(1000,800);
        setLayout(new BorderLayout());

        JPanel pushUpsForTitleName = new JPanel();
        pushUpsForTitleName.setLayout(new GridLayout(1,1));

    ///At first i made set an BorderLayout, and an pushUps Panel. And now i have to create buttons for "Add, delete, show push-Ups.
        /// But at first of cource do not forget about Label


        JLabel pushUpsLabelTitle = new JLabel("Push-Ups menu");
        pushUpsLabelTitle.add(pushUpsLabelTitle);
    ///And here we go with buttons creating...

        JButton addPushUpsButton = new JButton("Add Push-Ups");
        JButton removePushUpsButton = new JButton("Remove Push-Ups");
        JButton showPushUpsInfo = new JButton("Show Push-Ups Information");
        JButton showAveragePushUpsInfo = new JButton("Show average Push-Ups training"); ///Bonus button)))


        JPanel panelForButtons = new JPanel(); ///A new Panel for Buttons.
        panelForButtons.setLayout(new GridLayout(4,1));
        panelForButtons.add(addPushUpsButton);
        panelForButtons.add(removePushUpsButton);
        panelForButtons.add(showPushUpsInfo);
        panelForButtons.add(showAveragePushUpsInfo);

        secondPushUpsWindow.setVisible(true);

    }
}
