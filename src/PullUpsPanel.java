import javax.swing.*;
import java.awt.*;

public class PullUpsPanel extends JPanel{

///         Add public PullUps
        public PullUpsPanel(CardLayout cardLayout, JPanel container){
                setLayout(new BorderLayout());





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
        addPullUpsButton.addActionListener(event ->{
                cardLayout.show(container, "Add Pull-Ups");
        });


        JButton removePullUpsButton = new JButton("Remove Pull-Ups");
        removePullUpsButton.addActionListener(event ->{
                cardLayout.show(container,"Remove Pull-Ups");
        });

        JButton showPullUpsInfo = new JButton("Show Pull-Ups Information");
        showPullUpsInfo.addActionListener(event ->{
                cardLayout.show(container, "Show Pull-Ups Information");
        });





        JButton backPullUpsButton = new JButton("Back>");
        backPullUpsButton.addActionListener(event -> {
                cardLayout.show(container, "Main");
        });


        panelForExitButton.add(backPullUpsButton);

        panelForTitle.add(panelForExitButton, BorderLayout.WEST);
        panelForTitle.add(pullUpsTitle, BorderLayout.NORTH);

        JPanel panelForButtons = new JPanel();
        panelForButtons.setLayout(new GridLayout(3,1,0,50));
        panelForButtons.setBorder(BorderFactory.createEmptyBorder(90,260,90,260));




        panelForButtons.add(addPullUpsButton);
        panelForButtons.add(removePullUpsButton);
        panelForButtons.add(showPullUpsInfo);






        add(panelForTitle, BorderLayout.NORTH);
        add(panelForButtons, BorderLayout.CENTER);


        setVisible(true);
        }
}
