import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;

public class SearchMethod {
    public static boolean searchThing(String Brand){
        try {
            BufferedReader readFile = new BufferedReader(new FileReader("GCData.db"));
            String line;
            String input = "";

            while ((line = readFile.readLine()) != null) {

                System.out.println(line.contains(Brand));

                if (line.contains(Brand)) {

                    System.out.println("Record found.");
                    return (true);
                }
                input += line + '\n';
            }

            FileOutputStream writeFile = new FileOutputStream("GCData.db");
            writeFile.write(input.getBytes());
            readFile.close();
            writeFile.close();

        } catch(Exception e){

            System.out.println("Problem reading this file");

        }
        return (false);
    }
}
