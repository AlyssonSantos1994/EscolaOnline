package Banco; 
import Telas.PesquisaAlunos;
import escolaonline.FuncionarioOK;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author alysson
 */
public class ConexaoBanco {
    private Connection connection= null;
    private  Statement stm=null;
    public ResultSet rs=null;
    
  public  void  conecta(){
    
    String driver="com.mysql.jdbc.Driver";
    String servidor="jdbc:mysql://localhost:3306/escolaOnline";
    String usuario="root";
    String senha="";
    
    try{
    Class.forName(driver);
    this.connection=DriverManager.getConnection(servidor,usuario,senha);
    this.stm=this.connection.createStatement();
    
    }catch(Exception e){
    System.out.println("Erro "+e);
    }
    
    }
    
    
   public void cadastraAluno(String nome,String idade,String turma,String cpf){
    try{
        String tabela="INSERT INTO aluno(nome, idade, turma, cpf) VALUES('"+nome+"','"+idade+"','"+turma+"','"+cpf+"');";
        this.stm.executeUpdate(tabela);
    }catch(Exception e){
     System.out.println("Erro "+e); 
    
    }
    
    
    }
   
   
    public void cadastraProfessor(String nome, String numeroDiploma,String tituloDiploma, String turma,String cpf,String materi){
    try{
        String tabela="INSERT INTO professores(nome, numero_diploma, titulo_diploma, turma, cpf, materia) VALUES('"+nome+"','"+numeroDiploma+"','"+tituloDiploma+"','"+turma+"','"+cpf+"','"+materi+"');";
        this.stm.executeUpdate(tabela);
    }catch(Exception e){
     System.out.println("Erro "+e); 
    
    }
    
    }
    public void cadastraMaterias(String nome, String anoAp,String cargahora, String comentarios){
    try{
        String tabela="INSERT INTO materias(nome, anosAp, cargaHora, comentarios) VALUES('"+nome+"','"+anoAp+"','"+cargahora+"','"+comentarios+"');";
        this.stm.executeUpdate(tabela);
    }catch(Exception e){
     System.out.println("Erro "+e); 
    
    }
    
    }
    
    public void cadastraOutros(String nome, String cargo,String cpf, String rg, String tituliEl, String telefone){
    try{
        String tabela="INSERT INTO funcionarios(nome, cargo, cpf, rg, tituliEl, telefone) VALUES('"+nome+"','"+cargo+"','"+cpf+"','"+rg+"','"+tituliEl+"','"+telefone+"');";
        this.stm.executeUpdate(tabela);
    }catch(Exception e){
     System.out.println("Erro "+e); 
    
    }
    
    }
    
    
     public void pesquisaDados(String Nome,String cpf){
		
        try{
		String tabela="SELECT nome, cpf FROM funcionarios";	
                 this.rs=stm.executeQuery(tabela);
		this.stm=this.connection.createStatement();
                //rs.first();
                FuncionarioOK func=new FuncionarioOK();
                while(rs.next()){
                if(Nome.equals(rs.getString("nome"))&& cpf.equals(rs.getString("cpf"))){
                func.acessoOK();
               
                
                }
//                else{
//                func.Errologin();
//                
//                }
                }
		}catch(Exception e){
			System.out.println("erro na coluna");
			
		}	
    
    
}
    
    

}
