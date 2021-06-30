/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingcatalogue;

import java.io.Serializable;

/**
 * Program Name: Catalogue.java 
 * Date: 03/01/2021
 * @author E Feighery (x19413886)
 */
// Serializable means that it will go through the object reference heirarchy to write out objects onto the Stream.
public class Catalogue implements Serializable {

    // The main variables used in this superclass. Private means that the variables can be seen by the same class but not in the universal packages and subclasses.
    private String title; // To store the title of the film or show.
    private String genre; // To store the film/show's genre.
    private String duration;  // To store the film/show's runtime duration.

    // An overloaded constructor that initialises the field values.
    public Catalogue(String title, String genre, String duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    // A normal constructor that initialises the values of each variable based on their assigned datatypes.
    public Catalogue() {
        title = "";
        genre = "";
        duration = "";
    }

    // Setters - Stores the information that the user typed in
    // This setter stores the entered title value here
    public void setTitle(String title) {
        this.title = title;
    }

    // This setter stores the entered genre value here
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // This setter stores the entered duration value here
    public void setDuration(String duration) {
        this.duration = duration;
    }

    // Getters - Acquires the stored information so that they can be saved in a created file
    // This getter grabs the title value from the setter for calculation purposes
    public String getTitle() {
        return title;
    }

    // This getter grabs the genre value from the setter for calculation purposes
    public String getGenre() {
        return genre;
    }

    // This getter grabs the duration value from the setter for calculation purposes
    public String getDuration() {
        return duration;
    }

    // Because, I was using instantiable classes and polymorphism, the getter for the cert variable from Movies wasn't registering.  This bypasses the error to ensure that the getter for the Cert variable will be accepted in the GUI application.
    
    // It's Overriden meaning that the getCert method will be invoked and the data for it will be added to the outputs.
    String getCert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
