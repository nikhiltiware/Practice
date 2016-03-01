package com.company;

/**
 * Created by Nikhil on 3/1/16.
 */
public class excelColumnNumber {

    public int getColumnNumber(String s){
        int result =0;
        for(int i=0; i<s.length(); i++){
            result = result*26;
            result = result + s.charAt(i)-'A'+1;
        }

        return result;
    }
}
