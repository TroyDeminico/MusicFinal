/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicapp;

import java.util.ArrayList;

/**
 *
 * @author troydeminico
 */
public class ArtistList {
    private ArrayList<Integer> artistID;
    
    public ArtistList(){
        this.artistID = new ArrayList<Integer>();
    }
    
    public void addSong(int ID){
        this.artistID.add(ID);
    }
    
}
