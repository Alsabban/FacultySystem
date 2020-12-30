/*
 * Created by JFormDesigner on Mon Dec 28 21:34:05 EET 2020
 */

package GUI;

import Users.Student;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author 3enwanak
 */
public class StudentPage extends JFrame {
    Student student ;
    public StudentPage(Student student) {

        this.student=student;
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {

        RegisterCourse registerCourse = new RegisterCourse(student);

        registerCourse.setVisible(true);

    }

    private void button3MouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Grades: " + student.getGrades() + "\nGPA: " +student.calculateGPA());
    }

    private void button2MouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Total Credit Hours: "+ student.calculateCreditHours()+ "\nTotal Tuition Fees: " + student.getTotalFees() + "$");
    }

    private void button4MouseClicked(MouseEvent e) {
        ArrayList<String> c=new ArrayList<String>();
        for(int i=0;i<student.getCourses().size();i++){
           c.add( student.getCourses().get(i).getName());
        }
        JOptionPane.showMessageDialog(null,"Courses Registered: " + c);
    }

    private void button1MouseEntered(MouseEvent e) {
        button1.setBackground(new Color(6,96,159));
    }

    private void button1MouseExited(MouseEvent e) {
        button1.setBackground(Color.white);
    }

    private void button3MouseEntered(MouseEvent e) {
        button3.setBackground(new Color(6,96,159));
    }

    private void button3MouseExited(MouseEvent e) {
        button3.setBackground(Color.white);
    }

    private void button2MouseEntered(MouseEvent e) {
        button2.setBackground(new Color(6,96,159));
    }

    private void button2MouseExited(MouseEvent e) {
        button2.setBackground(Color.white);
    }

    private void button4MouseEntered(MouseEvent e) {
        button4.setBackground(new Color(6,96,159));
    }

    private void button4MouseExited(MouseEvent e) {
        button4.setBackground(Color.white);
    }

    private void button5ActionPerformed(ActionEvent e) {
        Login login = new Login();
        login.setVisible(true);
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 3enwanak
        panel1 = new JPanel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label1 = new JLabel();
        button1 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        button2 = new JButton();
        label6 = new JLabel();
        button5 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setForeground(new Color(0, 255, 204));
            panel1.setBackground(Color.lightGray);
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder (
            new javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion"
            , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM
            , new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 )
            ,java . awt. Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener(
            new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
            ) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
            ;} } );

            //======== panel2 ========
            {
                panel2.setBackground(new Color(6, 96, 159));

                //---- label2 ----
                label2.setText("Welcome " + student.getName());
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
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 468, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(37, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
            }

            //---- button1 ----
            button1.setIcon(new ImageIcon(getClass().getResource("/GUI/add.png")));
            button1.setBackground(Color.white);
            button1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button1MouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    button1MouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    button1MouseExited(e);
                }
            });

            //---- button3 ----
            button3.setIcon(new ImageIcon(getClass().getResource("/GUI/reserve.png")));
            button3.setBackground(Color.white);
            button3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button3MouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    button3MouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    button3MouseExited(e);
                }
            });

            //---- button4 ----
            button4.setIcon(new ImageIcon(getClass().getResource("/GUI/course.png")));
            button4.setBackground(Color.white);
            button4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button4MouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    button4MouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    button4MouseExited(e);
                }
            });

            //---- label3 ----
            label3.setText("Register Course");
            label3.setForeground(Color.black);
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 2f));
            label3.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label4 ----
            label4.setText("View Grades");
            label4.setForeground(Color.black);
            label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 2f));
            label4.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label5 ----
            label5.setText("Tuition Fees");
            label5.setForeground(Color.black);
            label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 2f));
            label5.setHorizontalAlignment(SwingConstants.CENTER);

            //---- button2 ----
            button2.setIcon(new ImageIcon(getClass().getResource("/GUI/user.png")));
            button2.setBackground(Color.white);
            button2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button2MouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    button2MouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    button2MouseExited(e);
                }
            });

            //---- label6 ----
            label6.setText("View Courses");
            label6.setForeground(Color.black);
            label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 2f));
            label6.setHorizontalAlignment(SwingConstants.CENTER);

            //---- button5 ----
            button5.setText("Logout");
            button5.setBackground(new Color(6, 96, 159));
            button5.setForeground(Color.white);
            button5.addActionListener(e -> button5ActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(label5, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(button2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(button1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(button3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(button5)
                                .addGap(103, 103, 103)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label3)
                            .addComponent(label4))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(label6))
                                .addGap(38, 38, 38))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(button5)
                                .addGap(15, 15, 15))))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
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
    private JButton button1;
    private JButton button3;
    private JButton button4;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JButton button2;
    private JLabel label6;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
