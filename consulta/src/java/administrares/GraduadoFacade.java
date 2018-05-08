/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrares;

import entidades.Graduado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC_Angelo
 */
@Stateless
public class GraduadoFacade extends AbstractFacade<Graduado> {

    @PersistenceContext(unitName = "consultaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GraduadoFacade() {
        super(Graduado.class);
    }
    
}
