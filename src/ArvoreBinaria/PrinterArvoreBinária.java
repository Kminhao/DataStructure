package ArvoreBinaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrinterArvoreBinária{

    static No raiz;
    public static void main(String[] args) {


        insere(9);
        insere(6);
        insere(10);
        insere(11);
        insere(3); 
        insere(4);
        insere(5);
        
        BTreePrinter.PrintArvore(raiz);


    }


    public static void insere(int v) {
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
}

class BTreePrinter{

    public static void PrintArvore(No root){
        int maxLevel = ProfundidadeMax(root);

        PrintArvoreInterno(Collections.singletonList(root), 1, maxLevel);
    }

    private static void PrintArvoreInterno(List<No> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        PrintarEspaçosBrancos(firstSpaces);

        List<No> newNodes = new ArrayList<No>();
        for (No node : nodes) {
            if (node != null) {
                System.out.print(node.valor);
                newNodes.add(node.esq);
                newNodes.add(node.dir);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            PrintarEspaçosBrancos(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                PrintarEspaçosBrancos(firstSpaces - i);
                if (nodes.get(j) == null) {
                    PrintarEspaçosBrancos(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).esq != null)
                    System.out.print("/");
                else
                    PrintarEspaçosBrancos(1);

                PrintarEspaçosBrancos(i + i - 1);

                if (nodes.get(j).dir != null)
                    System.out.print("\\");
                else
                    PrintarEspaçosBrancos(1);

                PrintarEspaçosBrancos(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        PrintArvoreInterno(newNodes, level + 1, maxLevel);
    }

    private static void PrintarEspaçosBrancos(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static int ProfundidadeMax(No node) {
        if (node == null)
            return 0;

        return Math.max(ProfundidadeMax(node.esq), ProfundidadeMax(node.dir)) + 1;
    }

    private static boolean isAllElementsNull(List list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }
}
