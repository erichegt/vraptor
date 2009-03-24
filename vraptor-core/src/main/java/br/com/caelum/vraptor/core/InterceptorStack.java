package br.com.caelum.vraptor.core;

import br.com.caelum.vraptor.Interceptor;

public interface InterceptorStack {

	void add(Interceptor interceptor);

	void next();

}
