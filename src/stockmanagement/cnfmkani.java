/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kani
 */
public class cnfmkani extends javax.swing.JDialog {

    /**
     * Creates new form cnfmkani;
     */
    String id="0",catagory="0",price="0",name=" ",profit=" ",quantity=" ",total=" ";
    byte[] img=null;
    
    public cnfmkani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    cnfmkani() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cnfmpanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        confirmadd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cnfmproduct = new javax.swing.JTextField();
        searchfield = new javax.swing.JTextField();
        cnfmcatagory = new javax.swing.JTextField();
        cnfmprice = new javax.swing.JTextField();
        cnfmquantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cnfmimg = new javax.swing.JLabel();
        cnfmtotal = new javax.swing.JLabel();
        cnfmsearch = new javax.swing.JButton();
        cnfmcalculate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cnfmpanel.setBackground(new java.awt.Color(102, 255, 255));
        cnfmpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product ID");
        cnfmpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 20));

        confirmadd.setText("confirm");
        confirmadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaddActionPerformed(evt);
            }
        });
        cnfmpanel.add(confirmadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("product name");
        cnfmpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("catagory");
        cnfmpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("price");
        cnfmpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("quantity");
        cnfmpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        cnfmpanel.add(cnfmproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 190, 30));

        searchfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfieldActionPerformed(evt);
            }
        });
        cnfmpanel.add(searchfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, 30));

        cnfmcatagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnfmcatagoryActionPerformed(evt);
            }
        });
        cnfmpanel.add(cnfmcatagory, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 222, 180, 30));

        cnfmprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnfmpriceActionPerformed(evt);
            }
        });
        cnfmpanel.add(cnfmprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 262, 100, 30));

        cnfmquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnfmquantityActionPerformed(evt);
            }
        });
        cnfmpanel.add(cnfmquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 302, 100, 30));

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Price");
        cnfmpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 80, -1));

        cnfmimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png"))); // NOI18N
        cnfmimg.setPreferredSize(new java.awt.Dimension(100, 100));
        cnfmpanel.add(cnfmimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 130, 140));

        cnfmtotal.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        cnfmtotal.setForeground(new java.awt.Color(255, 51, 0));
        cnfmtotal.setText("Rs.0");
        cnfmpanel.add(cnfmtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, 50));

        cnfmsearch.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        cnfmsearch.setForeground(new java.awt.Color(204, 0, 204));
        cnfmsearch.setText("search");
        cnfmsearch.setBorderPainted(false);
        cnfmsearch.setContentAreaFilled(false);
        cnfmsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnfmsearchActionPerformed(evt);
            }
        });
        cnfmpanel.add(cnfmsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 80, 20));

        cnfmcalculate.setText("calculate");
        cnfmcalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnfmcalculateActionPerformed(evt);
            }
        });
        cnfmpanel.add(cnfmcalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 80, 20));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View all stocks");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        cnfmpanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 380, 30));

        jLabel9.setFont(new java.awt.Font("Calibri Light", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Delicious Fruits");
        cnfmpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gabriola", 3, 110)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("BFS");
        cnfmpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif pic/21MarBlog.gif"))); // NOI18N
        cnfmpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 420, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cnfmpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cnfmpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnfmcatagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnfmcatagoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnfmcatagoryActionPerformed

    private void cnfmsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnfmsearchActionPerformed
        // TODO add your handling code here:
        try{
            int c;
            String search=searchfield.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://127.0.0.1/projectkani","root","");
            PreparedStatement pst1 = con.prepareStatement("SELECT * FROM bfsproduct WHERE ID="+search);
            System.out.println(pst1);
            ResultSet rs1= pst1.executeQuery();
            
            ResultSetMetaData rss=rs1.getMetaData();
            c=rss.getColumnCount();
            //DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
            //df.setRowCount(0);
            while(rs1.next())
            {
                    //Vector v2=new Vector();
                    for(int a=1;a<=c;a++){
                            id=rs1.getString("ID");
                            name=rs1.getString("name");
                            catagory=rs1.getString("catagory");
                            price=rs1.getString("price");
                            img=rs1.getBytes("image");
                    }
                    //df.addRow(v2);
            }
            System.out.print(id+" "+name+" "+catagory+" "+price);
            /*
            String id=rs1.getString("ID");
            String name=rs1.getString("name");
            String catagory=rs1.getString("catagory");
            String price=rs1.getString("price");
            String image=rs1.getString("image");
            System.out.print(id);
            */
            
            profit=String.valueOf(Integer.parseInt(price)/10+Integer.parseInt(price));
            
            cnfmproduct.setText(name);
            cnfmcatagory.setText(catagory);
            cnfmprice.setText(price);
            ImageIcon imgicon=new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(cnfmimg.getWidth(),cnfmimg.getHeight(),cnfmimg.getWidth()));
            cnfmimg.setIcon(imgicon);
            name="";
            catagory="";
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"something wrong please try again");
            searchfield.setText("");
            cnfmproduct.setText("");
            cnfmcatagory.setText("");
            cnfmprice.setText("");
            cnfmimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png")));
            
        }
    }//GEN-LAST:event_cnfmsearchActionPerformed

    private void searchfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfieldActionPerformed

    private void cnfmcalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnfmcalculateActionPerformed
        // TODO add your handling code here:
        
        quantity=cnfmquantity.getText();
        total=String.valueOf(Integer.parseInt(quantity)*Integer.parseInt(price));
        cnfmtotal.setText("Rs."+total);
    }//GEN-LAST:event_cnfmcalculateActionPerformed

    private void cnfmquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnfmquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnfmquantityActionPerformed

    private void confirmaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaddActionPerformed
        // TODO add your handling code here:
        try{
            int c;
            String newquanti=cnfmquantity.getText();
            String search=searchfield.getText();
            String oldquanti="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://127.0.0.1/projectkani","root","");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM kanistocks WHERE ID="+search);
            ResultSet rs= pst.executeQuery();
            if(rs.next()){
                PreparedStatement pst1 = con.prepareStatement("SELECT * FROM kanistocks WHERE ID="+search);
                ResultSet rs1= pst1.executeQuery();
                ResultSetMetaData rss=rs1.getMetaData();
                c=rss.getColumnCount();
                while(rs1.next())
                {
                        for(int a=1;a<=c;a++){
                                oldquanti=rs1.getString("quantity");
                        }
                }
                newquanti=String.valueOf(Integer.parseInt(oldquanti)+Integer.parseInt(newquanti));
                PreparedStatement pst2 = con.prepareStatement("UPDATE kanistocks SET quantity="+newquanti+" WHERE ID="+search);
                pst2.executeUpdate();
                JOptionPane.showMessageDialog(null,"updated successfully");
                searchfield.setText("");
                cnfmproduct.setText("");
                cnfmcatagory.setText("");
                cnfmprice.setText("");
                cnfmquantity.setText(""); 
                cnfmtotal.setText("RS.0");
                cnfmimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png")));
                //dispose();
            }
            else{
                PreparedStatement pst1 = con.prepareStatement("SELECT * FROM bfsproduct WHERE ID="+search);
                ResultSet rs1= pst1.executeQuery();
                ResultSetMetaData rss=rs1.getMetaData();
                c=rss.getColumnCount();
                //DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
                //df.setRowCount(0);
                String id="0",catagory="0",price="0",name=" ",profit=" ";
                byte[] image=null;
                while(rs1.next())
                {
                        //Vector v2=new Vector();
                        for(int a=1;a<=c;a++){
                                id=rs1.getString("ID");
                                name=rs1.getString("name");
                                catagory=rs1.getString("catagory");
                                price=rs1.getString("price");
                                image=rs1.getBytes("image");
                        }
                        //df.addRow(v2);
                }
                //System.out.print(id+" "+name+" "+catagory+" "+price);
                
                profit=String.valueOf(Integer.parseInt(price)/10+Integer.parseInt(price));
                PreparedStatement pst2 = con.prepareStatement("INSERT INTO kanistocks(ID,name,catagory,actualprice,saleprice,quantity,image)VALUES(?,?,?,?,?,?,?)");
                pst2.setString(1,id);
                pst2.setString(2,name);
                pst2.setString(3,catagory);
                pst2.setString(4,price);
                pst2.setString(5,profit);
                pst2.setString(6,newquanti);
                pst2.setBytes(7,image);
                //byte[] img=(userList().get(i).getImage());
                //byte[] img=image;
                //ImageIcon imgicon=new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(imglbl.getWidth(),imglbl.getHeight(),imglbl.getWidth()));
                //imglbl.setIcon(imgicon);
                //imageicon=img;
                pst2.executeUpdate();
                searchfield.setText("");
                cnfmproduct.setText("");
                cnfmcatagory.setText("");
                cnfmprice.setText("");
                cnfmquantity.setText(""); 
                cnfmtotal.setText("RS.0");
                cnfmimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/go.png")));
                JOptionPane.showMessageDialog(null,"A"
                        + "dded successfully");
                //dispose();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            searchfield.setText("");
        }
    }//GEN-LAST:event_confirmaddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cnfmpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnfmpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnfmpriceActionPerformed

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
            java.util.logging.Logger.getLogger(cnfmkani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cnfmkani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cnfmkani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cnfmkani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cnfmkani dialog = new cnfmkani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cnfmcalculate;
    private javax.swing.JTextField cnfmcatagory;
    private javax.swing.JLabel cnfmimg;
    private javax.swing.JPanel cnfmpanel;
    private javax.swing.JTextField cnfmprice;
    private javax.swing.JTextField cnfmproduct;
    private javax.swing.JTextField cnfmquantity;
    private javax.swing.JButton cnfmsearch;
    private javax.swing.JLabel cnfmtotal;
    private javax.swing.JButton confirmadd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField searchfield;
    // End of variables declaration//GEN-END:variables
}
