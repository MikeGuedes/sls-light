package classes;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "produto_venda")
@XmlRootElement
public class ProdutoVenda implements Serializable {
        private static final long serialVersionUID = 1L;
    
//=========================================================================================
//	ATRIBUTOS
//=========================================================================================
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "id")
        private Integer id;

        @Column(name = "quantidade")
        private Integer quantidade;

//=========================================================================================
//	CHAVE ESTRANGEIRA / LISTA
//=========================================================================================
    
        @JoinColumn(name = "produto")
        @ManyToOne(optional = false)
        private Produto produto;

        @JoinColumn(name = "venda")
        @ManyToOne(optional = false)
        private Venda venda;

//=========================================================================================
//	MÉTODOS GET / SET
//=========================================================================================

        public Integer getQuantidade() {
                return quantidade;
        }

        public void setQuantidade(Integer quantidade) {
                this.quantidade = quantidade;
        }

        public Produto getProduto() {
                return produto;
        }

        public void setProduto(Produto produto) {
                this.produto = produto;
        }

        public Venda getVenda() {
                return venda;
        }

        public void setVenda(Venda venda) {
                this.venda = venda;
        }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
    
}//CLASS
