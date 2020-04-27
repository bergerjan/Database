
import java.io.*;
import java.util.Scanner;

public class DelMethod {
    public static boolean delThings (String Brand, String Model, String Type) {

        String currentLine = "";
        String userString;
        File myTextFile = new File("GCData.db");
        String tempString = "";
        String inputString = "";
        File tempFile = new File("random");

        try
        {
            File newFile = new File("newFile.txt");
            FileWriter newwriter = new FileWriter(newFile, true);
            if(newFile.exists() == false) {
                newFile.createNewFile();
            }

            Scanner sc = new Scanner(myTextFile);

            while (sc.hasNextLine())
            {
                inputString = Brand.toLowerCase();
                userString = sc.nextLine();
                tempString = userString.toLowerCase();

                if (tempString.contains(inputString)) {

                    userString = "";
                    System.out.println("Record deleted");

                    return(true);
                } else {
                    System.out.println(tempString + '\n');
                    newwriter.write(tempString + '\n');
                }
            }

            newwriter.close();
            newwriter.flush();
            newFile.renameTo(myTextFile);

            System.out.println();

        }
        catch (IOException ex)
        {
            System.out.println("File Exception: " + ex);
        }
        return(false);
    }
}
