/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicapp;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

/**
 *
 * @author troydeminico
 */
public class APISearch {
    private static final String root = "https://deezerdevs-deezer.p.rapidapi.com";
    
    private static HttpResponse<String> makeRequest(String fx, String query) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(root + fx + query))
                    .header("X-RapidAPI-Key", "d36fd31bb7mshb975a7f8dac1eb5p16607djsn5b0afb4e9e89")
                    .header("X-RapidAPI-Host", "deezerdevs-deezer.p.rapidapi.com")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return response;
        }
        catch (InterruptedException ex) {
            Logger.getLogger(APISearch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(APISearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static List<String> searchSong(String songName){
         
            HttpResponse<String> response = makeRequest("/search", "?q=" + songName);
            
            if(response == null) return null;
            
            Gson gson = new Gson();
            SongContainer sc = gson.fromJson(response.body(), SongContainer.class);
            List<Song> Songs = sc.getSong();
            
            List<String> resultList = new ArrayList<>();

            if (Songs != null) {
                for (Song song : Songs) {
                    System.out.println(song.getSongInfo()); // makes json a string
                     resultList.add(song.getSongInfo()+ "\n");
                }
            } else {
                System.out.println("No songs in the list");
            }
            
        return resultList;
     }
    
    
    public static Song getSelectedSongInfo(String songName, int index){
         
            HttpResponse<String> response = makeRequest("/search", "?q=" + songName);
            
            if(response == null) return null;
            
            Gson gson = new Gson();
            SongContainer sc = gson.fromJson(response.body(), SongContainer.class);
            List<Song> Songs = sc.getSong();

            if (Songs != null) {
                    return (Songs.get(index));
                }
             else {
                return null;
            }
     }
}


