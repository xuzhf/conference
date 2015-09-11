package org.xebia.conference.view.gwt.server.locator;

import com.google.web.bindery.requestfactory.shared.Locator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.gwt.RooGwtLocator;
import org.springframework.stereotype.Component;
import org.xebia.conference.core.domain.Speaker;
import org.xebia.conference.core.service.SpeakerService;

@RooGwtLocator("org.xebia.conference.core.domain.Speaker")
@Component
public class SpeakerLocator extends Locator<Speaker, Long> {

    @Autowired
    SpeakerService speakerService;
 
    public Speaker create(Class<? extends org.xebia.conference.core.domain.Speaker> clazz) {
        return new Speaker();
    }

    public Speaker find(Class<? extends org.xebia.conference.core.domain.Speaker> clazz, Long id) {
        return speakerService.findSpeaker(id);
//    	return Speaker.class;
    }

    public Class<org.xebia.conference.core.domain.Speaker> getDomainType() {
        return Speaker.class;
    }

    public Long getId(Speaker speaker) {
//        return speaker.getId();
    	return Speaker.class;
    }

    public Class<java.lang.Long> getIdType() {
        return Long.class;
    }

    public Object getVersion(Speaker speaker) {
//        return speaker.getVersion();
    	return Speaker.class;
    }
}
