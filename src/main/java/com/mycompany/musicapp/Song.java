/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicapp;

/**
 *
 * @author troydeminico
 */
public class Song {
    private String title;
    private Artist artist;
    private String link; 
    private int duration;
    
    
    public String getSongInfo(){
        return this.title + "~ " + this.artist.getName();
    }
    
    public String getSongLink(){
        return this.link;
    }
//    
//    public String getArtistName(){
//        return this.artist.getName();
//    }
    
   
    
    @Override
    public String toString(){
        return title + ", " + link;
    }
    
}
