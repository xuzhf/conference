// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package org.xebia.conference.view.gwt.client.request;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtRequest;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;

@RooGwtRequest("org.xebia.conference.core.domain.Talk")
@ServiceName(value = "org.xebia.conference.core.service.TalkService", locator = "org.xebia.conference.view.gwt.server.locator.GwtServiceLocator")
public interface TalkRequest extends RequestContext {

    abstract Request<java.lang.Long> countAllTalks();

    abstract Request<java.util.List<org.xebia.conference.view.gwt.client.proxy.TalkProxy>> findAllTalks();

    abstract Request<java.util.List<org.xebia.conference.view.gwt.client.proxy.TalkProxy>> findTalkEntries(int firstResult, int maxResults);

    abstract Request<org.xebia.conference.view.gwt.client.proxy.TalkProxy> findTalk(Long id);

    abstract Request<java.lang.Void> saveTalk(TalkProxy proxy);

    abstract Request<java.lang.Void> deleteTalk(TalkProxy proxy);
}
