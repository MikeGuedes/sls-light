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
//	MÉTODO PARA RECUPERAR UMA CONEXÃO COM O BANCO DE DADOS 
//=========================================================================================
    
	public EntityManager Conectar() {
	
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("sls");
		EntityManager gerenciador = fabrica.createEntityManager();
		return gerenciador;
		
	}//CONECTAR
        
//=========================================================================================
//	MÉTODO PARA SALVAR UM OBJETO NO BANCO DE DADOS 
//=========================================================================================
	
	public void Persistir(EntityManager gerenciador,Object objeto) {
                 
		try{
			gerenciador.getTransaction().begin();
			gerenciador.persist(objeto);
			gerenciador.getTransaction().commit();
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null,"Erro ao salvar. \n"+
				"Erro: "+ex.getMessage(), "Mensagem de erro.", JOptionPane.ERROR_MESSAGE);
		}//TRY CATCH
                
        }//SALVAR

//=========================================================================================
//	MÉTODO PARA DELETAR UM OBJETO DO BANCO DE DADOS 
//=========================================================================================
	
	public void Deletar(EntityManager gerenciador,Object objeto) {
                 
		try{
			gerenciador.getTransaction().begin();
			gerenciador.remove(objeto);
			gerenciador.getTransaction().commit();
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null,"Erro: "+ex.getMessage(), "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
		}//TRY CATCH
                
	}//DELETAR
		
//=========================================================================================
//	MÉTODO PARA ENCERRAR A CONEXÃO COM O BANCO DE DADOS 
//=========================================================================================
	
	public void Fechar(EntityManager gerenciador) {

		try{//TRATAMENTO DE ERRO
			gerenciador.close();
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão com o banco de dados.\n"+
				"Erro: "+ex.getMessage(), "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
		}//TRY CATCH

	}//FECHAR
    
//=========================================================================================
//	MÉTODO PARA ALTERAR UM OBJETO NO BANCO DE DADOS 
//=========================================================================================
	
	public void Update(EntityManager gerenciador, Object obj, String tabela){

		try{
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
		
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Erro ao alterar.\n"+
				"Erro: "+ex, "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
		}//TRY CATCH     

	}//UPDATE

//=========================================================================================
//	MÉTODOS PARA LOCALIZAR OBJETOS
//=========================================================================================

	public Object Localiza(EntityManager gerenciador, int id, String tabela){

		try{
			consulta = gerenciador.createQuery("select c from "+tabela+" c where c.id = :id");//HQL
			consulta.setParameter("id", id); //Compara o id do banco com o id do parâmetro
			obj = consulta.getSingleResult();
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Erro ao localizar.\n"+
				"Erro: "+ex.getMessage(), "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
		}//TRY CATCH

		return obj;
	}//LOCALIZAR

//=========================================================================================
//	MÉTODO PARA LOCALIZAR O REGISTRO ANTERIOR
//=========================================================================================
	
	public Object Anterior(EntityManager gerenciador, int id, String tabela){

		try{
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
	}//ANTERIOR
    
//=========================================================================================
//	MÉTODO PARA LOCALIZAR O REGISTRO POSTERIOR
//=========================================================================================
	
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
	}//PRÓXIMO
    
//=========================================================================================
//	MÉTODO PARA LOCALIZAR O PRIMEIRO REGISTRO
//=========================================================================================
	
	public Object Primeiro(EntityManager gerenciador, String tabela){

		try{//TRATAMENTO DE ERROS
			//Seleciona apenas o primeiro registro na ordem crescente
			consulta = gerenciador.createQuery("select c from "+tabela+" c order by c.id asc");//HQL
			consulta.setMaxResults(1);//Captura o primeiro registro
			obj = consulta.getSingleResult();
		}catch(NoResultException ex){
			JOptionPane.showMessageDialog(null,"Erro ao localizar.\n"+
				"Erro: "+ex.getMessage(), "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
		}//TRY CATCH	

		return obj;
	}//PRIMEIRA
    
//=========================================================================================
//	MÉTODO PARA LOCALIZAR O ULTIMO REGISTRO
//=========================================================================================
		
	public Object Ultimo(EntityManager gerenciador, String tabela){

		try{
			//Seleciona apenas o primeiro registro na ordem decrescente
			consulta = gerenciador.createQuery("select c from "+tabela+" c order by c.id desc");//HQL
			consulta.setMaxResults(1);//Captura o último registro
			obj = consulta.getSingleResult();
		}catch(NoResultException ex){
			JOptionPane.showMessageDialog(null, "Erro ao localizar.\n"+
				"Erro: "+ex.getMessage(), "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
		}//TRY CATCH     

		return obj;
	}//ULTIMA
    
//=========================================================================================
//	MÉTODO PARA EXIBIR (PREVER) O CÓDIGO DO NOVO REGISTRO
//=========================================================================================
	
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
	}//MOSTRA O CÓDIGO
    
//=========================================================================================
//	MÉTODO PARA ACESSO AO SISTEMA (LOGIN)
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
    
//=========================================================================================
//	MÉTODO PARA VERIFICAR SE O USUÁRIO PODE SER CADASTRADO
//=========================================================================================
	
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
    
//=========================================================================================
//	MÉTODO PARA ADICIONAR ITEM A LISTA DE COMPRAS
//=========================================================================================
	
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
