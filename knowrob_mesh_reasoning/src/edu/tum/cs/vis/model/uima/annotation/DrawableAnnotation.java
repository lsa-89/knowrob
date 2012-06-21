/*******************************************************************************
 * Copyright (c) 2012 Stefan Profanter. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU Public License v3.0 which accompanies
 * this distribution, and is available at http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors: Stefan Profanter - initial API and implementation, Year: 2012
 ******************************************************************************/
package edu.tum.cs.vis.model.uima.annotation;

import processing.core.PGraphics;
import edu.tum.cs.uima.Annotation;

/**
 * @author Stefan Profanter
 * 
 */
public abstract class DrawableAnnotation extends Annotation {
	/**
	 * auto generated
	 */
	private static final long	serialVersionUID	= 1222063742441634463L;

	/**
	 * indicates if this annotation should be drawn or not
	 */
	protected boolean			drawAnnotation		= true;

	/**
	 * Draw the annotation with color from <code>getAnnotationColor()</code>
	 * 
	 * @param g
	 *            Applet to draw on
	 */
	public void draw(PGraphics g) {
		if (drawAnnotation)
			drawAnnotation(g);
	}

	protected abstract void drawAnnotation(PGraphics g);

	/**
	 * @return the drawAnnotation
	 */
	public boolean isDrawAnnotation() {
		return drawAnnotation;
	}

	/**
	 * @param drawAnnotation
	 *            the drawAnnotation to set
	 */
	public void setDrawAnnotation(boolean drawAnnotation) {
		this.drawAnnotation = drawAnnotation;
	}
}