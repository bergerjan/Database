import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class SearchMethod {
    public static boolean searchThing(String Brand){

        BufferedReader readFile = null;

        try {
            readFile = new BufferedReader(new FileReader("GCData.db"));
            String line;
            String input = "";


            String data = readFile.readLine();

            while ((line = readFile.readLine()) != null) {

                //split string by comma
                String[] dataparts = data.split( "," );

                //print parts
                for(String part : dataparts)
                    System.out.println(part);

                System.out.println(data.contains(Brand));

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
