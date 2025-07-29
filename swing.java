import javax.swing.*;

public class swingnew {
    private JPanel panel1;
    public swingnew(){
        panel1 =new JPanel();
        JLabel j=new JLabel("Hello Bro");
        JButton b=new JButton("Click me");
        panel1.add(j);
        panel1.add(b);
        b.addActionListener(e->{
            JOptionPane.showMessageDialog(panel1,"Button clicked");
        });
    }
    public static void main(String[] args) {
        JFrame f=new JFrame("New Swing");
        swingnew l=new swingnew();
        f.setContentPane(l.panel1);
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
