package telas;
import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class GUI_principal extends javax.swing.JFrame {
         
//=========================================================================================
//	VARIÁVEIS GLOBAIS
//=========================================================================================
	
	static String retorno, nome, data, hora; 
	static int codigo;
         
//=========================================================================================
//	CONSTRUTOR
//=========================================================================================
	
         //CONSTRUTOR
        public GUI_principal() {
                 
                initComponents();
                DataHora(); //Configura a data e horário atual
//                this.setExtendedState(MAXIMIZED_BOTH);
                
                //Ajusta a imagem de fundo com a resolução do seu monitor
                //lbl_imagemfundo.setSize(this.getWidth(), this.getHeight());        
                DataHora(); //Configura a data e horário atual
                setIcon();
        }//CONSTRUTOR

//=========================================================================================
//	CÓDIGO GERADO AUTOMÁTICAMENTE
//=========================================================================================
	   
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ferramentas = new javax.swing.JToolBar();
        btn_ven = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_pro = new javax.swing.JButton();
        btn_usu = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_ven1 = new javax.swing.JButton();
        btn_ven3 = new javax.swing.JButton();
        btn_ven2 = new javax.swing.JButton();
        btn_tro = new javax.swing.JButton();
        painel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_codAtiv = new javax.swing.JLabel();
        lbl_usuAtiv = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        lbl_carAtiv = new javax.swing.JLabel();
        lbl_data = new javax.swing.JLabel();
        lbl_hora = new javax.swing.JLabel();
        mnu_menu = new javax.swing.JMenuBar();
        mnu_cad = new javax.swing.JMenu();
        mnu_cadPro = new javax.swing.JMenuItem();
        mnu_man = new javax.swing.JMenu();
        mnu_manUsu = new javax.swing.JMenuItem();
        mnu_manCat = new javax.swing.JMenuItem();
        mnu_manEst = new javax.swing.JMenuItem();
        mnu_mov = new javax.swing.JMenu();
        mnu_movVen = new javax.swing.JMenuItem();
        mnu_rel = new javax.swing.JMenu();
        mnu_rel_res = new javax.swing.JMenuItem();
        mnu_encer = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SLS 1.0");
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 100));
        setResizable(false);

        ferramentas.setBackground(new java.awt.Color(51, 51, 51));
        ferramentas.setBorder(null);
        ferramentas.setFloatable(false);
        ferramentas.setPreferredSize(new java.awt.Dimension(900, 72));

        btn_ven.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_ven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/venda64.png"))); // NOI18N
        btn_ven.setToolTipText("Venda");
        btn_ven.setFocusable(false);
        btn_ven.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ven.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_venActionPerformed(evt);
            }
        });
        ferramentas.add(btn_ven);
        ferramentas.add(jSeparator1);

        btn_pro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_pro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/novo64.png"))); // NOI18N
        btn_pro.setToolTipText("Produto");
        btn_pro.setFocusable(false);
        btn_pro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proActionPerformed(evt);
            }
        });
        ferramentas.add(btn_pro);

        btn_usu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_usu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pessoa64.png"))); // NOI18N
        btn_usu.setToolTipText("Usuário");
        btn_usu.setFocusable(false);
        btn_usu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_usu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuActionPerformed(evt);
            }
        });
        ferramentas.add(btn_usu);
        ferramentas.add(jSeparator2);

        btn_ven1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_ven1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/settings64.png"))); // NOI18N
        btn_ven1.setToolTipText("Configuração");
        btn_ven1.setFocusable(false);
        btn_ven1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ven1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ven1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ven1ActionPerformed(evt);
            }
        });
        ferramentas.add(btn_ven1);

        btn_ven3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_ven3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/percent64.png"))); // NOI18N
        btn_ven3.setToolTipText("Visão Geral");
        btn_ven3.setFocusable(false);
        btn_ven3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ven3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ven3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ven3ActionPerformed(evt);
            }
        });
        ferramentas.add(btn_ven3);

        btn_ven2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_ven2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/info64.png"))); // NOI18N
        btn_ven2.setToolTipText("Informações do sistema");
        btn_ven2.setFocusable(false);
        btn_ven2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ven2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_ven2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ven2ActionPerformed(evt);
            }
        });
        ferramentas.add(btn_ven2);

        btn_tro.setBackground(new java.awt.Color(51, 51, 51));
        btn_tro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_tro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/info64.png"))); // NOI18N
        btn_tro.setToolTipText("Informações do sistema");
        btn_tro.setFocusable(false);
        btn_tro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_tro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_troActionPerformed(evt);
            }
        });
        ferramentas.add(btn_tro);

        painel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painel.setPreferredSize(new java.awt.Dimension(900, 437));

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 25));

        lbl_codAtiv.setFont(new java.awt.Font("Eras Light ITC", 1, 15)); // NOI18N
        lbl_codAtiv.setText("codigo");
        jPanel1.add(lbl_codAtiv);

        lbl_usuAtiv.setFont(new java.awt.Font("Eras Light ITC", 1, 15)); // NOI18N
        lbl_usuAtiv.setForeground(new java.awt.Color(0, 0, 153));
        lbl_usuAtiv.setText("usuário");
        jPanel1.add(lbl_usuAtiv);
        jPanel1.add(separador1);

        lbl_carAtiv.setFont(new java.awt.Font("Eras Light ITC", 1, 15)); // NOI18N
        lbl_carAtiv.setText("funcao");
        jPanel1.add(lbl_carAtiv);

        lbl_data.setBackground(new java.awt.Color(200, 200, 180));
        lbl_data.setFont(new java.awt.Font("Eras Light ITC", 1, 15)); // NOI18N
        lbl_data.setForeground(new java.awt.Color(0, 0, 153));
        lbl_data.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_data.setText("dia mês ano");
        lbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_dataMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_data);

        lbl_hora.setBackground(new java.awt.Color(200, 200, 180));
        lbl_hora.setFont(new java.awt.Font("Eras Light ITC", 1, 15)); // NOI18N
        lbl_hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_hora.setText("xx:xx:xx");
        jPanel1.add(lbl_hora);

        mnu_menu.setBackground(new java.awt.Color(102, 102, 102));
        mnu_menu.setBorder(null);
        mnu_menu.setPreferredSize(new java.awt.Dimension(900, 20));
        mnu_menu.setVerifyInputWhenFocusTarget(false);

        mnu_cad.setBackground(new java.awt.Color(102, 102, 102));
        mnu_cad.setText("Cadastro");

        mnu_cadPro.setBackground(new java.awt.Color(102, 102, 102));
        mnu_cadPro.setText("Produto");
        mnu_cadPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_cadProActionPerformed(evt);
            }
        });
        mnu_cad.add(mnu_cadPro);

        mnu_menu.add(mnu_cad);

        mnu_man.setBackground(new java.awt.Color(102, 102, 102));
        mnu_man.setText("Manutenção");
        mnu_man.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_manActionPerformed(evt);
            }
        });

        mnu_manUsu.setBackground(new java.awt.Color(102, 102, 102));
        mnu_manUsu.setText("Usuário");
        mnu_manUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_manUsuActionPerformed(evt);
            }
        });
        mnu_man.add(mnu_manUsu);

        mnu_manCat.setBackground(new java.awt.Color(102, 102, 102));
        mnu_manCat.setText("Categoria");
        mnu_manCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_manCatActionPerformed(evt);
            }
        });
        mnu_man.add(mnu_manCat);

        mnu_manEst.setText("Estoque");
        mnu_manEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_manEstActionPerformed(evt);
            }
        });
        mnu_man.add(mnu_manEst);

        mnu_menu.add(mnu_man);

        mnu_mov.setBackground(new java.awt.Color(102, 102, 102));
        mnu_mov.setText("Movimentação");

        mnu_movVen.setBackground(new java.awt.Color(102, 102, 102));
        mnu_movVen.setText("Venda");
        mnu_movVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_movVenActionPerformed(evt);
            }
        });
        mnu_mov.add(mnu_movVen);

        mnu_menu.add(mnu_mov);

        mnu_rel.setText("Relatórios");

        mnu_rel_res.setText("Resumo");
        mnu_rel_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_rel_resActionPerformed(evt);
            }
        });
        mnu_rel.add(mnu_rel_res);

        mnu_menu.add(mnu_rel);

        mnu_encer.setBackground(new java.awt.Color(102, 102, 102));
        mnu_encer.setText("Encerrar o sistema");
        mnu_encer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_encerMouseClicked(evt);
            }
        });
        mnu_encer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_encerActionPerformed(evt);
            }
        });
        mnu_menu.add(mnu_encer);

        setJMenuBar(mnu_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//=========================================================================================
//	AÇÕES
//=========================================================================================

    private void mnu_manUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_manUsuActionPerformed
        // Novo cadastro de usuario
        new tela_usuario().setVisible(true);
    }//GEN-LAST:event_mnu_manUsuActionPerformed

    private void btn_venActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_venActionPerformed
        // Nova venda
        new tela_venda().setVisible(true);
    }//GEN-LAST:event_btn_venActionPerformed

    private void mnu_cadProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_cadProActionPerformed
        // Novo produto 
        new tela_produto().setVisible(true);
        
    }//GEN-LAST:event_mnu_cadProActionPerformed

    private void btn_ven1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ven1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ven1ActionPerformed

    private void btn_ven2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ven2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ven2ActionPerformed

    private void btn_ven3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ven3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ven3ActionPerformed

    private void btn_proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proActionPerformed
        // Novo cadastro de produto
        new tela_produto().setVisible(true);
    }//GEN-LAST:event_btn_proActionPerformed

    private void btn_usuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuActionPerformed
        // Novo cadastro de usuario
        new tela_usuario().setVisible(true);
    }//GEN-LAST:event_btn_usuActionPerformed

    private void mnu_movVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_movVenActionPerformed
        // Novo venda ou troca
        new tela_venda().setVisible(true);
    }//GEN-LAST:event_mnu_movVenActionPerformed

    private void lbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_dataMouseClicked

    }//GEN-LAST:event_lbl_dataMouseClicked

         private void btn_troActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_troActionPerformed
                  //Fazer login com outro usuario
                  this.dispose();
                  new GUI_login().setVisible(true);
         }//GEN-LAST:event_btn_troActionPerformed

         private void mnu_manCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_manCatActionPerformed
                  new tela_categoria().setVisible(true);
         }//GEN-LAST:event_mnu_manCatActionPerformed

         private void mnu_manActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_manActionPerformed
                  
         }//GEN-LAST:event_mnu_manActionPerformed

         private void mnu_encerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_encerActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_mnu_encerActionPerformed

         private void mnu_encerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_encerMouseClicked
                  int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja encerrar o sistema ?");
                  //Funcao.Fechar(gerenciador);
                  if(opcao == 0){
                           System.exit(0);
                  }//IF
                  //System.exit(0);
         }//GEN-LAST:event_mnu_encerMouseClicked

    private void mnu_manEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_manEstActionPerformed
        new tela_estoque().setVisible(true);
    }//GEN-LAST:event_mnu_manEstActionPerformed

    private void mnu_rel_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_rel_resActionPerformed
		
		new GUI_resumo().setVisible(true);
		
    }//GEN-LAST:event_mnu_rel_resActionPerformed

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
                            //  UTILIZA O JTATTO PARA ALTERAR O LOOK N FEEL    
                            //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                                    if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                    }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(GUI_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(GUI_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(GUI_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(GUI_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
        //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new GUI_principal().setVisible(true);
                        }
                });
        }
	   
//=========================================================================================
//	COMPONENTES DO JFRAME
//=========================================================================================

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pro;
    private javax.swing.JButton btn_tro;
    private javax.swing.JButton btn_usu;
    private javax.swing.JButton btn_ven;
    private javax.swing.JButton btn_ven1;
    private javax.swing.JButton btn_ven2;
    private javax.swing.JButton btn_ven3;
    private javax.swing.JToolBar ferramentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JLabel lbl_carAtiv;
    private javax.swing.JLabel lbl_codAtiv;
    private javax.swing.JLabel lbl_data;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_usuAtiv;
    private javax.swing.JMenu mnu_cad;
    private javax.swing.JMenuItem mnu_cadPro;
    private javax.swing.JMenu mnu_encer;
    private javax.swing.JMenu mnu_man;
    private javax.swing.JMenuItem mnu_manCat;
    private javax.swing.JMenuItem mnu_manEst;
    private javax.swing.JMenuItem mnu_manUsu;
    private javax.swing.JMenuBar mnu_menu;
    private javax.swing.JMenu mnu_mov;
    private javax.swing.JMenuItem mnu_movVen;
    private javax.swing.JMenu mnu_rel;
    private javax.swing.JMenuItem mnu_rel_res;
    private javax.swing.JPanel painel;
    private javax.swing.JSeparator separador1;
    // End of variables declaration//GEN-END:variables

//=========================================================================================
//	MÉTODOS
//=========================================================================================
         
         //CONFIGURAÇÃO DE PERMISSÃO DE USUÁRIO
         public void Configuracao(String ret, int cod, String nom){
		GUI_principal.retorno = ret;
		GUI_principal.codigo = cod;
		GUI_principal.nome = nom;		
		
                  this.lbl_codAtiv.setText("Código: "+codigo);
                  this.lbl_carAtiv.setText("Função: "+retorno);
                  this.lbl_usuAtiv.setText("Usuário: "+nome);
                  switch(retorno){
                           case "Vendedor":
                                    this.btn_pro.setEnabled(false);
                                    this.btn_usu.setEnabled(false);
                                    this.mnu_man.setEnabled(false);
                                    this.mnu_cad.setEnabled(false);
                                    this.mnu_rel.setEnabled(false);
                                    break;
                  }//SWITCH
         }//CONFIGURAÇÃO
         
         //CENTRALIZA INTERNAL FRAME
         private void CentralizaForm(JInternalFrame frame) {
                  
                  Dimension desktopSize = painel.getSize();//Captura a altura e largura do painel
                  Dimension jInternalFrameSize = frame.getSize();//Captura a alltura e largura do internal frame
                  frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                  (desktopSize.height - jInternalFrameSize.height) / 2);
                  
         }//CENTRALIZA INTERNAL FRAME
         
         //DATA E HORA
         public void DataHora(){
    
        //NOVA THREAD
        new Thread() {
            @Override
            public void run() {
                
                for(;;) {
                    
                    //Instancia o calendario gregoriano
                    GregorianCalendar Calendar = new GregorianCalendar();
                    //Captura o dia
                    int dia = Calendar.get(GregorianCalendar.DAY_OF_MONTH);
                    Calendar data = Calendar.getInstance();
                    
                    //Captura o mês
                    String mes="";
                    switch(data.get(Calendar.MONTH)+1) {
                        case 1:mes="Janeiro"; break;
                        case 2:mes="Fevereiro‎"; break;
                        case 3:mes="Março‎"; break;
                        case 4:mes="Abril‎"; break;
                        case 5:mes="Maio"; break;
                        case 6:mes="Junho"; break;
                        case 7:mes="Julho"; break;
                        case 8:mes="Agosto"; break;
                        case 9:mes="Setembro"; break;  
                        case 10:mes="Outubro"; break; 
                        case 11:mes="Novembro"; break; 
                        case 12:mes="Dezembro"; break;
                        default:mes="Mês Inválido"; break;
                    }//SWITCH
                    
                    //Captura o ano
                    int ano = Calendar.get(GregorianCalendar.YEAR);
                    
                    //Finaliza com a data atual
			GUI_principal.data =  ""+dia+"/"+mes+"/"+ano;
                    lbl_data.setText(GUI_principal.data);
                    
                    //Define o relógio com a hora atual
                    int hora=Calendar.get(GregorianCalendar.HOUR_OF_DAY);//HORA
                    int min=Calendar.get(GregorianCalendar.MINUTE);//MINUTOS
                    int seg=Calendar.get(GregorianCalendar.SECOND);//SEGUNDOS
                    
                    //Variaveis que serão exibidas 
                    final String horaString;
                    final String minString;
                    final String segString;
                    
                    //Condição para aplicar um 0 caso a hora seja de apenas 1 digito
                    if(hora<10) {
                    horaString="0"+hora;
                    } else {
                       horaString=""+hora;
                    }//IF
                    
                    //Condição para aplicar um 0 caso os minutos sejam de apenas 1 digito
                    if(min<10) {
                        minString="0"+min;
                    } else {
                       minString=""+min;
                    }//IF
                    
                    //Condição para aplicar um 0 caso os segundos sejam de apenas 1 digito
                    if(seg<10) {
                        segString="0"+seg;
                    } else {
                       segString=""+seg;
                    }//IF
                    
                    //Finaliza com o relógio que será exibido
			GUI_principal.hora = horaString+":"+minString+":"+segString;
                    lbl_hora.setText(GUI_principal.hora);
                    
                    //Define o tempo de atualização do label
                    try {
                          sleep(1000);
                        }//TRY
                    catch (InterruptedException ex) {
                     System.out.println("Ocorreu um erro");
                    }//CHATCH  
                
                }//FOR
 
            }//RUN
            
        }//THREAD
        .start();
    
    }//DATA HORA

    private void setIcon() {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/venda48.png")));
    
    }//ICONE 

}//CLASS
