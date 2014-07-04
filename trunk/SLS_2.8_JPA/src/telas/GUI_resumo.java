package telas;

import classes.Categoria;
import classes.Produto;
import classes.ProdutoVenda;
import classes.Usuario;
import classes.Venda;
import funcoes.Rotinas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class GUI_resumo extends javax.swing.JFrame {
	
	EntityManager gerenciador;
	Query consulta;
	Rotinas rotina = new Rotinas();
	List<Categoria>listaCat;
	List<Produto>listaPro;
	List<Venda>listaVen;
	List<Usuario>listaUsu;
	List<ProdutoVenda>listaProdVen;
	
	public GUI_resumo() {
		initComponents();
		this.Resumo();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_cv = new javax.swing.JLabel();
        lbl_cv1 = new javax.swing.JLabel();
        lbl_cv2 = new javax.swing.JLabel();
        lbl_cv3 = new javax.swing.JLabel();
        lbl_cv4 = new javax.swing.JLabel();
        lbl_cv5 = new javax.swing.JLabel();
        lbl_cv6 = new javax.swing.JLabel();
        lbl_cv7 = new javax.swing.JLabel();
        lbl_cv8 = new javax.swing.JLabel();
        lbl_cv9 = new javax.swing.JLabel();
        lbl_cv10 = new javax.swing.JLabel();
        lbl_cv11 = new javax.swing.JLabel();
        lbl_cv12 = new javax.swing.JLabel();
        lbl_cv13 = new javax.swing.JLabel();
        lbl_cv14 = new javax.swing.JLabel();
        lbl_cv15 = new javax.swing.JLabel();
        lbl_1 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        lbl_3 = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        lbl_5 = new javax.swing.JLabel();
        lbl_6 = new javax.swing.JLabel();
        lbl_7 = new javax.swing.JLabel();
        lbl_8 = new javax.swing.JLabel();
        lbl_9 = new javax.swing.JLabel();
        lbl_10 = new javax.swing.JLabel();
        lbl_11 = new javax.swing.JLabel();
        lbl_12 = new javax.swing.JLabel();
        lbl_13 = new javax.swing.JLabel();
        lbl_14 = new javax.swing.JLabel();
        lbl_15 = new javax.swing.JLabel();
        lbl_16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resumo geral");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbl_cv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv.setText("Total de categorias cadastradas: ");

        lbl_cv1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv1.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv1.setText("Total de produtos cadastrados: ");

        lbl_cv2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv2.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv2.setText("Total de vendas realizadas: ");

        lbl_cv3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv3.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv3.setText("Total de itens vendidos: ");

        lbl_cv4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv4.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv4.setText("Total bruto arrecadado desde o início: ");

        lbl_cv5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv5.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv5.setText("Total de arrecadado hoje: ");

        lbl_cv6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv6.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv6.setText("Total de produtos em estoque: ");

        lbl_cv7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv7.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv7.setText("Total de usuarios cadastrados: ");

        lbl_cv8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv8.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv8.setText("Funcionário mais produtivo: ");

        lbl_cv9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv9.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv9.setText("Funcionário menos produtivo: ");

        lbl_cv10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv10.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv10.setText("Produto mais vendido: ");

        lbl_cv11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv11.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv11.setText("Produto menos vendido: ");

        lbl_cv12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv12.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv12.setText("Categoria mais vendida: ");

        lbl_cv13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv13.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv13.setText("Categoria menos vendida: ");

        lbl_cv14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv14.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv14.setText("Maior quantidade de produtos em estoque:");

        lbl_cv15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cv15.setForeground(new java.awt.Color(0, 102, 153));
        lbl_cv15.setText("Menor quantidade de produtos em estoque:");

        lbl_1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_1.setForeground(new java.awt.Color(102, 102, 102));
        lbl_1.setText("Código");

        lbl_2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_2.setForeground(new java.awt.Color(102, 102, 102));
        lbl_2.setText("Código");

        lbl_3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_3.setForeground(new java.awt.Color(102, 102, 102));
        lbl_3.setText("Código");

        lbl_4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_4.setForeground(new java.awt.Color(102, 102, 102));
        lbl_4.setText("Código");

        lbl_5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_5.setForeground(new java.awt.Color(102, 102, 102));
        lbl_5.setText("Código");

        lbl_6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_6.setForeground(new java.awt.Color(102, 102, 102));
        lbl_6.setText("Código");

        lbl_7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_7.setForeground(new java.awt.Color(102, 102, 102));
        lbl_7.setText("Código");

        lbl_8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_8.setForeground(new java.awt.Color(102, 102, 102));
        lbl_8.setText("Código");

        lbl_9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_9.setForeground(new java.awt.Color(102, 102, 102));
        lbl_9.setText("Código");

        lbl_10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_10.setForeground(new java.awt.Color(102, 102, 102));
        lbl_10.setText("Código");

        lbl_11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_11.setForeground(new java.awt.Color(102, 102, 102));
        lbl_11.setText("Código");

        lbl_12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_12.setForeground(new java.awt.Color(102, 102, 102));
        lbl_12.setText("Código");

        lbl_13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_13.setForeground(new java.awt.Color(102, 102, 102));
        lbl_13.setText("Código");

        lbl_14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_14.setForeground(new java.awt.Color(102, 102, 102));
        lbl_14.setText("Código");

        lbl_15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_15.setForeground(new java.awt.Color(102, 102, 102));
        lbl_15.setText("Código");

        lbl_16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_16.setForeground(new java.awt.Color(102, 102, 102));
        lbl_16.setText("Código");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv1)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv2)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv3)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv5)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv6)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv7)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv8)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv9)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv10)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv11)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv12)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv13)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv14)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_cv15)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_16)))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv)
                    .addComponent(lbl_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv1)
                    .addComponent(lbl_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv2)
                    .addComponent(lbl_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv3)
                    .addComponent(lbl_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv4)
                    .addComponent(lbl_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv5)
                    .addComponent(lbl_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv6)
                    .addComponent(lbl_7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv7)
                    .addComponent(lbl_8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv8)
                    .addComponent(lbl_9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv9)
                    .addComponent(lbl_10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv10)
                    .addComponent(lbl_11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv11)
                    .addComponent(lbl_12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv12)
                    .addComponent(lbl_13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv13)
                    .addComponent(lbl_14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv14)
                    .addComponent(lbl_15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cv15)
                    .addComponent(lbl_16))
                .addContainerGap(53, Short.MAX_VALUE))
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
			java.util.logging.Logger.getLogger(GUI_resumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI_resumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI_resumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI_resumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
        //</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI_resumo().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_10;
    private javax.swing.JLabel lbl_11;
    private javax.swing.JLabel lbl_12;
    private javax.swing.JLabel lbl_13;
    private javax.swing.JLabel lbl_14;
    private javax.swing.JLabel lbl_15;
    private javax.swing.JLabel lbl_16;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_5;
    private javax.swing.JLabel lbl_6;
    private javax.swing.JLabel lbl_7;
    private javax.swing.JLabel lbl_8;
    private javax.swing.JLabel lbl_9;
    private javax.swing.JLabel lbl_cv;
    private javax.swing.JLabel lbl_cv1;
    private javax.swing.JLabel lbl_cv10;
    private javax.swing.JLabel lbl_cv11;
    private javax.swing.JLabel lbl_cv12;
    private javax.swing.JLabel lbl_cv13;
    private javax.swing.JLabel lbl_cv14;
    private javax.swing.JLabel lbl_cv15;
    private javax.swing.JLabel lbl_cv2;
    private javax.swing.JLabel lbl_cv3;
    private javax.swing.JLabel lbl_cv4;
    private javax.swing.JLabel lbl_cv5;
    private javax.swing.JLabel lbl_cv6;
    private javax.swing.JLabel lbl_cv7;
    private javax.swing.JLabel lbl_cv8;
    private javax.swing.JLabel lbl_cv9;
    // End of variables declaration//GEN-END:variables

	public void Resumo(){
	
		gerenciador = rotina.Conectar();
		
		//BUSCA TODAS AS CATEGORIAS=====================================================
		consulta = gerenciador.createQuery("select c from Categoria c");
		listaCat = consulta.getResultList();
		//Total de categorias cadastradas:
		this.lbl_1.setText(""+listaCat.size());
		
		//BUSCA TODOS OS PRODUTOS======================================================
		consulta = gerenciador.createQuery("select c from Produto c");
		listaPro = consulta.getResultList();
		int estoque = 0;
		for(Produto p : listaPro){
			estoque += p.getEstoque();
		}
		//Total de produtos cadastrador:
		this.lbl_2.setText(""+listaPro.size());
		//Total de produtos em estoque:
		this.lbl_7.setText(""+estoque);
		
		//BUSCA TODAS AS VENDAS=========================================================
		consulta = gerenciador.createQuery("select c from Venda c");
		listaVen = consulta.getResultList();
		//Total de vendas cadastradas:
		this.lbl_3.setText(""+listaVen.size());
		
		//BUSCA TODOS OS USUÁRIOS=======================================================
		consulta = gerenciador.createQuery("select c from Usuario c");
		listaUsu = consulta.getResultList();
		//Total de usuários cadastrados:
		this.lbl_8.setText(""+listaUsu.size());
		
		//BUSCA TODOS OS ITENS VENDIDOS==================================================
		consulta = gerenciador.createQuery("select c from ProdutoVenda c");
		listaProdVen = consulta.getResultList();
		int qtdVendida = 0;
		double totalBruto = 0 , totalHoje =0;
		for(ProdutoVenda u : listaProdVen){
			qtdVendida += u.getQuantidade();
			totalBruto += u.getProduto().getValorVenda() * u.getQuantidade();
			
			
			if(u.getVenda().getData().equals(GUI_principal.data)){
				totalHoje += u.getProduto().getValorVenda() * u.getQuantidade();
			}
		}
		//Total de itens vendidos:
		this.lbl_4.setText(""+qtdVendida);
		//Total bruto arrecadado:
		this.lbl_5.setText("R$ "+totalBruto);
		//Total arrecadado hoje:
		this.lbl_6.setText("R$ "+totalHoje);
		
		rotina.Fechar(gerenciador);
	
	}//RESUMO

}//CLASS
