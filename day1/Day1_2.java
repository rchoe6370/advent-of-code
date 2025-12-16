package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1_2 {
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
                for(int i = 0; i < rotation; i++) {
                    pos--;
                    if(pos < 0) {
                        pos = 99;
                    }
                    if(pos == 0) {
                        zeroCount++;
                    }
                }

            } else {
                for(int i = 0; i < rotation; i++) {
                    pos++;
                    if(pos > 99) {
                        pos = 0;
                    }

                    if(pos == 0) {
                        zeroCount++;
                    }
                }
            }

        
        }

        System.out.println("Password: " + zeroCount);

        sc.close();
    }
}
