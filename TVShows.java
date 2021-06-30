/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingcatalogue;

/**
 * Program Name: TVShows.java 
 * Date: 03/01/2021
 * @author E Fighery (x19413886)
 */
// Here, the instantiable class TVShows adds an extension to the main Catalogue class, meaning its own variables and method parameters can be added here as well.
public class TVShows extends Catalogue {

    // Private means that the variables can be seen by the same class but not in the universal packages and subclasses.
    private int seriesNo; // For storing the series numbers for the TV Show.
    private int episodeNo; // For storing the episode numbers of the TV Show.

    // An overloaded constructor that confirms the field values and adds an extension to allow for the variables in the Catalogue class to be used.
    public TVShows(int seriesNo, int episodeNo, String title, String genre, String duration) {
        super(title, genre, duration);
        this.seriesNo = seriesNo;
        this.episodeNo = episodeNo;
    }

    // A normal constructor that initialises the values of each variable based on their assigned datatypes.
    // The super code has already been declared the other variables so it's left as it is.
    public TVShows() {
        super();
        seriesNo = 0;
        episodeNo = 0;
    }

    // The two setters will store the inputted series and episode number values.
    public int getSeriesNo() {
        return seriesNo;
    }

    public void setSeriesNo(int seriesNo) {
        this.seriesNo = seriesNo;
    }

    // The two getters will grab the two inputs from the user for calculation purposes
    public int getEpisodeNo() {
        return episodeNo;
    }

    public void setEpisodeNo(int episodeNo) {
        this.episodeNo = episodeNo;
    }

}
