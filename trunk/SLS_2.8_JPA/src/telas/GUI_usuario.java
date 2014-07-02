package telas;
import classes.Usuario;
import funcoes.Rotinas;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class GUI_usuario extends javax.swing.JInternalFrame {

//=========================================================================================
//	VARIÁVEIS GLOBAIS
//=========================================================================================
	
         EntityManager gerenciador; //Variável de acesso ao banco
         Query consulta;// variavel de consulta do banco
         Rotinas rotina = new Rotinas();// Instancia do DAO
         Usuario usuario = new Usuario();//Instancia da Entidade
         String alterador = "salva";// Variavel para alteração da função do 'btn_salvar'
         String tabela = "Usuario"; //Para fazer as percistencias
         
//=========================================================================================
//	CONSTRUTOR
//=========================================================================================
	    
        public GUI_usuario() {
                initComponents();
                this.ReiniciaFormulario();
        }

//=========================================================================================
//	CÓDIGO GERADO AUTOMÁTICAMENTE
//=========================================================================================
	   
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnl_principal = new javax.swing.JPanel();
        pnl_acoes = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_primeiro = new javax.swing.JButton();
        btn_proximo = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        btn_localizar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        pnl_titulo = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_usuario = new javax.swing.JPanel();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        lbl_cv = new javax.swing.JLabel();
        lbl_codigo = new javax.swing.JLabel();
        rd_ativo = new javax.swing.JRadioButton();
        lbl_senha = new javax.swing.JLabel();
        txt_senha = new javax.swing.JTextField();
        lbl_csenha = new javax.swing.JLabel();
        txt_csenha = new javax.swing.JTextField();
        lbl_cargo = new javax.swing.JLabel();
        box_cargo = new javax.swing.JComboBox();
        lbl_salario = new javax.swing.JLabel();
        lbl_meta = new javax.swing.JLabel();
        lbl_comissao_pre = new javax.swing.JLabel();
        lbl_comissao_pos = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        lbl_msg = new javax.swing.JLabel();
        txt_comissao_pos = new javax.swing.JFormattedTextField();
        txt_comissao_pre = new javax.swing.JFormattedTextField();
        txt_meta = new javax.swing.JFormattedTextField();
        txt_salario = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Cadastro de usuário");
        setPreferredSize(new java.awt.Dimension(455, 450));

        pnl_acoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_novo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(102, 102, 102));
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(102, 102, 102));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_anterior.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_anterior.setForeground(new java.awt.Color(102, 102, 102));
        btn_anterior.setText("Anterior");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_primeiro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_primeiro.setForeground(new java.awt.Color(102, 102, 102));
        btn_primeiro.setText("Primeiro");
        btn_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeiroActionPerformed(evt);
            }
        });

        btn_proximo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_proximo.setForeground(new java.awt.Color(102, 102, 102));
        btn_proximo.setText("Próximo");
        btn_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximoActionPerformed(evt);
            }
        });

        btn_ultimo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ultimo.setForeground(new java.awt.Color(102, 102, 102));
        btn_ultimo.setText("Último");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        btn_localizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_localizar.setForeground(new java.awt.Color(102, 102, 102));
        btn_localizar.setText("Localizar");
        btn_localizar.setPreferredSize(new java.awt.Dimension(130, 23));
        btn_localizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_localizarActionPerformed(evt);
            }
        });

        btn_alterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterar.setForeground(new java.awt.Color(102, 102, 102));
        btn_alterar.setText("Alterar");
        btn_alterar.setPreferredSize(new java.awt.Dimension(130, 23));
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
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(btn_localizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        pnl_acoesLayout.setVerticalGroup(
            pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_acoesLayout.createSequentialGroup()
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btn_anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_proximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_localizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_novo))
                .addGap(0, 0, 0)
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btn_primeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ultimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 102, 153));
        lbl_titulo.setText("Formulário de Cadastro de Usuario");

        javax.swing.GroupLayout pnl_tituloLayout = new javax.swing.GroupLayout(pnl_titulo);
        pnl_titulo.setLayout(pnl_tituloLayout);
        pnl_tituloLayout.setHorizontalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_tituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(61, 61, 61))
        );
        pnl_tituloLayout.setVerticalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_usuario.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_nome.setForeground(new java.awt.Color(0, 102, 153));
        lbl_nome.setText("Nome*");

        txt_nome.setBackground(new java.awt.Color(255, 255, 204));
        txt_nome.setForeground(new java.awt.Color(102, 102, 102));

        lbl_cv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv.setText("Código do usuário:");

        lbl_codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_codigo.setForeground(new java.awt.Color(102, 102, 102));
        lbl_codigo.setText("Código");

        rd_ativo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rd_ativo.setForeground(new java.awt.Color(0, 102, 153));
        rd_ativo.setText("Ativo");

        lbl_senha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_senha.setForeground(new java.awt.Color(0, 102, 153));
        lbl_senha.setText("Senha*");

        txt_senha.setBackground(new java.awt.Color(255, 255, 204));
        txt_senha.setForeground(new java.awt.Color(102, 102, 102));

        lbl_csenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_csenha.setForeground(new java.awt.Color(0, 102, 153));
        lbl_csenha.setText("Senha*");

        txt_csenha.setBackground(new java.awt.Color(255, 255, 204));
        txt_csenha.setForeground(new java.awt.Color(102, 102, 102));

        lbl_cargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cargo.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cargo.setText("Cargo*");

        box_cargo.setBackground(new java.awt.Color(255, 255, 204));
        box_cargo.setForeground(new java.awt.Color(102, 102, 102));
        box_cargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vendedor", "Gerente" }));

        lbl_salario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_salario.setForeground(new java.awt.Color(0, 102, 153));
        lbl_salario.setText("Salário (R$)");

        lbl_meta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_meta.setForeground(new java.awt.Color(0, 102, 153));
        lbl_meta.setText("Meta (R$)");

        lbl_comissao_pre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_comissao_pre.setForeground(new java.awt.Color(0, 102, 153));
        lbl_comissao_pre.setText("Comissão pré meta (%)");

        lbl_comissao_pos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_comissao_pos.setForeground(new java.awt.Color(0, 102, 153));
        lbl_comissao_pos.setText("Comissão pós meta (%)");

        btn_salvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_salvar.setForeground(new java.awt.Color(102, 102, 102));
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        lbl_msg.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lbl_msg.setForeground(new java.awt.Color(255, 51, 51));
        lbl_msg.setText("Mensagem de aviso");

        txt_comissao_pos.setBackground(new java.awt.Color(255, 255, 204));
        txt_comissao_pos.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txt_comissao_pos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_comissao_pos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_comissao_posActionPerformed(evt);
            }
        });

        txt_comissao_pre.setBackground(new java.awt.Color(255, 255, 204));
        txt_comissao_pre.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txt_comissao_pre.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_comissao_pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_comissao_preActionPerformed(evt);
            }
        });

        txt_meta.setBackground(new java.awt.Color(255, 255, 204));
        txt_meta.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txt_meta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_meta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_metaActionPerformed(evt);
            }
        });

        txt_salario.setBackground(new java.awt.Color(255, 255, 204));
        txt_salario.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txt_salario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_salarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_usuarioLayout = new javax.swing.GroupLayout(pnl_usuario);
        pnl_usuario.setLayout(pnl_usuarioLayout);
        pnl_usuarioLayout.setHorizontalGroup(
            pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_usuarioLayout.createSequentialGroup()
                        .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_usuarioLayout.createSequentialGroup()
                                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_senha)
                                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_usuarioLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(lbl_csenha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnl_usuarioLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_csenha)
                                        .addGap(30, 30, 30))))
                            .addGroup(pnl_usuarioLayout.createSequentialGroup()
                                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_usuarioLayout.createSequentialGroup()
                                        .addComponent(lbl_cv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_codigo))
                                    .addComponent(lbl_nome)
                                    .addComponent(lbl_cargo))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnl_usuarioLayout.createSequentialGroup()
                                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(box_cargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_nome))
                                .addGap(30, 30, 30)))
                        .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rd_ativo)
                            .addComponent(lbl_comissao_pre)
                            .addComponent(lbl_comissao_pos)
                            .addComponent(txt_comissao_pos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_comissao_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_usuarioLayout.createSequentialGroup()
                                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_salario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_meta)
                                    .addComponent(txt_meta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnl_usuarioLayout.createSequentialGroup()
                        .addComponent(lbl_msg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_usuarioLayout.setVerticalGroup(
            pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_usuarioLayout.createSequentialGroup()
                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_usuarioLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lbl_comissao_pre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_comissao_pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_comissao_pos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_comissao_pos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_usuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_codigo)
                            .addComponent(rd_ativo)
                            .addComponent(lbl_cv))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nome)
                            .addComponent(lbl_salario)
                            .addComponent(lbl_meta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_usuarioLayout.createSequentialGroup()
                                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_meta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_senha)
                                    .addComponent(lbl_csenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_csenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_cargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_msg)
                    .addComponent(btn_salvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_acoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_acoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//=========================================================================================
//	AÇÕES
//=========================================================================================
	    
         private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
                  
                  this.box_cargo.setEnabled(true);
                  this.txt_comissao_pos.setEnabled(true);
                  this.txt_comissao_pre.setEnabled(true);
                  this.txt_csenha.setEnabled(true);
                  this.txt_meta.setEnabled(true);
                  this.txt_salario.setEnabled(true);
                  this.txt_senha.setEnabled(true);
                  //@@@@@@@@@@@@@@
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
                  usuario = (Usuario)rotina.MostraCodigo(gerenciador, tabela);

	this.lbl_codigo.setText(""+(usuario.getId()+1));//FAZ A PREMONIÇÃO DO CODIGO

                  rotina.Fechar(gerenciador);//FECHA A CONEXÃO
                  
         }//GEN-LAST:event_btn_novoActionPerformed

         private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
                  
                  alterador = "salva"; //ALTERA A FUNÇÃO DO BOTÂO 'btn_salvar'
                  ReiniciaFormulario();//REINICIA O FORMULÁRIO
                  
                  
         }//GEN-LAST:event_btn_cancelarActionPerformed

         private void btn_localizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_localizarActionPerformed
                  
                  //CAPTURA O CODIGO DO PRODUTO
                  int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do usuario", "Busca por usuario", JOptionPane.QUESTION_MESSAGE));
                  
                  gerenciador = rotina.Conectar();//ABRE A CONEXÃO
                  usuario = (Usuario) rotina.Localiza(gerenciador, id, tabela);//PASSA O ID E RETORNA A CATEGORIA
                           this.btn_salvar.setEnabled(false);
                           this.btn_novo.setEnabled(false);
                           this.btn_cancelar.setEnabled(true);
                           this.btn_alterar.setEnabled(true);
                           this.btn_proximo.setEnabled(true);
                           this.btn_primeiro.setEnabled(true);
                           this.btn_ultimo.setEnabled(true);
                           this.btn_anterior.setEnabled(true);
                           //------------------------------------------
                           this.box_cargo.setSelectedItem(usuario.getCargo());
                  this.txt_comissao_pos.setText(""+usuario.getCpos());
                  this.txt_comissao_pre.setText(""+usuario.getCpre());
                  this.txt_csenha.setText(usuario.getSenha());
                  this.txt_meta.setText(""+usuario.getMeta());
                  this.txt_salario.setText(""+usuario.getSalario());
                  this.txt_senha.setText(usuario.getSenha());
                  //@@@@@@@@@@@@@@
                           this.lbl_codigo.setText(""+usuario.getId());
                           this.txt_nome.setText(usuario.getNome());
                           this.rd_ativo.setSelected(usuario.isStatus());
                           this.lbl_msg.setText("Vendas deste usuario: "+usuario.getVendaList().size());
                           //-------------------------------------------
                  rotina.Fechar(gerenciador);//FECHA A CONEXÃO
                  
         }//GEN-LAST:event_btn_localizarActionPerformed

         private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
                  
                  gerenciador = rotina.Conectar(); //ABRE A CONEXÃO
                  usuario = (Usuario)rotina.Ultimo(gerenciador, tabela);//RETORNA A CATEGORIA
                           //------------------------------------------------------
                           this.box_cargo.setEnabled(false);
                  this.txt_comissao_pos.setEnabled(false);
                  this.txt_comissao_pre.setEnabled(false);
                  this.txt_csenha.setEnabled(false);
                  this.txt_meta.setEnabled(false);
                  this.txt_salario.setEnabled(false);
                  this.txt_senha.setEnabled(false);
                  this.box_cargo.setSelectedItem(usuario.getCargo());
                  this.txt_comissao_pos.setText(""+usuario.getCpos());
                  this.txt_comissao_pre.setText(""+usuario.getCpre());
                  this.txt_csenha.setText(usuario.getSenha());
                  this.txt_meta.setText(""+usuario.getMeta());
                  this.txt_salario.setText(""+usuario.getSalario());
                  this.txt_senha.setText(usuario.getSenha());
                  //@@@@@@@@@@@@@@
                           this.lbl_codigo.setText(""+usuario.getId());
                           this.txt_nome.setText(usuario.getNome());
                           this.rd_ativo.setSelected(usuario.isStatus());
                           this.txt_nome.setEnabled(false);
                           this.rd_ativo.setEnabled(false);
                           this.lbl_msg.setText("Vendas deste usuario: "+usuario.getVendaList().size());
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

         private void btn_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeiroActionPerformed
                  
                  gerenciador = rotina.Conectar(); //ABRE A CONEXÃO
                  usuario = (Usuario)rotina.Primeiro(gerenciador, tabela);//RETORNA A CATEGORIA
                           //------------------------------------------------------
                           this.box_cargo.setEnabled(false);
                  this.txt_comissao_pos.setEnabled(false);
                  this.txt_comissao_pre.setEnabled(false);
                  this.txt_csenha.setEnabled(false);
                  this.txt_meta.setEnabled(false);
                  this.txt_salario.setEnabled(false);
                  this.txt_senha.setEnabled(false);
                  this.box_cargo.setSelectedItem(usuario.getCargo());
                  this.txt_comissao_pos.setText(""+usuario.getCpos());
                  this.txt_comissao_pre.setText(""+usuario.getCpre());
                  this.txt_csenha.setText(usuario.getSenha());
                  this.txt_meta.setText(""+usuario.getMeta());
                  this.txt_salario.setText(""+usuario.getSalario());
                  this.txt_senha.setText(usuario.getSenha());
                  //@@@@@@@@@@@@@@
                           this.lbl_codigo.setText(""+usuario.getId());
                           this.txt_nome.setText(usuario.getNome());
                           this.rd_ativo.setSelected(usuario.isStatus());
                           this.txt_nome.setEnabled(false);
                           this.rd_ativo.setEnabled(false);
                           this.lbl_msg.setText("Vendas deste usuario: "+usuario.getVendaList().size());
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

         private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
                  
               gerenciador = rotina.Conectar(); //ABRE A CONEXÃO
                  usuario = (Usuario)rotina.Anterior(gerenciador, Integer.parseInt(this.lbl_codigo.getText()), tabela);//PASSA O CODIGO E RETORNA A CATEGORIA
                           //------------------------------------------------------
                           this.box_cargo.setEnabled(false);
                  this.txt_comissao_pos.setEnabled(false);
                  this.txt_comissao_pre.setEnabled(false);
                  this.txt_csenha.setEnabled(false);
                  this.txt_meta.setEnabled(false);
                  this.txt_salario.setEnabled(false);
                  this.txt_senha.setEnabled(false);
                  this.box_cargo.setSelectedItem(usuario.getCargo());
                  this.txt_comissao_pos.setText(""+usuario.getCpos());
                  this.txt_comissao_pre.setText(""+usuario.getCpre());
                  this.txt_csenha.setText(usuario.getSenha());
                  this.txt_meta.setText(""+usuario.getMeta());
                  this.txt_salario.setText(""+usuario.getSalario());
                  this.txt_senha.setText(usuario.getSenha());
                  //@@@@@@@@@@@@@@
                           this.lbl_codigo.setText(""+usuario.getId());
                           this.txt_nome.setText(usuario.getNome());
                           this.rd_ativo.setSelected(usuario.isStatus());
                           this.txt_nome.setEnabled(false);
                           this.rd_ativo.setEnabled(false);
                           this.lbl_msg.setText("Vendas deste usuario: "+usuario.getVendaList().size());
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
                  
         }//GEN-LAST:event_btn_anteriorActionPerformed

         private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximoActionPerformed
                  
                  gerenciador = rotina.Conectar(); //ABRE A CONEXÃO
                  usuario = (Usuario)rotina.Proximo(gerenciador, Integer.parseInt(this.lbl_codigo.getText()), tabela);//PASSA O CODIGO E RETORNA A CATEGORIA
                           //------------------------------------------------------
                           this.box_cargo.setEnabled(false);
                  this.txt_comissao_pos.setEnabled(false);
                  this.txt_comissao_pre.setEnabled(false);
                  this.txt_csenha.setEnabled(false);
                  this.txt_meta.setEnabled(false);
                  this.txt_salario.setEnabled(false);
                  this.txt_senha.setEnabled(false);
                  this.box_cargo.setSelectedItem(usuario.getCargo());
                  this.txt_comissao_pos.setText(""+usuario.getCpos());
                  this.txt_comissao_pre.setText(""+usuario.getCpre());
                  this.txt_csenha.setText(usuario.getSenha());
                  this.txt_meta.setText(""+usuario.getMeta());
                  this.txt_salario.setText(""+usuario.getSalario());
                  this.txt_senha.setText(usuario.getSenha());
                  //@@@@@@@@@@@@@@
                           this.lbl_codigo.setText(""+usuario.getId());
                           this.txt_nome.setText(usuario.getNome());
                           this.rd_ativo.setSelected(usuario.isStatus());
                           this.txt_nome.setEnabled(false);
                           this.rd_ativo.setEnabled(false);
                           this.lbl_msg.setText("Vendas deste usuario: "+usuario.getVendaList().size());
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

         private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
                  
                  this.box_cargo.setEnabled(true);
                  this.txt_comissao_pos.setEnabled(true);
                  this.txt_comissao_pre.setEnabled(true);
                  this.txt_csenha.setEnabled(true);
                  this.txt_meta.setEnabled(true);
                  this.txt_salario.setEnabled(true);
                  this.txt_senha.setEnabled(true);
                  //@@@@@@@@@@@@@@
                  this.txt_nome.setEnabled(true);
                  this.rd_ativo.setEnabled(true);
                  this.btn_salvar.setEnabled(true);
                  alterador = "altera";
                  this.txt_nome.requestFocus();
                  
         }//GEN-LAST:event_btn_alterarActionPerformed

         private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

                  //IRÁ VALIDAR OS DADOS DO FORMULÁRIO
                  String retorno = rotina.ValidaUsuario(this.txt_nome.getText(), this.txt_senha.getText(), this.txt_csenha.getText());
                           
                  if(retorno.equals("ok")){
                  
                           gerenciador = rotina.Conectar();
                           switch(alterador){
                                    case "salva":
                                             int op = JOptionPane.showConfirmDialog(null, "Deseja realmente cadastrar este usuario ?", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                                             if(op == 0){
                                                      usuario.setId(null);
                                                      usuario.setNome(this.txt_nome.getText());
                                                      usuario.setStatus(this.rd_ativo.isSelected());
                                                      usuario.setCargo((String)this.box_cargo.getSelectedItem());
                                                      usuario.setSenha(this.txt_senha.getText());
                                                      usuario.setSalario(Double.parseDouble(this.txt_salario.getText()));
                                                      usuario.setMeta(Double.parseDouble(this.txt_meta.getText()));
                                                      usuario.setCpos(Double.parseDouble(this.txt_comissao_pos.getText()));
                                                      usuario.setCpre(Double.parseDouble(this.txt_comissao_pre.getText()));
                                                      //JOptionPane.showMessageDialog(null, "Não setou o objeto");
                                                      
                                                      rotina.Persistir(gerenciador, usuario);
                                                      
                                             }//IF
                                             ReiniciaFormulario();
                                             break;
                                    case "altera":
                                             int op1 = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar esta categoria ?", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                                             if(op1 == 0){
                                                   
                                                      usuario.setId(Integer.parseInt(this.lbl_codigo.getText()));
                                                      usuario.setNome(this.txt_nome.getText());
                                                      usuario.setCargo((String)this.box_cargo.getSelectedItem());
                                                      usuario.setSenha(this.txt_senha.getText());
                                                      usuario.setStatus(this.rd_ativo.isSelected());
                                                      
                                                      usuario.setSalario(Double.parseDouble(this.txt_salario.getText()));
                                                      usuario.setMeta(Double.parseDouble(this.txt_meta.getText()));
                                                      usuario.setCpos(Double.parseDouble(this.txt_comissao_pos.getText()));
                                                      usuario.setCpre(Double.parseDouble(this.txt_comissao_pre.getText()));
                                                      
                                                      rotina.Update(gerenciador, usuario, tabela);
                                                      
                                             }//IF
                                             this.txt_nome.setEnabled(false);
                                             this.rd_ativo.setEnabled(false);
                                             this.btn_salvar.setEnabled(false);
                                             this.box_cargo.setEnabled(false);
                                             this.txt_comissao_pos.setEnabled(false);
                                             this.txt_comissao_pre.setEnabled(false);
                                             this.txt_csenha.setEnabled(false);
                                             this.txt_meta.setEnabled(false);
                                             this.txt_nome.setEnabled(false);
                                             this.txt_salario.setEnabled(false);
                                             this.txt_senha.setEnabled(false);
                                             break;
                           }//SWITCH
                           rotina.Fechar(gerenciador);
                           
                  }//IF
                  
                           
                  
         }//GEN-LAST:event_btn_salvarActionPerformed

         private void txt_comissao_posActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_comissao_posActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_txt_comissao_posActionPerformed

         private void txt_comissao_preActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_comissao_preActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_txt_comissao_preActionPerformed

         private void txt_metaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_metaActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_txt_metaActionPerformed

         private void txt_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_salarioActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_txt_salarioActionPerformed

//=========================================================================================
//	COMPONENTES DO JFRAME
//=========================================================================================
	    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box_cargo;
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
    private javax.swing.JLabel lbl_cargo;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_comissao_pos;
    private javax.swing.JLabel lbl_comissao_pre;
    private javax.swing.JLabel lbl_csenha;
    private javax.swing.JLabel lbl_cv;
    private javax.swing.JLabel lbl_meta;
    private javax.swing.JLabel lbl_msg;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_salario;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_acoes;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JPanel pnl_titulo;
    private javax.swing.JPanel pnl_usuario;
    private javax.swing.JRadioButton rd_ativo;
    private javax.swing.JFormattedTextField txt_comissao_pos;
    private javax.swing.JFormattedTextField txt_comissao_pre;
    private javax.swing.JTextField txt_csenha;
    private javax.swing.JFormattedTextField txt_meta;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JFormattedTextField txt_salario;
    private javax.swing.JTextField txt_senha;
    // End of variables declaration//GEN-END:variables

//=========================================================================================
//	MÉTODOS
//=========================================================================================
	    
         public void ReiniciaFormulario(){
                  this.box_cargo.setEnabled(false);
                  this.txt_comissao_pos.setEnabled(false);
                  this.txt_comissao_pre.setEnabled(false);
                  this.txt_csenha.setEnabled(false);
                  this.txt_meta.setEnabled(false);
                  this.txt_salario.setEnabled(false);
                  this.txt_senha.setEnabled(false);
                  this.box_cargo.setSelectedItem("Vendedor");//------------------------
                  this.txt_comissao_pos.setText("");
                  this.txt_comissao_pre.setText("");
                  this.txt_csenha.setText("");
                  this.txt_meta.setText("");
                  this.txt_salario.setText("");
                  this.txt_senha.setText("");
                  //@@@@@@@@@@@@@@
                  this.btn_alterar.setEnabled(false);
                  this.btn_anterior.setEnabled(false);
                  this.btn_cancelar.setEnabled(false);
                  this.btn_novo.setEnabled(true);
                  this.btn_primeiro.setEnabled(false);
                  this.btn_proximo.setEnabled(false);
                  this.btn_salvar.setEnabled(false);
                  this.btn_ultimo.setEnabled(false);
                  this.txt_nome.setEnabled(false);
                  this.rd_ativo.setEnabled(false);
                  this.rd_ativo.setSelected(false);
                  this.btn_localizar.setEnabled(true);
                  this.lbl_codigo.setText("");
                  this.txt_nome.setText("");
                  this.lbl_msg.setText("Clique em \"Novo\" para cadastrar.");
         }//REINICIA FORMULÁRIO
         
}//CLASS
