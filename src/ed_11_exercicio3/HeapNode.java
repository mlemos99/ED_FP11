/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_11_exercicio3;

/**
 *
 * @author utilizador
 * @param <T>
 */
public class HeapNode<T> extends BinaryTreeNode<T> {

    protected HeapNode<T> parent;

    /**
     * Cria um novo nó de heap com os dados especificados.
     *
     * @param obj os dados a serem contidos nos novos nós de heap
     */
    HeapNode(T obj) {
        super(obj);
        parent = null;
    }
}
