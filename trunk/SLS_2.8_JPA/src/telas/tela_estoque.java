package telas;
import classes.Categoria;
import classes.Produto;
import funcoes.Rotinas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;

public class tela_estoque extends javax.swing.JFrame {

        EntityManager gerenciador;
        Query consulta;
        List<Categoria>lista;
        List<Produto>listaProd;
        Rotinas rotina = new Rotinas();
        Produto produto = new Produto();

    public tela_estoque() {
            initComponents();
            this.ListaCategorias();
            this.ReiniciaFormulario();
    }//CONSTRUTOR

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        box_categoria = new javax.swing.JComboBox();
        lbl_categoria = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        btn_busca_codigo = new javax.swing.JButton();
        lbl_codigo = new javax.swing.JLabel();
        btn_busca_categoria = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_itens = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lbl_cod = new javax.swing.JLabel();
        lbl_desc = new javax.swing.JLabel();
        lbl_est = new javax.swing.JLabel();
        txt_qtd = new javax.swing.JTextField();
        lbl_buscar4 = new javax.swing.JLabel();
        btn_adicionar = new javax.swing.JButton();
        cod = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        box_categoria.setBackground(new java.awt.Color(204, 204, 204));

        lbl_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_categoria.setForeground(new java.awt.Color(0, 102, 153));
        lbl_categoria.setText("Categoria:");

        txt_codigo.setBackground(new java.awt.Color(204, 204, 204));
        txt_codigo.setForeground(new java.awt.Color(102, 102, 102));

        btn_busca_codigo.setBackground(new java.awt.Color(51, 51, 51));
        btn_busca_codigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_busca_codigo.setForeground(new java.awt.Color(255, 255, 255));
        btn_busca_codigo.setText("Buscar");
        btn_busca_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busca_codigoActionPerformed(evt);
            }
        });

        lbl_codigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_codigo.setForeground(new java.awt.Color(0, 102, 153));
        lbl_codigo.setText("Código");

        btn_busca_categoria.setBackground(new java.awt.Color(51, 51, 51));
        btn_busca_categoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_busca_categoria.setForeground(new java.awt.Color(255, 255, 255));
        btn_busca_categoria.setText("Buscar");
        btn_busca_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busca_categoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_categoria)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(box_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_busca_categoria)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_busca_codigo))
                    .addComponent(lbl_codigo)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_categoria)
                    .addComponent(lbl_codigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_busca_codigo)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(box_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_busca_categoria))))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tbl_itens.setBackground(new java.awt.Color(204, 204, 204));
        tbl_itens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Localização", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_itens.getTableHeader().setResizingAllowed(false);
        tbl_itens.getTableHeader().setReorderingAllowed(false);
        tbl_itens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_itensMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_itens);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_cod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cod.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cod.setText("Código:");

        lbl_desc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_desc.setForeground(new java.awt.Color(0, 102, 153));
        lbl_desc.setText("Descrição:");

        lbl_est.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_est.setForeground(new java.awt.Color(0, 102, 153));
        lbl_est.setText("Produtos em estoque:");

        txt_qtd.setBackground(new java.awt.Color(204, 204, 204));
        txt_qtd.setForeground(new java.awt.Color(102, 102, 102));
        txt_qtd.setText("0");

        lbl_buscar4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_buscar4.setForeground(new java.awt.Color(0, 102, 153));
        lbl_buscar4.setText("Adicionar itens");

        btn_adicionar.setBackground(new java.awt.Color(51, 51, 51));
        btn_adicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_adicionar.setForeground(new java.awt.Color(255, 255, 255));
        btn_adicionar.setText("Adicionar");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        cod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cod.setForeground(new java.awt.Color(102, 255, 255));
        cod.setText("Código");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_desc)
                    .addComponent(lbl_est)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_cod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cod)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_buscar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_adicionar))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cod)
                    .addComponent(lbl_buscar4)
                    .addComponent(cod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_desc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_est))
                    .addComponent(txt_qtd)))
            .addComponent(btn_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_busca_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busca_codigoActionPerformed

        gerenciador = rotina.Conectar();

        int codigo = Integer.parseInt(this.txt_codigo.getText());
        produto = (Produto)rotina.Localiza(gerenciador, codigo, "Produto");

        this.cod.setText(""+produto.getId());
        this.lbl_desc.setText("Descrição: "+produto.getNome());
        this.lbl_est.setText("Produtos em estoque: "+produto.getEstoque());

        this.txt_qtd.setEnabled(true);
        this.btn_adicionar.setEnabled(true);

        rotina.Fechar(gerenciador);

    }//GEN-LAST:event_btn_busca_codigoActionPerformed

    private void btn_busca_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busca_categoriaActionPerformed

        for(int i = 0  ; this.tbl_itens.getModel().getRowCount() > 0 ; ++i ){
            ((DefaultTableModel) this.tbl_itens.getModel()).removeRow(0);
        }

        gerenciador = rotina.Conectar();
        consulta = gerenciador.createQuery("select c from Produto c");
        listaProd = consulta.getResultList();

        if(this.box_categoria.getSelectedItem().equals("Todas")){
            for(Produto u : listaProd){
                DefaultTableModel tbl_itens = (DefaultTableModel)this.tbl_itens.getModel();
                tbl_itens.addRow(new Object[] {u.getId(), u.getNome(), u.getLocalizacao(), u.getEstoque()});
            }//FOR
        }else{
            for(Produto u : listaProd){
                if(u.getCategoria().getNome().equals(this.box_categoria.getSelectedItem())){
                    DefaultTableModel tbl_itens = (DefaultTableModel)this.tbl_itens.getModel();
                    tbl_itens.addRow(new Object[] {u.getId(), u.getNome(), u.getLocalizacao(), u.getEstoque()});
                }//IF
            }//FOR
        }//IF
    }//GEN-LAST:event_btn_busca_categoriaActionPerformed

    private void tbl_itensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_itensMouseClicked

        int linha  = this.tbl_itens.getSelectedRow();

        for(Produto u : listaProd){
            if(u.getId() == (Integer)this.tbl_itens.getModel().getValueAt(linha, 0)){
                this.cod.setText(""+u.getId());
                this.lbl_desc.setText("Descrição: "+u.getNome());
                this.lbl_est.setText("Produtos em estoque: "+u.getEstoque());
                produto = u;
            }//IF
        }//FOR

        this.txt_qtd.setEnabled(true);
        this.btn_adicionar.setEnabled(true);

    }//GEN-LAST:event_tbl_itensMouseClicked

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed

        gerenciador = rotina.Conectar();
        int qtd = Integer.parseInt(this.txt_qtd.getText());
        produto.setEstoque(produto.getEstoque() + qtd);
        rotina.Update(gerenciador, produto, "Produto");
        rotina.Fechar(gerenciador);

        this.ReiniciaFormulario();

    }//GEN-LAST:event_btn_adicionarActionPerformed

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
            java.util.logging.Logger.getLogger(tela_estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box_categoria;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_busca_categoria;
    private javax.swing.JButton btn_busca_codigo;
    private javax.swing.JLabel cod;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_buscar4;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JLabel lbl_cod;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_desc;
    private javax.swing.JLabel lbl_est;
    private javax.swing.JTable tbl_itens;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_qtd;
    // End of variables declaration//GEN-END:variables
	
	public void ListaCategorias(){

		this.box_categoria.addItem("Todas");
		
                  gerenciador = rotina.Conectar();
                  consulta = gerenciador.createQuery("select c from Categoria c");
                  lista = consulta.getResultList();
                  for (int i=0 ; i<lista.size() ; i++) {
                           this.box_categoria.addItem(lista.get(i).getNome());
                  }//FOR
                  rotina.Fechar(gerenciador);
         
         }//LISTA CATEGORIAS
	
	public void ReiniciaFormulario(){
	
		this.txt_qtd.setText("0");
		this.txt_qtd.setEnabled(false);
		this.btn_adicionar.setEnabled(false);
		this.cod.setText("");
		this.lbl_desc.setText("Descrição: ");
		this.lbl_est.setText("Produtos em estoque: ");
		
	}//REINICIA O FORMULARIO
	
}//CLASS
