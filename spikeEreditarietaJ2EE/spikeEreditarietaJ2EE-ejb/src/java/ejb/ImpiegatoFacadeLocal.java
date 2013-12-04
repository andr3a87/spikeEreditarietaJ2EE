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
public interface ImpiegatoFacadeLocal {

    void create(Impiegato impiegato);

    void edit(Impiegato impiegato);

    void remove(Impiegato impiegato);

    Impiegato find(Object id);

    List<Impiegato> findAll();

    List<Impiegato> findRange(int[] range);

    int count();
    
}
