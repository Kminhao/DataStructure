/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArvoreBinaria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Arvore {

    static No raiz = null;

    public static void main(String[] args) throws IOException {
/*
        insereIterativo(9);
        insereIterativo(6);
        insereIterativo(10);
        insereIterativo(11);
        insereIterativo(3);
        insereIterativo(4);
        insereIterativo(5);

       exibeOrdenado(raiz);
     //   System.out.println("Número de folhas: " + contarFolhas(raiz));
     //   System.out.println("Profundidade: " + profundidade(raiz));
        System.out.println("lul");
        exibeInverso(raiz);

     //   exibe1filho(raiz);
        System.out.println("lul");
      //  exibefolhas(raiz);

        System.out.println("A profundidade é:");
        profundidade(raiz);

        System.out.println("A quantidade de folhas da Árvore é:" +" " + contarFolhas(raiz));



*/

            LerArquivo();
            
            System.out.println("Número de folhas:" + contarFolhas(raiz));
            System.out.println("A profundidade é:" + profundidade(raiz));
            exibeArvore(raiz, 0);
            System.out.println("As que tem um filho:");
                    exibe1filho(raiz);
    
    }

    
    
    
    public static void LerArquivo() throws FileNotFoundException, IOException{
                // LEITURA

        // Escolhendo o arquivo que será lido
        String arqLeitura = "";
        String linha ="";
        //filtro
        FileFilter filter = new FileNameExtensionFilter("Só TXT ou DOC carai...","txt","doc");
         JFileChooser chooser = new JFileChooser();
        chooser.addChoosableFileFilter(filter);
        int returnVal = chooser.showSaveDialog(chooser);
        returnVal = chooser.showOpenDialog(chooser);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            arqLeitura = chooser.getSelectedFile().getAbsolutePath();
        }
        
        BufferedReader buffRead = new BufferedReader(new FileReader(arqLeitura));
       // System.out.println("Lendo o arquivo " + arqLeitura);
        
        
        
        
        linha = buffRead.readLine();
        while (linha != null) {
            int x = Integer.parseInt(linha);
            insereIterativo(x);
            linha = buffRead.readLine();
        }
        buffRead.close();

    }
    
    
    
    
    
    
    
    
    
    
    
    public static void insereIterativo(int v) {
        No novo = new No(v);

        if (raiz == null) {
            raiz = novo;
        } else {
            boolean inseriu = false;
            No temp = raiz;

            while (!inseriu) {
                if (novo.valor <= temp.valor) {
                    if (temp.esq == null) {
                        temp.esq = novo;
                        inseriu = true;
                    } else {
                        temp = temp.esq;
                    }
                } else {
                    if (temp.dir == null) {
                        temp.dir = novo;
                        inseriu = true;
                    } else {
                        temp = temp.dir;
                    }

                }
            }
        }
    }



    public static void exibeOrdenado(No temp) {
        if (temp != null) {
            exibeOrdenado(temp.esq);
            System.out.println(temp.valor);            
            exibeOrdenado(temp.dir);
        }
    }

    public static void exibeInverso(No temp) {
        if (temp != null) {
            exibeInverso(temp.dir);
            exibeInverso(temp.esq);
            System.out.println(temp.valor);
        }

    }

    public static int exibe1filho(No temp) {
        int an = 0;
        if (temp != null) {
            exibe1filho(temp.dir);
            exibe1filho(temp.esq);
        if ((temp.esq == null && temp.dir != null)||(temp.esq != null && temp.dir == null)) {
                  //  System.out.println(temp.valor);
                  an++;

       }

    }
                return an;
}
    
    
    public static void exibefolhas(No temp){
        if(temp != null){
            exibefolhas(temp.dir);
            exibefolhas(temp.esq);
          if (temp.esq == null && temp.dir == null){
              System.out.println(temp.valor);
          }
        
    }
    
    }    
    
    
    
    
    public static int contarFolhas(No temp) {
        if (temp == null) {
            return 0;
        } else {
            if (temp.esq != null || temp.dir != null) {
                return contarFolhas(temp.esq) + contarFolhas(temp.dir);
            } else {
                if (temp.esq == null && temp.dir == null) {
                    return 1;
                }
            }
        }

        return 0;
    }

    public static int profundidade(No temp) {

        if (temp == null) {
            return -1;
        } else {
            if ((temp != null) || (temp.esq == null && temp.dir == null)) {
                return 0;
            } else {
                int le = profundidade(temp.esq);
                int ld = profundidade(temp.dir);

                if (le > ld) {
                    return 1 + le;
                } else {
                    return 1 + ld;
                }
            }

        }

    }
    
    
    public void exibeSubEsq(No temp){
        temp = temp.esq;
        System.out.println(temp.valor);
    }
    
    public void exibeSubDir(No temp){
        temp = temp.dir;
        System.out.println(temp.valor);
    }
    
    
    
    
    
   static void exibeArvore(No n, int x){

        if(n.dir != null)
            exibeArvore(n.dir, x+1);
        else
            System.out.println();

        for(int i=1; i<=x; i++)
            System.out.print("|  ");
        
        if((n.esq == null)&&(n.dir == null))
            System.out.print("["+n.valor+"]");
        else
            System.out.print(n.valor);
   
        if(n.esq != null)
            exibeArvore(n.esq, x+1);
        else
            System.out.println();
        
    } 
    
    
    
    
    
    
    
    
    
    
    
    
}
