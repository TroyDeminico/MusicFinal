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
    private String md5_image;
    
    
    public String getSongInfo(){
        return this.title + "~ " + this.artist.getName();
    }
    
    public String getSongLink(){
        return this.link;
    }
    
     public String getSongImg(){
        return this.md5_image;
    }
     
     public int getArtistID(){
         return this.artist.getID();
     }
//    
//    public String getArtistInfo(){
//        return this.artist.toString();
//    }
//    
   
    
    @Override
    public String toString(){
        return title + ", " + link;
    }
    
}
