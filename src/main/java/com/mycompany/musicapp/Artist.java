/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicapp;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author troydeminico
 */
public class Artist {
    private int id;
    private String name;
    private String picture_big;
    private int count = 0; 
    
    
    @Override
    public String toString(){
        return id + ", " + name;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    public ImageIcon getImage(){
        try {
            BufferedImage bi = ImageIO.read(new URL(picture_big));      
            ImageIcon ii = new ImageIcon(bi.getScaledInstance(bi.getWidth() / 3, bi.getHeight() / 3, BufferedImage.SCALE_SMOOTH));
            return ii;
        } catch (IOException ex) {
//            Logger.getLogger(Artist.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
}
