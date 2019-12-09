/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_11_exercicio2;

/**
 *
 * @author utilizador
 * @param <T>
 */
public interface HeapADT<T> extends BinaryTreeADT<T> {

    /**
     * Adiciona o objeto especificado a este heap.
     *
     * @param obj o elemento a ser adicionado a esta cabeça
     */
    public void addElement(T obj);

    /**
     * Remove o elemento com o valor mais baixo desse heap.
     *
     * @return o elemento com o menor valor dessa pilha
     * @throws ed_11_exercicio2.EmptyCollectionException
     */
    public T removeMin() throws EmptyCollectionException;

    /**
     * Retorna uma referência ao elemento com o menor valor neste heap.
     *
     * @return uma referência ao elemento com o menor valor nesta pilha
     * @throws ed_11_exercicio2.EmptyCollectionException
     */
    public T findMin() throws EmptyCollectionException;
}
