package Principal;

import javax.swing.JLabel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author dvchinx_
 */
public class JfrWebScrapping extends javax.swing.JFrame {

    private int xMouse, yMouse;
    private String url = "https://blog.facialix.com";
    
    private JLabel lbls[] = new JLabel[10];
    
    public JfrWebScrapping() {
        initComponents();
        lbls[0]=lbl1;
        lbls[1]=lbl2;
        lbls[2]=lbl3;
        lbls[3]=lbl4;
        lbls[4]=lbl5;
        lbls[5]=lbl6;
        lbls[6]=lbl7;
        lbls[7]=lbl8;
        lbls[8]=lbl9;
        lbls[9]=lbl10;
    }
    
    public void WebScrapp(){
        try {
            Document doc = Jsoup.connect(url).get();
            Elements h2 = doc.select("h2");
            
            for (int i = 0; i < h2.size(); i++) {
                lbls[i].setText("<html>"+h2.get(i).text()+"<html>");
            }
        } catch (Exception e) {
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl3.setForeground(new java.awt.Color(0, 0, 0));
        lbl3.setText("3. (Not Found)");
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 660, 40));

        lbl1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 0));
        lbl1.setText("1. (Not Found)");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 660, 40));

        lbl2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 0));
        lbl2.setText("2. (Not Found)");
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 660, 40));

        lbl6.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl6.setForeground(new java.awt.Color(0, 0, 0));
        lbl6.setText("6. (Not Found)");
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 660, 40));

        lbl5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl5.setForeground(new java.awt.Color(0, 0, 0));
        lbl5.setText("5. (Not Found)");
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 660, 40));

        lbl4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl4.setForeground(new java.awt.Color(0, 0, 0));
        lbl4.setText("4. (Not Found)");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 660, 40));

        lbl8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl8.setForeground(new java.awt.Color(0, 0, 0));
        lbl8.setText("8. (Not Found)");
        jPanel1.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 660, 40));

        lbl7.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl7.setForeground(new java.awt.Color(0, 0, 0));
        lbl7.setText("7. (Not Found)");
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 660, 40));

        lbl9.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl9.setForeground(new java.awt.Color(0, 0, 0));
        lbl9.setText("9. (Not Found)");
        jPanel1.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 660, 40));

        lbl10.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lbl10.setForeground(new java.awt.Color(0, 0, 0));
        lbl10.setText("10. (Not Found)");
        jPanel1.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 660, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 0, 40, 40));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Recargar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("WebScrapping: Facialix");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        WebScrapp();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    // End of variables declaration//GEN-END:variables
}
