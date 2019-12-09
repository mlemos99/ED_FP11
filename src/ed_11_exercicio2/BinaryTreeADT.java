/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_11_exercicio2;

import java.util.Iterator;

/**
 *
 * @author utilizador
 * @param <T>
 */
public interface BinaryTreeADT<T> {

    /**
     * Retorna uma referência ao elemento root
     *
     * @return a reference to the root
     * @throws ed_11_exercicio2.EmptyCollectionException
     */
    public T getRoot() throws EmptyCollectionException;

    /**
     * Retorna true se essa árvore binária estiver vazia e falsa caso contrário.
     *
     * @return true if this binary tree is empty
     */
    public boolean isEmpty();

    /**
     * Retorna o número de elementos nesta árvore binária.
     *
     * @return the integer number of elements in this tree
     */
    public int size();

    /**
     * Retorna true se a árvore binária contém um elemento que corresponde ao
     * elemento especificado e false caso contrário.
     *
     * @param targetElement the element being sought in the tree
     * @return true if the tree contains the target element
     */
    public boolean contains(T targetElement);

    /**
     * Retorna uma referência ao elemento especificado se ele for encontrado
     * neste árvore binária. Lança uma exceção se o elemento especificado não
     * for encontrado.
     *
     * @param targetElement the element being sought in the tree
     * @return a reference to the specified element
     * @throws ed_11_exercicio2.ElementoNaoExisteException
     */
    public T find(T targetElement) throws ElementoNaoExisteException;

    /**
     * Retorna a representação em cadeia da árvore binária.
     *
     * @return a string representation of the binary tree
     */
    @Override
    public String toString();

    /**
     * Executa uma passagem inorder nesta árvore binária chamando um Método
     * inorder sobrecarregado e recursivo que começa com a raiz.
     *
     * @return an iterator over the elements of this binary tree
     */
    public Iterator<T> iteratorInOrder();

    /**
     * Executa um percurso de pré-encomenda nessa árvore binária chamando um
     * Método de pré-encomenda recursiva e sobrecarregada que começa com a raiz.
     *
     * @return an iterator over the elements of this binary tree
     */
    public Iterator<T> iteratorPreOrder();

    /**
     * Executa um percurso pós-ordem nessa árvore binária chamando um Método
     * pós-encomenda recursiva sobrecarregado que começa com a raiz.
     *
     * @return an iterator over the elements of this binary tree
     */
    public Iterator<T> iteratorPostOrder();

    /**
     * Executa um percurso de ordem de nível na árvore binária, usando uma fila.
     *
     * @return an iterator over the elements of this binary tree
     */
    public Iterator<T> iteratorLevelOrder();

}
