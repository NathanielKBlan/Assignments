/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicsmain;

import javax.swing.JFrame;

public class GraphicsMain {

    public static void main(String[] args) {
        JFrame window = new JFrame("Java Graphics!");
        GraphicsPanel content = new GraphicsPanel();
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120,70);
        window.setSize(700,500);
        window.setVisible(true);
    }

}
