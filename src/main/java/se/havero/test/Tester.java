/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.havero.test;

/**
 *
 * @author johan
 * Interface implementation should perform basic
 * crud operations on objects
 */
public interface Tester {

    /**
     * Performs the basic test of crud operations
     */
    void test();

    /**
     * performs create operation on objects
     */
    void create();

    /**
     * performs read operation on object
     */
    void read();

    /**
     * performs update operation on objects
     */
    void update();
    
    
   /**
    * Performs delete operation on objects
    */
    void delete();
    
    /**
     * Reads all entries
     */
    public void readAll();

}
