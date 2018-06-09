
package linkedList;


public class listaLigada {
    
    static No inicio = null;
    
    public void inserir(int x){
        No novo = new No (x);
        if (inicio == null)
            inicio = novo;
        else{
            No temp = inicio;
            while (inicio != null)
                temp = temp.prox;
            temp.prox = novo;
        }   
            
        
    }
    
  
    public void exibidor(No temp){
        if (inicio == null)
            System.out.println("Fila vazia");
        else{
            while (temp != null)
                System.out.println(temp.valor);
            exibidor(temp.prox);
            
        
         }
    
    } 
    
    
    public int tamanho(No temp){
        if (inicio != null)
            return tamanho(temp.prox);
        return 0;
        
    }
    
    
    public void removeFim(No temp){
        No temp2 = null;
        while(temp.prox != null){
            temp2 = temp;
            temp = temp.prox;
            }
        temp2.prox = null;

    }
        
    
    
    
    
    
    public void removeInicio(No temp){
        inicio = temp.prox;
    }
    
    
     static void removeValor( int x){
        No temp = inicio;
        No temp2 = temp;
        boolean first = true;
        boolean nofirst = false;
        
        if(temp.prox == null && temp.valor == x){
            inicio = null;
        }

        
        
        while(temp.prox != null){
            if(first == true && temp2.valor == x){
                first = false;
                inicio = inicio.prox;
                nofirst = false;
            }
            
            if(temp.valor == x && nofirst == true){
                temp2.prox = temp.prox;
            }
            temp2 = temp;
            temp = temp.prox;
            first = false;
            nofirst = true;
        }
        
        if(temp.prox == null && temp.valor == x)
            temp2.prox = null;

    }

       

     
     
        static void exibirInverso(No temp){
        if(inicio == null)
            System.out.println("Lista Vazia");
        else
            if (temp != null) {
                exibirInverso(temp.prox);
                System.out.println(temp.valor);
            }
    }
  
        
        
        
        
     public static void main (String ... args){
         
         listaLigada f = new listaLigada();
         
         
         
         f.inserir(10);
         f.inserir(12);
         
         

         
         
         
         
         
         
     }   

  
} 
  
  
  
  
