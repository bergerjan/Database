import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EditMethod {
    public static boolean viewThings(String Brand, String Model, String Type) {

        ArrayList<String> line1 = new ArrayList<>();

        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader("GCData.db"));

            while(true) {

                String line2 = "";
                line2 = br.readLine();

                if(line2 == null) {
                    break;
                }
                line1.add(line2);
            }

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return true;
    }
}
