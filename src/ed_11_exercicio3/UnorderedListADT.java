/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_11_exercicio3;

/**
 * Interface UnorderedListADT
 * @author utilizador
 * @param <T>
 */
public interface UnorderedListADT<T> extends ListADT<T> {

    public void addToFront(T element);

    public void addToRear(T element);

    public void addAfter(T element, T atual) throws ElementoNaoExisteException;

}
