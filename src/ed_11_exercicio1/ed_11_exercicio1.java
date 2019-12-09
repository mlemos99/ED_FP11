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
 */
public class ed_11_exercicio1 {

    /**
     * @param args the command line arguments
     * @throws ed_11_exercicio1.EmptyCollectionException
     */
    public static void main(String[] args) throws EmptyCollectionException {
        ArrayHeap<Integer> binary = new ArrayHeap<>();
        binary.addElement(15);
        binary.addElement(10);
        binary.addElement(30);
        binary.addElement(5);
        binary.addElement(12);
        binary.addElement(20);
        binary.addElement(35);
        
        System.out.println("O removido é: " + binary.removeMin());
        
        System.out.println("O minimo é: " + binary.findMin());

        Iterator it = binary.iteratorLevelOrder();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
