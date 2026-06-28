package com.cognizant.search;

public class SearchModule {

    static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] products = {101, 104, 108, 110, 115};

        int result = linearSearch(products, 108);

        if (result != -1)
            System.out.println("Product found at index " + result);
        else
            System.out.println("Product not found");
    }
}