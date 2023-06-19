import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        //We ask the user to enter the Arrays length
       System.out.println("Dizi Uzunluğunu Giriniz \t.:");
        int b = input.nextInt();
        int [] arrays = new int[b];

        //Adding the numbers entered by the user to the array
        for(int i=0; i<arrays.length; i++){
            System.out.print(i+1 + ". sayıyı giriniz \t.:");
            arrays[i] = input.nextInt();
        }

        //We sort our array from smallest to largest
        Arrays.sort(arrays);
        System.out.print("Küçükten Büyüğe Sıralama \t .:" + Arrays.toString(arrays));

    }
}