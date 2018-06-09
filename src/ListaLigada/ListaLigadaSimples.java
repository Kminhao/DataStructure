/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaLigada;






public class ListaLigadaSimples {

    static No inicio = null;
    
    public static void main(String ... args){
        inserir(1);
        inserir(2);      
        inserir(3);
        inserir(4);
        inserir(5);
        exibir();
        exibirInverso(inicio);
        
        
        
        
    }
    
    
  static void inserir(int x){
        No novo = new No (x);  
        if (inicio == null)
        inicio = novo;
        else{
                No temp = inicio;
                while ((temp.prox != null))
                        temp = temp.prox;
                temp.prox = novo;           
    }
}    
 
  static void exibirInverso(No temp){
        if(inicio == null)
            System.out.println("Lista Vazia!");
        
        else if (temp != null){
            exibirInverso(temp.prox);
            System.out.println(temp.valor);

            
            
        }
        
    }

  static void exibir(){
 if(inicio == null)
            System.out.println("Lista Vazia!");
        
 else{ 
                No temp = inicio;
         while (temp != null){

             System.out.println(temp.valor);

          temp = temp.prox;       
   
    
        }
    
    }   
    

}
   
  static void removeInicio(No temp){
       inicio = temp.prox;
   }
   
   
  static int tamanho(No temp) {
        if (temp != null)
            return 1 + tamanho(temp.prox);

        return 0;
    }

  static void removeFim(No temp){
        No temp2 = null;
       
        while(temp.prox != null){
            temp2 = temp;
            temp = temp.prox;
        }
         
        temp2.prox = null;

    } 
   
   
}