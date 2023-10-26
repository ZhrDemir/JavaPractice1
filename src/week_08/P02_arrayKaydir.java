package week_08;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class P02_arrayKaydir {
    public static void main(String[] args) {

        /*

Verilen bir array'deki tum elementleri bir saga kaydirip, sondaki elementi de
basa tasiyacak bir method olusturun, array'i yeni haliyle kaydedin.
Orn : input : [4,5,6,7] array'in son hali. : [7,4,5,6]
 */
         int [] arr ={4,5,6,7};
        elementleriSagaKaydir(arr);





    }

    private static void elementleriSagaKaydir(int [] arr) {

        int [] yeniArr =new int[arr.length];
        yeniArr[0] = arr[arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {
            yeniArr[i+1] = arr[i];
        }
        System.out.println("Input : "+ Arrays.toString(arr));
          arr = yeniArr;
        System.out.println("array'in sağa kaydırılmış hali : Output : " + Arrays.toString(arr));



    }
}
