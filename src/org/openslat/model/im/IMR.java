package org.openslat.model.im;

import org.openslat.interfaces.DifferentiableFunction;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Session Bean implementation class IMR
 */
@JsonSerialize
public class IMR {
	
	private String name;
	private double epistemicWeight = 1;
	private DifferentiableFunction model;

	/**
	 * Returns the rate of exceedance for a specified intensity measure.
	 * 
	 * @param im
	 *            specified intensity measure
	 * @return rate of exceedance
	 */
	public double evaluate(double im) {
		return model.value(im);
	}

	/**
	 * Returns the derivative of the rate of exceedance for a specified
	 * intensity measure.
	 * 
	 * @param im
	 *            specified intensity measure
	 * @return rate of exceedance
	 */
	public double derivative(double im) {
		return model.derivative(im);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEpistemicWeight() {
		return epistemicWeight;
	}

	public void setEpistemicWeight(double epistemicWeight) {
		this.epistemicWeight = epistemicWeight;
	}

	public DifferentiableFunction getModel() {
		return model;
	}

	public void setModel(DifferentiableFunction model) {
		this.model = model;
	}
}
