package com.driver;

import java.util.Scanner;

public class Main {
    public static class Product{
        public int product(int x, int y) {return x*y;}
        public int product(int x, int y, int z) {return x*y*z;}
        public double product(double x, double y) {return (x*y);}
    }
    public static void main(String[] args){
        Product p=new Product();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println(p.product(x,y));
        System.out.println(p.product(x,y,z));
        System.out.println(p.product(a,b));
    }

}