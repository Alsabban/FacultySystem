/*
 * Created by JFormDesigner on Mon Dec 28 20:21:26 EET 2020
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.plaf.synth.SynthOptionPaneUI;

//import GUI.IDandPasswords;
import System.SystemData;
import Users.Admin;
//import static GUI.IDandPasswords.logininfo;
import static System.SystemData.*;
import static java.lang.Integer.parseInt;

/**
 * @author 3enwanak
 */
public class Login extends JFrame {
    public Login() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        String userID = textField1.getText();
        String password = String.valueOf(passwordField1.getPassword());
        if(SystemData.logininfo.containsKey(userID)){
            if(SystemData.logininfo.get(userID).equals(password)) {

                this.setVisible(false);
                if(parseInt(SystemData.logininfo.get(userID))>1000 && parseInt(SystemData.logininfo.get(userID))<2000){

                    for(int i = 0 ; i<students.size() ; i++){
                        if(students.get(i).getID() == Integer.parseInt(userID)){

                            StudentPage studentPage = new StudentPage(students.get(i));
                            studentPage.setVisible(true);
                            studentPage.setDefaultCloseOperation(EXIT_ON_CLOSE);
                            break;
                        }


                    }
                }else if(parseInt(SystemData.logininfo.get(userID))>2000 && parseInt(SystemData.logininfo.get(userID))<3000){

                    for(int i = 0 ; i<professors.size() ; i++){
                        if(professors.get(i).getID() == Integer.parseInt(userID)){

                            ProfessorPage professorPage = new ProfessorPage(professors.get(i));
                            professorPage.setVisible(true);
                            professorPage.setDefaultCloseOperation(EXIT_ON_CLOSE);
                            break;
                        }


                    }
                }else if(parseInt(SystemData.logininfo.get(userID))==3001 ){
                    for(int i = 0 ; i<admins.size() ; i++){
                        if(admins.get(i).getID() == Integer.parseInt(userID)){

                            AdminPage adminPage = new AdminPage(admins.get(i));
                            adminPage.setVisible(true);
                            adminPage.setDefaultCloseOperation(EXIT_ON_CLOSE);
                            break;
                        }


                    }

                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Wrong Password");
            }

        }
        else {
          JOptionPane.showMessageDialog(null,"Username Not Found");
        }
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 3enwanak
        panel1 = new JPanel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label1 = new JLabel();
        panel3 = new JPanel();
        label3 = new JLabel();
        label4 = new JLabel();
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setForeground(new Color(0, 255, 204));
            panel1.setBackground(Color.lightGray);
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
            swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border
            . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog"
            , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) ,panel1. getBorder
            () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
            . beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException
            ( ) ;} } );

            //======== panel2 ========
            {
                panel2.setBackground(new Color(6, 96, 159));

                //---- label2 ----
                label2.setText("Welcome To Faculty Of Engineering Ain Shams University");
                label2.setForeground(Color.black);
                label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.BOLD, label2.getFont().getSize() + 5f));
                label2.setBackground(new Color(0, 51, 255));
                label2.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label1 ----
                label1.setIcon(new ImageIcon(getClass().getResource("/GUI/asu scaled.png")));

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(21, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                );
            }

            //======== panel3 ========
            {
                panel3.setBackground(Color.white);
                panel3.setForeground(Color.white);

                //---- label3 ----
                label3.setText("ID:");
                label3.setForeground(Color.black);
                label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 7f));
                label3.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label4 ----
                label4.setText("Password:");
                label4.setForeground(Color.black);
                label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 7f));
                label4.setHorizontalAlignment(SwingConstants.CENTER);

                //---- textField1 ----
                textField1.setBackground(Color.white);
                textField1.setForeground(Color.black);

                //---- passwordField1 ----
                passwordField1.setBackground(Color.white);
                passwordField1.setForeground(Color.black);

                //---- button1 ----
                button1.setText("Login");
                button1.setBackground(new Color(6, 96, 159));
                button1.setForeground(Color.white);
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button1MouseClicked(e);
                    }
                });

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label4, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                .addComponent(label3, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel3Layout.createParallelGroup()
                                .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                            .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                            .addContainerGap(160, Short.MAX_VALUE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                            .addGap(146, 146, 146))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addGroup(panel3Layout.createParallelGroup()
                                .addComponent(label3)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label4)
                                .addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addComponent(button1)
                            .addContainerGap(50, Short.MAX_VALUE))
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 81, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 3enwanak
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label2;
    private JLabel label1;
    private JPanel panel3;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
