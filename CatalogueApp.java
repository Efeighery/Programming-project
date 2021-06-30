/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingcatalogue;

/**
 * Program Name: CatalogueApp.java Date: 03/01/2021
 *
 * @author E Feighery (x19413886)
 */
public class CatalogueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Here an object of the Catalogue GUI class is created and declared

        CatalogueGUI myStreamingGUI = new CatalogueGUI();
        // Here I set the object of the GUI class to be visible when the user runs the application (Since the setVisible command uses boolean properties).
        myStreamingGUI.setVisible(true);
    }

}
