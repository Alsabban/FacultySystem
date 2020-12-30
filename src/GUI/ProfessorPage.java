/*
 * Created by JFormDesigner on Wed Dec 30 15:36:37 EET 2020
 */

package GUI;

import Users.Professor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author 3enwanak
 */
public class ProfessorPage extends JFrame {
    Professor professor;
    public ProfessorPage(Professor professor) {
        this.professor=professor;
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        AssignCourse assignCourse = new AssignCourse(professor);
        assignCourse.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void button1MouseEntered(MouseEvent e) {
        button1.setBackground(new Color(6,96,159));
    }

    private void button1MouseExited(MouseEvent e) {
        button1.setBackground(Color.white);
    }

    private void button3MouseClicked(MouseEvent e) {
        AssignGrade assignGrade = new AssignGrade(professor);
        assignGrade.setVisible(true);

    }

    private void button3MouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void button3MouseExited(MouseEvent e) {
        // TODO add your code here
    }

    private void button4MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button4MouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void button4MouseExited(MouseEvent e) {
        // TODO add your code here
    }

    private void button2MouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "Total Credit Hours: " + professor.calculateCreditHours() + "\nYour Salary: " + professor.caclulateSalary() + "$");
    }

    private void button2MouseEntered(MouseEvent e) {
        button2.setBackground(new Color(6,96,159));
    }

    private void button2MouseExited(MouseEvent e) {
        button2.setBackground(Color.white);
    }

    private void button5MouseClicked(MouseEvent e) {
        AssignGrade assignGrade = new AssignGrade(professor);
        assignGrade.setVisible(true);
    }

    private void button3ActionPerformed(ActionEvent e) {
        Login login = new Login();
        login.setVisible(true);
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }

    private void button5MouseEntered(MouseEvent e) {
        button5.setBackground(new Color(6,96,159));
    }

    private void button5MouseExited(MouseEvent e) {
        button5.setBackground(Color.white);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 3enwanak
        panel1 = new JPanel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label1 = new JLabel();
        button1 = new JButton();
        label3 = new JLabel();
        label5 = new JLabel();
        button2 = new JButton();
        label6 = new JLabel();
        button5 = new JButton();
        button3 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setForeground(new Color(0, 255, 204));
            panel1.setBackground(Color.lightGray);
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing
            .border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border.TitledBorder
            .CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069alog",java.
            awt.Font.BOLD,12),java.awt.Color.red),panel1. getBorder()))
            ;panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e
            ){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException();}})
            ;

            //======== panel2 ========
            {
                panel2.setBackground(new Color(6, 96, 159));

                //---- label2 ----
                label2.setText("Welcome Prof. " + professor.getName());
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

            //---- label3 ----
            label3.setText("Assign To Course");
            label3.setForeground(Color.black);
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 2f));
            label3.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label5 ----
            label5.setText("View Salary");
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
            label6.setText("Assign Grades");
            label6.setForeground(Color.black);
            label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 2f));
            label6.setHorizontalAlignment(SwingConstants.CENTER);

            //---- button5 ----
            button5.setIcon(new ImageIcon(getClass().getResource("/GUI/reserve.png")));
            button5.setBackground(Color.white);
            button5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    button5MouseClicked(e);
                }
                @Override
                public void mouseEntered(MouseEvent e) {
                    button5MouseEntered(e);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    button5MouseExited(e);
                }
            });

            //---- button3 ----
            button3.setText("Logout");
            button3.setBackground(new Color(6, 96, 159));
            button3.setForeground(Color.white);
            button3.addActionListener(e -> button3ActionPerformed(e));

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(button2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(label6, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(button5, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addGap(64, 64, 64))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button3)
                        .addGap(277, 277, 277))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(button1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(button2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(button5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(label3)
                            .addComponent(label5)
                            .addComponent(label6))
                        .addGap(114, 114, 114)
                        .addComponent(button3)
                        .addGap(33, 33, 33))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
                .addGap(0, 593, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 443, Short.MAX_VALUE)
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
    private JLabel label3;
    private JLabel label5;
    private JButton button2;
    private JLabel label6;
    private JButton button5;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
