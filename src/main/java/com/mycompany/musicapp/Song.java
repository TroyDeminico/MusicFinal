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
    
    public String getArtistName(){
        return this.artist.getName();
    }
    
    public String getSongLink(){
        return this.link;
    }
    
     public String getSongImg(){
        return this.md5_image;
    }
     
     public String getArtistID(){
        String ID = Integer.toString(this.artist.getID());
        return ID;
     }
//    
//    public String getArtistInfo(){
//        return this.artist.toString();
//    }
//    
   public Artist getArtist(){
       return artist;
   }
    
    @Override
    public String toString(){
        return title + ", " + link;
    }
    
}
