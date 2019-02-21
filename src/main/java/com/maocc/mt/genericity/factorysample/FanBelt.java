package com.maocc.mt.genericity.factorysample;

/**
 * @author maocc
 * @description
 * @date: 2019/2/18 10:49
 */
public class FanBelt extends Belt {
	public static class Factory implements com.maocc.mt.genericity.factorysample.Factory<FanBelt> {
		@Override
		public FanBelt create() {
			return new FanBelt();
		}
	}
}
