package PaqC01;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

class miPanel2 extends JFrame{

    private JPanel miPanel2;
    private JTextArea textAreaestadoID;

    public static void main(String[] args) {
        new miPanel2();
    }

    public miPanel2() {
        setTitle("Nueva ventana del peso total");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);

        setLayout(null);
        setVisible(true);
        setContentPane(miPanel2);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JFrame frame = new JFrame("Peso total del hub");
        JPanel panel = new JPanel();
        JButton boton = new JButton("Pulsa aquí");
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame nuevaVentana = new JFrame("Nueva ventana");
                nuevaVentana.setSize(300, 200);
                nuevaVentana.addWindowListener((WindowListener) nuevaVentana);{
                    System.out.println("x");
                }
                nuevaVentana.setVisible(true);
            }
        });

    }
}