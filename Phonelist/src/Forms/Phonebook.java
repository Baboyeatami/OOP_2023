/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Forms;

import DatabaseConnection.DBConnection;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.print.PrinterException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;
import java.util.TimerTask;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;








/**
 *
 * @author JAMIEXXX3
 */
public class Phonebook extends javax.swing.JFrame {
   DefaultTableModel model1=new DefaultTableModel();
    private Object dateReC;
    /**
     * Creates new form Phonebook
     */
    public Phonebook() {
        initComponents();
        LoadData();
        DateandTime();
        model1=(DefaultTableModel)Table.getModel();
        RefreshTime();
        
        
        {
      
        
       
       
       
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnumber = new javax.swing.JTextField();
        txtNumID = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Jprint = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        LoadLatestKey = new javax.swing.JButton();
        Latestkey = new javax.swing.JLabel();
        IReportPrint = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        DateandTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtname.setName("Name"); // NOI18N

        jLabel2.setText("Number");

        jLabel4.setText("Search ID");

        jLabel3.setText("Number ID");

        txtNumID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumIDActionPerformed(evt);
            }
        });

        txtSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchCaretUpdate(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(txtname)
                    .addComponent(txtnumber)
                    .addComponent(txtNumID))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Jprint.setText("Print");
        Jprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JprintActionPerformed(evt);
            }
        });

        LoadLatestKey.setText("Get Lastest Key");
        LoadLatestKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadLatestKeyActionPerformed(evt);
            }
        });

        Latestkey.setBackground(new java.awt.Color(204, 204, 255));

        IReportPrint.setText("iReport");
        IReportPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IReportPrintActionPerformed(evt);
            }
        });

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Jprint)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LoadLatestKey)
                                .addGap(28, 28, 28)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Latestkey, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(IReportPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Login)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(password))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Jprint)
                                .addComponent(LoadLatestKey)
                                .addComponent(Latestkey, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButtonSave)
                    .addComponent(jButton3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Login)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IReportPrint)
                        .addGap(24, 24, 24))))
        );

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "number Id", "Name", "Number", "Username", "Password"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel5.setText("Jamie PhoneBook ");

        DateandTime.setMaximumSize(new java.awt.Dimension(5, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(DateandTime, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(DateandTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        txtname.setText(String.valueOf(model1.getValueAt(Table.getSelectedRow(), 1)));
        txtnumber.setText(String.valueOf(model1.getValueAt(Table.getSelectedRow(), 2)));
        txtNumID.setText(String.valueOf(model1.getValueAt(Table.getSelectedRow(), 0)));
    }//GEN-LAST:event_TableMouseClicked

    private void JprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JprintActionPerformed
        // TODO add your handling code here:
        MessageFormat header= new MessageFormat("Students Placement Report");
        MessageFormat footer= new MessageFormat(" Page{0,number,integer} ");
        try {

            Table.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_JprintActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            DBConnection.init();
            Connection c=DBConnection.getConnection();
            PreparedStatement ps;
            ps=c.prepareStatement("Delete from info where idinfo=(?)");

            ps.setString(1,this.txtNumID.getText());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Number Deleted");

        }
        catch(Exception e){System.out.println(e);}
       
        LoadData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            //Vector row=new Vector();
            Connection c=DBConnection.getConnection();
            PreparedStatement ps;

 ps=c.prepareStatement("Update info set idinfo = (?),Name=(?),Number=(?) where idinfo like (?)");

            ps.setString(1, txtNumID.getText());
            ps.setString(2,txtname.getText());
            ps.setString(3,txtnumber.getText());
            ps.setString(4, txtNumID.getText());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this,"Succefully ");

        }
        catch(Exception e ){JOptionPane.showMessageDialog(null,e);}

        LoadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        try{
             
            Calendar cal=  Calendar.getInstance();
           cal.getTime();
           SimpleDateFormat date2=new SimpleDateFormat("yyyy/MM/d");
           SimpleDateFormat time=new SimpleDateFormat("hh:mm:ss");
   
            String Date = date2.format(cal.getTime());
            String Time = time.format(cal.getTime());
            
           
            
            DBConnection.init();
            Connection c =(Connection) DBConnection.getConnection();
            PreparedStatement ps;
            ResultSet rs;
             
            ps=c.prepareStatement("Select * from info where idinfo='"+this.txtNumID.getText()+"'");
            rs=ps.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "Number Already Exist");

                return;
            }

            ps=c.prepareStatement("Insert into info (idinfo,Name,Number,UserName,Pass,time,datex)values"+"('"+this.txtNumID.getText()+"','"+this.txtname.getText()+"','"+this.username.getText()+"','"+this.password.getText()+"','"+this.txtnumber.getText()+"','"+Time+"','"+Date+"')");

            ps.execute(); 
            JOptionPane.showMessageDialog(this,"Phone Number Saved! ",
                    "Phonebook Information", JOptionPane.INFORMATION_MESSAGE);

        }
        catch(SQLException e){System.out.println(e);}

        LoadData();
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LoadData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchCaretUpdate
        // TODO add your handling code here:

       // if (this.txtSearch.getText()==""){
         //   JOptionPane.showMessageDialog(this, "Nothins to Update");
        //}else{
          //  try{
            //    Connection c=OpenDatabaseConnection();
              //  PreparedStatement ps=c.prepareStatement("Select * from info where idinfo=(?)");
               // ResultSet rs;

                //ps.setString(1, this.txtSearch.getText());
                //rs=ps.executeQuery();

                //while(rs.next()){
                  //  this.txtNumID.setText(rs.getString(1));
                   // this.txtname.setText(rs.getString(2));
                    //this.txtnumber.setText(rs.getString(3));

                //}
          //  /}
            //catch(Exception e){System.out.println(e);}

        //}
        
       LoadSearchData();
    }//GEN-LAST:event_txtSearchCaretUpdate

    private void txtNumIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumIDActionPerformed

    private void LoadLatestKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadLatestKeyActionPerformed
        // TODO add your handling code here:
        this.LoadLatestID();
    }//GEN-LAST:event_LoadLatestKeyActionPerformed

    private void IReportPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IReportPrintActionPerformed
        // TODO add your handling code here:
        
          try{
            JasperReport JR;
        JasperPrint JP;
        
        String Q="%"+this.txtSearch.getText() +"%";
        
       // String Source="C:\\Users\\JAMIEXXX3\\Documents\\NetBeansProjects\\Phonelist\\src\\Forms\\report1.jrxml";
      
            DBConnection.init();
           JasperDesign Jd = JRXmlLoader.load(System.getProperty("user.dir")+"\\\\reports\\\\report1.jrxml");
           
            String SQL="SELECT * from info "; 
            
            JRDesignQuery JQ=new JRDesignQuery();
            JQ.setText(SQL);
            Jd.setQuery(JQ);
           JR=JasperCompileManager.compileReport(Jd);
           
          // m.put("parameter1", "   Covered Period: "+dateF+"  to  "+dateT);
            HashMap m = new HashMap<>();
            String pr=JOptionPane.showInputDialog("Enter Prepared By:");
            String pn=JOptionPane.showInputDialog("Enter Noted By:");
            m.put("parameter1",pr);
              m.put("parameter2",pn);
            
            JP=JasperFillManager.fillReport(JR,m, OpenDatabaseConnection());
           
            JasperViewer.viewReport(JP);
        
        
        }
        catch(Exception e){System.out.println(e);}
      
    }//GEN-LAST:event_IReportPrintActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        boolean suc = false;
        try{
         Connection c=OpenDatabaseConnection();
            PreparedStatement ps;
            ResultSet rs;

            ps=c.prepareStatement("Select * from info");
            rs=ps.executeQuery();
            while(rs.next()){
                
            if(rs.getString(4).equals(this.username.getText()) && rs.getString(5).equals(this.password.getText()) && rs.getString(2).equals("asd")) {
                
              
            JOptionPane.showMessageDialog(this, "LOGIN SUCCESS");
            System.out.println(rs.getString(4)+"HAHAH");
            this.Jprint.setEnabled(false);
            suc=false;
            break;
            }
            else {suc=true;}
            }
          if(suc){JOptionPane.showMessageDialog(this, "INVALID ACCOUNT");}
         
       

            
            
        }
        catch(Exception e){System.out.println(e);}
    }//GEN-LAST:event_LoginActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Phonebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Phonebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Phonebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Phonebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Phonebook().setVisible(true);
            }
        });
    }
    public void Chacha(){}
    
    public void LoadData(){
    try{
       
    DBConnection.init();
    Connection c=(Connection)DBConnection.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    
    ps=c.prepareStatement("SELECT * from info");
    
    rs=ps.executeQuery();
    model1.setRowCount(0);
      while(rs.next()){    
    model1.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
    }  
   

    }
    catch(Exception e){System.out.println(e);}
   }
    
    public void LoadSearchData(){
     
          //  String S=this.txtSearch.getText(); 
            //String S1=this.txtNumID.getText();
            
         try{
         String S="%"+this.txtSearch.getText()+"%";
             System.out.println(S);
    DBConnection.init();
    Connection c=DBConnection.getConnection();
    PreparedStatement ps;
    ResultSet rs;
  
  //  DefaultTableModel model=new DefaultTableModel();
   //  Table.setModel(model);
    int col;
    
    //'"+this.txtSearch.getText()+"'
    ps=c.prepareStatement("SELECT * FROM info WHERE idinfo like '"+S+"'");
    rs=ps.executeQuery();
   model1.setRowCount(0);
     while(rs.next()){    
    model1.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
    }  
      
    }
    catch(SQLException e){System.out.println(e);}
    
    
    }
    
    Connection OpenDatabaseConnection(){
     Connection c=null;
     
     try{
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          c=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook", "root", "root");}
     
     catch(Exception e){}
    return c;
    };
    
    public void DateandTime(){
    Calendar cal=  Calendar.getInstance();
    cal.getTime();
    SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ssa MMMM-dd-yyyy");
   
    this.DateandTime.setText(sdf.format(cal.getTime()));
    }
  public void RefreshTime(){
  TimerTask TT =new TimerTask() {
      @Override
      public void run() {
          DateandTime();
      }
  };
  
  Timer t =new Timer();
      t.scheduleAtFixedRate(TT, 1000, 1000);
  }
  
  public void LoadLatestID(){
    try{  
   DBConnection.init();
    Connection c=(Connection)DBConnection.getConnection();
    PreparedStatement ps;
    ResultSet rs;
     ps=c.prepareStatement("SELECT * from info");
     rs=ps.executeQuery();
    while(rs.next()){
  this.txtNumID.setText(rs.getString(1)+1+"");
    }}
    catch(SQLException e  ){System.out.println(e);}
  }
  
  
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateandTime;
    private javax.swing.JButton IReportPrint;
    private javax.swing.JButton Jprint;
    private javax.swing.JLabel Latestkey;
    private javax.swing.JButton LoadLatestKey;
    private javax.swing.JButton Login;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtNumID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnumber;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
