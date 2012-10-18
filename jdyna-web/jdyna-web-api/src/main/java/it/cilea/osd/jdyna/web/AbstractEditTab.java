/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 * 
 * http://www.dspace.org/license/
 * 
 * The document has moved 
 * <a href="https://svn.duraspace.org/dspace/licenses/LICENSE_HEADER">here</a>
 */
package it.cilea.osd.jdyna.web;

import it.cilea.osd.jdyna.model.Containable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEditTab<H extends IPropertyHolder<Containable>, D extends AbstractTab<H>> extends Tab<H> {

	public abstract Tab<H> getDisplayTab();

	public abstract void setDisplayTab(D tab);

	public abstract Class<D> getDisplayTabClass();
		
}