package br.ufes.inf.nemo.autotrab.domain;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport_;

/**
 * TODO: document this type.
 *
 * @author Vítor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
@StaticMetamodel(Semester.class)
public class Semester_ extends PersistentObjectSupport_ {
	public static volatile SingularAttribute<Semester, Integer> year;
	public static volatile SingularAttribute<Semester, Integer> number;
	public static volatile SingularAttribute<Semester, Date> startDate;
	public static volatile SingularAttribute<Semester, Date> endDate;
}
