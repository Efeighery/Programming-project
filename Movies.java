/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingcatalogue;

/**
 * Program Name: Movies.java 
 * Date: 03/01/2021
 * @author E Feighery (x19413886)
 */
// Here, the instantiable class Movies adds an extension to the main Catalogue class, meaning its own variables and method parameters can be added here as well/#.
public class Movies extends Catalogue {

    // Private means that the variables can be seen by the same class but not in the universal packages and subclasses.
    private String cert; // To store the age rating of the movie (PG+, R, 12, 6 and up, etc.)

    // An overloaded constructor to initialise the field values in Movies. Super means that variables declared in the Catalogue file will be included here.
    public Movies(String cert, String title, String genre, String duration) {
        super(title, genre, duration);
        this.cert = cert;
    }

    // A normal constructor that initialises the values of each variable based on their assigned datatypes.
    // The super code has already been declared the other variables so it's left as it is.
    public Movies() {
        super();
        cert = "";
    }

    // A setter to store the inputted age rating of the movie.
    public String getCert() {
        return cert;
    }
    // A getter to grab the inputted age rating of the movie and returns it to the user.

    public void setCert(String cert) {
        this.cert = cert;
    }
}
