import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomingPage  extends JFrame implements ActionListener {
    JFrame myFrame = new JFrame();
    JButton playBtn = new JButton();
    JButton twoPlayerBtn = new JButton();
    public  WelcomingPage(){
        //myFrame = new JFrame();
        myFrame.setSize(450 ,600);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(false);
        myFrame.setLocationRelativeTo(null);

        playBtn.setBounds(100, 175, 250,50);
        playBtn.setBackground(new Color(0x1212B1));
        playBtn.setForeground(new Color(14, 13, 13));
        playBtn.setOpaque(true);
        playBtn.setText("Play");
        playBtn.setFont(new Font("Ink Free", Font.BOLD ,30));
        playBtn.setFocusable(false);

        twoPlayerBtn.setBounds(100, 250, 250,50);
        twoPlayerBtn.setBackground(new Color(0x1212B1));
        twoPlayerBtn.setForeground(new Color(14, 13, 13));
        twoPlayerBtn.setOpaque(true);
        twoPlayerBtn.setText("Two players");
        twoPlayerBtn.setFont(new Font("Ink Free", Font.BOLD ,30));
        twoPlayerBtn.setFocusable(false);

        myFrame.add(twoPlayerBtn);
        myFrame.add(playBtn);
        myFrame.setLayout(null);
        myFrame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {

    }

    public void add() {
    }
}
