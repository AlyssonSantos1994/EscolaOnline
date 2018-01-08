/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escolaonline;

import Telas.TelaHome;
import java.util.ArrayList;

/**
 *
 * @author alysson
 */
public class Lista {
     TelaHome home=new TelaHome();
    ArrayList lista=new ArrayList();
    
 public void  AdicionaNome(String nome){
lista.add(0,nome);
 home.retornaNome(nome);
}
  public void AdiconaCpf(String CPF){
  lista.add(1,CPF);
  home.retornaCpf(CPF);
  
 }
  
  public void retorna(){
  
 String  nome=(String) lista.get(0);
 String cpf=(String)lista.get(1);
     


   }
 
    
}
