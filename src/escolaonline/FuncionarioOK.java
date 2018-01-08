
package escolaonline;

import Telas.TelaHome;
import Telas.TelaLgin;
import javax.swing.JOptionPane;

/**
 *
 * @author alysson
 */
public class FuncionarioOK {
    
   public void acessoOK(){
  TelaHome chama= new TelaHome();
   chama.setVisible(true);
   
   }
   public void Errologin(){
       TelaLgin chama=new TelaLgin();
       chama.setVisible(true);
 JOptionPane.showMessageDialog(null,"ERRO EM SEU LOGIN TENTE NOVAMENTE");
   
   } 
}
