import java.io.*;

public class AddMethod {
    public static boolean addThings(String Brand, String Model, String Type) {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("GCData.db"));
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
        fw.close();

        return(true);

    } catch (IOException el) {
        el.printStackTrace();
    }


    return(false);
}
}
