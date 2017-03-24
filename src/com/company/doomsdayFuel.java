package com.company;

/**
 * Created by Nikhil on 1/2/17.
 */
import java.util.*;

public class doomsdayFuel {
    public static final int PRECISION =10;
    public static int[] answer(int[][] m) {

        // Your code goes here.

        if(m==null || m.length==0 || m[0]==null)
            throw new IllegalArgumentException();
        int rowSize = m.length;
        int columnSize = m[0].length;

        if(rowSize==0 || columnSize==0 || rowSize>10 || columnSize>10)
            throw new IllegalArgumentException();

        if(rowSize!=columnSize)
            throw new IllegalArgumentException();


        ArrayList<Integer> states=new ArrayList<Integer>();

        double[][] output=new double[rowSize][columnSize];
        for(int i=0;i<rowSize;i++){
            double total=0;
            for(int k=0;k<columnSize;k++){
                output[i][k]=m[i][k];
                total=total+output[i][k];
            }
            if(total>0){
                for(int j=0;j<columnSize;j++){
                    double val=output[i][j]/total;
                    output[i][j]=val;
                }
            }else if(total==0){
                output[i][i]=1;
                states.add(i);
            }

        }
        double[][] res=matrixPower(output, 1000);

        double[] init=new double[rowSize];
        init[0]=1.0;

        double[][] sol=matrixMultiply(new double[][]{init}, res);

        double[] solution=sol[0];


        int[] result;
        int[] denoms=new int[states.size()];

        Fraction[] absorbRows=new Fraction[states.size()];
        for(int i=0;i<states.size();i++){
            absorbRows[i]=simplify(solution[states.get(i)]);
        }
        for(int i=0;i<absorbRows.length;i++){
            denoms[i]=absorbRows[i].getDen();
        }

        int lcm=lcm(denoms);


        result=new int[absorbRows.length+1];
        result[result.length-1]=lcm;
        for(int i=0;i<absorbRows.length;i++){
            Fraction f=absorbRows[i];

            int numerator=0;
            if(f.getDen()!=0){
                numerator=(lcm/f.getDen())*f.getNum();
            }
            result[i]=numerator;
        }

        return result;
    }

    public static int lcm(int[] input)
    {
        if(input.length==0)
            return 0;
        int result = input[0];
        for(int i = 1; i < input.length; i++) {
            if(input[i]>0)
                result = lcm(result, input[i]);
        }

        return result;
    }


    public static int lcm(int a, int b)
    {
        int gcd=Fraction.gcd(a, b);
        if(gcd!=0)
            return a * (b / gcd);
        else return 0;
    }

    public static int findDenominator(final int numerator, int low, int high, final double value){
        double differenceAllowed=0.00001;
        if(Math.abs(high-low)<=1){
            double m=low;
            double n=numerator;
            double roundedVal=round((n/m), PRECISION);
            if(Math.abs(roundedVal-value)<differenceAllowed)
                return low;

            m=high;
            n=numerator;
            roundedVal=round((n/m), PRECISION);
            if(Math.abs(roundedVal-value)<differenceAllowed)
                return high;

            return -1;
        }

        int mid=(low+high)/2;

        double m=mid;
        double n=numerator;
        double roundedVal=round((n/m), PRECISION);
        if(Math.abs(roundedVal-value)<differenceAllowed)
            return mid;
        else if(roundedVal<value)
            return findDenominator(numerator, low, mid, value);
        else
            return findDenominator(numerator, mid, high, value);

    }

    public static double[][] matrixMultiply(double[][] m, double[][] n){
        double[][] res;
        int rowSize = m.length;
        int mColumnSize = m[0].length;
        int nColumnSize = n[0].length;

        res = new double[rowSize][nColumnSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < nColumnSize; j++) {
                for (int k = 0; k < mColumnSize; k++) {
                    res[i][j] += round(m[i][k] * n[k][j], PRECISION);

                    res[i][j]=round(res[i][j], PRECISION);
                }
            }
        }
        return res;
    }

    public static Fraction simplify(double d){
        int range=1000;
        int roundPrecision= PRECISION;
        if(d<0.0001){
            return new Fraction(0, 1);
        }
        double rounded=round(d, roundPrecision);
        for(int i=1;i<range;i++){
            int j=findDenominator(i, 1, range, rounded);
            if(j>0){
                Fraction f= new Fraction(i, j);
                return f;
            }

        }
        return null;
    }


    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static double[][] matrixPower(double[][] a, int power){
        double[][] m=null;
        if(power<=1)
            return a;
        double[][] r=matrixPower(a, power/2);
        m=matrixMultiply(r, r);
        if(power%2!=0){
            m=matrixMultiply(m, a);
        }
        return m;
    }

    public static class Fraction
    {
        private int num;
        private int den;

        public Fraction(int n, int d){
            if(d != 0)
            {
                num = n;
                den = d;
            }
        }
        public static int gcd(int a, int b) {
            if (b==0) return a;
            return gcd(b,a%b);
        }

        public int getNum() {
            return num;
        }

        public int getDen() {
            return den;
        }

    }

}

