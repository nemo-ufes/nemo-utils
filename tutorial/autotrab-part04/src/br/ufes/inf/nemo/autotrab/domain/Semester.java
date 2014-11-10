package br.ufes.inf.nemo.autotrab.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.ufes.inf.nemo.util.ejb3.persistence.PersistentObjectSupport;

/**
 * TODO: document this type.
 *
 * @author Vítor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
@Entity
public class Semester extends PersistentObjectSupport implements Comparable<Semester> {
	/** TODO: document this field. */
	private static final long serialVersionUID = 1L;

	/** TODO: document this field. */
	private Integer year;

	/** TODO: document this field. */
	private Integer number;

	/** TODO: document this field. */
	@Temporal(TemporalType.DATE)
	private Date startDate;

	/** TODO: document this field. */
	@Temporal(TemporalType.DATE)
	private Date endDate;

	/** Getter for year. */
	public Integer getYear() {
		return year;
	}

	/** Setter for year. */
	public void setYear(Integer year) {
		this.year = year;
	}

	/** Getter for number. */
	public Integer getNumber() {
		return number;
	}

	/** Setter for number. */
	public void setNumber(Integer number) {
		this.number = number;
	}

	/** Getter for startDate. */
	public Date getStartDate() {
		return startDate;
	}

	/** Setter for startDate. */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/** Getter for endDate. */
	public Date getEndDate() {
		return endDate;
	}

	/** Setter for endDate. */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/** @see java.lang.Comparable#compareTo(java.lang.Object) */
	@Override
	public int compareTo(Semester o) {
		if (year == null) return 1;
		if (o.year == null)	return -1;
		int cmp = year.compareTo(o.year);
		if (cmp != 0)	return cmp;
		
		if (number == null) return 1;
		if (o.number == null) return -1;
		cmp = number.compareTo(o.number);
		if (cmp != 0) return cmp;

		return uuid.compareTo(o.uuid);
	}
}
