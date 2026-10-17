import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class CaloriesPanel {

public CaloriesPanel(){


    JFrame window = new JFrame("Calories Window");
    window.setSize(1000,800);

    window.setLayout(new BorderLayout());




    JPanel titlePanel = new JPanel(new BorderLayout());
    titlePanel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
    titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));










    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4,1,20,20));
    buttonPanel.setBorder(BorderFactory.createEmptyBorder(100,160,50,160));

    JPanel exitPanel = new JPanel();
    exitPanel.setLayout(new GridLayout());


    JLabel caloriesTittle = new JLabel("CALORIES Menu");
    caloriesTittle.setFont(new Font("Arial", Font.BOLD,30));


    JButton addCaloriesButton = new JButton("Add calories");

    JButton removeCaloriesButton = new JButton("Remove calories");

    JButton showCaloriesButton = new JButton("Show calories");

    JButton averageCaloriesButton = new JButton("Show average calories");

    JButton exitButtonButton = new JButton("Back>");



    titlePanel.add(caloriesTittle);

    buttonPanel.add(addCaloriesButton);
    buttonPanel.add(removeCaloriesButton);
    buttonPanel.add(showCaloriesButton);
    buttonPanel.add(averageCaloriesButton);



    window.add(titlePanel, BorderLayout.NORTH);
    window.add(buttonPanel);



    window.setVisible(true);















}





}
