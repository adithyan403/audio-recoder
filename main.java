import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class main extends JFrame implements ActionListener{
    private JButton record,save,stop;
    private JLabel status;
    private AudioFormat format;
    private TargetDataLine target;
    private boolean isrecording=false;

    public main(){
        this.setTitle("Audio Recorder");
        this.setLayout(new BorderLayout());
        this.setSize(400,200);
        this.getContentPane().setBackground(Color.BLUE);

        record=new JButton("Record Now", null);
        save=new JButton("Save Now");
        stop=new JButton("STOP");

        JPanel buttoPanel=new JPanel(new FlowLayout());
        buttoPanel.add(record);
        buttoPanel.add(save);
        buttoPanel.add(stop);
        this.add(buttoPanel,BorderLayout.NORTH);
        this.setVisible(true);

        
        
    }
    public static void main(String[] args){
        new main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
