import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

public class MyGui extends JFrame {
    private JPanel contentPane;
    private JButton button1;
    private JLabel label;

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                try {
                    MyGui frame = new MyGui();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MyGui() {
        //set frame title
        setTitle("Menu");
        //set default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //set bounds of the frame
        setBounds(100, 100, 450, 300);
        //create object of JPanel
        contentPane = new JPanel();
        //set color of background
        contentPane.setBackground(Color.lightGray);
        //set border
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        //set ContentPane
        setContentPane(contentPane);
        //set null
        contentPane.setLayout(null);

        //create object of JButton and set label on it
        JButton btnAdd = new JButton("Add");
        //set font of the Button
        btnAdd.setFont(new Font("Add", Font.BOLD, 16));
        //set bounds of the Button
        btnAdd.setBounds(15, 215, 100, 25);
        //add Button into contentPane
        contentPane.add(btnAdd);

        //create object of JButton and set label on it
        JButton btnDel = new JButton("Del");
        //set font of the Button
        btnDel.setFont(new Font("Del", Font.BOLD, 16));
        //set bounds of the Button
        btnDel.setBounds(122, 215, 100, 25);
        //add Button into contentPane
        contentPane.add(btnDel);

        //create object of JButton and set label on it
        JButton btnSearch = new JButton("Search");
        //set font of the Button
        btnSearch.setFont(new Font("Search", Font.BOLD, 16));
        //set bounds of the Button
        btnSearch.setBounds(230, 215, 100, 25);
        //add Button into contentPane
        contentPane.add(btnSearch);

        //create object of JButton and set label on it
        JButton btnEdit = new JButton("Edit");
        //set font of the Button
        btnEdit.setFont(new Font("Edit", Font.BOLD, 16));
        //set bounds of the Button
        btnEdit.setBounds(337, 215, 100, 25);
        //add Button into contentPane
        contentPane.add(btnEdit);

        //create object of JButton and set label on it
        JButton btnQuit = new JButton("Quit");
        //set font of the Button
        btnQuit.setFont(new Font("Quit", Font.BOLD, 16));
        //set bounds of the Button
        btnQuit.setBounds(337, 250, 100, 25);
        //add Button into contentPane
        contentPane.add(btnQuit);

        //set Label in the frame
        JLabel lblStartMessage = new JLabel("Welcome to Thornton Academy Student Database");
        //set foreground color to the label
        lblStartMessage.setForeground(Color.RED);
        //set font of that label
        lblStartMessage.setFont(new Font("Times New Roman", Font.CENTER_BASELINE | Font.BOLD, 18));
        //set bound of the label
        lblStartMessage.setBounds(20, 30, 500, 39);
        //add label to the contentPane
        contentPane.add(lblStartMessage);

        //set Label in the frame
        JLabel lblMessage = new JLabel("Select the action you want to perform");
        //set foreground color to the label
        lblMessage.setForeground(Color.BLUE);
        //set font of that label
        lblMessage.setFont(new Font("Times New Roman", Font.CENTER_BASELINE | Font.BOLD, 18 ));
        //set bound of the label
        lblMessage.setBounds(20,170,400,39);
        //add label to the contentPane
        contentPane.add(lblMessage);

        //add actionListener
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //call the object of NewWindow and set visible true
                Add frame = new Add();
                //make frame visible
                frame.setVisible(true);
                //set default location of frame
                frame.setLocationRelativeTo(null);
                //set default close operation
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                try {

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        //add actionListener
        btnDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //call the object of NewWindow and set visible true
                Del frame = new Del();
                //make frame visible
                frame.setVisible(true);
                //set default location of frame
                frame.setLocationRelativeTo(null);
                //set default close operation
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                try {

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });
        //add actionListener
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //call the object of NewWindow and set visible true
                Search frame = new Search();
                //make frame visible
                frame.setVisible(true);
                //set default location of frame
                frame.setLocationRelativeTo(null);
                //set default close operation
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                try {

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });
        //add actionListener
        btnEdit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //call the object of NewWindow and set visible true
                Edit frame = new Edit();
                //make frame visible
                frame.setVisible(true);
                //set default location of frame
                frame.setLocationRelativeTo(null);
                //set default close operation
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                try {

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        //add actionListener
        btnQuit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                System.exit(0);
            }
        });
    }
}

