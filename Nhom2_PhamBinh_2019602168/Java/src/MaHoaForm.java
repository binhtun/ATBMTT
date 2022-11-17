
import aes.AES;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import lsb.LSB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class MaHoaForm extends javax.swing.JFrame {

    /**
     * Creates new form MaHoa
     */
    public MaHoaForm() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtContent = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSecretKey = new javax.swing.JTextField();
        imageBefore = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        imageAffter = new javax.swing.JScrollPane();
        btnOpen = new javax.swing.JButton();
        btnEncrypt = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnOpenContent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mã hóa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mã hóa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Thông điệp mã hóa:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Khóa bí mật:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ảnh ban đầu");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Ảnh đã mã hóa:");

        btnOpen.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnOpen.setText("Chọn ảnh");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnEncrypt.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnEncrypt.setText("Mã hóa");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton3.setText("Trở về");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnOpenContent.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnOpenContent.setText("Chọn File");
        btnOpenContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenContentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imageBefore)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imageAffter)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnOpen)
                        .addGap(43, 43, 43)
                        .addComponent(btnEncrypt)
                        .addGap(45, 45, 45)
                        .addComponent(jButton3)
                        .addGap(211, 211, 211))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSecretKey, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtContent)
                                .addGap(18, 18, 18)
                                .addComponent(btnOpenContent)))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenContent))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSecretKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18,18,18)
                        .addComponent(imageAffter, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(imageBefore, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpen)
                    .addComponent(btnEncrypt)
                    .addComponent(jButton3))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:


    }//GEN-LAST:event_formWindowOpened

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
        try {
            File file = showFileDialog(true);
            BufferedImage bufferedImage = ImageIO.read(file);
            bufferedImageBefore = bufferedImage;
            JLabel l = new JLabel(new ImageIcon(bufferedImage));
            imageBefore.getViewport().add(l);
        } catch (IOException ex) {
            Logger.getLogger(MaHoaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        // TODO add your handling code here:
//        String content = txtContent.getText().trim();
        String content = contentFile.trim();
        String secretKey = txtSecretKey.getText().trim();
        if (content.compareTo("") == 0 || secretKey.compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "Nội dung và khóa bí mật không được để trống","Dữ liệu không hợp lệ", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (bufferedImageBefore == null) {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn ảnh", "Dữ liệu không hợp lệ", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String encryptedContent = AES.encrypt(content, secretKey);
        int[] bits = LSB.getBitFromContent(encryptedContent);

        try {
            LSB.hideTheMessage(bits, bufferedImageBefore);
            File file = new File(".\\images\\image_encrypted.png");
            BufferedImage bufferedImage = ImageIO.read(file);
            JLabel l = new JLabel(new ImageIcon(bufferedImage));
            imageAffter.getViewport().add(l);
            JOptionPane.showMessageDialog(this, "Mã hóa thành công.\n Ảnh được lưu vào :\n" + dirFile.getAbsolutePath()+ "\\image_encrypted.png", "Mã hóa", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mã hóa thất bại", "Mã hóa", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnOpenContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenContentActionPerformed
        // TODO add your handling code here:

        try {
            String dataString = "";
            File file = showFileContentDialog(true);
            txtContent.setText(file.getAbsolutePath());
            Scanner scanner = new Scanner(Paths.get(file.getAbsolutePath()), "UTF-8");
            while (scanner.hasNext()) {
                String data = scanner.nextLine();
                dataString += data;
                dataString += "\n";
            }
            contentFile = dataString;
        } catch (IOException ex) {
            Logger.getLogger(MaHoaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOpenContentActionPerformed

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

    private File showFileContentDialog(final boolean open) {
        JFileChooser fc = new JFileChooser("Open a file");
        fc.setCurrentDirectory(new File(".").getAbsoluteFile());
        FileFilter ff = new FileFilter() {
            public boolean accept(File f) {
                String name = f.getName().toLowerCase();
                if (open) {
                    return f.isDirectory() || name.endsWith(".txt") || name.endsWith(".dat");
                }
                return f.isDirectory() || name.endsWith(".txt") || name.endsWith(".dat");
            }

            public String getDescription() {
                if (open) {
                    return "Image (*.txt, *.dat)";
                }
                return "Image (*.txt, *.dat)";
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
            java.util.logging.Logger.getLogger(MaHoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaHoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaHoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaHoaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaHoaForm().setVisible(true);
            }
        });
    }

    private String contentFile;
    private File dirFile = new File("images");
    private BufferedImage bufferedImageBefore;
    private BufferedImage bufferedImageAfter;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnOpenContent;
    private javax.swing.JScrollPane imageAffter;
    private javax.swing.JScrollPane imageBefore;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtContent;
    private javax.swing.JTextField txtSecretKey;
    // End of variables declaration//GEN-END:variables
}
