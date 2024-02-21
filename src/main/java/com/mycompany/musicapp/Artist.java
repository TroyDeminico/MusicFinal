/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicapp;

/**
 *
 * @author troydeminico
 */
public class Artist {
    private int id;
    private String name;
    
    
    @Override
    public String toString(){
        return id + ", " + name;
    }
    
    public String getName(){
        return name;
    }
    
}
