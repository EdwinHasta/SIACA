/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrares;

import entidades.Programaacademico;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC_Angelo
 */
@Stateless
public class ProgramaacademicoFacade extends AbstractFacade<Programaacademico> {

    @PersistenceContext(unitName = "consultaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProgramaacademicoFacade() {
        super(Programaacademico.class);
    }
    
}
