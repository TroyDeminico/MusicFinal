/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicapp;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;


/**
 *
 * @author troydeminico
 */
public class IntList {
    private ArrayList<Integer> counts;
    
    public IntList(){
        this.counts = new ArrayList<Integer>();
    }
    
    public int get(int i){
        return this.counts.get(i);
    }
    
    public void addCount(Integer newArtist){
        this.counts.add(newArtist);
    }
    
    public void removeCount(int i){
        this.counts.remove(i);
    }
    
    public void increaseCount(int i) {
        if(!counts.isEmpty()){
            int count = this.counts.get(i);
            count += 1;
            this.counts.set(i, count); // Update the count in the list
        }
        else{
            counts.add(1); // Update the count in the list
            System.out.println("empty");
        }
    } 
    
    public void decreaseCount(int i) {
        int count = this.counts.get(i);
        count -= 1;
        this.counts.set(i, count); // Update the count in the list
    }
            
    
    @Override
    public String toString(){
        String CountsListOutput = "";
        int index = 0;
        for (Integer aInt : this.counts){
            index += 1;
            CountsListOutput += "\n" + Integer.toString(index) + ". " + aInt;
        }
        return CountsListOutput;
    }
    
     public void reorderListsFromGreatestToLeast(Playlist artistList, ArrayList<ImageIcon> favImgs, Playlist namesList) {
        ArrayList<Integer> copyCounts = new ArrayList<>(counts);
        Collections.sort(counts, Collections.reverseOrder()); 

        ArrayList<String> tempArtistList = new ArrayList<>();
        ArrayList<ImageIcon> tempFavImgs = new ArrayList<>();
        ArrayList<String> tempNamesList = new ArrayList<>(); 

        for (Integer count : counts) {
            int index = copyCounts.indexOf(count);
            tempArtistList.add(artistList.get(index));
            tempFavImgs.add(favImgs.get(index));
            tempNamesList.add(namesList.get(index));
            copyCounts.set(index, null);
        }

        artistList.clear();
        artistList.addAll(tempArtistList);
        favImgs.clear();
        favImgs.addAll(tempFavImgs);
        namesList.clear();
        namesList.addAll(tempNamesList);
    }
     //https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html
        
}
