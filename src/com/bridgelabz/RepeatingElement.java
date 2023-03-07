package com.bridgelabz;

public class RepeatingElement {
    public static void main(String[] args) {
        int arr[] = {18, 4, 20, 4, 2, 5, 4, 2};
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.println(arr[j]);


                }
            }
        }
    }
}
