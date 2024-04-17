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
    
    public String get(int i){
        String song = this.songs.get(i);
        return song;
    }
    
    public int getSize(){
        return this.songs.size();
    }
    
            
    @Override
    public String toString(){
        String SongsListOutput = "";
        int index = 0;
        for (String aString : this.songs){
            index += 1;
            SongsListOutput += "\n" + Integer.toString(index) + ". " + aString;
        }
        return SongsListOutput;
    }

    public int compareID(String newID){
        int index = 0;
        if (!this.songs.isEmpty() && this.songs.size() > 0 ){
            for (String aString : this.songs){
                if (newID.equals(aString))
                    return index;
                else 
                    index += 1;    
            }
            return -1;
        }
        return -1;
}
    }
