
package PilhaFila;


public class Pilha {
    

    
    int vet[] = new int[100];
    int topo = 0;
    
        public static void main(String ... args){
        
        Pilha p = new Pilha();
        
        
        System.out.println(p.vazia());
        
        p.empilhar(2);
        p.empilhar(64);      
        p.empilhar(5);      
        p.empilhar(4);      
        
        System.out.println(p.vazia());
        System.out.println(p.tamanho());
        
        
        
        
    }
    
    public void empilhar(int x){
        if (topo >= 0){
            
            vet[topo] = x;
            topo++;
    }else{ 
        System.out.println("Pilha cheia, impossível Empilhar");
                    }        
    }
   
    public void desempilhar(){
        if (topo != 0 )
        topo--;    
        else{
            System.out.println("Pilha vazia, não há o que desempilhar!!");
        }
    }
    
    public int topo(){
        if (topo != 0)
        return vet[topo];
     else{
            return 0;
    }
}
    public int tamanho(){
            return topo;
}
    
    public  boolean vazia(){
        return topo <= 0;
    }
    


}
    
    
    
    
    

