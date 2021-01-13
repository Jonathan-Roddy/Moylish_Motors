/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Optional;
import java.util.List;

/**
 *
 * @author Jonathan Roddy
 */
public interface VendorRepository <T>{
    
    List<T> getAll();
   
    Optional<T> getByID(int id);
   
    void add(T t);
   
    void delete (T t);
   
    void update (T t);
    
}
