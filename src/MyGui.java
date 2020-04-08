import javax.swing.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

public class MyGui {
    private JPanel panel1;
    private JButton button1;
    private JLabel label;

    public MyGui() throws Exception{
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file = new File("GCData.db");

                BufferedReader br = null;
                String line = null;

                //String brand = line.substring(1, 19);
                double num;
               //num = Double.parseDouble(line.substring(20, 43).trim());
                try {
                    br = new BufferedReader(new FileReader(file));

                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                        label.setText(line);
                        //System.out.println(brand);
                        //System.out.println(num);
                    }
                }  catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("App");
        frame.setContentPane(new MyGui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
/*
catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
                catch (NullPointerException el) {
                    el.printStackTrace();
                }
        */