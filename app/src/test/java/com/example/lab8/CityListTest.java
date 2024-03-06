package com.example.lab8;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    public void testHasCity(){
        CityList cityList = mockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        assertTrue(cityList.hasCity(city));
        assertFalse(cityList.hasCity(new City("Paris", "France")));
    }

    @Test
    public void testDeleteNonCity(){
        CityList cityList = mockCityList();
        City edm = new City("Edmonton", "AB");
        assertThrows( IllegalArgumentException.class, () -> {
            cityList.delete(edm);
        });
    }
}
