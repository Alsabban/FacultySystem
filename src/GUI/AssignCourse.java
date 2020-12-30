/*
 * Created by JFormDesigner on Wed Dec 30 16:10:19 EET 2020
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import System.SystemData;
import Users.Professor;

/**
 * @author 3enwanak
 */
public class AssignCourse extends JFrame {
    Professor professor;
    public AssignCourse(Professor professor) {
        this.professor=professor;
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        String name = (String) comboBox1.getSelectedItem();

        for(int i = 0 ; i<SystemData.courses.size();i++){
            if(name.equals(SystemData.courses.get(i).getName())){

                professor.assignCourse(SystemData.courses.get(i));
                SystemData.professors.set(professor.getID()-2001, professor);
                JOptionPane.showMessageDialog(null,"Course Assigned!");
                break;

            }
        }
        this.setVisible(false);

    }

    private void button1MouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void button1MouseExited(MouseEvent e) {
        // TODO add your code here
    }

    private void button3MouseClicked(MouseEvent e) {
        // TODO add your code here
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
        // TODO add your code here
    }

    private void button2MouseEntered(MouseEvent e) {
        // TODO add your code here
    }

    private void button2MouseExited(MouseEvent e) {
        // TODO add your code here
    }

    private void comboBox1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 3enwanak
        panel1 = new JPanel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label1 = new JLabel();
        panel3 = new JPanel();
        comboBox1 = new JComboBox();
        label3 = new JLabel();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setForeground(new Color(0, 255, 204));
            panel1.setBackground(Color.lightGray);
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder (
            0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder
            . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .
            red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java .
            beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );

            //======== panel2 ========
            {
                panel2.setBackground(new Color(6, 96, 159));

                //---- label2 ----
                label2.setText("Assign Course");
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
                            .addContainerGap(55, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
            }

            //======== panel3 ========
            {
                panel3.setBackground(Color.white);
                panel3.setForeground(Color.white);

                //---- comboBox1 ----
                comboBox1.setMaximumRowCount(60);
                for(int i = 0; i < SystemData.courses.size();i++){
                    comboBox1.addItem(SystemData.courses.get(i).getName());
                }
                comboBox1.setForeground(Color.black);
                comboBox1.setFont(comboBox1.getFont().deriveFont(comboBox1.getFont().getSize() + 2f));
                comboBox1.setBackground(Color.white);
                comboBox1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        comboBox1MouseClicked(e);
                    }
                });

                //---- label3 ----
                label3.setText("Choose Student:");
                label3.setForeground(Color.black);
                label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 2f));

                //---- button1 ----
                button1.setText("Register");
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
                        .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(label3, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel3Layout.createParallelGroup()
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE))
                            .addGap(14, 14, 14))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                            .addComponent(button1)
                            .addGap(29, 29, 29))
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap(106, Short.MAX_VALUE)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(92, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private JPanel panel2;
    private JLabel label2;
    private JLabel label1;
    private JPanel panel3;
    private JComboBox comboBox1;
    private JLabel label3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
