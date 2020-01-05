package semistral;

import java.util.ArrayList;
import java.util.Scanner;

public class Semistral {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isGoing = true;
        String button;
        
        OUTER:
        while (isGoing) {
            System.out.println("Pokracovat ve spracovani (a/n):");
            button = sc.next().toLowerCase();
            switch (button) {
                case "a":
                    inputSecuenses();
                    break;
                case "n":
                    System.out.println("Good buy");
                    break OUTER;
                default:
                    System.out.println("Incorrect type. Try again...");
                    break;
            }
        }   
    }
    
    private static void inputSecuenses (){
        System.out.println("Zadey prvni posloupnost:");
        ArrayList<Integer> list_1 = new ArrayList<>();
        int num_1 = 0;
        while (num_1 >= 0) {
            num_1 = sc.nextInt();
            list_1.add(num_1);
        }
        System.out.println("Zadey druhou posloupnost:");
        ArrayList<Integer> list_2 = new ArrayList<>();
        int num_2 = 0;
        while (num_2 >= 0) {
            num_2 = sc.nextInt();
            list_2.add(num_2);
        }
        mainLogic(list_1, list_2);
    }
    
    private static void mainLogic (ArrayList<Integer> list_1, ArrayList<Integer> list_2){
        int firstSize = list_1.size();
        int secondSize = list_2.size();
        int max = 0;
        
        int[][] dp = new int[firstSize][secondSize];
        
        for (int i = 0; i < firstSize; i++) {
            for (int j = 0; j < secondSize; j++) { 
                if(!list_1.get(i).equals(list_2.get(j))){
		} else {
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j] = dp[i-1][j-1]+1;
                    }

                    if(max < dp[i][j])
                        max = dp[i][j];
                }
            }
        }
        System.out.println("Nejdelsi spolecny usek obou poslopnosti ma delku: " + max);
    }
}
