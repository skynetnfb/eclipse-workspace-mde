/*
 * generated by Xtext 2.25.0
 */
package it.disim.univaq.xtext.cool.ui.tests;

import com.google.inject.Injector;
import it.disim.univaq.xtext.cool.ui.internal.CoolActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class CoolDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CoolActivator.getInstance().getInjector("it.disim.univaq.xtext.cool.CoolDsl");
	}

}