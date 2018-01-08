package escolaonline;

import java.util.List;

/**
 *
 * @author alysson
 */
public class AlunosCadastroMetodos {
   
    
    private String nome;
   public String setNome(String nome){
    this.nome=nome;
    
     
     return this.nome;
    }
 
   public void getNome(){
 
   System.out.println("Nome Salvo: "+this.nome);     
    
        
   }    
}
