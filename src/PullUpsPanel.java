import javax.swing.*;
import java.awt.*;

public class PullUpsPanel extends JPanel{

///         Add public PullUps
        public PullUpsPanel(){


        JFrame pullUpsWindow = new JFrame("PullUps");
        pullUpsWindow.setSize(1000,800);


        JPanel panelForTitle = new JPanel(new BorderLayout());
        panelForTitle.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));



        JPanel panelForExitButton = new JPanel();
        panelForExitButton.setLayout(new FlowLayout(FlowLayout.LEFT));




        JLabel pullUpsTitle = new JLabel("PULL-Ups MENU");
        pullUpsTitle.setFont(new Font("Arial", Font.BOLD, 30));
        pullUpsTitle.setBorder(BorderFactory.createEmptyBorder(25,15,15,15));
        pullUpsTitle.setHorizontalAlignment(SwingConstants.CENTER);
        panelForTitle.add(pullUpsTitle);



///             Create Pull-Ups Buttons. And add Pull-Ups variabels in panel
        JButton addPullUpsButton = new JButton("Add Pull-Ups");



        JButton removePullUpsButton = new JButton("Remove Pull-Ups");


        JButton showPullUpsInfo = new JButton("Show Pull-Ups Information");


        JButton showPullUpsAverage = new JButton("Show average");


        JButton backPullUpsButton = new JButton("Back>");
        panelForExitButton.add(backPullUpsButton);

        panelForTitle.add(panelForExitButton, BorderLayout.WEST);
        panelForTitle.add(pullUpsTitle, BorderLayout.NORTH);

        JPanel panelForButtons = new JPanel();
        panelForButtons.setLayout(new GridLayout(4,1,0,50));
        panelForButtons.setBorder(BorderFactory.createEmptyBorder(90,260,90,260));




        panelForButtons.add(addPullUpsButton);
        panelForButtons.add(removePullUpsButton);
        panelForButtons.add(showPullUpsInfo);
        panelForButtons.add(showPullUpsAverage);







        pullUpsWindow.add(panelForTitle, BorderLayout.NORTH);
        pullUpsWindow.add(panelForButtons, BorderLayout.CENTER);


        pullUpsWindow.setVisible(true);
}
}
