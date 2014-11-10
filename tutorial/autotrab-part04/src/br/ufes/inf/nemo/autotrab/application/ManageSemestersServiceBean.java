package br.ufes.inf.nemo.autotrab.application;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.inf.nemo.autotrab.domain.Semester;
import br.ufes.inf.nemo.autotrab.persistence.SemesterDAO;
import br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean;
import br.ufes.inf.nemo.util.ejb3.persistence.BaseDAO;

/**
 * TODO: document this type.
 *
 * @author Vítor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
@Stateless
public class ManageSemestersServiceBean extends CrudServiceBean<Semester> implements ManageSemestersService {
	/** TODO: document this field. */
	private static final long serialVersionUID = 1L;
	
	/** TODO: document this field. */
	@EJB
	private SemesterDAO semesterDAO;
	
	/** @see br.ufes.inf.nemo.util.ejb3.application.ListingService#getDAO() */
	@Override
	public BaseDAO<Semester> getDAO() {
		return semesterDAO;
	}

	/** @see br.ufes.inf.nemo.util.ejb3.application.CrudServiceBean#createNewEntity() */
	@Override
	protected Semester createNewEntity() {
		return new Semester();
	}

}
