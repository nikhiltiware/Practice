package com.company;

/**
 * Created by Nikhil on 3/2/16.
 */
public class sortThree {

    public void sortNumbers(int a, int b, int c)
    {
        int[] num = {a,b,c};

        for(int i=0; i<3; i++)
        {
            for(int j=i; j<3; j++)
            {
                if(num[i]>num[j])
                {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;

                }

            }

        }

        System.out.println(num[0]+" "+num[1]+" "+num[2]);


    }

    public void sort3Numbers(int num1, int num2, int num3)
    {
        if ((num1 > num2 && num1 > num3))
        {
            if(num2 > num3)
            {
                System.out.print(num3 + " " + num2 + " " + num1);
            }
            else
                System.out.print(num2 + " " + num3 + " " + num1);
        }
        else if ((num2 > num1 && num2 > num3))
        {
            if(num1 > num3)
            {
                System.out.print(num3 + " " + num1 + " " + num1);
            }
            else
            {
                System.out.print(num1 + " " + num3 + " " + num2);
            }
        }
        else if ((num3 > num1 && num3 > num2))
        {
            if(num1 > num2)
            {
                System.out.print(num2 + " " + num1 + " " + num3);
            }
            else
                System.out.print(num1 + " " + num2 + " " + num3);
        }
        else
        {
            System.out.println("ERROR!");
        }


    }
}
