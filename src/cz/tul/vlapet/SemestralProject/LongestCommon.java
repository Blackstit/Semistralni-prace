package cz.tul.vlapet.SemestralProject;

import java.util.ArrayList;

/**
 * Longest Common Subsequence Semester Search Program
 * @author Vladislav Petrushkin
 */
public class LongestCommon extends Semistral{
    private static void longestCommonSubsequence() { // simple menu for navigation
        boolean isDo = true;
        
        OUTER:
        while (isDo) {
            System.out.print("Continue processing? (y/n):");
            String button = sc.next().toLowerCase();
            switch (button) {
                case "y":
                    inputSecuenses();
                    break;
                case "n":   // exit to main menu
                    break OUTER; 
                default:
                    System.out.print("Error: Please type \"a\" or \"n\" ");
                
            }
        }   
    }
    /** type-checking data entry */
    protected static void inputSecuenses (){
        System.out.println("Enter the first sequence:");
        ArrayList<Integer> list_1 = new ArrayList<>();
        int num_1 = 0;
        
        while (num_1 >= 0) {   // check that the number is positive
            if(!sc.hasNextInt()) {  // check that there was a NUMBER!
                System.out.println("That's not a number!");
                sc.next(); // this is important!
                
            }else{
                num_1 = sc.nextInt();
                list_1.add(num_1);  // add number to the ArrayList one
            }
        }
        
        System.out.println("Enter the second sequence:");
        ArrayList<Integer> list_2 = new ArrayList<>();
        
        int num_2 = 0;
        while (num_2 >= 0) { // check that the number is positive
            if(!sc.hasNextInt()) { // check that there was a NUMBER!
                System.out.println("That's not a number!");
                sc.next(); // this is important!
                
            }else{
                num_2 = sc.nextInt();
                list_2.add(num_2);  // add number to the ArrayList two
            }
        }
        mainLogic(list_1, list_2);
    }
    
    /** main program logic */
    private static void mainLogic (ArrayList<Integer> list_1, ArrayList<Integer> list_2){
        int firstSize = list_1.size()-1;    // find out the size of the field without the last negative number
        int secondSize = list_2.size()-1;   // find out the size of the field without the last negative number
        int max = 0; // counter
        
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
        System.out.println("The longest common section: " + max);
        longestCommonSubsequence();
    }
}
