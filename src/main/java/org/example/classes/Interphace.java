package org.example.classes;
import java.awt.*;
import javax.swing.*;

public class Interphace extends JFrame {
    JPanel jp = new JPanel();
    JFrame jf = new JFrame("Convertisseur");
    JLabel jl = new JLabel("😊👋WELCOME😊👋");
    JLabel jl1 = new JLabel("choisissez votre unité de convertion:");
    JLabel jl2 = new JLabel("1:Longeur📏📏");
    JLabel jl3 = new JLabel("2:Poids⚖️⚖️");
    JLabel jl4 = new JLabel(" 3:quantité🛢️🛢️");
    JLabel jl5 = new JLabel("Entrer votre choix:");
    JTextField jt1 = new JTextField(3);
    JButton jb1 =  new JButton("CONVERTIR🔄️🔄️");
    JTextField jt2 = new JTextField(30);
    JLabel jlim = new JLabel("", new ImageIcon("img/Camavinga.png"),4);
    public  Interphace() {
        Initcomposant();
        jf.setSize(800,800);
        jf.setVisible(true);
        jf.setResizable(true);
        // Background
        jp.setBackground(Color.gray);
    }
    public void Initcomposant (){
        jp.add(jl);
        jp.add(jl1);
        jp.add(jl2);
        jp.add(jl3);
        jp.add(jl4);
        jp.add(jl5);
        jp.add(jt1);
        jp.add(jb1);
        jp.add(jt2);
        jp.add(jlim);
        jf.setContentPane(jp);
    }

    public static void main(String[] args) {
        new Interphace();
    }
}



