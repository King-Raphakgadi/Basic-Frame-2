/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ub;

import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author Onthatile
 */
public class MySecondFrame extends JFrame{
    public MySecondFrame(){
        setTitle("My Second GUI");
        setSize(200,250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
}
