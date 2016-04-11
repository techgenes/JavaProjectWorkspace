import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by achalgupta on 4/5/2016.
 */
public class Menu implements ActionListener{
    public JPanel mainPanel;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button31;
    private JButton button32;
    private JButton button33;
    private JLabel heading;
    private JButton reset;



    int turn=0;
//
    public Menu(){
        Font font=new Font("",1,30);
        font.isBold();

        mainPanel.setBackground(Color.WHITE);
        button11.setBackground(Color.ORANGE);
        button12.setBackground(Color.ORANGE);
        button13.setBackground(Color.ORANGE);
        button21.setBackground(Color.ORANGE);
        button22.setBackground(Color.ORANGE);
        button23.setBackground(Color.ORANGE);
        button31.setBackground(Color.ORANGE);
        button32.setBackground(Color.ORANGE);
        button33.setBackground(Color.ORANGE);

        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button21.addActionListener(this);
        button22.addActionListener(this);
        button23.addActionListener(this);
        button31.addActionListener(this);
        button32.addActionListener(this);
        button33.addActionListener(this);

        button11.setFont(font);
        button12.setFont(font);
        button13.setFont(font);
        button21.setFont(font);
        button22.setFont(font);
        button23.setFont(font);
        button31.setFont(font);
        button32.setFont(font);
        button33.setFont(font);

        reset.addActionListener(this);
    }
    private boolean hasPlayerWon(String symbol) {
        if ((this.button11.getText() == symbol) && (this.button12.getText() == symbol) && (this.button13.getText() == symbol)) {
            return true;
        }

        if ((this.button21.getText() == symbol) && (this.button22.getText() == symbol) && (this.button23.getText() == symbol)) {
            return true;
        }

        if ((this.button31.getText() == symbol) && (this.button32.getText() == symbol) && (this.button33.getText() == symbol)) {
            return true;
        }

        if ((this.button11.getText() == symbol) && (this.button22.getText() == symbol) && (this.button33.getText() == symbol)) {
            return true;
        }

        if ((this.button13.getText() == symbol) && (this.button22.getText() == symbol) && (this.button31.getText() == symbol)) {
            return true;
        }

        if ((this.button11.getText() == symbol) && (this.button21.getText() == symbol) && (this.button31.getText() == symbol)) {
            return true;
        }

        if ((this.button12.getText() == symbol) && (this.button22.getText() == symbol) && (this.button32.getText() == symbol)) {
            return true;
        }

        if ((this.button13.getText() == symbol) && (this.button23.getText() == symbol) && (this.button33.getText() == symbol)) {
            return true;
        }

        return false;
    }

    private void disableButton(){
        button11.setEnabled(false);
        button12.setEnabled(false);
        button13.setEnabled(false);
        button21.setEnabled(false);
        button22.setEnabled(false);
        button23.setEnabled(false);
        button31.setEnabled(false);
        button32.setEnabled(false);
        button33.setEnabled(false);
    }
//
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("pressed");
        JButton obj=(JButton) e.getSource();
        //Object obj=e.getSource();
        obj.setEnabled(false);

        if(obj.getText()=="Reset"){
            resetGame();
            return;
        }

        if(turn%2==0){
            heading.setText("Player2 Turn");
            obj.setBackground(Color.GREEN);

            //obj.setForeground(Color.black);
            obj.setText("X");
        }
        else{
            heading.setText("Player1 Turn");
            obj.setBackground(Color.YELLOW);
            //obj.setForeground(Color.BLUE);


            obj.setText("0");
        }
        turn++;
        if(hasPlayerWon("0")){
            disableButton();
            heading.setText("Player2 won");
        }
        if(hasPlayerWon("X")){
            disableButton();
            heading.setText("Player1 won");
        }
        if(turn==9){
            disableButton();
            heading.setText("Match Draw");
        }
    }

    private void resetGame(){
        turn=0;
        button11.setText("");
        button12.setText("");
        button13.setText("");
        button21.setText("");
        button22.setText("");
        button23.setText("");
        button31.setText("");
        button32.setText("");
        button33.setText("");

        button11.setBackground(Color.ORANGE);
        button12.setBackground(Color.ORANGE);
        button13.setBackground(Color.ORANGE);
        button21.setBackground(Color.ORANGE);
        button22.setBackground(Color.ORANGE);
        button23.setBackground(Color.ORANGE);
        button31.setBackground(Color.ORANGE);
        button32.setBackground(Color.ORANGE);
        button33.setBackground(Color.ORANGE);

        button11.setEnabled(true);
        button12.setEnabled(true);
        button13.setEnabled(true);
        button21.setEnabled(true);
        button22.setEnabled(true);
        button23.setEnabled(true);
        button31.setEnabled(true);
        button32.setEnabled(true);
        button33.setEnabled(true);
        reset.setEnabled(true);
    }
}
