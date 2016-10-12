/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;
import java.util.*;

public class BeerExpert {
    
    public List getBrands(String color, String country) {
        List brands = new ArrayList();
        if (color.equals("amber")) {
            if(country.equals("Greek")) brands.add("Voreia Smoked Amber Ale");
            else brands.add("Amber Ale");
            
        } 
         if (color.equals("yellow")) {
            if(country.equals("Greek")) brands.add("Pils");
            else brands.add("Heineken");
            
        } 
         if (color.equals("brown")) {
            if(country.equals("Greek")) brands.add("Canal Dive Brown Ale");
            else brands.add("American brown ale");
            
        } 
         if (color.equals("dark")) {
            if(country.equals("Greek")) brands.add("Fix dark");
            else brands.add("Vander Ghinste Oud Bruin");
            
        } 
        return brands;
    }
}
