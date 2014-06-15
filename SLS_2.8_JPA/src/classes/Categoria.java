package classes;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "categoria")
@XmlRootElement
public class Categoria implements Serializable {
        private static final long serialVersionUID = 1L;
    
//=========================================================================================
//	ATRIBUTOS
//=========================================================================================
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "id")
        private int id;
        @Column(name = "nome")
        private String nome;
        @Column(name = "status")
        private boolean status;
    
//=========================================================================================
//	CHAVE ESTRANGEIRA / LISTA
//=========================================================================================
    
        @OneToMany(mappedBy = "categoria")
        private List<Produto> produtoList;

//=========================================================================================
//	MÉTODOS GET / SET
//=========================================================================================

        public int getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
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

        public void setStatus(boolean stautus) {
                this.status = stautus;
        }

        public List<Produto> getProdutoList() {
                return produtoList;
        }

        public void setProdutoList(List<Produto> produtoList) {
                this.produtoList = produtoList;
        }
    
}//CLASS
