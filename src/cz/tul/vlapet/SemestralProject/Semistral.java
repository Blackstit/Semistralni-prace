package cz.tul.vlapet.SemestralProject;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * 
 * @author Vladislav Petrushkin
 */
public class Semistral {
    public static Scanner sc = new Scanner(System.in);
    
    /** Main menu for navigating the program
     * @param args */
    
    public static void main(String[] args) {
        readHelp(); // read help file
        boolean isGoing = true;
        OUTER:
        while (isGoing){
        System.out.print("[MENU] Select a program: ");
        String type = sc.next().toLowerCase();
           switch (type) {
                case "a":
                    Euler.multiplierSearch();
                    
                    break;
                case "b":
                    LongestCommon.inputSecuenses();
                    break;
                case "exit":
                    break OUTER;
                case "--help":
                    readHelp();
                    break;
                default:
                    System.out.print("This command does not exist. Please try again: ");
            } 
        }
    }
    /** read the file character by character */
    private static void readHelp(){       
        try(FileReader reader = new FileReader("help.txt")){
            int c;
            while((c=reader.read())!=-1){        
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){    
            System.out.println(ex.getMessage());
        }   
    }    
}
