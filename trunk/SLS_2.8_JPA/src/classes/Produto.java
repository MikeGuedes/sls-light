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
@Table(name = "produto")
@XmlRootElement
public class Produto implements Serializable {
        private static final long serialVersionUID = 1L;
    
//=========================================================================================
//	ATRIBUTOS
//=========================================================================================
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "id")
        private Integer id;
        @Column(name = "cor")
        private String cor;
        @Column(name = "estoque")
        private Integer estoque;
        @Column(name = "genero")
        private String genero;
        @Column(name = "localizacao")
        private String localizacao;
        @Column(name = "nome")
        private String nome;
        @Column(name = "status")
        private boolean status;
        @Column(name = "tamanho")
        private String tamanho;
        // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
        @Column(name = "valorFabrica")
        private Double valorFabrica;
        @Column(name = "valorVenda")
        private Double valorVenda;
    
//=========================================================================================
//	CHAVE ESTRANGEIRA / LISTA
//=========================================================================================
    
        @JoinColumn(name = "categoria", referencedColumnName = "id")
        @ManyToOne
        private Categoria categoria;

        @OneToMany(cascade = CascadeType.ALL, mappedBy = "produto")
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

        public String getCor() {
                return cor;
        }

        public void setCor(String cor) {
                this.cor = cor;
        }

        public Integer getEstoque() {
                return estoque;
        }

        public void setEstoque(Integer estoque) {
                this.estoque = estoque;
        }

        public String getGenero() {
                return genero;
        }

        public void setGenero(String genero) {
                this.genero = genero;
        }

        public String getLocalizacao() {
                return localizacao;
        }

        public void setLocalizacao(String localizacao) {
                this.localizacao = localizacao;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public boolean isStatus() {
                return status;
        }

        public void setStatus(boolean status) {
                this.status = status;
        }

        public String getTamanho() {
                return tamanho;
        }

        public void setTamanho(String tamanho) {
                this.tamanho = tamanho;
        }

        public Double getValorFabrica() {
                return valorFabrica;
        }

        public void setValorFabrica(Double valorFabrica) {
                this.valorFabrica = valorFabrica;
        }

        public Double getValorVenda() {
                return valorVenda;
        }

        public void setValorVenda(Double valorVenda) {
                this.valorVenda = valorVenda;
        }

        public Categoria getCategoria() {
                return categoria;
        }

        public void setCategoria(Categoria categoria) {
                this.categoria = categoria;
        }

        @XmlTransient
        public List<ProdutoVenda> getProdutoVendaList() {
                return produtoVendaList;
        }

        public void setProdutoVendaList(List<ProdutoVenda> produtoVendaList) {
                this.produtoVendaList = produtoVendaList;
        }

}//CLASS
