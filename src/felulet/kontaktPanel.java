/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package felulet;

import alaposztaly.Kontakt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import multitelefonkonyv.MultiTelefonkonyv;

/**
 *
 * @author Marci
 */
public class kontaktPanel extends javax.swing.JPanel {

    /**
     * Creates new form kontaktPanel
     */
    
    MultiTelefonkonyv telefonkonyv;
    
    public kontaktPanel() {
        initComponents();
        beallitas();
        kapcsolat();
        getKontaktLista();
        kontaktokTablabaIr();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableShowUsers = new javax.swing.JTable();
        txtNev = new javax.swing.JTextField();
        txtTelSzam = new javax.swing.JTextField();
        txtIrSzam = new javax.swing.JTextField();
        txtVaros = new javax.swing.JTextField();
        btnBeilleszt = new javax.swing.JButton();
        btnModosit = new javax.swing.JButton();
        btnTöröl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdateChooser = new datechooser.beans.DateChooserCombo();
        comboTipus = new javax.swing.JComboBox<>();
        comboHalozat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtKereses = new javax.swing.JTextField();
        btnKeres = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rdbtnNevSzerint = new javax.swing.JRadioButton();
        rdnbtnKorSzerint = new javax.swing.JRadioButton();
        rdnbtnVarosSzerint = new javax.swing.JRadioButton();

        tableShowUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tableShowUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableShowUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableShowUsers);

        btnBeilleszt.setText("Beilleszt");
        btnBeilleszt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeillesztActionPerformed(evt);
            }
        });

        btnModosit.setText("Módosít");
        btnModosit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModositActionPerformed(evt);
            }
        });

        btnTöröl.setText("Töröl");
        btnTöröl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTörölActionPerformed(evt);
            }
        });

        jLabel1.setText("Név:");

        jLabel2.setText("Telefonszám:");

        jLabel3.setText("Születésnap:");

        jLabel4.setText("Irányítószám:");

        jLabel5.setText("Város:");

        comboTipus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mobil", "vezetékes" }));
        comboTipus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipusActionPerformed(evt);
            }
        });

        jLabel6.setText("Keresés:");

        btnKeres.setText("Keres");
        btnKeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeresActionPerformed(evt);
            }
        });

        jLabel7.setText("Rendezés:");

        buttonGroup1.add(rdbtnNevSzerint);
        rdbtnNevSzerint.setText("Név szerint");
        rdbtnNevSzerint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNevSzerintActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdnbtnKorSzerint);
        rdnbtnKorSzerint.setText("Kor szerint");
        rdnbtnKorSzerint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdnbtnKorSzerintActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdnbtnVarosSzerint);
        rdnbtnVarosSzerint.setText("Város szerint");
        rdnbtnVarosSzerint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdnbtnVarosSzerintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboTipus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboHalozat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbtnNevSzerint))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdnbtnKorSzerint)
                                            .addComponent(rdnbtnVarosSzerint))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNev)
                            .addComponent(txtTelSzam)
                            .addComponent(txtIrSzam)
                            .addComponent(txtVaros, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnKeres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtKereses, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBeilleszt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModosit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(btnTöröl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelSzam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(comboTipus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboHalozat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jdateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIrSzam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtVaros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBeilleszt)
                            .addComponent(btnModosit)
                            .addComponent(btnTöröl))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKereses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnKeres))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rdbtnNevSzerint))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdnbtnKorSzerint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdnbtnVarosSzerint)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableShowUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableShowUsersMouseClicked
        int i = tableShowUsers.getSelectedRow();
        TableModel model = tableShowUsers.getModel();
        
        txtNev.setText(model.getValueAt(i,0).toString());
        txtTelSzam.setText(model.getValueAt(i,1).toString());
        jdateChooser.setText(model.getValueAt(i,2).toString());
        txtIrSzam.setText(model.getValueAt(i,3).toString());
        txtVaros.setText(model.getValueAt(i,4).toString());
        
        
    }//GEN-LAST:event_tableShowUsersMouseClicked

    private void btnBeillesztActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeillesztActionPerformed
      String query = "insert into multialarm(nev, telefonszam, szuletesnap, irSzam, varos) values \n" +
              "('"+txtNev.getText()+"', '"
                +txtTelSzam.getText()+"', '"
                +jdateChooser.getText()+"', "
                +Integer.valueOf(txtIrSzam.getText())+", '"
                +txtVaros.getText()+"');";
      
        sqlMuvelet(query, "Beillesztve");
        
    }//GEN-LAST:event_btnBeillesztActionPerformed

    private void btnModositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModositActionPerformed
        String query = "UPDATE multialarm SET(nev, telefonszam, szuletesnap, irSzam, varos)" +
                "= ('"+txtNev.getText()+"','"
                +txtTelSzam.getText()+"', '"
                +jdateChooser.getText()+"', "
                +Integer.valueOf(txtIrSzam.getText())+", '"
                +txtVaros.getText()+"') WHERE nev = '"+txtNev.getText()+"';";
        
        sqlMuvelet(query, "Frissítve");
    }//GEN-LAST:event_btnModositActionPerformed

    private void btnTörölActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTörölActionPerformed
        String query = "DELETE FROM multialarm where nev = '"+txtNev.getText()+"'";
        sqlMuvelet(query, "Törölve");
    }//GEN-LAST:event_btnTörölActionPerformed

    private void comboTipusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipusActionPerformed
            comboHalozat.removeAllItems();
        if (comboTipus.getSelectedItem() == "mobil") {
            comboHalozat.addItem("20");
            comboHalozat.addItem("30");
            comboHalozat.addItem("70");
        }else{
            comboHalozat.addItem("22");
        }
    }//GEN-LAST:event_comboTipusActionPerformed

    private void btnKeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeresActionPerformed
        String query = "Select * from multialarm where nev = '"+txtKereses.getText()+"';";
        sqlLekerdezes(query, "Talált!");
    }//GEN-LAST:event_btnKeresActionPerformed

    private void rdnbtnKorSzerintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdnbtnKorSzerintActionPerformed
        String query = "Select * from multialarm order by kor asc;";
        sqlLekerdezes(query, "Rendezve");
    }//GEN-LAST:event_rdnbtnKorSzerintActionPerformed

    private void rdbtnNevSzerintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNevSzerintActionPerformed
        String query = "Select * from multialarm order by nev asc;";
        sqlLekerdezes(query, "Rendezve");
    }//GEN-LAST:event_rdbtnNevSzerintActionPerformed

    private void rdnbtnVarosSzerintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdnbtnVarosSzerintActionPerformed
        String query = "Select * from multialarm order by irszam asc;";
        sqlLekerdezes(query, "Rendezve");
    }//GEN-LAST:event_rdnbtnVarosSzerintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeilleszt;
    private javax.swing.JButton btnKeres;
    private javax.swing.JButton btnModosit;
    private javax.swing.JButton btnTöröl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboHalozat;
    private javax.swing.JComboBox<String> comboTipus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private datechooser.beans.DateChooserCombo jdateChooser;
    private javax.swing.JRadioButton rdbtnNevSzerint;
    private javax.swing.JRadioButton rdnbtnKorSzerint;
    private javax.swing.JRadioButton rdnbtnVarosSzerint;
    private javax.swing.JTable tableShowUsers;
    private javax.swing.JTextField txtIrSzam;
    private javax.swing.JTextField txtKereses;
    private javax.swing.JTextField txtNev;
    private javax.swing.JTextField txtTelSzam;
    private javax.swing.JTextField txtVaros;
    // End of variables declaration//GEN-END:variables

public void kontaktokTablabaIr() {
        ArrayList<Kontakt> lista = getKontaktLista();
        Object[] fejlecek = new Object[5];
        fejlecek[0] = "Név";
        fejlecek[1] = "Telefonszám";
        fejlecek[2] = "Születésnap";
        fejlecek[3] = "Ir.szám";
        fejlecek[4] = "Város";
        DefaultTableModel model = (DefaultTableModel)tableShowUsers.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(fejlecek);
        Object[] sor = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
        sor[0]=lista.get(i).getNev();
        sor[1]=lista.get(i).getTelszam();
        sor[2]=lista.get(i).getSzuletesnap();
        sor[3]=lista.get(i).getIrSzam();
        sor[4]=lista.get(i).getVaros();
        
        model.addRow(sor);
    }
         
    }

    private Connection kapcsolat()  {
         Connection con;
        
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/postgres";
            con = DriverManager.getConnection(url, "postgres", "Szmart91");
            return con;        
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

   public ArrayList<Kontakt> getKontaktLista()
    {
        ArrayList<Kontakt>kontaktLista = new ArrayList<>();
        Connection kapcsolat = kapcsolat();
        
        String query = "SELECT * FROM multialarm";
        Statement st;
        ResultSet rs;
        
        try {
            st = kapcsolat.createStatement();
            rs = st.executeQuery(query);
            
            Kontakt kontakt;
             while (rs.next()) {                
                kontakt = new Kontakt(rs.getString("nev"), rs.getString("varos"), rs.getString("szuletesnap"), rs.getInt("irszam"), rs.getString("telefonszam"));
                kontaktLista.add(kontakt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kontaktLista;
    }
    
    public void sqlMuvelet(String query,String uzenet){
        Connection con=kapcsolat();
        Statement st;
        try {
            st = con.createStatement();
            if((st.executeUpdate(query))== 1){
                //ujratoltés
                DefaultTableModel model =(DefaultTableModel)tableShowUsers.getModel();
                model.setRowCount(0);
                kontaktokTablabaIr();
                JOptionPane.showMessageDialog(this, "Sikeres");
                
            }else{
                JOptionPane.showMessageDialog(this, "Sikertelen");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void sqlLekerdezes(String query,String uzenet){
        Connection con=kapcsolat();
        Statement st;
        try {
            st = con.createStatement();
            st.executeQuery(query);
                //ujratoltés
                DefaultTableModel model =(DefaultTableModel)tableShowUsers.getModel();
                model.setRowCount(0);
                kontaktokTablabaIr();
                JOptionPane.showMessageDialog(this, "Sikeres");
                
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void beallitas() {
            comboHalozat.addItem("20");
            comboHalozat.addItem("30");
            comboHalozat.addItem("70");
    }
    
}
