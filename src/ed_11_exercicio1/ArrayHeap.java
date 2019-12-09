/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_11_exercicio1;


/**
 * ArrayHeap fornece uma implementação de matriz de um minheap.
 *
 * @param <T>
 */
public class ArrayHeap<T> extends ArrayBinaryTree<T> implements HeapADT<T> {

    public ArrayHeap() {
        super();
    }

    /**
     * Adiciona o elemento especificado a este heap na posição apropriada de
     * acordo com seu valor-chave. Observe que elementos iguais são adicionados
     * ao direito.
     *
     * @param obj o elemento a ser adicionado a este heap
     */
    @Override
    public void addElement(T obj) {
        if (count == tree.length) {
            expandCapacity();
        }
        tree[count] = obj;
        count++;
        if (count > 1) {
            heapifyAdd();
        }
    }

    /**
     * Reordena esse heap para manter a propriedade de pedido após adicionar um
     * nó.
     */
    private void heapifyAdd() {
        T temp;
        int next = count - 1;

        temp = tree[next];

        while ((next != 0) && (((Comparable) temp).compareTo(tree[(next - 1) / 2]) < 0)) {
            tree[next] = tree[(next - 1) / 2];
            next = (next - 1) / 2;
        }
        tree[next] = temp;
    }

    /**
     * Remova o elemento com o valor mais baixo nesta pilha e retorne um
     * referência a ele. Lança um EmptyCollectionException se o heap estiver
     * vazio.
     *
     * @return uma referência ao elemento com o menor valor nesta cabeça
     * @throws EmptyCollectionException se ocorrer uma exceção de coleção vazia
     */
    @Override
    public T removeMin() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Empty Heap");
        }
        T minElement = tree[0];
        tree[0] = tree[count - 1];
        heapifyRemove();
        count--;

        return minElement;
    }

    /**
     * Reordena esse heap para manter a propriedade do pedido.
     */
    private void heapifyRemove() {
        T temp;
        int node = 0;
        int left = 1;
        int right = 2;
        int next;

        if ((tree[left] == null) && (tree[right] == null)) {
            next = count;
        } else if (tree[left] == null) {
            next = right;
        } else if (tree[right] == null) {
            next = left;
        } else if (((Comparable) tree[left]).compareTo(tree[right]) < 0) {
            next = left;
        } else {
            next = right;
        }
        temp = tree[node];
        while ((next < count) && (((Comparable) tree[next]).compareTo(temp) < 0)) {
            tree[node] = tree[next];
            node = next;
            left = 2 * node + 1;
            right = 2 * (node + 1);
            if ((tree[left] == null) && (tree[right] == null)) {
                next = count;
            } else if (tree[left] == null) {
                next = right;
            } else if (tree[right] == null) {
                next = left;
            } else if (((Comparable) tree[left]).compareTo(tree[right]) < 0) {
                next = left;
            } else {
                next = right;
            }
        }
        tree[node] = temp;
    }

    /**
     * Retorna o elemento com o menor valor na pilha. Lança um
     * EmptyHeapException se o heap estiver vazio.
     *
     * @return
     * @throws EmptyCollectionException
     */
    @Override
    public T findMin() throws EmptyCollectionException {

        if (isEmpty()) {
            throw new EmptyCollectionException("Empty Heap");
        }

        return tree[0];

    }
}
