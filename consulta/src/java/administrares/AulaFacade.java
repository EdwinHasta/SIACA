/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrares;

import entidades.Aula;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC_Angelo
 */
@Stateless
public class AulaFacade extends AbstractFacade<Aula> {

    @PersistenceContext(unitName = "consultaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AulaFacade() {
        super(Aula.class);
    }
    
}
