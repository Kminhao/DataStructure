
package Recursividade;


public class Recursividade {
    
    

        
        //fatorial
public static int fat(int n){
	if (n <= 1)
	return 1;
else{ 
	return fat(n-1) * n; 
}


}

//somatório
public int soma(int n){
	if (n <= 1){
		return 1;
}
	return n + soma(n-1);

}



//potência
public static int potencia(int x, int n){
    if( n == 1 )
         return x;
    else{ return x*potencia(x,n-1);
    
}
}
/*potência
 public static int pot(int x, int n){
        
        if(n>=1)
            return (x*pot(x,n-1));
        
        else{   
        return 1;
 }
 }
*/
//exibir de 0 até n de forma crescente
public void cresc(int n){
        if(n>=0){
            cresc(n-1);
            System.out.println(n);
        }
        
}

//exibir de n até 0 de forma crescente
public void decresc(int n){
        if(n>=0){
            System.out.println(n);
            decresc(n-1);
        }
        
}

//soma dos elementos do vetor 
public int SomaVet(int v[],int n){
        if(n>=0){
            return (v[n]+SomaVet(v,n-1));
        }
        return 0;        
}

//exibir o menor elemento de um vetor
    public int MenorValor(int v[],int n){
    if(n>0){
        int x = MenorValor(v,n-1);
        if(x < v[n]){
        return x;
        }

        return v[n];

        }
    return v[n];
}

//apresentação binária
    public void Dec2Bin(int n){
        
        if(n!=1){
        Dec2Bin(n/2);
        int c = n%2;
            System.out.println(c);

        }else{
        System.out.println(1);
        }
}



    
    
 public static void main (String ... args){
     
     
     System.out.println(fat(5));
     
     System.out.println(potencia(223,5));
     
     Recursividade exiba = new Recursividade();
     exiba.cresc(5);
     exiba.decresc(5);
 }
    
    
    
    
    
}
