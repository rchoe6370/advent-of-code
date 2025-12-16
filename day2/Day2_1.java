package day2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day2_1 {
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

                if(s.length() % 2 == 0 && s.substring(0, mid).equals(s.substring(mid))) {
                    sum += id;
                } 
            }
        }

        System.out.println("Sum: " + sum);
        sc.close();
    }
    
}
