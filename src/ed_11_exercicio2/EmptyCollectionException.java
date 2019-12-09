/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_11_exercicio2;

/**
 * Criar a excepção coleção vazia
 * @author utilizador
 */
class EmptyCollectionException extends Exception {
    public EmptyCollectionException(){
        super();
    }
    
    public EmptyCollectionException(String message) {
        super(message);
    }
}
