package com.example.lab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List getCities() {
        List list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * When given a city, return whether or not it belongs in the list
     * @param city
     * @return boolean
     */
    public boolean hasCity(City city) {
         return cities.contains(city);
    }

//    /**
//     * Check if a city is present in the list. If it does then remove it from the list, if not then throw an exception
//     * @param city
//     */
//    public void delete(City city) {
//        if(!cities.contains(city)){
//            throw new IllegalArgumentException("City not found in the list.");
//        }
//        cities.remove(city);
//    }
//
//    /**
//     * Return how many cities are in the list
//     * @return int
//     */
//    public int countCities(){
//        return cities.size();
//    }

}