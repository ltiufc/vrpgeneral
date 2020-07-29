package entity;

import org.apache.commons.math3.distribution.AbstractRealDistribution;

import generalvrp.vo.DistributionEnum;

public class Distribution<T extends AbstractRealDistribution> {
	
	public T distribuction;
	public DistributionEnum type;
	public double val1;  // mean, logmean, min
	public double val2;  // sd, logsd, max
}

