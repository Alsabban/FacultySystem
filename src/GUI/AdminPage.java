/*
 * Created by JFormDesigner on Wed Dec 30 15:50:53 EET 2020
 */

package GUI;

import Users.Admin;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author 3enwanak
 */
public class AdminPage extends JFrame {
Admin admin;
    public AdminPage(Admin admin) {
this.admin=admin;
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button1MouseEntered(MouseEvent e) {
        button1.setBackground(new Color(6,96,159));
    }

    private void button1MouseExited(MouseEvent e) {
        button1.setBackground(Color.white);
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button3MouseEntered(MouseEvent e) {
        button3.setBackground(new Color(6,96,159));
    }

    private void button3MouseExited(MouseEvent e) {
        button3.setBackground(Color.white);
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button4MouseEntered(MouseEvent e) {
        
    }

    private void button4MouseExited(MouseEvent e) {
        // TODO add your code here
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button2MouseEntered(MouseEvent e) {
        button2.setBackground(new Color(6,96,159));
    }

    private void button2MouseExited(MouseEvent e) {
        button2.setBackground(Color.white);
    }

    private void button5ActionPerformed(ActionEvent e) {
        Login login = new Login();
        login.setVisible(true);
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }

    private void button1ActionPerformed(ActionEvent e) {
        CreateStudent createStudent = new CreateStudent();
        createStudent.setVisible(true);
        
    }

    private void button2ActionPerformed(ActionEvent e) {
        CreateCourse createCourse = new CreateCourse();
        createCourse.setVisible(true);
    }

    private void button3ActionPerformed(ActionEvent e) {
        CreateProfessor createProfessor = new CreateProfessor();
        createProfessor.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 3enwanak
        panel1 = new JPanel();
        button5 = new JButton();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setForeground(new Color(0, 255, 204));
            panel1.setBackground(Color.lightGray);
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
            EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border . TitledBorder. CENTER ,javax . swing
            . border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog", java .awt . Font. BOLD ,12 ) ,
            java . awt. Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
            { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName () ) )
            throw new RuntimeException( ) ;} } );

            //---- button5 ----
            button5.setText("Logout");
            button5.setBackground(new Color(6, 96, 159));
            button5.setForeground(Color.white);
            button5.addActionListener(e -> button5ActionPerformed(e));

            //---- button1 ----
            button1.setIcon(new ImageIcon(getClass().getResource("/GUI/user.png")));
            button1.setBackground(Color.white);
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    button1MouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    button1MouseExited(e);
                }
            });
            button1.addActionListener(e -> button1ActionPerformed(e));

            //---- button2 ----
            button2.setIcon(new ImageIcon(getClass().getResource("/GUI/course.png")));
            button2.setBackground(Color.white);
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    button2MouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    button2MouseExited(e);
                }
            });
            button2.addActionListener(e -> button2ActionPerformed(e));

            //---- button3 ----
            button3.setIcon(new ImageIcon(getClass().getResource("/GUI/user.png")));
            button3.setBackground(Color.white);
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    button3MouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    button3MouseExited(e);
                }
            });
            button3.addActionListener(e -> button3ActionPerformed(e));

            //---- label3 ----
            label3.setText("Register Student");
            label3.setForeground(Color.black);
            label3.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label4 ----
            label4.setText("Register Course");
            label4.setForeground(Color.black);
            label4.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label5 ----
            label5.setText("Register Professor");
            label5.setForeground(Color.black);
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //======== panel2 ========
            {
                panel2.setBackground(new Color(6, 96, 159));

                //---- label2 ----
                label2.setText("Welcome Admin!");
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
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(button5)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(button3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62))))
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(label5)
                            .addComponent(label4))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(button5)
                        .addGap(40, 40, 40))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 3enwanak
    private JPanel panel1;
    private JButton button5;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JPanel panel2;
    private JLabel label2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
