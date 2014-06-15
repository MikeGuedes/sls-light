package classes;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "venda")
@XmlRootElement
public class Venda implements Serializable {
        private static final long serialVersionUID = 1L;
    
//=========================================================================================
//	ATRIBUTOS
//=========================================================================================
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "id")
        private Integer id;
        @Column(name = "data_")
        private String data;
		
        @Column(name = "hora")
        private String hora;
		
        @Column(name = "pagamento")
        private String pagamento;
    
//=========================================================================================
//	CHAVE ESTRANGEIRA / LISTA
//=========================================================================================
    
        @JoinColumn(name = "usuario", referencedColumnName = "id")
        @ManyToOne
        private Usuario usuario;

        @OneToMany(cascade = CascadeType.ALL, mappedBy = "venda")
        private List<ProdutoVenda> produtoVendaList;

//=========================================================================================
//	MÉTODOS GET / SET
//=========================================================================================
    
        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getData() {
                return data;
        }

        public void setData(String data) {
                this.data = data;
        }

        public String getHora() {
                return hora;
        }

        public void setHora(String hora) {
                this.hora = hora;
        }

        public String getPagamento() {
                return pagamento;
        }

        public void setPagamento(String pagamento) {
                this.pagamento = pagamento;
        }

        @XmlTransient
        public List<ProdutoVenda> getProdutoVendaList() {
                return produtoVendaList;
        }

        public void setProdutoVendaList(List<ProdutoVenda> produtoVendaList) {
                this.produtoVendaList = produtoVendaList;
        }

        public Usuario getUsuario() {
                return usuario;
        }

        public void setUsuario(Usuario usuario) {
                this.usuario = usuario;
        }

}//CLASS
