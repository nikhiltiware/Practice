package com.company;

/**
 * Created by Nikhil on 3/19/17.
 */
public class BusinessInfo {
    int id;
    String catagory;
    Double rating;
    BusinessInfo(int i, String r) {
        id = i;
        catagory = r;
    }

    BusinessInfo(int i, Double r) {
        id = i;
        rating = r;
    }
}
