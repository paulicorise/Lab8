package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void testHasCity(){
        list = MockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        assertFalse(list.hasCity(new City("Paris", "France")));
    }

    @Test
    public void testDeleteNonCity(){
        list = MockCityList();
        City edm = new City("Edmonton", "AB");
        assertThrows(IllegalArgumentException.class, () -> {
            list.delete(edm);
        });
    }
    @Test
    public void testDeleteCity(){
        list = MockCityList();
        City edm = new City("Edmonton", "AB");
        list.addCity(edm);
        list.delete(edm);
        assertFalse(list.hasCity(edm));
    }

    @org.junit.Test
    public void testCountCities(){
        list = MockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        Assert.assertEquals(1, list.countCities());
    }


}
