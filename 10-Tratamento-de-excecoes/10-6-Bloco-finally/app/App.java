package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        File file = new File("in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException e){
            System.out.println("ERROR opeing file: " + e.getMessage());
        }finally {
            if(sc != null){
                sc.close();
            }
            System.out.println("FINALLY ok");
        }
    }
}
