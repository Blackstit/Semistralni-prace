package semistral;

import java.util.ArrayList;
import java.util.Scanner;

public class Semistral {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        inputSecuenses();
    }
    
    public static void inputSecuenses (){
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
        outputData(list_1, list_2);
    }
    
    public static void outputData(ArrayList<Integer> list_1, ArrayList<Integer> list_2){
        System.out.println(list_1.toString());
        System.out.println(list_2.toString());
    }
    
    public static int getLongestCommonSubstring(String a, String b){
	int m = a.length()-3;
	int n = b.length()-3;
 
	int max = 0;
 
	int[][] dp = new int[m][n];
 
	for(int i=0; i<m; i++){
		for(int j=0; j<n; j++){
			if(a.charAt(i) == b.charAt(j)){
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
	return max;
    }
    
}
