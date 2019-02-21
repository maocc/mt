package com.maocc.mt.genericity.factorysample;

/**
 * @author maocc
 * @description
 * @date: 2019/2/18 10:46
 */
public class FuelFilter extends Filter {
	public static class Factory implements com.maocc.mt.genericity.factorysample.Factory<FuelFilter> {
		@Override
		public FuelFilter create() {
			return new FuelFilter();
		}
	}
}
