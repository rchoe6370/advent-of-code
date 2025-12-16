package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1_1 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("day1/input.txt");
        Scanner sc = new Scanner(file);

        int zeroCount = 0;
        int pos = 50;

        while(sc.hasNextLine()) {

            String line = sc.nextLine(); 

            String direction = line.substring(0, 1);
            int rotation = Integer.valueOf(line.substring(1));
            
            if(direction.equals("L")) {
                pos = pos - rotation;
                pos = pos % 100;

                if(pos < 0) {
                    pos = pos + 100;
                }
            } else {
                pos = pos + rotation;
                pos = pos % 100;
            }


            if(pos == 0) {
                zeroCount++;
            }

        
        }

        System.out.println("Password: " + zeroCount);

        sc.close();
    }


}