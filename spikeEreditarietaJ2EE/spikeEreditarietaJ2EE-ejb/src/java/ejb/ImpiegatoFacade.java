/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Andr3A
 */
@Stateless
public class ImpiegatoFacade extends AbstractFacade<Impiegato> implements ImpiegatoFacadeLocal {
    @PersistenceContext(unitName = "spikeEreditarietaJ2EE-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ImpiegatoFacade() {
        super(Impiegato.class);
    }
    
}
