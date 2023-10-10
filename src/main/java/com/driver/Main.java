package com.driver;

import java.util.Scanner;

public class Main {
    public static class Product{
        public int product(int x, int y) {return x*y;}
        public int product(int x, int y, int z) {return x*y*z;}
        public double product(double x, double y) {return ((double)(x*y));}
    }
    public static void main(String args[]){
        Product p=new Product();
        Scanner s=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        p.product(x,y);
        p.product(x,y,z);
        p.product(a,b);
    }

}