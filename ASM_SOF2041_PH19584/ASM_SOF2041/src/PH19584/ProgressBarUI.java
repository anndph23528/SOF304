
package PH19584;

import Utils.XImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Nguyen Truc
 */
public class ProgressBarUI extends javax.swing.JFrame {

    /**
     * Creates new form ProgressBarUI
     */
    Timer t;
    public ProgressBarUI() {
        initComponents();
        // Change default icon 
//        ImageIcon icon = new ImageIcon("src\\Icons\\fpt.png");
//        this.setIconImage(icon.getImage());
        this.setIconImage(XImage.getAppIcon());
        // Tao doi tuong timer
        t  = new Timer(10,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // sau mỗi giây tăng giá trị progress lên 1 đơn vị-> nếu quá 100 bắt đầu lại từ 0
                int value = prgui.getValue()+1;
                prgui.setValue(value);
                if(value==100){
                    new LoginUI().setVisible(true);
                    dispose();
                    return;
                }
            }
        });
         t.start();
        } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnimg = new javax.swing.JPanel();
        prgui = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnimg.setBackground(new java.awt.Color(0, 153, 153));
        pnimg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prgui.setBackground(new java.awt.Color(255, 255, 255));
        prgui.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        prgui.setValue(1);
        prgui.setStringPainted(true);
        pnimg.add(prgui, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 843, 28));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/password.png"))); // NOI18N
        pnimg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 985, 510));

        getContentPane().add(pnimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 985, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgressBarUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnimg;
    public static javax.swing.JProgressBar prgui;
    // End of variables declaration//GEN-END:variables
}
