// Here we go!!! Actually I do a lot of Mistakes, because it´s quite a big Projekt that i do for a long time
// So because of that I have created this class "JustAtraining" that means I will repeat and learn everything how to use something by projekt

import javax.swing.*;
import java.awt.*;

public class JustAtraining {

public JustAtraining(){

    JFrame window = new JFrame("Training");
    window.setSize(1000,800);
    window.setLayout(new BorderLayout());

    JPanel progressBarPanel = new JPanel();


    /// Now i´m gonna learn a new Swing component that is called: " JProgressBar " (It´s needed for the "Averages panels)
    JProgressBar progressBar = new JProgressBar();
    progressBar.setValue(50);
    progressBar.setStringPainted(true);
    progressBar.setPreferredSize(new Dimension(400,35));
    progressBarPanel.add(progressBar);


    window.add(progressBarPanel, BorderLayout.CENTER);
    window.setVisible(true);


}
}
