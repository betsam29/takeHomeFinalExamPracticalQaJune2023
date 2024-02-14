package ExistenceOfPath;

import java.io.File;
import java.util.Scanner;

public class FilePathExistenceChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Pleas enter the File Path: ");
        String path = scanner.nextLine();

        if (doesFileExist(path)) {
            System.out.println("The File do exsist");
        } else {
            System.out.println("The File do not exist");
        }
    }

    public static boolean doesFileExist(String path) {
        try {
            File file = new File(path);
            return file.exists();
        } catch (Exception e) {
            System.out.println("Occurred error while checking of the File: " + e.getMessage());
            return false;
        }
    }	
		

	}


