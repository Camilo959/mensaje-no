
import javax.swing.*;
import java.util.Random;
import java.awt.*;
import javax.swing.JFrame;

public class MensajeNv extends JFrame{

    Container panel;

    private JLabel mensajeP;
    private JButton botondeSi;
    private JButton botondeNo;

    public MensajeNv() {
        super("Ventana");
        setSize(700,500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = getContentPane();

        iniciarComp();
    }

    private void iniciarComp() {

        mensajeP = new JLabel("¿Quieres ser mi novia?");
        mensajeP.setBounds(150,100,330,50);
        mensajeP.setFont(new Font("Arial Black", 1, 24));

        botondeSi = new JButton("Si");
        botondeSi.setBounds(180,200,90,40);

        botondeNo = new JButton("No");
        botondeNo.setBounds(350,200,90,40);

        botondeSi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botondeSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondeSiActionPerformed(evt);
            }
        });

        botondeNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botondeNoMouseEntered(evt);
            }
        });

        botondeNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondeNoActionPerformed(evt);
            }
        });

        panel.add(mensajeP);
        panel.add(botondeSi);
        panel.add(botondeNo);
    }

    private void botondeNoActionPerformed(java.awt.event.ActionEvent evt) {
        botondeNo.setBounds(x(), y(), 90, 40);
    }

    private void botondeNoMouseEntered(java.awt.event.MouseEvent evt) {
        botondeNo.setBounds(x(), y(), 90, 40);
    }

    private void botondeSiActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Sabia que dirias que si \n Te amo :3");
    }

    int x(){
        Random r=new Random();
        int n=r.nextInt(600);
        return n;
    }
    
    int y(){
        Random r=new Random();
        int n=r.nextInt(450);
        return n;
    }
    
}
