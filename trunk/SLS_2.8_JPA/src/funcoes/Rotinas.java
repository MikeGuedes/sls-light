package funcoes;
import classes.Categoria;
import classes.Produto;
import classes.Usuario;
import classes.Venda;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import telas.GUI_principal;

public class Rotinas {
	
//=========================================================================================
//	VARIÁVEIS GLOBAIS
//=========================================================================================
    
        Query consulta;
        Object obj = new Object();
        Usuario usuario = new Usuario();
        Categoria categoria = new Categoria();
        Produto produto = new Produto();
        Venda venda = new Venda();
        
//=========================================================================================
//	MÉTODOS PRINCIPAIS  
//=========================================================================================
    
        public EntityManager Conectar() {

                //Método de criação e conexão do banco de dados
                EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("sls");
                EntityManager gerenciador = fabrica.createEntityManager();

                return gerenciador;
        }//CONECTAR
        
        public void Persistir(EntityManager gerenciador,Object objeto) {
                 
                try{//TRATAMENTO DE ERRO
                        gerenciador.getTransaction().begin();
                        gerenciador.persist(objeto);
                        gerenciador.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !", 
                                "Informativo", JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Erro ao percistir o objeto ! \n"+
                                "Erro: "+ex.getMessage(), "Ocorreu um problema !", JOptionPane.WARNING_MESSAGE);
                }//TRY CATCH
                
        }//PERSISTIR

        public void Fechar(EntityManager gerenciador) {
            
                try{//TRATAMENTO DE ERRO
                        gerenciador.close();
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Erro ao tentar fechar o banco de dados \n"+
                                "Erro: "+ex.getMessage(), "Encotramos problemas !", JOptionPane.WARNING_MESSAGE);
                }//TRY CATCH
            
        }//FECHAR
    
        public void Update(EntityManager gerenciador, Object obj, String tabela){
             
                try{//TRATAMENTO DE ERROS
                        //Seleciona apenas o primeiro registro igual ao id
                        consulta = gerenciador.createQuery("select c from "+tabela+" c where c.id = :id");
                  
                        if(tabela.equals("Categoria")){
                        categoria = (Categoria)obj;
                        consulta.setParameter("id", categoria.getId()); //Compara o id do banco com o id do parâmetro
                        gerenciador.getTransaction().begin();
                        gerenciador.merge(categoria);
                        gerenciador.getTransaction().commit();
                        
                        }else if(tabela.equals("Usuario")){
                        usuario = (Usuario)obj;
                        consulta.setParameter("id", usuario.getId()); //Compara o id do banco com o id do parâmetro
                        gerenciador.getTransaction().begin();
                        gerenciador.merge(usuario);
                        gerenciador.getTransaction().commit();
                        
                        }else if(tabela.equals("Produto")){
                        produto = (Produto)obj;
                        consulta.setParameter("id", produto.getId()); //Compara o id do banco com o id do parâmetro
                        gerenciador.getTransaction().begin();
                        gerenciador.merge(produto);
                        gerenciador.getTransaction().commit();
                        
                        }else if(tabela.equals("Venda")){
                        venda = (Venda)obj;
                        consulta.setParameter("id", venda.getId()); //Compara o id do banco com o id do parâmetro
                        gerenciador.getTransaction().begin();
                        gerenciador.merge(venda);
                        gerenciador.getTransaction().commit();
                }//IF
                           
                        JOptionPane.showMessageDialog(null, "Ateração realizada com sucesso !", 
                                "Informativo", JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "Erro ao tentar realizar a alteração no objeto ! \n"+
                                "Erro: "+ex, "Ocorreu um problema !", JOptionPane.WARNING_MESSAGE);
                }//TRY CATCH     
             
        }//UPDATE
    
//=========================================================================================
//	MÉTODOS PARA NAVEGAÇÃO
//=========================================================================================

        public Object Localiza(EntityManager gerenciador, int id, String tabela){

                try{//TRATAMENTO DE ERROS

                        consulta = gerenciador.createQuery("select c from "+tabela+" c where c.id = :id");//HQL
                        consulta.setParameter("id", id); //Compara o id do banco com o id do parâmetro
                        obj = consulta.getSingleResult();

                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null, "O código informado não existe ! \n"+
                                "Digite o código corretamente", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                }//TRY CATCH
             
                return obj;
        }//LOCALIZA CATEGORIA
    
        public Object Anterior(EntityManager gerenciador, int id, String tabela){
             
                try{//TRATAMENTO DE ERROS
                        //Seleciona apenas o primeiro registro com o id menor que o passado
                        consulta = gerenciador.createQuery("select c from "+tabela+" c where c.id < :id order by c.id desc");//HQL
                        consulta.setParameter("id", id); //Compara o id do banco com o id do parâmetro
                        consulta.setMaxResults(1);//Captura o primeiro registro
                        obj = consulta.getSingleResult();
                }catch(NoResultException ex){
                        JOptionPane.showMessageDialog(null, "Esse é o primeiro registro", 
                                "Informativo", JOptionPane.INFORMATION_MESSAGE);
                }//TRY CATCH
             
                return obj;
        }//CATEGORIA ANTERIOR
    
        public Object Proximo(EntityManager gerenciador, int id, String tabela){
             
                try{//TRATAMENTO DE ERROS
                        //Seleciona apenas o primeiro registro com o id maior que o passado
                        consulta = gerenciador.createQuery("select c from "+tabela+" c where c.id > :id");//HQL
                        consulta.setParameter("id", id); //Compara o id do banco com o id do parâmetro
                        consulta.setMaxResults(1);//Captura o primeiro registro
                        obj = consulta.getSingleResult();
                }catch(NoResultException ex){
                        JOptionPane.showMessageDialog(null, "Esse é o último registro", 
                                "Informativo", JOptionPane.INFORMATION_MESSAGE);
                }//TRY CATCH
             
                return obj;
        }//CATEGORIA ANTERIOR
    
        public Object Primeiro(EntityManager gerenciador, String tabela){

                try{//TRATAMENTO DE ERROS
                        //Seleciona apenas o primeiro registro na ordem crescente
                        consulta = gerenciador.createQuery("select c from "+tabela+" c order by c.id asc");//HQL
                        consulta.setMaxResults(1);//Captura o primeiro registro
                        obj = consulta.getSingleResult();
                }catch(NoResultException ex){
                        JOptionPane.showMessageDialog(null,"Erro ao tentar achar o primeiro registro \n"+
                                "Tente novamente", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                }//TRY CATCH
                  
                return obj;
        }//CATEGORIA PRIMEIRA
    
        public Object Ultimo(EntityManager gerenciador, String tabela){
             
                try{//TRATAMENTO DE ERROS
                        //Seleciona apenas o primeiro registro na ordem decrescente
                        consulta = gerenciador.createQuery("select c from "+tabela+" c order by c.id desc");//HQL
                        consulta.setMaxResults(1);//Captura o último registro
                        obj = consulta.getSingleResult();
                }catch(NoResultException ex){
                        JOptionPane.showMessageDialog(null, "Erro ao tentar achar o ultimo registro \n"+
                                "Tente novamente", "Informativo", JOptionPane.INFORMATION_MESSAGE);
                }//TRY CATCH     
             
                return obj;
        }//CATEGORIA ULTIMA
    
        public Object MostraCodigo(EntityManager gerenciador, String tabela){
             
                try{
                        //Seleciona apenas o primeiro registro na ordem decrescente
                        consulta = gerenciador.createQuery("select c from "+tabela+" c order by c.id desc");//HQL
                        consulta.setMaxResults(1);//Captura o último registro
		obj = consulta.getSingleResult();
				    
                }catch(Exception ex){
                        JOptionPane.showMessageDialog(null,"Bem vindo ! \n"+
                                "Agora você ira realizar seu primeiro cadastro, neste módulo. \n"+
                                "Preencha todos os campos de maneira correta.", 
                                "Informativo", JOptionPane.INFORMATION_MESSAGE);
                }//TRY CATCH
             
                return obj;
        }//MOSTRA O CÓDIGO DA CATAGORIA
    
//=========================================================================================
//	MÉTODOS INDIVIDUAIS
//=========================================================================================
    
        public Usuario Acesso(EntityManager gerenciador, int id, String senha){
             
                consulta = gerenciador.createQuery("select c from Usuario c where c.id = :id");
                consulta.setParameter("id", id);
                consulta.setMaxResults(1);//Captura o último registro
                usuario = (Usuario)consulta.getSingleResult();
             
                if(usuario.getId() == id && usuario.getSenha().equals(senha)){
             
                        if(usuario.isStatus() == true){
                                
                                if(usuario.getCargo().equals("Vendedor") || usuario.getCargo().equals("Gerente")){
                                
					GUI_principal tela = new GUI_principal();
					tela.setVisible(true);
					tela.Configuracao(usuario.getCargo(), usuario.getId(), usuario.getNome());
										
                                }//IF
                           
                        }//IF
             
                }//IF
             
                return usuario;
        }//ACESSO
    
        public String ValidaUsuario(String nome, String senha, String csenha){
    
                String retorno = "";
             
                if(nome.equals("") || senha.equals("") || csenha.equals("") ){
                        
                        JOptionPane.showMessageDialog(null,"Todos os campos são requeridos.", 
                                "Informativo", JOptionPane.INFORMATION_MESSAGE);
                      
                }else{
                
                        if(senha.equals(csenha)){
                                
                                retorno = "ok";
                               
                        }else{
                                JOptionPane.showMessageDialog(null,"As senhas não são iguais.", 
                                        "Informativo", JOptionPane.INFORMATION_MESSAGE);
                        
                        }//IF
                        
                }//IF
             
             
                return retorno;
        }//VALIDA USUARIO
    
	public Produto AdicionaIten(EntityManager gerenciador, int id){
	
		try{//TRATAMENTO DE ERRO
			consulta = gerenciador.createQuery("select c from Produto c where c.id = :id");
			consulta.setParameter("id", id);
			produto = (Produto) consulta.getSingleResult();
			
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Erro ao adicionar o item à lista. \n"
				+ "ERRO: "+ex.getMessage());
		}//TRY CATCH 
		
		return produto;
	}//ADICIONA ITEM	
	
}//CLASS
