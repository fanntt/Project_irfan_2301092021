/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package irfan_31052024.view;

import irfan_31052024.controller.MataKuliahControler;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Lab-J2-01
 */
public class FormMataKuliah extends javax.swing.JFrame {
    private final MataKuliahControler controler;
    /**
     * Creates new form FormMataKuliah
     */
    public FormMataKuliah() {
        initComponents();
        controler = new MataKuliahControler(this);
        controler.cancel();
        controler.viewData();
    }
    

    public JTextField getTxtNama() {
        return txtnama;
    }
    public JTextField getTxtNobp() {
        return txtnobp;
    }
    public JComboBox<String> getCboSmt() {
        return cbosmt;
    }
    public JComboBox<String> getCbojurusan() {
        return cbojurusan;
    }
    public JTextField getTxtkls() {
        return txtkls;
    }
    public JTextField getTxtMatkul() {
        return txtmatkul;
    }
    public JTextField getTxtsks() {
        return txtsks;
    }
    public JTable getTabelMataKuliah() {
        return tabelMataKuliah;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtnobp = new javax.swing.JTextField();
        txtsks = new javax.swing.JTextField();
        txtkls = new javax.swing.JTextField();
        txtmatkul = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMataKuliah = new javax.swing.JTable();
        cbosmt = new javax.swing.JComboBox<>();
        cbojurusan = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Mata Kuliah");
        getContentPane().setLayout(null);

        jLabel1.setText("Nama  ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 90, 16);

        jLabel2.setText("No.BP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 90, 16);

        jLabel3.setText("Semester");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 90, 16);

        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 140, 90, 16);

        jLabel5.setText("Kelas");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 20, 90, 16);

        jLabel6.setText("Mata Kuliah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 60, 100, 16);

        jLabel7.setText("Jumlah Sks");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(360, 100, 100, 16);

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama);
        txtnama.setBounds(130, 20, 180, 22);
        getContentPane().add(txtnobp);
        txtnobp.setBounds(130, 60, 180, 22);
        getContentPane().add(txtsks);
        txtsks.setBounds(480, 100, 180, 22);
        getContentPane().add(txtkls);
        txtkls.setBounds(480, 20, 180, 22);

        txtmatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatkulActionPerformed(evt);
            }
        });
        getContentPane().add(txtmatkul);
        txtmatkul.setBounds(480, 60, 180, 22);

        tabelMataKuliah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "No.BP", "Semester", "Jurusan", "Kelas", "Matkul", "Jumlah sks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelMataKuliah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMataKuliahMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMataKuliah);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 640, 160);

        cbosmt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Semester", "1", "2", "3", "4", "5", "6", "7", "8" }));
        getContentPane().add(cbosmt);
        cbosmt.setBounds(130, 100, 180, 22);

        cbojurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jurusan", "Sipil", "Elektro", "Mesin", "Teknologi Informasi", "Adminstrasi Niaga", "Akuntansi", "Bahasa Inggris" }));
        cbojurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbojurusanActionPerformed(evt);
            }
        });
        getContentPane().add(cbojurusan);
        cbojurusan.setBounds(130, 140, 180, 22);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(30, 370, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(170, 370, 72, 23);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(580, 370, 72, 23);

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel);
        btncancel.setBounds(440, 370, 72, 23);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(300, 370, 72, 23);

        setBounds(0, 0, 693, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void cbojurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbojurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbojurusanActionPerformed

    private void txtmatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatkulActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
        controler.cancel();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controler.insert();
        controler.viewData();
        controler.cancel();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controler.update();
        controler.viewData();
        controler.cancel();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        controler.delete();
        controler.viewData();
        controler.cancel();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void tabelMataKuliahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMataKuliahMouseClicked
        // TODO add your handling code here:
        controler.getMataKuliah();
    }//GEN-LAST:event_tabelMataKuliahMouseClicked

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
            java.util.logging.Logger.getLogger(FormMataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMataKuliah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JComboBox<String> cbojurusan;
    private javax.swing.JComboBox<String> cbosmt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelMataKuliah;
    private javax.swing.JTextField txtkls;
    private javax.swing.JTextField txtmatkul;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnobp;
    private javax.swing.JTextField txtsks;
    // End of variables declaration//GEN-END:variables
}
