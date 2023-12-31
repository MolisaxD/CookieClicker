/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author mborges
 */
public class CookieClickerTela extends javax.swing.JFrame {
    
    public int cookiesTotal = 0;
    public int cpcPreco = 10;
    public int cpcTotal = 1;
    public int autoclickerPreco = 10;
    public int autoclickerTotal = 0;
    public ArrayList<Timer> timers = new ArrayList();
    

    /**
     * Creates new form CookieClickerTela
     */
    public CookieClickerTela() {
        initComponents();
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
        lbTitle = new javax.swing.JLabel();
        btCookie = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbCookiesTotal = new javax.swing.JLabel();
        btCpc = new javax.swing.JButton();
        lbCpcTotal = new javax.swing.JLabel();
        lbCpcPreco = new javax.swing.JLabel();
        btAutoClicker = new javax.swing.JButton();
        lbAutoTotal = new javax.swing.JLabel();
        lbAutoPreco = new javax.swing.JLabel();
        btReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbCps = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Cookie Clicker");

        btCookie.setBackground(new java.awt.Color(255, 255, 255));
        btCookie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/images.jpg"))); // NOI18N
        btCookie.setAlignmentY(0.0F);
        btCookie.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btCookie.setHideActionText(true);
        btCookie.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCookie.setMargin(new java.awt.Insets(2, 1, 2, 1));
        btCookie.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btCookie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCookieActionPerformed(evt);
            }
        });

        jLabel1.setText("Clique no cookie para fazer novos cookies!");

        lbCookiesTotal.setText("Cookies: " + cookiesTotal);

        btCpc.setText("+1 CPC");
        btCpc.setToolTipText("(Cookie por clique)");
        btCpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCpcActionPerformed(evt);
            }
        });

        lbCpcTotal.setText("Total: " + cpcTotal);

        lbCpcPreco.setText("Preço: " + cpcPreco);

        btAutoClicker.setText("+1 autoclicker");
        btAutoClicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutoClickerActionPerformed(evt);
            }
        });

        lbAutoTotal.setText("Total: " + autoclickerTotal);

        lbAutoPreco.setText("Preço: " + autoclickerPreco);

        btReset.setText("Resetar progresso");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        jLabel2.setText("Clica para você a cada 5 segs");

        jLabel3.setText("Cookies por clique");

        lbCps.setText("Cookies por segundo (aprox.): " + (autoclickerTotal / 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(206, 206, 206))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCps)
                    .addComponent(lbCookiesTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCookie)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAutoClicker)
                            .addComponent(btReset)
                            .addComponent(jLabel3)
                            .addComponent(lbAutoTotal)
                            .addComponent(btCpc)
                            .addComponent(lbCpcTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAutoPreco)
                            .addComponent(jLabel2)
                            .addComponent(lbCpcPreco))))
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCookie)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCpc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCpcTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCpcPreco)
                        .addGap(18, 18, 18)
                        .addComponent(btAutoClicker)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbAutoTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbAutoPreco)
                        .addGap(22, 22, 22)
                        .addComponent(btReset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCookiesTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCps)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCpcActionPerformed
        // TODO add your handling code here:
       
        if(cookiesTotal >= cpcPreco) {
            //Cookies
            cookiesTotal -= cpcPreco;
            lbCookiesTotal.setText("Cookies: " + cookiesTotal);
            
             //CPC
            cpcTotal++;
            cpcPreco *= 1.2;
            lbCpcPreco.setText("Preço: " + cpcPreco);
            lbCpcTotal.setText("Total: " + cpcTotal);
        }
    }//GEN-LAST:event_btCpcActionPerformed

    private void btAutoClickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutoClickerActionPerformed
        // TODO add your handling code here:
        if(cookiesTotal >= autoclickerPreco) {
            
            //Configurar o método do autoclicker
            Timer timer = new Timer();

            TimerTask incrementCookies = new TimerTask() {
                @Override
                public void run() {
                    cookiesTotal++;
                    lbCookiesTotal.setText("Cookies: " + cookiesTotal);
                }
            };
            
            //Cookies
            cookiesTotal -= autoclickerPreco;
            lbCookiesTotal.setText("Cookies: " + cookiesTotal);
            
             //CPC
            autoclickerTotal++;
            autoclickerPreco *= 1.2;
            lbAutoPreco.setText("Preço: " + autoclickerPreco);
            lbAutoTotal.setText("Total: " + autoclickerTotal);
           
            //Chamar método configurado
            timer.scheduleAtFixedRate(incrementCookies, 0, 5000);
            
            //Salvar timer no array para cancelar depois
            timers.add(timer);
            
            
            
            lbCps.setText("Cookies por segundo (aprox.): " + (autoclickerTotal / 5));
        }
        
        
            
        
    }//GEN-LAST:event_btAutoClickerActionPerformed

    private void btCookieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCookieActionPerformed
        // TODO add your handling code here:
        cookiesTotal = (cookiesTotal + 1 * cpcTotal);
        lbCookiesTotal.setText("Cookies: " + cookiesTotal);
    }//GEN-LAST:event_btCookieActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
            cookiesTotal = 0;
            cpcPreco = 10;
            cpcTotal = 1;
            autoclickerPreco = 10;
            autoclickerTotal = 0; 
            
            lbCookiesTotal.setText("Cookies: " + cookiesTotal);
            lbCpcPreco.setText("Preço: " + cpcPreco);
            lbCpcTotal.setText("Total: " + cpcTotal);
            lbAutoPreco.setText("Preço: " + autoclickerPreco);
            lbAutoTotal.setText("Total: " + autoclickerTotal);
            
            for (Timer timer : timers) {
                timer.cancel();
            }
            
            lbCps.setText("Cookies por segundo (aprox.): " + (autoclickerTotal / 5));
            
            
    }//GEN-LAST:event_btResetActionPerformed

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
            java.util.logging.Logger.getLogger(CookieClickerTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CookieClickerTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CookieClickerTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CookieClickerTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CookieClickerTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAutoClicker;
    private javax.swing.JButton btCookie;
    private javax.swing.JButton btCpc;
    private javax.swing.JButton btReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAutoPreco;
    private javax.swing.JLabel lbAutoTotal;
    private javax.swing.JLabel lbCookiesTotal;
    private javax.swing.JLabel lbCpcPreco;
    private javax.swing.JLabel lbCpcTotal;
    private javax.swing.JLabel lbCps;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
