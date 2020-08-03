package entity;

import org.apache.commons.math3.distribution.AbstractRealDistribution;

import generalvrp.vo.DistributionEnum;

public class Distribution<T extends AbstractRealDistribution> {
	
	public T distribution;
	public DistributionEnum type;
	public double val1;  // mean, logmean, min
	public double val2;  // sd, logsd, max
	
	public double getValue() {
		if (distribution==null) {
			return val1;
		} else {
			return distribution.sample();
		}
	}
}

