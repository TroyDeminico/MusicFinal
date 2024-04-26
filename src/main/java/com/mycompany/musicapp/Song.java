/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
    private static HashMap<Integer, Integer> artistIdCounter = new HashMap<>();
    
    public Song(String title, Artist artist, String link, int duration, String md5_image) {
        this.title = title;
        this.artist = artist;
        this.link = link;
        this.duration = duration;
        this.md5_image = md5_image;
        artistIdCounter.put(artist.getID(), artistIdCounter.getOrDefault(artist.getID(), 0) + 1);
    }
    
     public static LinkedHashMap<Integer, Integer> reorderArtistIdCounter() {
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(artistIdCounter.entrySet());
        Collections.sort(entryList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
     // help from 
     //https://sentry.io/answers/iterate-hashmap-java/#:~:text=Using%20a%20For%2DEach%20Loop,or%20entries%20in%20the%20HashMap.
    
    
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
