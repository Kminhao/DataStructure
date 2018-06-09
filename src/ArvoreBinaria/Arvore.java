/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArvoreBinaria;

public class Arvore {

    static No raiz = null;

    public static void main(String[] args) {

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
     //   exibeInverso(raiz);

        exibe1filho(raiz);
        System.out.println("lul");
        exibefolhas(raiz);
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

    public void inserir(int x) {

    }

    public static void exibeOrdenado(No temp) {
        if (temp != null) {
            System.out.println(temp.valor);
            exibeOrdenado(temp.esq);
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

    public static void exibe1filho(No temp) {
        if (temp != null) {
            exibe1filho(temp.dir);
            exibe1filho(temp.esq);
        if ((temp.esq == null && temp.dir != null)||(temp.esq != null && temp.dir == null)) {
                    System.out.println(temp.valor);

       }

    }
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
            if ((temp == null) || (temp.esq == null && temp.dir == null)) {
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
}
