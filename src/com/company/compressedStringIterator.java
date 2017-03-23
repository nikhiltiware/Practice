package com.company;

/**
 * Created by Nikhil on 3/22/17.
 */
public class compressedStringIterator {

    String str;
    int count;
    int index;
    char c;
    public compressedStringIterator(String str)
    {
        this.str = str;
        this.index = 0;
        this.count = 0;
        update();
    }

    public boolean hasNext()
    {
        return count > 0 || index < str.length();
    }

    public  char next(){
        if(count == 0)
        {
            update();
        }
        count--;
        return c;
    }

    private void update()
    {
        if(index < str.length())
        {
            int current = 0;
            while(Character.isDigit(str.charAt(index)))
            {
                current = current*10 +  str.charAt(index) - '0';
                index++;
            }
            this.count = current;
            this.c = str.charAt(index++);
        }

    }
}
