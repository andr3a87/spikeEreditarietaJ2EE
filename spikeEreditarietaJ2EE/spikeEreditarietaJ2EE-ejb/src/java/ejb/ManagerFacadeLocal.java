/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andr3A
 */
@Local
public interface ManagerFacadeLocal {

    void create(Manager manager);

    void edit(Manager manager);

    void remove(Manager manager);

    Manager find(Object id);

    List<Manager> findAll();

    List<Manager> findRange(int[] range);

    int count();
    
}
