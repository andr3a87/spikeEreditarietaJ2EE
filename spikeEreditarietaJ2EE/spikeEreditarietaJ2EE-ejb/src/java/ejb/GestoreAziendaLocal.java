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
public interface GestoreAziendaLocal {

    void aggiungiImpiegato(String nome, double salario);

    void aggiungiManager(String nome, double salario, String nomeSegretaria);

    List<Manager> findAllManager();

    List<Impiegato> findAllImpiegato();
    
}
