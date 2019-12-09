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
public class PriorityQueueNode<T> implements Comparable<PriorityQueueNode> {

    private static int nextorder = 0;
    private int priority;
    private int order;
    private T element;

    /**
     * Cria um novo PriorityQueueNode com os dados especificados.
     *
     * @param obj o elemento do novo nó da fila de prioridade
     * @param prio a prioridade inteira do novo nó da fila
     */
    public PriorityQueueNode(T obj, int prio) {
        element = obj;
        priority = prio;
        order = nextorder;
        nextorder++;
    }

    /**
     * Retorna o elemento neste nó.
     *
     * @return o elemento contido neste nó
     */
    public T getElement() {
        return element;
    }

    /**
     * Retorna o valor da prioridade para este nó.
     *
     * @return a prioridade inteira para este nó
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Retorna a ordem para este nó.
     *
     * @return a ordem inteira para este nó
     */
    public int getOrder() {
        return order;
    }

    /**
     * Retorna uma representação de sequência para este nó.
     *
     * @return 
     */
    @Override
    public String toString() {
        String temp = (element.toString() + priority + order);
        return temp;
    }

    /**
     * Retorna 1 se o nó atual tiver prioridade mais alta que o nó especificado
     * e -1 caso contrário.
     *
     * @param obj o nó para comparar com este nó
     * @return o resultado inteiro da comparação do nó obj e este
     */
    @Override
    public int compareTo(PriorityQueueNode obj) {
        int result;
        PriorityQueueNode<T> temp = obj;
        if (priority > temp.getPriority()) {
            result = 1;
        } else if (priority < temp.getPriority()) {
            result = -1;
        } else if (order > temp.getOrder()) {
            result = 1;
        } else {
            result = -1;
        }
        return result;
    }
}
