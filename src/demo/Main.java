package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

File file = new File("/Users/Ozcan/Textfile.txt");
Scanner scan = new Scanner(file);
        System.out.println(scan.nextLine());

    }
}
