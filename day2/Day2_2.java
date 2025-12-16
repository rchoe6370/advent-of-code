package day2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day2_2 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("day2/input2.txt");
        Scanner sc = new Scanner(file);

        String line = sc.nextLine();
        String[] ranges = line.split(",");
        String range = "";
        String low = "";
        String high = "";
        long id = 0;
        long sum = 0;

        for(int i = 0; i < ranges.length; i++) {
            range = ranges[i];
            
            low = range.split("-")[0];
            high = range.split("-")[1]; 

            for(int j = 0; j <= Long.parseLong(high) - Long.parseLong(low); j++) {
                id = Long.parseLong(low) + j;

                String s = String.valueOf(id);
                int mid = s.length() / 2;
                int len = s.length();

                Boolean valid = false;

                for(int patt = 1; patt <= mid; patt++) {
                    if(len % patt == 0) {
                        String pattern = s.substring(0, patt);
                        String test = "";
                        int repeats = len / patt;

                        for(int r = 0; r < repeats; r++) {
                            test += pattern;
                        }

                        if(test.equals(s)) {
                            valid = true;
                            break;
                        }
                    }
                }

                if(valid) {
                    sum += id;
                } 
            }
        }

        System.out.println("Sum: " + sum);
        sc.close();
    }
    
}
