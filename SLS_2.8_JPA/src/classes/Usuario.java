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
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "usuario")
@XmlRootElement
public class Usuario implements Serializable {
        private static final long serialVersionUID = 1L;
    
//=========================================================================================
//	ATRIBUTOS
//=========================================================================================
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "id")
        private Integer id;
        @Column(name = "cargo")
        private String cargo;
        //@Max(value=2)  @Min(value=2)//if you know range of your decimal fields consider using these annotations to enforce field validation
        @Column(name = "cpos")
        private Double cpos;
        @Column(name = "cpre")
        private Double cpre;
        @Column(name = "meta")
        private Double meta;
        @Column(name = "nome")
        private String nome;
        @Column(name = "salario")
        private Double salario;
        @Column(name = "senha")
        private String senha;
        @Column(name = "status")
        private boolean status;

//=========================================================================================
//	CHAVE ESTRANGEIRA / LISTA
//=========================================================================================
    
        @OneToMany(mappedBy = "usuario")
        private List<Venda> vendaList;

//=========================================================================================
//	CONSTRUTOR
//=========================================================================================
    
        public Usuario() {
        }
    
//=========================================================================================
//	MÉTODOS GET /SET
//=========================================================================================

        public Usuario(Integer id) {
                this.id = id;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getCargo() {
                return cargo;
        }

        public void setCargo(String cargo) {
                this.cargo = cargo;
        }

        public Double getCpos() {
                return cpos;
        }

        public void setCpos(Double cpos) {
                this.cpos = cpos;
        }

        public Double getCpre() {
                return cpre;
        }

        public void setCpre(Double cpre) {
                this.cpre = cpre;
        }

        public Double getMeta() {
                return meta;
        }

        public void setMeta(Double meta) {
                this.meta = meta;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public Double getSalario() {
                return salario;
        }

        public void setSalario(Double salario) {
                this.salario = salario;
        }

        public String getSenha() {
                return senha;
        }

        public void setSenha(String senha) {
                this.senha = senha;
        }

        public boolean isStatus() {
                return status;
        }

        public void setStatus(boolean status) {
                this.status = status;
        }

        @XmlTransient
        public List<Venda> getVendaList() {
                return vendaList;
        }

        public void setVendaList(List<Venda> vendaList) {
                this.vendaList = vendaList;
        }

}//CLASS