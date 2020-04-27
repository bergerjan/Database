import java.io.*;
import java.util.ArrayList;

public class AddMethod {
    public static boolean addThings(String Brand, String Model, String Type) {

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

        FileWriter fw;
        try {
            fw = new FileWriter(new File("GCData.db"));

            fw.write(Brand);
            fw.write(", ");
            fw.write(Model);
            fw.write(", ");
            fw.write(Type);
            fw.write(System.lineSeparator());
            //fw.write(line1);

            for (String s : line1) {

                fw.write(s);
                fw.write(System.lineSeparator());

            }
            fw.close();

        } catch (IOException el) {
            el.printStackTrace();
        }


    return true;
}
}
