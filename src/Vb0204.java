// Voorbeeld 0204
// Opstartklasse voor applicatie met paneel
// voor 2 knoppen en tekstvak

import javax.swing.*;
import java.awt.event.*;

public class Vb0204 extends JFrame
{
    public static void main (String args[])
    {
        JFrame frame = new Vb0204();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Voorbeeld 0204");
        JPanel paneel = new Paneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
    }
}
// Paneel met 2 knoppen en een tekstvak
class Paneel extends JPanel
{
    private JButton knop, herstelknop;
    private JTextField tekstvak;

    public Paneel()
    {
        knop = new JButton("Klik!");
        knop.addActionListener( new KnopHandler());

        herstelknop = new JButton("Uitvegen!");
        herstelknop.addActionListener(new HerstelknopHandler());

        tekstvak = new JTextField(10);
        add(knop);
        add(tekstvak);
        add(herstelknop);
    }
    //Inwendige klasse
    class KnopHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            tekstvak.setText("Je hebt geklikt!");
        }
    }
    //Nog een inwendige klasse
    class HerstelknopHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            tekstvak.setText("");
        }
    }

} //Einde van de klasse