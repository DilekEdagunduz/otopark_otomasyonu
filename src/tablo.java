
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dilek Eda
 */
public class tablo extends javax.swing.JFrame {

    /**
     * Creates new form tablo
     */
    
    DefaultTableModel tablo =new DefaultTableModel();
    
    public tablo() {
        initComponents();
        gosterge_tablosu.setModel (tablo);
        tablo.setColumnIdentifiers(new String [] {"Ad", "Soyad", "Numara", "Plaka", "Saat"});
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
        sys_ad = new javax.swing.JTextField();
        sys_soyad = new javax.swing.JTextField();
        sys_numara = new javax.swing.JTextField();
        sys_plaka = new javax.swing.JTextField();
        sys_giris_saati = new javax.swing.JTextField();
        btn_kaydet = new javax.swing.JButton();
        btn_iptal = new javax.swing.JButton();
        btn_cikis = new javax.swing.JButton();
        btn_sonlandir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gosterge_tablosu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Müşteri Girişi");
        setLocation(new java.awt.Point(250, 200));

        jLabel1.setText("Müşteri Adı:");

        jLabel2.setText("Soyadı: ");

        jLabel3.setText("İletişim Numarası:");

        jLabel4.setText("Araç Plakası:");

        jLabel5.setText("Giriş saati: ");

        sys_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_adActionPerformed(evt);
            }
        });

        sys_numara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_numaraActionPerformed(evt);
            }
        });

        btn_kaydet.setBackground(new java.awt.Color(102, 255, 51));
        btn_kaydet.setText("Kaydet");
        btn_kaydet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });

        btn_iptal.setBackground(new java.awt.Color(255, 0, 51));
        btn_iptal.setText("İptal");
        btn_iptal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iptalActionPerformed(evt);
            }
        });

        btn_cikis.setBackground(new java.awt.Color(204, 0, 102));
        btn_cikis.setText("Çıkış Yap");
        btn_cikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        btn_sonlandir.setBackground(new java.awt.Color(51, 255, 255));
        btn_sonlandir.setText("Sistemi Sonlandır");
        btn_sonlandir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sonlandir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sonlandirActionPerformed(evt);
            }
        });

        gosterge_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(gosterge_tablosu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sys_soyad, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(sys_ad)
                            .addComponent(sys_numara)
                            .addComponent(sys_plaka)
                            .addComponent(sys_giris_saati)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_sonlandir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addComponent(btn_cikis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_iptal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_kaydet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(sys_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sys_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sys_numara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sys_plaka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sys_giris_saati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_kaydet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_iptal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cikis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sonlandir)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sys_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_adActionPerformed

    private void sys_numaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_numaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_numaraActionPerformed

    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed
            String ad = sys_ad.getText();
            String soyad =sys_soyad.getText();
            String numara = sys_numara.getText();
            String plaka =sys_plaka.getText();
            String saat= sys_giris_saati.getText();
            sys_ad.setText("");
            sys_soyad.setText("");
            sys_numara.setText("");
            sys_plaka.setText("");
            sys_giris_saati.setText("");
            String save_message = "Kayıt Tamamlandı";
            JOptionPane.showMessageDialog(rootPane, save_message);
            tablo.addRow(new String[] {ad,soyad,numara,plaka,saat});
    }//GEN-LAST:event_btn_kaydetActionPerformed

    private void btn_iptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iptalActionPerformed
           sys_ad.setText("");
            sys_soyad.setText("");
            sys_numara.setText("");
            sys_plaka.setText("");
            sys_giris_saati.setText("");
    }//GEN-LAST:event_btn_iptalActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
        Double hesap;
        String giris_saati =JOptionPane.showInputDialog("Giriş saati");
        String cikis_saati =JOptionPane.showInputDialog("Çıkış  saati");
        Double grs_sti = Double.parseDouble(giris_saati);
        Double cks_sti = Double.parseDouble(cikis_saati);
        Double  saat_farki= (cks_sti - grs_sti) ;
        hesap = saat_farki * 15;
        JOptionPane.showMessageDialog(rootPane,"Tutar : "+String.valueOf( hesap));
        tablo.removeRow (gosterge_tablosu.getSelectedRow());
    }//GEN-LAST:event_btn_cikisActionPerformed

    private void btn_sonlandirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sonlandirActionPerformed
       dispose();
    }//GEN-LAST:event_btn_sonlandirActionPerformed

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
            java.util.logging.Logger.getLogger(tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_iptal;
    private javax.swing.JButton btn_kaydet;
    private javax.swing.JButton btn_sonlandir;
    private javax.swing.JTable gosterge_tablosu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sys_ad;
    private javax.swing.JTextField sys_giris_saati;
    private javax.swing.JTextField sys_numara;
    private javax.swing.JTextField sys_plaka;
    private javax.swing.JTextField sys_soyad;
    // End of variables declaration//GEN-END:variables
}
