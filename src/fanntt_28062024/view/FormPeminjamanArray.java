/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fanntt_28062024.view;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import fanntt_28062024.controller.PeminjamanControllerArray;
/**
 *
 * 
 */
public class FormPeminjamanArray extends javax.swing.JFrame {

    /**
     * 
     */
    PeminjamanControllerArray controller;
    public FormPeminjamanArray() {
        initComponents();
        controller = new PeminjamanControllerArray(this);
        controller.clearForm();
        controller.isiCboMahasiswa();
        controller.isiCboBuku();
        controller.viewData();
    }

    public JComboBox<String> getCboMahasiswa() {
        return cboMahasiswa;
    }

    public JComboBox<String> getCboBuku() {
        return cboBuku;
    }

    public JTable getTabelPeminjaman() {
        return tabelPeminjaman;
    }

    public JTextField getTxtTglkembali() {
        return txtTglkembali;
    }

    public JTextField getTxtTglpinjam() {
        return txtTglpinjam;
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
        cboMahasiswa = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboBuku = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtTglpinjam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTglkembali = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPeminjaman = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Mahasiswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 140, 16);

        cboMahasiswa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboMahasiswa);
        cboMahasiswa.setBounds(160, 20, 320, 30);

        jLabel2.setText("Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 120, 16);

        cboBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboBuku);
        cboBuku.setBounds(160, 50, 320, 30);

        jLabel3.setText("Tanggal Pinjam");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 80, 130, 16);

        txtTglpinjam.setText("jTextField1");
        getContentPane().add(txtTglpinjam);
        txtTglpinjam.setBounds(160, 80, 320, 30);

        jLabel4.setText("Tanggal Kembali");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 110, 130, 16);

        txtTglkembali.setText("jTextField2");
        getContentPane().add(txtTglkembali);
        txtTglkembali.setBounds(160, 110, 320, 30);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(20, 160, 80, 23);

        btnUpdate.setText("Update");
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(100, 160, 80, 23);

        btnDelete.setText("Delete");
        getContentPane().add(btnDelete);
        btnDelete.setBounds(180, 160, 80, 23);

        btnCancel.setText("Cancel");
        getContentPane().add(btnCancel);
        btnCancel.setBounds(260, 160, 90, 23);

        btnExit.setText("Exit");
        getContentPane().add(btnExit);
        btnExit.setBounds(350, 160, 90, 23);

        tabelPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Anggota", "Kode Buku", "Tgl Pinjam", "Tgl Kembali"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPeminjaman);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 202, 460, 330);

        setSize(new java.awt.Dimension(518, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.insert();
        controller.clearForm();
        controller.viewData();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tabelPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPeminjamanMouseClicked
        // TODO add your handling code here:
        controller.getPeminjaman();
    }//GEN-LAST:event_tabelPeminjamanMouseClicked

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
            java.util.logging.Logger.getLogger(FormPeminjamanArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeminjamanArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeminjamanArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeminjamanArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeminjamanArray().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboBuku;
    private javax.swing.JComboBox<String> cboMahasiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelPeminjaman;
    private javax.swing.JTextField txtTglkembali;
    private javax.swing.JTextField txtTglpinjam;
    // End of variables declaration//GEN-END:variables
}
