package com.maocc.mt.genericity.factorysample;

/**
 * @author maocc
 * @description
 * @date: 2019/2/18 10:48
 */
public class AirFilter extends Filter {
	public static class Factory implements com.maocc.mt.genericity.factorysample.Factory<AirFilter> {
		@Override
		public AirFilter create() {
			return new AirFilter();
		}
	}
}
