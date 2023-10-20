import java.awt.*;
import java.awt.event.*;

class Myframe extends Frame implements ActionListener{
    Button b = new Button("Click");
    Myframe(){
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Vinit");
    }
public static void main(String st[]){
    Frame f = new Frame();
    f.setTitle("First awt program");
    f.setSize(150, 150);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
}
}
