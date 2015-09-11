package org.xebia.conference.view.gwt.client.scaffold.ioc;

import org.xebia.conference.view.gwt.client.scaffold.ScaffoldApp;
import com.google.gwt.inject.client.Ginjector;

public interface ScaffoldInjector extends Ginjector {

	ScaffoldApp getScaffoldApp();
}
