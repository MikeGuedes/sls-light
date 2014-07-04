package telas;
import classes.Usuario;
import funcoes.Rotinas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class GUI_login extends javax.swing.JFrame {
         
//=========================================================================================
//	VARIÁVEIS GLOBAIS
//=========================================================================================
	
	EntityManager gerenciador;
	Query consulta;
	List <Usuario> listaUsuario;
	Rotinas rotina = new Rotinas();
	Usuario usuario =new Usuario();
         
//=========================================================================================
//	CONSTRUTOR
//=========================================================================================
	
	public GUI_login() {
		initComponents();
	}
	
//=========================================================================================
//	CÓDIGO GERADO AUTOMÁTICAMENTE
//=========================================================================================
	
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_principal = new javax.swing.JPanel();
        lbl_msg = new javax.swing.JLabel();
        lbl_senha = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        txt_sen = new javax.swing.JPasswordField();
        btn_entrar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        lbl_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(440, 300));
        setResizable(false);

        pnl_principal.setPreferredSize(new java.awt.Dimension(400, 220));
        pnl_principal.setRequestFocusEnabled(false);
        pnl_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_msg.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lbl_msg.setForeground(new java.awt.Color(255, 255, 153));
        pnl_principal.add(lbl_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 240, 30));

        lbl_senha.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        lbl_senha.setForeground(new java.awt.Color(255, 255, 255));
        lbl_senha.setText("Senha");
        pnl_principal.add(lbl_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        lbl_usuario.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuario.setText("Código");
        pnl_principal.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        txt_cod.setBackground(new java.awt.Color(204, 204, 204));
        txt_cod.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        pnl_principal.add(txt_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 97, -1));

        txt_sen.setBackground(new java.awt.Color(204, 204, 204));
        txt_sen.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        pnl_principal.add(txt_sen, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 97, -1));

        btn_entrar.setBackground(new java.awt.Color(0, 0, 0));
        btn_entrar.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        btn_entrar.setForeground(new java.awt.Color(204, 204, 204));
        btn_entrar.setText("Entrar");
        btn_entrar.setFocusable(false);
        btn_entrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_entrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });
        pnl_principal.add(btn_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 97, -1));

        btn_sair.setBackground(new java.awt.Color(0, 0, 0));
        btn_sair.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        btn_sair.setForeground(new java.awt.Color(204, 204, 204));
        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        pnl_principal.add(btn_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 97, -1));

        lbl_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagens-sls-light-login.png"))); // NOI18N
        pnl_principal.add(lbl_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(439, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//=========================================================================================
//	AÇÕES
//=========================================================================================    
	    
        private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
                 //--------------------------------------------------------------------
                 gerenciador = rotina.Conectar();
				 
                  int id = Integer.parseInt(this.txt_cod.getText());
		String senha = this.txt_sen.getText();
                 usuario = rotina.Acesso(gerenciador, id, senha);
				 
                 if(usuario == null || !usuario.getSenha().equals(senha)){
					 
                          this.lbl_msg.setText("Usuario inválido");
						  
                 }else{
					 
			if(usuario.getId() == id && usuario.getSenha().equals(senha) && usuario.isStatus() == true){
				
				this.dispose();
			
			}else{
				
				this.lbl_msg.setText("Usuario inativo");
			
			}//IF

                 }//IF
                 
		rotina.Fechar(gerenciador);
        }//GEN-LAST:event_btn_entrarActionPerformed
        
         private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
                  // TODO add your handling code here:
                  System.exit(0);
         }//GEN-LAST:event_btn_sairActionPerformed

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
                        java.util.logging.Logger.getLogger(GUI_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(GUI_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(GUI_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(GUI_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
        //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new GUI_login().setVisible(true);
                        }
                });
        }//MAIN
	   
//=========================================================================================
//	COMPOMPONENTES DO JFRAME
//=========================================================================================

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JLabel lbl_msg;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JPasswordField txt_sen;
    // End of variables declaration//GEN-END:variables

}//CLASS