package com.maocc.mt.genericity.factorysample;

/**
 * @author maocc
 * @description
 * @date: 2019/2/18 10:45
 */
public class GeneratorBelt extends Belt {
	public static class Factory implements com.maocc.mt.genericity.factorysample.Factory<GeneratorBelt> {
		@Override
		public GeneratorBelt create() {
			return new GeneratorBelt();
		}
	}
}
