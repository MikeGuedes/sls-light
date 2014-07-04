package telas;
import funcoes.Rotinas;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

public class GUI_splash extends javax.swing.JFrame {

//=========================================================================================
//	VARIÁVEIS GLOBAIS
//=========================================================================================
	
         EntityManager gerenciador;
         Rotinas rotina = new Rotinas();

//=========================================================================================
//	CONSTRUTOR
//=========================================================================================
	    
    public GUI_splash() {
        initComponents();
        new Thread(){
            public void run(){
                     bar_prog.setVisible(false);
                     
                for(int contador = -30 ; contador <101 ; contador++){
                    try {
                        sleep(100);
                        if(contador < 0){
                                 bar_prog.setValue(0);
                        }else {
                                 bar_prog.setVisible(true);
                                 bar_prog.setValue(contador);
                                 lbl_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imagens-sls-light-splash2.png")));
                        }//IF

                    } catch (InterruptedException ex) {
                        Logger.getLogger(GUI_splash.class.getName()).log(Level.SEVERE, null, ex);
                    }//TRY
                }//FOR
                setVisible(false);
                new GUI_login().setVisible(true);
            }//RUN
        }.start();//THRED

    }

//=========================================================================================
//	CÓDIGO GERADO AUTOMÁTICAMENTE
//=========================================================================================
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bar_prog = new javax.swing.JProgressBar();
        lbl_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar_prog.setBorderPainted(false);
        bar_prog.setPreferredSize(new java.awt.Dimension(146, 4));
        bar_prog.setString("");
        bar_prog.setStringPainted(true);
        jPanel1.add(bar_prog, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 214, 500, -1));

        lbl_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens-sls-light-splash1.png"))); // NOI18N
        jPanel1.add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(500, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//=========================================================================================
//	MÉTODO MAIN
//=========================================================================================
	    
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
            java.util.logging.Logger.getLogger(GUI_splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_splash().setVisible(true);
            }
        });
    }
    
//=========================================================================================
//	COMPONENTES DO JFRAME
//=========================================================================================

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar_prog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bg;
    // End of variables declaration//GEN-END:variables

}//CLASS
