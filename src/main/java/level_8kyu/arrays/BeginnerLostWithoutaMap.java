package level_8kyu.arrays;

import java.util.Arrays;

/*
Given an array of integers, return a new array with each value doubled.
    For example:
    [1, 2, 3] --> [2, 4, 6]
*/
public class BeginnerLostWithoutaMap {

    public static void main(String[] args) {
        System.out.println("2, 4, 6 = " + Arrays.toString(map(new int[]{1, 2, 3})));
        System.out.println("8, 2, 2, 2, 8 = " + Arrays.toString(map2(new int[]{4, 1, 1, 1, 4})));
        System.out.println("2, 2, 2, 2, 2, 2 = " + Arrays.toString(map(new int[]{1, 1, 1, 1, 1, 1})));
    }

//----------------------------------------------------------------------------------------------------------------------
    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

//----------------------------------------------------------------------------------------------------------------------
    public static int[] map2(int[] arr) {
        return Arrays.stream(arr).map(x -> x * 2).toArray();
    }
//----------------------------------------------------------------------------------------------------------------------
}

