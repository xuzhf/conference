// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package org.xebia.conference.view.gwt.client.request;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtRequest;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;

@RooGwtRequest("org.xebia.conference.core.domain.Speaker")
@ServiceName(value = "org.xebia.conference.core.service.SpeakerService", locator = "org.xebia.conference.view.gwt.server.locator.GwtServiceLocator")
public interface SpeakerRequest extends RequestContext {

    abstract Request<java.lang.Long> countAllSpeakers();

    abstract Request<java.util.List<org.xebia.conference.view.gwt.client.proxy.SpeakerProxy>> findAllSpeakers();

    abstract Request<java.util.List<org.xebia.conference.view.gwt.client.proxy.SpeakerProxy>> findSpeakerEntries(int firstResult, int maxResults);

    abstract Request<org.xebia.conference.view.gwt.client.proxy.SpeakerProxy> findSpeaker(Long id);

    abstract Request<java.lang.Void> saveSpeaker(SpeakerProxy proxy);

    abstract Request<java.lang.Void> deleteSpeaker(SpeakerProxy proxy);
}
