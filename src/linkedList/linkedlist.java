
package linkedList;

public class linkedlist {
    
    static No inicio = null;
    
    
    
    public void Inserir(int x){
        No novo = new No(x);
        if (inicio == null){
            inicio = novo;
        }else{
            No temp = inicio;
            while (inicio != null){
                temp = temp.prox;
            
            temp.prox = novo;
            }
        }
        
    }
    
    public void exibir(){
        if(inicio == null){
            System.out.println("Lista vazia, não há o que exibir!");
        }else{
            No temp = inicio;
            while(temp != null)
                System.out.println(temp);
            temp = temp.prox;
                
                }
        
        





    }
    
    
    
    
    
    public static void main(String ... args){
        linkedlist f = new linkedlist();
        
        
   f.Inserir(2);
   f.Inserir(3);
    f.exibir();
        
        
        
        
        
      
    }
    

}
    

