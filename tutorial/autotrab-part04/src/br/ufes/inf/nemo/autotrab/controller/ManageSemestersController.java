package br.ufes.inf.nemo.autotrab.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.autotrab.application.ManageSemestersService;
import br.ufes.inf.nemo.autotrab.domain.Semester;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.application.filters.SimpleFilter;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

/**
 * TODO: document this type.
 *
 * @author Vítor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
@Named @SessionScoped
public class ManageSemestersController extends CrudController<Semester> {
	/** TODO: document this field. */
	private static final long serialVersionUID = 1L;
	
	/** TODO: document this field. */
	@EJB 
	private ManageSemestersService manageSemestersService;

	/** Constructor. */
	public ManageSemestersController() {
		viewPath = "/manageSemesters/";
		bundleName = "msgs";
	}

	/** @see br.ufes.inf.nemo.util.ejb3.controller.CrudController#getCrudService() */
	@Override
	protected CrudService<Semester> getCrudService() {
		// TODO Auto-generated method stub
		return manageSemestersService;
	}

	/** @see br.ufes.inf.nemo.util.ejb3.controller.CrudController#createNewEntity() */
	@Override
	protected Semester createNewEntity() {
		return new Semester();
	}

	/** @see br.ufes.inf.nemo.util.ejb3.controller.ListingController#initFilters() */
	@Override
	protected void initFilters() {
		addFilter(new SimpleFilter("manageSemesters.filter.byYear", "year", getI18nMessage("msgs", "manageSemesters.text.filter.byYear")));
	}

}
