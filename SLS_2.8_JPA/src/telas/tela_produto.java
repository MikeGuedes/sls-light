package telas;
import classes.Categoria;
import classes.Produto;
import funcoes.Rotinas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

public class tela_produto extends javax.swing.JFrame {
	
//=========================================================================================
//	VARIÁVEIS GLOBAIS
//=========================================================================================

         EntityManager gerenciador; //Variável de acesso ao banco
         Query consulta;// variavel de consulta do banco
         Rotinas rotina = new Rotinas();// Instancia do DAO
         Produto produto = new Produto();
         Categoria categoria = new Categoria();//Instancia da Entidade
         String alterador = "salva";// Variavel para alteração da função do 'btn_salvar'
         String tabela = "Produto"; //Para fazer as percistencias
         List<Categoria>lista;
         
//=========================================================================================
//	CONSTRUTOR
//=========================================================================================
	    
    public tela_produto() {
        initComponents();
        ReiniciaFormulario();
        ListaCategorias();
    }//COSTRUTOR

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_principal = new javax.swing.JPanel();
        pnl_titulo = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_acoes = new javax.swing.JPanel();
        btn_novo = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_primeiro = new javax.swing.JButton();
        btn_proximo = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        btn_localizar = new javax.swing.JButton();
        btn_alterar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_cv = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        rd_ativo = new javax.swing.JRadioButton();
        lbl_valFab = new javax.swing.JLabel();
        txt_valFab = new javax.swing.JTextField();
        lbl_valVen = new javax.swing.JLabel();
        txt_valVen = new javax.swing.JTextField();
        lbl_tamanho = new javax.swing.JLabel();
        box_tamanho = new javax.swing.JComboBox();
        lbl_genero = new javax.swing.JLabel();
        box_genero = new javax.swing.JComboBox();
        lbl_cor = new javax.swing.JLabel();
        txt_cor = new javax.swing.JTextField();
        lbl_local = new javax.swing.JLabel();
        txt_local = new javax.swing.JTextField();
        lbl_categoria = new javax.swing.JLabel();
        box_categoria = new javax.swing.JComboBox();
        btn_salvar = new javax.swing.JButton();
        lbl_msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnl_principal.setBackground(new java.awt.Color(51, 51, 51));

        pnl_titulo.setBackground(new java.awt.Color(51, 51, 51));
        pnl_titulo.setBorder(null);

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Formulário de Cadastro de Produto");

        javax.swing.GroupLayout pnl_tituloLayout = new javax.swing.GroupLayout(pnl_titulo);
        pnl_titulo.setLayout(pnl_tituloLayout);
        pnl_tituloLayout.setHorizontalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_tituloLayout.setVerticalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_acoes.setBackground(new java.awt.Color(51, 51, 51));
        pnl_acoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_novo.setBackground(new java.awt.Color(51, 51, 51));
        btn_novo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(255, 255, 255));
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(51, 51, 51));
        btn_cancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_anterior.setBackground(new java.awt.Color(51, 51, 51));
        btn_anterior.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_anterior.setForeground(new java.awt.Color(255, 255, 255));
        btn_anterior.setText("Anterior");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_primeiro.setBackground(new java.awt.Color(51, 51, 51));
        btn_primeiro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_primeiro.setForeground(new java.awt.Color(255, 255, 255));
        btn_primeiro.setText("Primeiro");
        btn_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeiroActionPerformed(evt);
            }
        });

        btn_proximo.setBackground(new java.awt.Color(51, 51, 51));
        btn_proximo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_proximo.setForeground(new java.awt.Color(255, 255, 255));
        btn_proximo.setText("Próximo");
        btn_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximoActionPerformed(evt);
            }
        });

        btn_ultimo.setBackground(new java.awt.Color(51, 51, 51));
        btn_ultimo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ultimo.setForeground(new java.awt.Color(255, 255, 255));
        btn_ultimo.setText("Último");
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        btn_localizar.setBackground(new java.awt.Color(51, 51, 51));
        btn_localizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_localizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_localizar.setText("Localizar");
        btn_localizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_localizarActionPerformed(evt);
            }
        });

        btn_alterar.setBackground(new java.awt.Color(51, 51, 51));
        btn_alterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_alterar.setForeground(new java.awt.Color(255, 255, 255));
        btn_alterar.setText("Alterar");
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
                    .addComponent(btn_primeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ultimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_localizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnl_acoesLayout.setVerticalGroup(
            pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_acoesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_acoesLayout.createSequentialGroup()
                .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_acoesLayout.createSequentialGroup()
                        .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btn_anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_proximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_localizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(pnl_acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btn_primeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ultimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btn_novo))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_codigo.setForeground(new java.awt.Color(102, 102, 102));
        lbl_codigo.setText("Código");

        lbl_cv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv.setText("Código do usuário:");

        lbl_nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_nome.setForeground(new java.awt.Color(0, 102, 153));
        lbl_nome.setText("Nome*");

        txt_nome.setBackground(new java.awt.Color(204, 204, 204));
        txt_nome.setForeground(new java.awt.Color(102, 102, 102));

        rd_ativo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rd_ativo.setForeground(new java.awt.Color(0, 102, 153));
        rd_ativo.setText("Ativo");

        lbl_valFab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_valFab.setForeground(new java.awt.Color(0, 102, 153));
        lbl_valFab.setText("Valor de fabrica (R$)*");

        txt_valFab.setBackground(new java.awt.Color(204, 204, 204));
        txt_valFab.setForeground(new java.awt.Color(102, 102, 102));

        lbl_valVen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_valVen.setForeground(new java.awt.Color(0, 102, 153));
        lbl_valVen.setText("Valor de venda (R$)*");

        txt_valVen.setBackground(new java.awt.Color(204, 204, 204));
        txt_valVen.setForeground(new java.awt.Color(102, 102, 102));

        lbl_tamanho.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_tamanho.setForeground(new java.awt.Color(0, 102, 153));
        lbl_tamanho.setText("Tamanho*");

        box_tamanho.setBackground(new java.awt.Color(204, 204, 204));
        box_tamanho.setForeground(new java.awt.Color(102, 102, 102));
        box_tamanho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "P", "M", "G" }));
        box_tamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_tamanhoActionPerformed(evt);
            }
        });

        lbl_genero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_genero.setForeground(new java.awt.Color(0, 102, 153));
        lbl_genero.setText("Genero*");

        box_genero.setBackground(new java.awt.Color(204, 204, 204));
        box_genero.setForeground(new java.awt.Color(102, 102, 102));
        box_genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));

        lbl_cor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cor.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cor.setText("Cor");

        txt_cor.setBackground(new java.awt.Color(204, 204, 204));
        txt_cor.setForeground(new java.awt.Color(102, 102, 102));

        lbl_local.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_local.setForeground(new java.awt.Color(0, 102, 153));
        lbl_local.setText("Localização");

        txt_local.setBackground(new java.awt.Color(204, 204, 204));
        txt_local.setForeground(new java.awt.Color(102, 102, 102));

        lbl_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_categoria.setForeground(new java.awt.Color(0, 102, 153));
        lbl_categoria.setText("Categoria*");

        box_categoria.setBackground(new java.awt.Color(204, 204, 204));
        box_categoria.setForeground(new java.awt.Color(102, 102, 102));

        btn_salvar.setBackground(new java.awt.Color(51, 51, 51));
        btn_salvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_salvar.setForeground(new java.awt.Color(255, 255, 255));
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        lbl_msg.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lbl_msg.setForeground(new java.awt.Color(255, 51, 51));
        lbl_msg.setText("Mensagem de aviso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_codigo))
                    .addComponent(lbl_valVen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_categoria, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_valVen, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_valFab, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_valFab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbl_msg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(box_categoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_genero)
                        .addComponent(lbl_cor)
                        .addComponent(txt_cor)
                        .addComponent(lbl_local)
                        .addComponent(txt_local)
                        .addComponent(lbl_tamanho)
                        .addComponent(rd_ativo)
                        .addComponent(box_tamanho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(box_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_salvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_cv)
                        .addComponent(lbl_codigo))
                    .addComponent(rd_ativo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_valFab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_valFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_local)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_local, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_valVen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_valVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_tamanho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_genero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_categoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_msg))
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        getAccessibleContext().setAccessibleName("Produto");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed

        this.box_categoria.setEnabled(true);
        this.box_genero.setEnabled(true);
        this.box_tamanho.setEnabled(true);
        this.txt_cor.setEnabled(true);
        this.txt_local.setEnabled(true);
        this.txt_valFab.setEnabled(true);
        this.txt_valVen.setEnabled(true);
        //@@@@@@@@@@@@@@@
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
        produto = (Produto)rotina.MostraCodigo(gerenciador, tabela);//MOSTRA O CÓDIGO DO PRODUTO
        this.lbl_codigo.setText(""+(produto.getId()+1));//FAZ A PREMONIÇÃO DO COD
        //@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        rotina.Fechar(gerenciador);//FECHA A CONEXÃO

    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        alterador = "salva"; //ALTERA A FUNÇÃO DO BOTÂO 'btn_salvar'
        ReiniciaFormulario();//REINICIA O FORMULÁRIO
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed

        gerenciador = rotina.Conectar(); //ABRE A CONEXÃO
        produto = (Produto)rotina.Anterior(gerenciador, Integer.parseInt(this.lbl_codigo.getText()), tabela);//RETORNA A CATEGORIA
        //------------------------------------------------------
        this.box_categoria.setSelectedItem(produto.getCategoria().getNome());
        this.box_genero.setSelectedItem(produto.getGenero());
        this.box_tamanho.setSelectedItem(produto.getTamanho());
        this.txt_cor.setText(produto.getCor());
        this.txt_local.setText(produto.getLocalizacao());
        this.txt_valFab.setText(""+produto.getValorFabrica());
        this.txt_valVen.setText(""+produto.getValorVenda());
        //@@@@@@@@@@@@@@@
        this.lbl_codigo.setText(""+produto.getId());
        this.txt_nome.setText(produto.getNome());
        this.rd_ativo.setSelected(produto.isStatus());
        this.txt_nome.setEnabled(false);
        this.rd_ativo.setEnabled(false);
        this.box_categoria.setEnabled(false);
        this.box_genero.setEnabled(false);
        this.box_tamanho.setEnabled(false);
        this.txt_cor.setEnabled(false);
        this.txt_local.setEnabled(false);
        this.txt_valFab.setEnabled(false);
        this.txt_valVen.setEnabled(false);
        //@@@@@@@@@@@@@@@
        this.lbl_msg.setText("Quantidade em estoque: "+produto.getEstoque());
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

    private void btn_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeiroActionPerformed

        gerenciador = rotina.Conectar(); //ABRE A CONEXÃO
        produto = (Produto)rotina.Primeiro(gerenciador, tabela);//RETORNA A CATEGORIA
        //------------------------------------------------------
        this.box_categoria.setSelectedItem(produto.getCategoria().getNome());
        this.box_genero.setSelectedItem(produto.getGenero());
        this.box_tamanho.setSelectedItem(produto.getTamanho());
        this.txt_cor.setText(produto.getCor());
        this.txt_local.setText(produto.getLocalizacao());
        this.txt_valFab.setText(""+produto.getValorFabrica());
        this.txt_valVen.setText(""+produto.getValorVenda());
        //@@@@@@@@@@@@@@@
        this.lbl_codigo.setText(""+produto.getId());
        this.txt_nome.setText(produto.getNome());
        this.rd_ativo.setSelected(produto.isStatus());
        this.txt_nome.setEnabled(false);
        this.rd_ativo.setEnabled(false);
        this.box_categoria.setEnabled(false);
        this.box_genero.setEnabled(false);
        this.box_tamanho.setEnabled(false);
        this.txt_cor.setEnabled(false);
        this.txt_local.setEnabled(false);
        this.txt_valFab.setEnabled(false);
        this.txt_valVen.setEnabled(false);
        //@@@@@@@@@@@@@@@
        this.lbl_msg.setText("Quantidade em estoque: "+produto.getEstoque());
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

    private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximoActionPerformed

        gerenciador = rotina.Conectar(); //ABRE A CONEXÃO
        produto = (Produto)rotina.Proximo(gerenciador, Integer.parseInt(this.lbl_codigo.getText()), tabela);//RETORNA A CATEGORIA
        //------------------------------------------------------
        this.box_categoria.setSelectedItem(produto.getCategoria().getNome());
        this.box_genero.setSelectedItem(produto.getGenero());
        this.box_tamanho.setSelectedItem(produto.getTamanho());
        this.txt_cor.setText(produto.getCor());
        this.txt_local.setText(produto.getLocalizacao());
        this.txt_valFab.setText(""+produto.getValorFabrica());
        this.txt_valVen.setText(""+produto.getValorVenda());
        //@@@@@@@@@@@@@@@
        this.lbl_codigo.setText(""+produto.getId());
        this.txt_nome.setText(produto.getNome());
        this.rd_ativo.setSelected(produto.isStatus());
        this.txt_nome.setEnabled(false);
        this.rd_ativo.setEnabled(false);
        this.box_categoria.setEnabled(false);
        this.box_genero.setEnabled(false);
        this.box_tamanho.setEnabled(false);
        this.txt_cor.setEnabled(false);
        this.txt_local.setEnabled(false);
        this.txt_valFab.setEnabled(false);
        this.txt_valVen.setEnabled(false);
        //@@@@@@@@@@@@@@@
        this.lbl_msg.setText("Quantidade em estoque: "+produto.getEstoque());
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

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed

        gerenciador = rotina.Conectar(); //ABRE A CONEXÃO
        produto = (Produto)rotina.Ultimo(gerenciador, tabela);//RETORNA A CATEGORIA
        //------------------------------------------------------
        this.box_categoria.setSelectedItem(produto.getCategoria().getNome());
        this.box_genero.setSelectedItem(produto.getGenero());
        this.box_tamanho.setSelectedItem(produto.getTamanho());
        this.txt_cor.setText(produto.getCor());
        this.txt_local.setText(produto.getLocalizacao());
        this.txt_valFab.setText(""+produto.getValorFabrica());
        this.txt_valVen.setText(""+produto.getValorVenda());
        //@@@@@@@@@@@@@@@
        this.lbl_codigo.setText(""+produto.getId());
        this.txt_nome.setText(produto.getNome());
        this.rd_ativo.setSelected(produto.isStatus());
        this.txt_nome.setEnabled(false);
        this.rd_ativo.setEnabled(false);
        this.box_categoria.setEnabled(false);
        this.box_genero.setEnabled(false);
        this.box_tamanho.setEnabled(false);
        this.txt_cor.setEnabled(false);
        this.txt_local.setEnabled(false);
        this.txt_valFab.setEnabled(false);
        this.txt_valVen.setEnabled(false);
        //@@@@@@@@@@@@@@@
        this.lbl_msg.setText("Quantidade em estoque: "+produto.getEstoque());
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

    private void btn_localizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_localizarActionPerformed

        //CAPTURA O CODIGO DO PRODUTO
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do produto", "Busca por categoria", JOptionPane.QUESTION_MESSAGE));

        gerenciador = rotina.Conectar();//ABRE A CONEXÃO
        produto = (Produto) rotina.Localiza(gerenciador, id, tabela);//PASSA O ID E RETORNA A CATEGORIA
        this.btn_salvar.setEnabled(false);
        this.btn_novo.setEnabled(false);
        this.btn_cancelar.setEnabled(true);
        this.btn_alterar.setEnabled(true);
        this.btn_proximo.setEnabled(true);
        this.btn_primeiro.setEnabled(true);
        this.btn_ultimo.setEnabled(true);
        this.btn_anterior.setEnabled(true);
        //------------------------------------------
        this.box_categoria.setSelectedItem(produto.getCategoria().getNome());
        this.box_genero.setSelectedItem(produto.getGenero());
        this.box_tamanho.setSelectedItem(produto.getTamanho());
        this.txt_cor.setText(produto.getCor());
        this.txt_local.setText(produto.getLocalizacao());
        this.txt_valFab.setText(""+produto.getValorFabrica());
        this.txt_valVen.setText(""+produto.getValorVenda());
        //@@@@@@@@@@@@@@@
        this.lbl_codigo.setText(""+produto.getId());
        this.txt_nome.setText(produto.getNome());
        this.rd_ativo.setSelected(produto.isStatus());
        this.lbl_msg.setText("Quantidade em estoque: "+produto.getEstoque());
        //-------------------------------------------
        rotina.Fechar(gerenciador);//FECHA A CONEXÃO

    }//GEN-LAST:event_btn_localizarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed

        this.box_categoria.setEnabled(true);
        this.box_genero.setEnabled(true);
        this.box_tamanho.setEnabled(true);
        this.txt_cor.setEnabled(true);
        this.txt_local.setEnabled(true);
        this.txt_valFab.setEnabled(true);
        this.txt_valVen.setEnabled(true);
        //@@@@@@@@@@@@@@@
        this.txt_nome.setEnabled(true);
        this.rd_ativo.setEnabled(true);
        this.btn_salvar.setEnabled(true);
        alterador = "altera";
        this.txt_nome.requestFocus();

    }//GEN-LAST:event_btn_alterarActionPerformed

    private void box_tamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_tamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_tamanhoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

        gerenciador = rotina.Conectar();
        switch(alterador){
            case "salva":
            int op = JOptionPane.showConfirmDialog(null, "Deseja realmente cadastrar esta categoria ?", "Informativo", JOptionPane.INFORMATION_MESSAGE);
            if(op == 0){
                produto.setId(null);
                produto.setNome(this.txt_nome.getText());
                produto.setStatus(this.rd_ativo.isSelected());
                produto.setValorFabrica(Double.parseDouble(this.txt_valFab.getText()));
                produto.setValorVenda(Double.parseDouble(this.txt_valVen.getText()));
                produto.setEstoque(0);
                produto.setCor(this.txt_cor.getText());
                produto.setLocalizacao(this.txt_local.getText());
                produto.setGenero((String)this.box_genero.getSelectedItem());
                produto.setTamanho((String)this.box_tamanho.getSelectedItem());
                //---------------------------------------------------------------------------------
                categoria = BuscaCategoria(gerenciador, (String)this.box_categoria.getSelectedItem());
                produto.setCategoria(categoria);
                rotina.Persistir(gerenciador, produto);

            }//IF
            ReiniciaFormulario();
            break;
            case "altera":
            int op1 = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar esta categoria ?", "Informativo", JOptionPane.INFORMATION_MESSAGE);
            if(op1 == 0){

                produto.setId(Integer.parseInt(this.lbl_codigo.getText()));
                produto.setNome(this.txt_nome.getText());
                produto.setStatus(this.rd_ativo.isSelected());
                produto.setValorFabrica(Double.parseDouble(this.txt_valFab.getText()));
                produto.setValorVenda(Double.parseDouble(this.txt_valVen.getText()));
                produto.setCor(this.txt_cor.getText());
                produto.setLocalizacao(this.txt_local.getText());
                produto.setGenero((String)this.box_genero.getSelectedItem());
                produto.setTamanho((String)this.box_tamanho.getSelectedItem());
                //---------------------------------------------------------------------------------
                categoria = BuscaCategoria(gerenciador, (String)this.box_categoria.getSelectedItem());
                produto.setCategoria(categoria);

                rotina.Update(gerenciador, produto, tabela);

            }//IF
            this.txt_nome.setEnabled(false);
            this.rd_ativo.setEnabled(false);
            this.btn_salvar.setEnabled(false);
            this.box_categoria.setEnabled(false);
            this.box_genero.setEnabled(false);
            this.box_tamanho.setEnabled(false);
            this.txt_cor.setEnabled(false);
            this.txt_local.setEnabled(false);
            this.txt_valFab.setEnabled(false);
            this.txt_valVen.setEnabled(false);
            //@@@@@@@@@@@@@@@
            break;
        }//SWITCH
        rotina.Fechar(gerenciador);

    }//GEN-LAST:event_btn_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(tela_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box_categoria;
    private javax.swing.JComboBox box_genero;
    private javax.swing.JComboBox box_tamanho;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_localizar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_primeiro;
    private javax.swing.JButton btn_proximo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_cor;
    private javax.swing.JLabel lbl_cv;
    private javax.swing.JLabel lbl_genero;
    private javax.swing.JLabel lbl_local;
    private javax.swing.JLabel lbl_msg;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_tamanho;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_valFab;
    private javax.swing.JLabel lbl_valVen;
    private javax.swing.JPanel pnl_acoes;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JPanel pnl_titulo;
    private javax.swing.JRadioButton rd_ativo;
    private javax.swing.JTextField txt_cor;
    private javax.swing.JTextField txt_local;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_valFab;
    private javax.swing.JTextField txt_valVen;
    // End of variables declaration//GEN-END:variables

//=========================================================================================
//	MÉTODOS
//=========================================================================================
	    
         public void ReiniciaFormulario(){
                  this.txt_cor.setText("");
                  this.txt_local.setText("");
                  this.txt_valFab.setText("");
                  this.txt_valVen.setText("");
                  //@@@@@@@@@@@@@@@
                  this.box_categoria.setEnabled(false);
                  this.box_genero.setEnabled(false);
                  this.box_tamanho.setEnabled(false);
                  this.txt_cor.setEnabled(false);
                  this.txt_local.setEnabled(false);
                  this.txt_valFab.setEnabled(false);
                  this.txt_valVen.setEnabled(false);
                  //@@@@@@@@@@@@@@@
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

         public void ListaCategorias(){

                  gerenciador = rotina.Conectar();
                  consulta = gerenciador.createQuery("select c from Categoria c");
                  lista = consulta.getResultList();
                  for (int i=0 ; i<lista.size() ; i++) {
                           this.box_categoria.addItem(lista.get(i).getNome());
                  }//FOR
                  rotina.Fechar(gerenciador);
         
         }//LISTA CATEGORIAS
         
         public Categoria BuscaCategoria(EntityManager gerenciador, String cat){

                  try{//TRATAMENTO DE ERROS
                  consulta = gerenciador.createQuery("select c from Categoria c where c.nome = :nome");//HQL
                  consulta.setParameter("nome", cat); //Compara o id do banco com o id do parâmetro
                  categoria = (Categoria)consulta.getSingleResult();
             }catch(Exception ex){
                  JOptionPane.showMessageDialog(null, "Erro ao buscar a categoria !", "Informativo", JOptionPane.INFORMATION_MESSAGE);
             }//TRY CATCH
             
             return categoria;
    }//BUSCA CATEGORIA

}//CLASS
