
import aes.AES;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import lsb.LSB;


public class GiaiMaForm extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GiaiMaForm() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaContent = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtSecretKey = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        imageEncrypted = new javax.swing.JScrollPane();
        btnOpen = new javax.swing.JButton();
        btnDecrypt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giải Mã");

        txaContent.setColumns(20);
        txaContent.setRows(5);
        jScrollPane1.setViewportView(txaContent);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Nhập khóa bí mật:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Chọn ảnh đã mã hóa:");

        btnOpen.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnOpen.setText("Chọn ảnh");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnDecrypt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnDecrypt.setText("Giải Mã");
        btnDecrypt.setToolTipText("");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Giải Mã");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton3.setText("Đóng");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Nội dung sau khi giải mã:");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imageEncrypted)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnOpen)))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDecrypt)
                        .addGap(72, 72, 72)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSecretKey)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(imageEncrypted, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSecretKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addGap(18, 18, 18)
                .addComponent(btnOpen)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecrypt)
                    .addComponent(jButton3))
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
        try {
            File file = showFileDialog(true);
            BufferedImage bufferedImage = ImageIO.read(file);
            bufferedImageEncrypted = bufferedImage;
            JLabel l = new JLabel(new ImageIcon(bufferedImage));
            imageEncrypted.getViewport().add(l);
        } catch (IOException ex) {
            Logger.getLogger(MaHoaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        // TODO add your handling code here:
        String secretKey = txtSecretKey.getText().trim();
        if (secretKey.compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "Khóa bí mật không được để trống", "Dữ liệu không hợp lệ", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (bufferedImageEncrypted == null) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn ảnh", "Dữ liệu không hợp lệ", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String encryptedContent = LSB.decodeTheMessage(bufferedImageEncrypted);
            String rawData = AES.decrypt(encryptedContent, secretKey);
            if (rawData == null) {
                JOptionPane.showMessageDialog(this, "Khóa bí mật không đúng", "Giải Mã", JOptionPane.ERROR_MESSAGE);
                return;
            }
            txaContent.setText(rawData);
            JOptionPane.showMessageDialog(this, "Giải mã thành công", "Giải Mã", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Giải mã thất bại", "Giải Mã", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDecryptActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private File showFileDialog(final boolean open) {
        JFileChooser fc = new JFileChooser("Open an image");
        fc.setCurrentDirectory(new File(".").getAbsoluteFile());
        FileFilter ff = new FileFilter() {
            public boolean accept(File f) {
                String name = f.getName().toLowerCase();
                if (open) {
                    return f.isDirectory() || name.endsWith(".jpg") || name.endsWith(".jpeg")
                            || name.endsWith(".png") || name.endsWith(".gif") || name.endsWith(".tiff")
                            || name.endsWith(".bmp") || name.endsWith(".dib");
                }
                return f.isDirectory() || name.endsWith(".png") || name.endsWith(".bmp");
            }

            public String getDescription() {
                if (open) {
                    return "Image (*.jpg, *.jpeg, *.png, *.gif, *.tiff, *.bmp, *.dib)";
                }
                return "Image (*.png, *.bmp)";
            }
        };
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(ff);

        File f = null;
        if (open && fc.showOpenDialog(this) == fc.APPROVE_OPTION) {
            f = fc.getSelectedFile();
        } else if (!open && fc.showSaveDialog(this) == fc.APPROVE_OPTION) {
            f = fc.getSelectedFile();
        }
        return f;
    }

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
            java.util.logging.Logger.getLogger(GiaiMaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaiMaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaiMaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaiMaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaiMaForm().setVisible(true);
            }
        });
    }

    private BufferedImage bufferedImageEncrypted;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnOpen;
    private javax.swing.JScrollPane imageEncrypted;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaContent;
    private javax.swing.JTextField txtSecretKey;
    // End of variables declaration//GEN-END:variables
}
