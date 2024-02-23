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
public class Playlist {
    private ArrayList<String> songs;
    
    public Playlist(){
        this.songs = new ArrayList<String>();
    }
    
    public void addSong(String newSong){
        this.songs.add(newSong);
    }
    
    public void removeSong(int i){
        this.songs.remove(i);
    }
    
    @Override
    public String toString(){
        String SongsListOutput = "";
        for (String aString : this.songs){
            SongsListOutput += "\n" + aString;
        }
        return SongsListOutput;
    }
}
