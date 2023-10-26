package week_07;

import java.util.Arrays;

public class P03_arrays {

    public static void main(String[] args) {

        int [] arr = {12,25,36,48,25};

        System.out.println(Arrays.toString(arr));

        /* Ödev

        verilen bir int arr yi tüm elemanlarını 2 artırıp bize döndüren bir method oluşturun.
        eskiarrayi yeni haliyle kaydedin

         */

        System.out.println(Arrays.toString(ikiArtir(arr)));

    }

    private static int [] ikiArtir(int[] arr) {



        for (int i = 0; i < arr.length; i++) {
             arr[i]= arr [i] + 2;

        }
        return arr;
    }

}
