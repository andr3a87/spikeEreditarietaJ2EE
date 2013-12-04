/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Andr3A
 */
@Stateless
public class GestoreAzienda implements GestoreAziendaLocal {
    @EJB
    private ManagerFacadeLocal managerFacade;
    @EJB
    private ImpiegatoFacadeLocal impiegatoFacade;
    
    
    @Override
    public void aggiungiImpiegato(String nome, double salario) {
        Impiegato i = new Impiegato();
        i.setNome(nome);
        i.setSalario(salario);
        impiegatoFacade.create(i);
    }

    @Override
    public void aggiungiManager(String nome, double salario, String nomeSegretaria) {
        Manager m = new Manager();
        m.setNome(nome);
        m.setSalario(salario);
        m.setNomeSegretaria(nomeSegretaria);
        managerFacade.create(m);
    }

    @Override
    public List<Manager> findAllManager() {
        return managerFacade.findAll();
    }

    @Override
    public List<Impiegato> findAllImpiegato() {
        return impiegatoFacade.findAll();
    }
    
    
    
    
    
    
    
   
}
