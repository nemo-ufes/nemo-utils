package br.ufes.inf.nemo.autotrab.application;

import javax.ejb.Local;

import br.ufes.inf.nemo.autotrab.domain.Semester;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;

/**
 * TODO: document this type.
 *
 * @author Vítor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
@Local
public interface ManageSemestersService extends CrudService<Semester> {

}
