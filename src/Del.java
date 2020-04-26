import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Del extends JFrame {

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
    public Del() {
        //set frame title
        setTitle("Del");
        //set default close operation
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //set bounds of the frame
        setBounds(100, 100, 450, 300);

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

        //set Label in the frame
        JLabel lblName = new JLabel("Student Name:");
        //set foreground color to the label
        lblName.setForeground(Color.DARK_GRAY);
        //set font of that label
        lblName.setFont(new Font("Times New Roman", Font.CENTER_BASELINE | Font.PLAIN, 16 ));
        //set bound of the label
        lblName.setBounds(10,10,239,39);
        //add label to the contentPane
        contentPane.add(lblName);

        //set TextField in the frame
        JTextField txtFld1 = new JTextField();
        //set font of that textField
        txtFld1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE | Font.PLAIN, 16));
        //set bounds of that textField
        txtFld1.setBounds(130, 10, 239, 39);
        //add label to that contentPane
        contentPane.add(txtFld1);

        //set Label in the frame
        JLabel lblGradYr = new JLabel("Graduation YR:");
        //set foreground color to the label
        lblGradYr.setForeground(Color.DARK_GRAY);
        //set font of that label
        lblGradYr.setFont(new Font("Times New Roman", Font.CENTER_BASELINE | Font.PLAIN, 16));
        //set bound of the label
        lblGradYr.setBounds(10, 50, 239, 39);
        //add label to the contentPane
        contentPane.add(lblGradYr);

        //set TextField in the frame
        JTextField txtFld2 = new JTextField();
        //set font of that textField
        txtFld2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE | Font.PLAIN, 16));
        //set bounds of that textField
        txtFld2.setBounds(130, 50, 239, 39);
        //add label to that contentPane
        contentPane.add(txtFld2);

        //set Label in the frame
        JLabel lblDOB = new JLabel("Date of Birth:");
        //set foreground color to the label
        lblDOB.setForeground(Color.DARK_GRAY);
        //set font of that label
        lblDOB.setFont(new Font("Times New Roman", Font.CENTER_BASELINE | Font.PLAIN, 16));
        //set bound of the label
        lblDOB.setBounds(10, 90, 239, 39);
        //add label to the contentPane
        contentPane.add(lblDOB);

        //set TextField in the frame
        JTextField txtFld3 = new JTextField();
        //set font of that textField
        txtFld3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE | Font.PLAIN, 16));
        //set bounds of that textField
        txtFld3.setBounds(130, 90, 239, 39);
        //add label to that contentPane
        contentPane.add(txtFld3);

        //set Label in the frame
        JLabel lblGPA = new JLabel("GPA:");
        //set foreground color to the label
        lblGPA.setForeground(Color.DARK_GRAY);
        //set font of that label
        lblGPA.setFont(new Font("Times New Roman", Font.CENTER_BASELINE | Font.PLAIN, 16));
        //set bound of the label
        lblGPA.setBounds(10, 130, 239, 39);
        //add label to the contentPane
        contentPane.add(lblGPA);

        //set TextField in the frame
        JTextField txtFld4 = new JTextField();
        //set font of that textField
        txtFld4.setFont(new Font("Times New Roman", Font.CENTER_BASELINE | Font.PLAIN, 16));
        //set bounds of that textField
        txtFld4.setBounds(130, 130, 239, 39);
        //add label to that contentPane
        contentPane.add(txtFld4);


        //add actionListener
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //call the object of Menu and set visible true
                Menu frame = new Menu();
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

            }
        });
    }
}
