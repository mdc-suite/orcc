/*
 * generated by Xtext
 */
package net.sf.orcc.cal;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class CalUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return net.sf.orcc.cal.ui.internal.CalActivator.getInstance().getInjector("net.sf.orcc.cal.Cal");
	}

}
