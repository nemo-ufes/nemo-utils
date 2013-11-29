package br.ufes.inf.nemo.util.people.persistence;

import javax.ejb.Local;

import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;
import br.ufes.inf.nemo.util.people.domain.ContactType;

/**
 * Interface for a DAO for objects of the ContactType domain class.
 * 
 * Using a mini CRUD framework for EJB3, basic DAO operation definitions are inherited from the superclass, whereas
 * operations that are specific to the managed domain class (if any) are specified in this class.
 * 
 * <i>This class is part of the Engenho de Software "Legal Entity" mini framework for EJB3 (Java EE 6).</i>
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @see br.ufes.inf.nemo.util.people.persistence.ContactType
 * @see br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO
 */
@Local
public interface ContactTypeDAO extends BaseDAO<ContactType> {}