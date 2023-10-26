package week_08;

import java.util.Arrays;

public class P03_MDArray {
    public static void main(String[] args) {


/*
Verilen 2 katli bir array'de ayni index'e sahip elementleri toplayip, yeni
olusturacagimiz tek katli bir array'e bu toplamlari atayin.
input : int[][] arr = {{3,4,5}, {2,3,6,7}};
output: [5, 7, 11]
 */

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};

        int enKucukIndex = arr[0].length; // başlangıç noktası

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length < enKucukIndex) { // en küçük indexi araştırıyoruz
                enKucukIndex = arr[i].length;
            }
        }
        int toplam = 0;
        int[] yeniarr = new int[enKucukIndex];
        for (int i = 0; i < yeniarr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                toplam += arr[j][i];


            }
            yeniarr[i] = toplam;
            toplam=0;
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("-----------------------------");
        System.out.println(Arrays.toString(yeniarr));
    }
}