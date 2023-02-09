package com.driver;

public class Main {

    public static class Product
    {
        public int product(int x, int y)
        {
            return 0;
        }
        public int product(int x, int y, int z) {
            return 0;
        }
        public double product(double x, double y) {
            return 0;
        }

    }
    public static  void main(String[] args )
    {
        Product  p=new Product ();
        p.product(5,6);
        p.product(4,5,6);
        p.product(10.2,12.3);
    }

}