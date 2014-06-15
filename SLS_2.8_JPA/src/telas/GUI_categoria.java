package telas;
import classes.Categoria;
import funcoes.Rotinas;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class GUI_categoria extends javax.swing.JInternalFrame {
	
//=========================================================================================
//	VARIÁVEIS GLOBAIS
//=========================================================================================

	EntityManager gerenciador; //Variável de acesso ao banco
	Query consulta;// variavel de consulta do banco
	Rotinas rotina = new Rotinas();// Instancia do DAO
	Categoria categoria = new Categoria();//Instancia da Entidade
	String alterador = "salva";// Variavel para alteração da função do 'btn_salvar'
	String tabela = "Categoria"; //Para fazer as percistencias
	
//=========================================================================================
//	CONSTRUTOR
//=========================================================================================
	
	public GUI_categoria() {
		initComponents();
		ReiniciaFormulario();//Inicia o formulario
	}

//=========================================================================================
//	CÓDIGO GERADO AUTOMÁTICAMENTE
//=========================================================================================
	   
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnl_principal = new javax.swing.JPanel();
        pnl_titulo = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_categoria = new javax.swing.JPanel();
        lbl_cv = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        rd_ativo = new javax.swing.JRadioButton();
        lbl_msg = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        pnl_acoes = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_primeiro = new javax.swing.JButton();
        btn_proximo = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        btn_localizar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de categoria");
        setPreferredSize(new java.awt.Dimension(455, 330));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        pnl_principal.setPreferredSize(new java.awt.Dimension(990, 460));
        pnl_principal.setRequestFocusEnabled(false);

        pnl_titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        pnl_titulo.setPreferredSize(new java.awt.Dimension(457, 50));

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 102, 153));
        lbl_titulo.setText("Formulário de Cadastro de Categoria");

        javax.swing.GroupLayout pnl_tituloLayout = new javax.swing.GroupLayout(pnl_titulo);
        pnl_titulo.setLayout(pnl_tituloLayout);
        pnl_tituloLayout.setHorizontalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_tituloLayout.setVerticalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnl_categoria.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_cv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv.setText("Código da categoria:");

        lbl_codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_codigo.setForeground(new java.awt.Color(102, 102, 102));
        lbl_codigo.setText("Código");

        lbl_nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_nome.setForeground(new java.awt.Color(0, 102, 153));
        lbl_nome.setText("Nome *");

        txt_nome.setBackground(new java.awt.Color(255, 255, 204));
        txt_nome.setForeground(new java.awt.Color(102, 102, 102));

        rd_ativo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rd_ativo.setForeground(new java.awt.Color(0, 102, 153));
        rd_ativo.setText("Ativo");
        rd_ativo.setToolTipText("");

        lbl_msg.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lbl_msg.setForeground(new java.awt.Color(255, 51, 51));
        lbl_msg.setText("Mensagem de aviso");

        btn_salvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_salvar.setForeground(new java.awt.Color(102, 102, 102));
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_categoriaLayout = new javax.swing.GroupLayout(pnl_categoria);
        pnl_categoria.setLayout(pnl_categoriaLayout);
        pnl_categoriaLayout.setHorizontalGroup(
            pnl_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_categoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_categoriaLayout.createSequentialGroup()
                        .addGroup(pnl_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_categoriaLayout.createSequentialGroup()
                                .addGroup(pnl_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_categoriaLayout.createSequentialGroup()
                                        .addComponent(lbl_cv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_codigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rd_ativo))
                                    .addGroup(pnl_categoriaLayout.createSequentialGroup()
                                        .addComponent(lbl_nome)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(50, 50, 50))
                            .addGroup(pnl_categoriaLayout.createSequentialGroup()
                                .addComponent(txt_nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_categoriaLayout.createSequentialGroup()
                        .addComponent(lbl_msg)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_categoriaLayout.setVerticalGroup(
            pnl_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_categoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv)
                    .addComponent(lbl_codigo)
                    .addComponent(rd_ativo))
                .addGap(18, 18, 18)
                .addComponent(lbl_nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lbl_msg)
                .addContainerGap())
        );

        pnl_acoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_novo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(102, 102, 102));
        btn_novo.setText("Novo");
        btn_novo.setToolTipText("");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(102, 102, 102));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setToolTipText("");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_anterior.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_anterior.setForeground(new java.awt.Color(102, 102, 102));
        btn_anterior.setText("Anterior");
        btn_anterior.setToolTipText("");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_primeiro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_primeiro.setForeground(new java.awt.Color(102, 102, 102));
        btn_primeiro.setText("Primeiro");
        btn_primeiro.setToolTipText("");
        btn_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeiroActionPerformed(evt);
            }
        });

        btn_proximo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_proximo.setForeground(new java.awt.Color(102, 102, 102));
        btn_proximo.setText("Próximo");
        btn_proximo.setToolTipText("");
        btn_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximoActionPerformed(evt);
            }
        });

        btn_ultimo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ultimo.setForeground(new java.awt.Color(102, 102, 102));
        btn_ultimo.setText("Último");
        btn_ultimo.setToolTipText("");
        btn_ultimo.setPreferredSize(new java.awt.Dimension(69, 30));
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        btn_localizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_localizar.setForeground(new java.awt.Color(102, 102, 102));
        btn_localizar.setText("Localizar");
        btn_localizar.setToolTipText("");
        btn_localizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_localizarActionPerformed(evt);
            }
        });

        btn_alterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterar.setForeground(new java.awt.Color(102, 102, 102));
        btn_alterar.setText("Alterar");
        btn_alterar.setToolTipText("");
        btn_alterar.setPreferredSize(new java.awt.Dimension(120, 30));
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_acoesLayout = new javax.swing.GroupLayout(pnl_acoes);
        pnl_acoes.setLayout(pnl_acoesLayout);
        pnl_acoesLayout.setHorizontalGroup(
            pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_acoesLayout.createSequentialGroup()
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_primeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_proximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_localizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_acoesLayout.setVerticalGroup(
            pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_acoesLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_novo)
                    .addComponent(btn_anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_proximo)
                    .addComponent(btn_localizar))
                .addGap(0, 0, 0)
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_primeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(pnl_acoes, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_acoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//=========================================================================================
//	AÇÕES
//========================================================================================= 
	    
         private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
                  this.txt_nome.requestFocus();
                  this.txt_nome.setEnabled(true);
                  this.rd_ativo.setEnabled(true);
                  this.rd_ativo.setSelected(true);
                  this.txt_nome.setText("");
                  //------------------------------------------
                  this.btn_salvar.setEnabled(true);
                  this.btn_cancelar.setEnabled(true);
                  this.btn_novo.setEnabled(false);
                  this.btn_localizar.setEnabled(false);
                  this.lbl_msg.setText("Digite o nome da nova categoria !");
	this.lbl_codigo.setText("1");
                  //-------------------------------------------
                  gerenciador =rotina.Conectar();//ABRE A CONEXÃO
                  categoria = (Categoria)rotina.MostraCodigo(gerenciador, tabela);

	this.lbl_codigo.setText(String.valueOf(categoria.getId()+1));//FAZ A PREMONIÇÃO DO CODIGO

                  rotina.Fechar(gerenciador);//FECHA A CONEXÃO
         }//GEN-LAST:event_btn_novoActionPerformed

         private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
                  alterador = "salva"; //ALTERA A FUNÇÃO DO BOTÂO 'btn_salvar'
                  ReiniciaFormulario();//REINICIA O FORMULÁRIO
         }//GEN-LAST:event_btn_cancelarActionPerformed

         private void btn_localizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_localizarActionPerformed
                  //CAPTURA O CODIGO DO PRODUTO
                  int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código da categoria", "Busca por categoria", JOptionPane.QUESTION_MESSAGE));
                  
                  gerenciador = rotina.Conectar();//ABRE A CONEXÃO
                  categoria = (Categoria) rotina.Localiza(gerenciador, id, tabela);//PASSA O ID E RETORNA A CATEGORIA
                           this.btn_salvar.setEnabled(false);
                           this.btn_novo.setEnabled(false);
                           this.btn_cancelar.setEnabled(true);
                           this.btn_alterar.setEnabled(true);
                           this.btn_proximo.setEnabled(true);
                           this.btn_primeiro.setEnabled(true);
                           this.btn_ultimo.setEnabled(true);
                           this.btn_anterior.setEnabled(true);
                           //------------------------------------------
                           this.lbl_codigo.setText(""+categoria.getId());
                           this.txt_nome.setText(categoria.getNome());
                           this.rd_ativo.setSelected(categoria.isStatus());
                           this.lbl_msg.setText("Produtos desta categoria: "+categoria.getProdutoList().size());
                           //-------------------------------------------
                  rotina.Fechar(gerenciador);//FECHA A CONEXÃO
                  
         }//GEN-LAST:event_btn_localizarActionPerformed

         private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
                  gerenciador = rotina.Conectar();//ABRE A CONEXÃO
                  categoria = (Categoria)rotina.Anterior(gerenciador, Integer.parseInt(this.lbl_codigo.getText()), tabela);//PASSA O CODIGO E RETORNA A CATEGORIA
                           //------------------------------------------------------
                           this.lbl_codigo.setText(""+categoria.getId());
                           this.txt_nome.setText(categoria.getNome());
                           this.rd_ativo.setSelected(categoria.isStatus());
                           this.txt_nome.setEnabled(false);
                           this.rd_ativo.setEnabled(false);
                           this.lbl_msg.setText("Produtos desta categoria: "+categoria.getProdutoList().size());
                           //-------------------------------------------------------
                           this.btn_salvar.setEnabled(false);
                           this.btn_novo.setEnabled(false);
                           this.btn_cancelar.setEnabled(true);
                           this.btn_alterar.setEnabled(true);
                           this.btn_proximo.setEnabled(true);
                           this.btn_primeiro.setEnabled(true);
                           this.btn_ultimo.setEnabled(true);
                           this.btn_anterior.setEnabled(true);
                           this.btn_salvar.setEnabled(false);
                           //---------------------------------------------------------
                  rotina.Fechar(gerenciador);//FECHA A CONEXÃO
         }//GEN-LAST:event_btn_anteriorActionPerformed

         private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximoActionPerformed
                  gerenciador = rotina.Conectar(); //ABRE A CONEXÃO
                  categoria = (Categoria)rotina.Proximo(gerenciador, Integer.parseInt(this.lbl_codigo.getText()), tabela);//PASSA O CODIGO E RETORNA A CATEGORIA
                           //------------------------------------------------------
                           this.lbl_codigo.setText(""+categoria.getId());
                           this.txt_nome.setText(categoria.getNome());
                           this.rd_ativo.setSelected(categoria.isStatus());
                           this.txt_nome.setEnabled(false);
                           this.rd_ativo.setEnabled(false);
                           this.lbl_msg.setText("Produtos desta categoria: "+categoria.getProdutoList().size());
                           //------------------------------------------------------
                           this.btn_salvar.setEnabled(false);
                           this.btn_novo.setEnabled(false);
                           this.btn_cancelar.setEnabled(true);
                           this.btn_alterar.setEnabled(true);
                           this.btn_proximo.setEnabled(true);
                           this.btn_primeiro.setEnabled(true);
                           this.btn_ultimo.setEnabled(true);
                           this.btn_anterior.setEnabled(true);
                           this.btn_salvar.setEnabled(false);
                           //-----------------------------------------------------
                  rotina.Fechar(gerenciador);//FECHA A CONEXÃO
         }//GEN-LAST:event_btn_proximoActionPerformed

         private void btn_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeiroActionPerformed
                  gerenciador = rotina.Conectar(); //ABRE A CONEXÃO
                  categoria = (Categoria)rotina.Primeiro(gerenciador, tabela);//RETORNA A CATEGORIA
                           //------------------------------------------------------
                           this.lbl_codigo.setText(""+categoria.getId());
                           this.txt_nome.setText(categoria.getNome());
                           this.rd_ativo.setSelected(categoria.isStatus());
                           this.txt_nome.setEnabled(false);
                           this.rd_ativo.setEnabled(false);
                           this.lbl_msg.setText("Produtos desta categoria: "+categoria.getProdutoList().size());
                           //------------------------------------------------------
                           this.btn_salvar.setEnabled(false);
                           this.btn_novo.setEnabled(false);
                           this.btn_cancelar.setEnabled(true);
                           this.btn_alterar.setEnabled(true);
                           this.btn_proximo.setEnabled(true);
                           this.btn_primeiro.setEnabled(true);
                           this.btn_ultimo.setEnabled(true);
                           this.btn_anterior.setEnabled(true);
                           this.btn_salvar.setEnabled(false);
                           //-----------------------------------------------------
                  rotina.Fechar(gerenciador);//FECHA A CONEXÃO
         }//GEN-LAST:event_btn_primeiroActionPerformed

         private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
                  gerenciador = rotina.Conectar(); //ABRE A CONEXÃO
                  categoria = (Categoria)rotina.Ultimo(gerenciador, tabela);//RETORNA A CATEGORIA
                           //------------------------------------------------------
                           this.lbl_codigo.setText(""+categoria.getId());
                           this.txt_nome.setText(categoria.getNome());
                           this.rd_ativo.setSelected(categoria.isStatus());
                           this.txt_nome.setEnabled(false);
                           this.rd_ativo.setEnabled(false);
                           this.lbl_msg.setText("Produtos desta categoria: "+categoria.getProdutoList().size());
                           //------------------------------------------------------
                           this.btn_salvar.setEnabled(false);
                           this.btn_novo.setEnabled(false);
                           this.btn_cancelar.setEnabled(true);
                           this.btn_alterar.setEnabled(true);
                           this.btn_proximo.setEnabled(true);
                           this.btn_primeiro.setEnabled(true);
                           this.btn_ultimo.setEnabled(true);
                           this.btn_anterior.setEnabled(true);
                           this.btn_salvar.setEnabled(false);
                           //-----------------------------------------------------
                  rotina.Fechar(gerenciador);//FECHA A CONEXÃO
         }//GEN-LAST:event_btn_ultimoActionPerformed

         private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
                  if(this.txt_nome.getText().equals("")){
                           JOptionPane.showMessageDialog(null, "Digite um nome para a categoria.", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                           this.txt_nome.requestFocus();
                  }else{
                           gerenciador = rotina.Conectar();
                           switch(alterador){
                                    case "salva":
                                             int op = JOptionPane.showConfirmDialog(null, "Deseja realmente cadastrar esta categoria ?", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                                             if(op == 0){
                                                      categoria.setId(0);
                                                      categoria.setNome(this.txt_nome.getText());
                                                      categoria.setStatus(this.rd_ativo.isSelected());
                                                      rotina.Persistir(gerenciador, categoria);
                                                      
                                             }//IF
                                             ReiniciaFormulario();
                                             break;
                                    case "altera":
                                             int op1 = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar esta categoria ?", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                                             if(op1 == 0){
                                                      
                                                      categoria.setId(Integer.parseInt(this.lbl_codigo.getText()));
                                                      categoria.setNome(this.txt_nome.getText());
                                                      categoria.setStatus(this.rd_ativo.isSelected());
                                                      rotina.Update(gerenciador, categoria, tabela);
                                                      
                                             }//IF
                                             this.txt_nome.setEnabled(false);
                                             this.rd_ativo.setEnabled(false);
                                             this.btn_salvar.setEnabled(false);
                                             break;
                           }//SWITCH
                           rotina.Fechar(gerenciador);
                  }//IF
         }//GEN-LAST:event_btn_salvarActionPerformed

         private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
                  this.txt_nome.setEnabled(true);
                  this.rd_ativo.setEnabled(true);
                  this.btn_salvar.setEnabled(true);
                  this.txt_nome.requestFocus();
                  alterador = "altera";
         }//GEN-LAST:event_btn_alterarActionPerformed

//=========================================================================================
//	COMPOMPONENTES DO JFRAME
//=========================================================================================
	    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_localizar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_primeiro;
    private javax.swing.JButton btn_proximo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_cv;
    private javax.swing.JLabel lbl_msg;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_acoes;
    private javax.swing.JPanel pnl_categoria;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JPanel pnl_titulo;
    private javax.swing.JRadioButton rd_ativo;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables

//=========================================================================================
//	MÉTODOS
//=========================================================================================
	    
         public void ReiniciaFormulario(){
                  
                  this.btn_alterar.setEnabled(false);
                  this.btn_anterior.setEnabled(false);
                  this.btn_cancelar.setEnabled(false);
                  this.btn_novo.setEnabled(true);
                  this.btn_primeiro.setEnabled(false);
                  this.btn_proximo.setEnabled(false);
                  this.btn_salvar.setEnabled(false);
                  this.btn_ultimo.setEnabled(false);
                  this.btn_localizar.setEnabled(true);
                  
                  this.txt_nome.setEnabled(false);
                  this.txt_nome.setText("");
                  
                  this.rd_ativo.setEnabled(false);
                  this.rd_ativo.setSelected(false);
                  
                  this.lbl_codigo.setText("");
                  this.lbl_msg.setText("Clique em \"Novo\" para cadastrar.");
                  
         }//REINICIA FORMULÁRIO

}//CLASS
