package interfaces;

import javax.swing.*;

public class Utilitario extends JFrame {

    public void defineIcone() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/interfaces/simbolo-de-reciclagem.png"));
        setIconImage(icon.getImage());
        //*
        // Cria o método defineIcone da classe Utilitario que atribui a imagem escolhida ao objeto icon
        // *//
    }
}