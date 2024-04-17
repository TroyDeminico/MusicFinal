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
public class IntList {
    private ArrayList<Integer> counts;
    
    public IntList(){
        this.counts = new ArrayList<Integer>();
    }
    
    public void addCount(Integer newArtist){
        this.counts.add(newArtist);
    }
    
    public void removeCount(int i){
        this.counts.remove(i);
    }
    
    public void increaseCount(int i) {
        int count = this.counts.get(i);
        count += 1;
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

    
}
