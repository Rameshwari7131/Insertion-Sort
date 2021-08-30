/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rameshwari.jadhav;

import java.util.Scanner;

/**
 *
 * @author Rameshwari
 */
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter all elements in array : ");
        for(int i= 0; i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        InsertionSort.sort(arr, size);
//        System.out.println("Sorted array : "+ Arrays.toString(arr));
        for(int i= 0; i<size;i++)
        {
            System.out.print(arr[i]);
        }
    }

    private static void sort(int arr[], int size) {
        int position, currValue, index;
        
        for(index = 1; index < size; index ++)
        {
            currValue = arr[index];
            position = index;
            while(position > 0 && (arr[position - 1] > currValue ))
            {
                arr[position] = arr[position - 1];
                position = position - 1;
            }
            arr[position] = currValue;
        }
    }
    
}
