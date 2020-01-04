package semistral;

import java.util.ArrayList;
import java.util.Scanner;

public class Semistral {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        zadej();
    }
    
    public static void zadej (){
        ArrayList<Integer> list_1 = new ArrayList<>();
        int num_1 = 0;
        while (num_1 >= 0) {
            num_1 = sc.nextInt();
            list_1.add(num_1);
        }
        ArrayList<Integer> list_2 = new ArrayList<>();
        int num_2 = 0;
        while (num_2 >= 0) {
            num_2 = sc.nextInt();
            list_2.add(num_2);
        }
        posloupnosti(list_1, list_2);
    }
    
    public static void posloupnosti(ArrayList<Integer> list_1, ArrayList<Integer> list_2){
        System.out.println(list_1.toString());
        System.out.println(list_2.toString());
    }
}
