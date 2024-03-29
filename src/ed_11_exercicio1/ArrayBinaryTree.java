/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_11_exercicio1;

import java.util.Iterator;

/**
 *
 * @author utilizador
 * @param <T>
 */
public class ArrayBinaryTree<T> implements BinaryTreeADT<T> {

    protected int count;
    protected T[] tree;
    private final int CAPACITY = 50;

    /**
     * Cria uma árvore binária vazia.
     */
    public ArrayBinaryTree() {
        count = 0;
        tree = (T[]) new Object[CAPACITY];
    }

    /**
     * Cria uma árvore binária com o elemento especificado como sua raiz.
     *
     * @param element o elemento que se tornará a raiz da nova árvore
     */
    public ArrayBinaryTree(T element) {
        count = 1;
        tree = (T[]) new Object[CAPACITY];
        tree[0] = element;
    }

    /**
     * Método construtor
     *
     * @param element
     */
    public ArrayBinaryTree(T[] element) {
        count = element.length;
        tree = element;
    }
    
    /**
     * Usado apenas para teste. Expande a capacidade desta fila
     */
    public void expandCapacity() {
        T[] newList = (T[]) (new Object[CAPACITY * 2]);

        for (int i = 0; i < this.count; i++) {
            newList[i] = this.tree[i];
        }

        this.tree = newList;
    }

    /**
     * Retorna uma referência ao elemento de destino especificado se ele for
     * encontrado em esta árvore binária. Lança um NoSuchElementException se o
     * destino especificado o elemento não foi encontrado na árvore binária.
     *
     * @param targetElement o elemento que está sendo procurado na árvore
     * @return true se o elemento estiver na árvore
     */
    @Override
    public T find(T targetElement) throws ElementoNaoExisteException {
        T temp = null;
        boolean found = false;

        for (int ct = 0; ct < count && !found; ct++) {
            if (targetElement.equals(tree[ct])) {
                found = true;
                temp = tree[ct]; //guarda o elemento em temp
            }
        }
        if (!found) {
            throw new ElementoNaoExisteException("binary tree");
        }
        
        return temp;
    }

    /**
     * Retorna a referencia do root
     *
     * @return a referencia do root
     */
    @Override
    public T getRoot() {
        return this.tree[0];
    }

    /**
     * Retorna true se a arvore binaria estiver vazia,falso caso contrario
     *
     * @return true se a arvore binaria estiver vazia
     */
    @Override
    public boolean isEmpty() {
        return (this.tree[0] == null);
    }

    /**
     * Retorna o numero de elementos da arvore binaria
     *
     * @return numero de elementos da arvore
     */
    @Override
    public int size() {
        return this.count;
    }

    /**
     * Retorna true se a array binário conter um elemento que corresponde ao
     * elemento especificado
     *
     * @return true se contiver o elemento
     */
    @Override
    public boolean contains(T targetElement) {
        for (int ct = 0; ct < count; ct++) {
            if (targetElement.equals(tree[ct])) {
                return true;
            }
        }
        return false;
    }

    /**
     * Executa uma passagem inorder nesta árvore binária chamando um Método
     * inorder sobrecarregado e recursivo que começa com a raiz.
     *
     * @return um iterador sobre a árvore binária
     */
    @Override
    public Iterator<T> iteratorInOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<>();
        inorder(0, templist);
        
        return templist.iterator();
    }

    /**
     * Executa uma travessia de ordem de entrada recursiva.
     *
     * @param node o nó usado no percurso
     * @param templist a lista temporária usada no percurso
     */
    protected void inorder(int node, ArrayUnorderedList<T> templist) {
        if (node < tree.length) {
            if (tree[node] != null) {
                inorder(node * 2 + 1, templist);
                templist.addToRear(tree[node]);
                inorder((node + 1) * 2, templist);
            }
        }
    }

    /**
     * Executa um percurso de pré-encomenda na árvore binária chamando um método
     * de pré-encomenda recursiva sobrecarregada que começa com a raiz.
     *
     * @return
     */
    @Override
    public Iterator<T> iteratorPreOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<>();
        preOrder(0, templist);
        
        return templist.iterator();
    }

    /**
     * Executa um percurso de pré-encomenda recursiva.
     *
     * @param node
     * @param templist
     */
    protected void preOrder(int node, ArrayUnorderedList<T> templist) {

        if (node < tree.length) {
            if (tree[node] != null) {
                templist.addToRear(tree[node]);
                inorder((node + 1) * 2 - 1, templist);
                inorder((node + 1) * (2 + 1) - 1, templist);
            }
        }
    }

    /**
     * Executa um percurso pós-ordem na árvore binária chamando um método de
     * pós-encomenda recursiva sobrecarregado que inicia com a raiz.
     *
     * @return
     */
    @Override
    public Iterator<T> iteratorPostOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<>();
        postOrder(0, templist);
        
        return templist.iterator();
    }

    /**
     * Executa uma passagem recursiva de ordem posterior
     *
     * @param node
     * @param templist
     */
    protected void postOrder(int node, ArrayUnorderedList<T> templist) {
        if (node < tree.length) {
            if (tree[node] != null) {
                inorder((node + 1) * 2 - 1, templist);
                inorder((node + 1) * (2 + 1) - 1, templist);
                templist.addToRear(tree[node]);
            }
        }
    }

    /**
     * Executa um percurso de ordem de nível na árvore binária, usando um modelo.
     */
    @Override
    public Iterator<T> iteratorLevelOrder() {
        ArrayUnorderedList<T> templist = new ArrayUnorderedList<>();
        for (int ct = 0; ct < count; ct++) {
            templist.addToRear(tree[ct]);
        }
        
        return templist.iterator();
    }

}
