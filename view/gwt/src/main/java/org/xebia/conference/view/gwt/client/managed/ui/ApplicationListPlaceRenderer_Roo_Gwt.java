// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.xebia.conference.view.gwt.client.managed.ui;

import com.google.gwt.text.shared.AbstractRenderer;
import org.xebia.conference.view.gwt.client.managed.request.ApplicationEntityTypesProcessor;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyListPlace;

public abstract class ApplicationListPlaceRenderer_Roo_Gwt extends AbstractRenderer<ProxyListPlace> {

    public String render(ProxyListPlace object) {
        return new ApplicationEntityTypesProcessor<String>() {

            @Override
            public void handleSpeaker(SpeakerProxy isNull) {
                setResult("Speakers");
            }

            @Override
            public void handleTalk(TalkProxy isNull) {
                setResult("Talks");
            }
        }.process(object.getProxyClass());
    }
}
