/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_11_exercicio3;

/**
 * BinaryTreeNode representa um nó em uma árvore binária com a esquerda e a direita
 * child.
 * @param <T>
 */
public class BinaryTreeNode<T> {

    protected T element;
    protected BinaryTreeNode<T> left, right;

    /**
     * Cria um novo nó da árvore com os dados especificados.
     *
     * @param obj o elemento que se tornará parte do novo nó da árvore
     */
    BinaryTreeNode(T obj) {
        element = obj;
        left = null;
        right = null;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    /**
     * Retorna o número de filhos não nulos deste nó. Este método pode ser
     * capaz de ser escrito com mais eficiência.
     *
     * @return o número inteiro de filhos não nulos deste nó
     */
    public int numChildren() {
        int children = 0;
        if (left != null) {
            children = 1 + left.numChildren();
        }
        if (right != null) {
            children = children + 1 + right.numChildren();
        }
        
        return children;
    }
}
