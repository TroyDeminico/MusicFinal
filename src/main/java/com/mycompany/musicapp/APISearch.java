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
import java.util.Random;

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

    public static Song searchSong(String songName){
         
            HttpResponse<String> response = makeRequest("/search", "?q=" + songName);
            
            if(response == null) return null;
            
            Gson gson = new Gson();
            SongContainer sc = gson.fromJson(response.body(), SongContainer.class);
            List<Song> Songs = sc.getSong();

            if (Songs != null) {
                for (Song song : Songs) {
                    System.out.println(song.getSongInfo()); // makes json a string
                }
            } else {
                System.out.println("No songs in the list");
            }
            
        return null;
     }
    
    
    public static String getFirstSongInfo(String songName){
         
            HttpResponse<String> response = makeRequest("/search", "?q=" + songName);
            
            if(response == null) return null;
            
            Gson gson = new Gson();
            SongContainer sc = gson.fromJson(response.body(), SongContainer.class);
            List<Song> Songs = sc.getSong();

            if (Songs != null) {
                    return (Songs.get(0).getSongInfo());
                }
             else {
                return ("No song in the exist");
            }
            
        //return null;
     }
    
    public static String getSongLink(String songName){
         
            HttpResponse<String> response = makeRequest("/search", "?q=" + songName);
            
            if(response == null) return null;
            
            Gson gson = new Gson();
            SongContainer sc = gson.fromJson(response.body(), SongContainer.class);
            List<Song> Songs = sc.getSong();

            if (Songs != null) {
                    return (Songs.get(0).getSongLink());
                }
             else {
                return ("No song in the exist");
            }
            
        //return null;
     }
    
    
    public static Artist getArtist(String artistName){
         
            HttpResponse<String> response = makeRequest("/artist/", artistName);
            
            if(response == null) return null;
            
            Gson gson = new Gson();
            ArtistContainer ac = gson.fromJson(response.body(), ArtistContainer.class);
            List<Artist> Artists = ac.getArtist();

            if (Artists != null) {
                for (Artist artist : Artists) {
                    System.out.println(artist.getName()); // makes json a string
                }
            } else {
                System.out.println("No artist exist");
            }
            
        return null;
     }
    
    
    public static Song searchGenre(String genre){
         
            HttpResponse<String> response = makeRequest("/search/", genre);
            
            if(response == null) return null;
            
            Gson gson = new Gson();
            SongContainer sc = gson.fromJson(response.body(), SongContainer.class);
            List<Song> Songs = sc.getSong();

            if (Songs != null) {
                for (Song song : Songs) {
                    System.out.println(song.getSongInfo()); // makes json a string
                }
            } else {
                System.out.println("No songs in the list");
            }
            
        return null;
     }
    
    public static String getRandomSongInfo(String songName){
         
            HttpResponse<String> response = makeRequest("/search", "?q=" + songName);
            
            if(response == null) return null;
            
            Gson gson = new Gson();
            SongContainer sc = gson.fromJson(response.body(), SongContainer.class);
            List<Song> Songs = sc.getSong();          
            Random random = new Random();
            int randomNumber = random.nextInt(Songs.size());
            if (Songs != null) {
                    return (Songs.get(randomNumber).getSongInfo());
                }
             else {
                return ("No song in the exist");
            }
            
        //return null;
     }
    
//    public static String getSongLink(String songName){
//         
//            HttpResponse<String> response = makeRequest("/search", "?q=" + songName);
//            
//            if(response == null) return null;
//            
//            Gson gson = new Gson();
//            SongContainer sc = gson.fromJson(response.body(), SongContainer.class);
//            List<Song> Songs = sc.getSong();
//
//            if (Songs != null) {
//                    return (Songs.get(randomNumber).getSongLink());
//                }
//             else {
//                return ("No song in the exist");
//            }
//            
//        //return null;
//     }
    
}


