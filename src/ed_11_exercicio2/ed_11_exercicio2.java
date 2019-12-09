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
 */
public class ed_11_exercicio2 {

    /**
     * @param args the command line arguments
     * @throws ed_11_exercicio2.EmptyCollectionException
     */
    public static void main(String[] args) throws EmptyCollectionException {
        // TODO code application logic here
        PriorityQueue<Integer> binary = new PriorityQueue<>();
        // adiciona(elemento, prioridade)
        binary.addElement(15, 2);
        binary.addElement(10, 1);
        binary.addElement(30, 3);
        binary.addElement(5, 4);
        binary.addElement(12, 6);
      // binary.addElement(20,4);
        binary.addElement(20, 5);
        binary.addElement(35, 0);

        System.out.println("o removido: " + binary.removeNext());
 
        Iterator it = binary.iteratorLevelOrder();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
