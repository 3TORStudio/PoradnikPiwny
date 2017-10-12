package com.example.marcin.doradcapiwny;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin on 12.10.2017.
 */

public class BeerExpert {
    List<String> getBrands (String color){
        List<String> brands = new ArrayList<>();
        if(color.equals("bursztynowe")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
