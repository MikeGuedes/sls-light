package telas;

import classes.Categoria;
import classes.Produto;
import funcoes.Rotinas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class GUI_estoque extends javax.swing.JInternalFrame {

	EntityManager gerenciador;
	Query consulta;
	List<Categoria>lista;
	Rotinas rotina = new Rotinas();
	Produto produto = new Produto();

	public GUI_estoque() {
		initComponents();
		this.ListaCategorias();
	}//CONSTRUTOR

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        box_categoria = new javax.swing.JComboBox();
        lbl_categoria = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        btn_busca_codigo = new javax.swing.JButton();
        lbl_codigo = new javax.swing.JLabel();
        btn_busca_categoria = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_itens = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lbl_cod = new javax.swing.JLabel();
        lbl_desc = new javax.swing.JLabel();
        lbl_est = new javax.swing.JLabel();
        txt_nome1 = new javax.swing.JTextField();
        lbl_buscar4 = new javax.swing.JLabel();
        btn_adicionar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_categoria.setForeground(new java.awt.Color(0, 102, 153));
        lbl_categoria.setText("Categoria:");

        txt_codigo.setBackground(new java.awt.Color(255, 255, 204));
        txt_codigo.setForeground(new java.awt.Color(102, 102, 102));

        btn_busca_codigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_busca_codigo.setForeground(new java.awt.Color(102, 102, 102));
        btn_busca_codigo.setText("Buscar");
        btn_busca_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busca_codigoActionPerformed(evt);
            }
        });

        lbl_codigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_codigo.setForeground(new java.awt.Color(0, 102, 153));
        lbl_codigo.setText("Código");

        btn_busca_categoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_busca_categoria.setForeground(new java.awt.Color(102, 102, 102));
        btn_busca_categoria.setText("Buscar");
        btn_busca_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busca_categoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_categoria)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(box_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_busca_categoria)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_busca_codigo))
                    .addComponent(lbl_codigo)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_categoria)
                    .addComponent(lbl_codigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_busca_codigo)
                        .addContainerGap())
                    .addComponent(box_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_busca_categoria)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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
        jScrollPane1.setViewportView(tbl_itens);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_cod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cod.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cod.setText("Código");

        lbl_desc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_desc.setForeground(new java.awt.Color(0, 102, 153));
        lbl_desc.setText("Descrição:");

        lbl_est.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_est.setForeground(new java.awt.Color(0, 102, 153));
        lbl_est.setText("Produtos em estoque:");

        txt_nome1.setBackground(new java.awt.Color(255, 255, 204));
        txt_nome1.setForeground(new java.awt.Color(102, 102, 102));
        txt_nome1.setText("0");

        lbl_buscar4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_buscar4.setForeground(new java.awt.Color(0, 102, 153));
        lbl_buscar4.setText("Adicionar itens");

        btn_adicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_adicionar.setForeground(new java.awt.Color(102, 102, 102));
        btn_adicionar.setText("Adicionar");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_desc)
                    .addComponent(lbl_est)
                    .addComponent(lbl_cod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_buscar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_adicionar))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cod)
                    .addComponent(lbl_buscar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_desc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_est))
                    .addComponent(txt_nome1)))
            .addComponent(btn_adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed

    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void btn_busca_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busca_codigoActionPerformed
        
		gerenciador = rotina.Conectar();
		
		int codigo = Integer.parseInt(this.txt_codigo.getText());
		produto = (Produto)rotina.Localiza(gerenciador, codigo, "Produto");
		
		this.lbl_cod.setText("Código: "+produto.getId());
		this.lbl_desc.setText("Descrição: "+produto.getNome());
		this.lbl_est.setText("Produtos em estoque: "+produto.getEstoque());
		
    }//GEN-LAST:event_btn_busca_codigoActionPerformed

    private void btn_busca_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busca_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_busca_categoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box_categoria;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_busca_categoria;
    private javax.swing.JButton btn_busca_codigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_buscar4;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JLabel lbl_cod;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_desc;
    private javax.swing.JLabel lbl_est;
    private javax.swing.JTable tbl_itens;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nome1;
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
	
}//CLASS
