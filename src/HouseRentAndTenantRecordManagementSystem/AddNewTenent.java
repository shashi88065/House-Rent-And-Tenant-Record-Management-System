
package HouseRentAndTenantRecordManagementSystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddNewTenent extends javax.swing.JFrame {
    
    public AddNewTenent() {
        initComponents();
        H1.setText("1");
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        G1 = new javax.swing.JComboBox<>();
        AddB = new javax.swing.JButton();
        H1 = new javax.swing.JTextField();
        R1 = new javax.swing.JTextField();
        N1 = new javax.swing.JTextField();
        C1 = new javax.swing.JTextField();
        A1 = new javax.swing.JTextField();
        NM1 = new javax.swing.JTextField();
        RT1 = new javax.swing.JTextField();
        bck = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT = new javax.swing.JTable();
        view = new javax.swing.JButton();
        MS1 = new com.toedter.calendar.JDateChooser();
        TRupdtB = new javax.swing.JButton();
        TRdelB = new javax.swing.JButton();
        TRsrchB = new javax.swing.JButton();
        TRsrchF = new javax.swing.JTextField();
        RAVChkB = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("House No");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Room No.");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Contact No.");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Number Of Members");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Aadhar Number");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Month started");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Rent");

        G1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female","Other"}));
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        AddB.setText("SAVE");
        AddB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBActionPerformed(evt);
            }
        });

        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });

        bck.setText("back");
        bck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("*please fill the following details to add new tenent");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        JT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No.", "R.No.", "Name", "Gender", "Con.No.", "Month", "Rent"
            }
        ));
        jScrollPane1.setViewportView(JT);

        view.setText("VIEW");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        MS1.setDateFormatString("dd-MM-yyyy");

        TRupdtB.setText("Update");
        TRupdtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRupdtBActionPerformed(evt);
            }
        });

        TRdelB.setText("Delete");
        TRdelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRdelBActionPerformed(evt);
            }
        });

        TRsrchB.setText("Search");
        TRsrchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRsrchBActionPerformed(evt);
            }
        });

        TRsrchF.setForeground(new java.awt.Color(153, 153, 153));
        TRsrchF.setText("Enter adhar number");
        TRsrchF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TRsrchFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TRsrchFFocusLost(evt);
            }
        });
        TRsrchF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRsrchFActionPerformed(evt);
            }
        });

        RAVChkB.setText("Check");
        RAVChkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAVChkBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel5))
                            .addComponent(jLabel4)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bck))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(view))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(C1)
                                                .addComponent(A1)
                                                .addComponent(N1)
                                                .addComponent(H1)
                                                .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(RAVChkB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(NM1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RT1))
                                    .addComponent(MS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TRupdtB)
                        .addGap(18, 18, 18)
                        .addComponent(TRdelB)
                        .addGap(90, 90, 90)
                        .addComponent(TRsrchF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TRsrchB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TRupdtB)
                        .addComponent(TRdelB)
                        .addComponent(TRsrchB)
                        .addComponent(TRsrchF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RAVChkB))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(NM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(MS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddB)
                                    .addComponent(bck)
                                    .addComponent(view))
                                .addContainerGap(82, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        setBounds(210, 120, 890, 467);
    }// </editor-fold>//GEN-END:initComponents

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
            
    }//GEN-LAST:event_G1ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
 
    }//GEN-LAST:event_H1ActionPerformed

    private void AddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBActionPerformed

        if("".equals(H1.getText()) ||"".equals(R1.getText()) || "".equals(N1.getText())|| "".equals(G1.getSelectedItem().toString()) || "".equals(C1.getText())|| "".equals(A1.getText())||"".equals(NM1.getText())|| "".equals(MS1.getDate().toString())||"".equals(RT1.getText()))
            JOptionPane.showMessageDialog(null, "please fill the deatails");
        else if(evt.getSource()== AddB)
        {  
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/housedb", "root", "root");
                
                String s = "insert into h1(HN,RN,Name,Gen,Con,Adr,Mem,Md,Ren) values (?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(s);
                ps.setString(1, H1.getText());
                ps.setString(2, R1.getText());
                ps.setString(3, N1.getText());
                ps.setString(4, G1.getSelectedItem().toString());
                ps.setString(5, C1.getText());
                ps.setString(6, A1.getText());
                ps.setString(7, NM1.getText());
                ps.setString(8, MS1.getDate().toString());
                ps.setString(9, RT1.getText());
                //ResultSet rs = ps.executeQuery();
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "saved successfully!");
            }catch(Exception e){
                System.out.print(e);
            }
            
        }
    }//GEN-LAST:event_AddBActionPerformed

    private void bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckActionPerformed
        setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_bckActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/housedb", "root", "root");
                java.sql.Statement st=con.createStatement();
                String query="select* from h1";
                ResultSet rs=st.executeQuery(query);
                
                
                while(rs.next()){ 
                    String sn = rs.getString("SN");
                    String hn = rs.getString("HN");
                    String rn = rs.getString("RN");
                    String nm = rs.getString("Name");
                    String gn = rs.getString("Gen");
                    String cn = rs.getString("Con");
                    String an = rs.getString("Adr");
                    String mn = rs.getString("Mem");
                    String md = rs.getString("Md");
                    String rnt = rs.getString("Ren");
                    String tbData[] = {sn,rn,nm,gn,cn,md,rnt};
                    DefaultTableModel tblModel=(DefaultTableModel) JT.getModel();
                    tblModel.addRow(tbData);
                }
                
            }catch(Exception e){
                System.out.print(e);
            }
       // }
    }//GEN-LAST:event_viewActionPerformed

    private void TRupdtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRupdtBActionPerformed
       String a=TRsrchF.getText();
        if("".equals(a)){
            JOptionPane.showMessageDialog(null, "Enter to search");
        }else if(evt.getSource()==TRupdtB){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/housedb", "root", "root");
            String s ="update h1 set HN=?,RN=?,Name=?,Con=?,Mem=?,Ren=? where Adr=? ";
            PreparedStatement ps = con.prepareStatement(s);
         
            ps.setString(1, H1.getText());
            ps.setString(2, R1.getText());
            ps.setString(3, N1.getText());
            ps.setString(4, C1.getText());
            ps.setString(5, NM1.getText());
            ps.setString(6, RT1.getText());
            ps.setString(7, A1.getText());

    
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null,"updated successfully!" );
            
        } catch (Exception e) {
            System.out.print(e);
        }
        }
    }//GEN-LAST:event_TRupdtBActionPerformed

    private void TRsrchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRsrchBActionPerformed
          String a=TRsrchF.getText();
        if ("Enter adhar number".equals(a)) {
            JOptionPane.showMessageDialog(null, "Enter something to search");
        } else if (evt.getSource() == TRsrchB) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/housedb", "root", "root");
                String s = "select* from h1 where Adr=?";
                PreparedStatement ps = con.prepareStatement(s);
                ps.setString(1, a);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    H1.setText(rs.getString(2));
                    R1.setText(rs.getString(3));
                    N1.setText(rs.getString(4));
                    C1.setText(rs.getString(6));
                    A1.setText(rs.getString(7));
                    NM1.setText(rs.getString(8));
                   // MS1.setText(rs.getString(9));
                    RT1.setText(rs.getString(10));
                } else {
                    JOptionPane.showMessageDialog(null, "No such record is found!\n please try again");
                    TRsrchF.setForeground(new Color(153,153,153));
                    TRsrchF.setText("Enter adhar number");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No such record is found!");
            }
        }
    }//GEN-LAST:event_TRsrchBActionPerformed

    private void TRdelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRdelBActionPerformed
        String a = TRsrchF.getText();
        if ("".equals(a)) {
            JOptionPane.showMessageDialog(null, "Enter to search");
        } else if (evt.getSource() == TRdelB) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/housedb", "root", "root");
                String s = "delete from h1 where Adr=? ";
                PreparedStatement ps = con.prepareStatement(s);
                ps.setString(1, A1.getText());

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Deleted successfully!");
                R1.setText("");
                N1.setText("");
                C1.setText("");
                NM1.setText("");
                A1.setText("");
                RT1.setText("");
                TRsrchF.setText("");
            } catch (Exception e) {
                System.out.print(e);
            }
        }
    }//GEN-LAST:event_TRdelBActionPerformed

    private void TRsrchFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TRsrchFFocusGained
        if (evt.getSource() == TRsrchF) {
            if (TRsrchF.getText().equals("Enter adhar number")) {
                TRsrchF.setText("");
                TRsrchF.setForeground(new Color(0, 0, 0));

            }
        }
    }//GEN-LAST:event_TRsrchFFocusGained

    private void TRsrchFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TRsrchFFocusLost
        if (evt.getSource() == TRsrchF) {
            if (TRsrchF.getText().equals("")) {
                TRsrchF.setText("Enter adhar number");
                TRsrchF.setForeground(new Color(153, 153, 153));
            }
        }
    }//GEN-LAST:event_TRsrchFFocusLost

    private void TRsrchFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRsrchFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRsrchFActionPerformed

    private void RAVChkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAVChkBActionPerformed
        String avc = R1.getText();
        if ("".equals(avc)) {
            JOptionPane.showMessageDialog(null, "Enter the field!");
        } else if (evt.getSource() == RAVChkB) {
            try {
                String rmno = R1.getText();
                int rintNo = Integer.parseInt(rmno);

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/housedb", "root", "root");
                String rach = "select* from h1 where RN=" + rintNo + "";
                PreparedStatement ps = con.prepareStatement(rach);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Not Available");
                    R1.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Available!");
                    R1.setText(avc);
                }
            } catch (Exception e) {
                System.out.print(e);
            }

        }
    }//GEN-LAST:event_RAVChkBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewTenent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewTenent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewTenent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewTenent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewTenent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A1;
    private javax.swing.JButton AddB;
    private javax.swing.JTextField C1;
    private javax.swing.JComboBox<String> G1;
    private javax.swing.JTextField H1;
    private javax.swing.JTable JT;
    private com.toedter.calendar.JDateChooser MS1;
    private javax.swing.JTextField N1;
    private javax.swing.JTextField NM1;
    private javax.swing.JTextField R1;
    private javax.swing.JButton RAVChkB;
    private javax.swing.JTextField RT1;
    private javax.swing.JButton TRdelB;
    private javax.swing.JButton TRsrchB;
    private javax.swing.JTextField TRsrchF;
    private javax.swing.JButton TRupdtB;
    private javax.swing.JButton bck;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
