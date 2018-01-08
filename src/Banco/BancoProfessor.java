
package Banco;

import java.sql.Statement;

/**
 *
 * @author alysson
 */
public class BancoProfessor{
    ConexaoBanco conectaBanco=new ConexaoBanco();
    private Statement stm=null;
    
   public void conecta(){
    conectaBanco.conecta();
    } 
   public void cadastraProfessor(String nome, String numeroDiploma,String tituloDiploma, String turma,String cpf,String materi){
    try{
        String tabela="INSERT INTO professores(nome, idade, turma, cpf) VALUES('"+nome+"','"+numeroDiploma+"','"+turma+"','"+cpf+"');";
        this.stm.executeUpdate(tabela);
    }catch(Exception e){
     System.out.println("Erro "+e); 
    
    }
    
    }
}
