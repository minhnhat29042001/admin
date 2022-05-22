/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class City {
    private String citynameString;

    @Override
    public String toString() {
        return citynameString ;
    }

    public String getCitynameString() {
        return citynameString;
    }

    public void setCitynameString(String citynameString) {
        this.citynameString = citynameString;
    }

    public City(String citynameString) {
        this.citynameString = citynameString;
    }
}
