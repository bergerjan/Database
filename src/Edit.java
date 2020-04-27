import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Edit extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {

        /* It posts an event (Runnable)at the end of Swings event list and is
		processed after all other GUI events are processed.*/
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                try {

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Edit() {
        //set frame title
        setTitle("View");
        //set default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //set bounds of the frame
        setBounds(100, 100, 464, 350);

        //create object of JPanel
        contentPane = new JPanel();
        //set border
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        //set ContentPane
        setContentPane(contentPane);
        //set null
        contentPane.setLayout(null);

        //create object of JButton and set label on it
        JButton btnCancel = new JButton("Cancel");
        //set font of the Button
        btnCancel.setFont(new Font("Cancel", Font.BOLD, 16));
        //set bounds of the Button
        btnCancel.setBounds(10, 250, 98, 25);
        //add Button into contentPane
        contentPane.add(btnCancel);

        //create object of JButton and set label on it
        JButton btnQuit = new JButton("Quit");
        //set font of the Button
        btnQuit.setFont(new Font("Quit", Font.BOLD, 16));
        //set bounds of the Button
        btnQuit.setBounds(337, 250, 100, 25);
        //add Button into contentPane
        contentPane.add(btnQuit);

        //create object of JButton and set label on it
        JButton btnSubmit = new JButton("Submit");
        //set font of the Button
        btnSubmit.setFont(new Font("Submit", Font.BOLD, 16));
        //set bounds of the Button
        btnSubmit.setBounds(180, 250, 100, 25);
        //add Button into contentPane
        contentPane.add(btnSubmit);


        //add actionListener
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //call the object of Menu and set visible true
                MyGui frame = new MyGui();
                //make frame visible
                frame.setVisible(true);
                //set default location of frame
                frame.setLocationRelativeTo(null);
                //set default close operation
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
        //add actionListener
        btnQuit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //Exit program
                System.exit(0);
            }
        });
        //add actionListener
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String brand = "";
                String model = "";
                String type = "";

                if(EditMethod.viewThings(brand, model, type)) {

                    System.out.println("Displaying: Brands, Models, Types");

                } else {
                    System.out.println("Did not display");
                }

            }
        });
    }


}
