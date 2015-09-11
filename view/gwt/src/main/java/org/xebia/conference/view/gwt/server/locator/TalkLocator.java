package org.xebia.conference.view.gwt.server.locator;

import com.google.web.bindery.requestfactory.shared.Locator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.gwt.RooGwtLocator;
import org.springframework.stereotype.Component;
import org.xebia.conference.core.domain.Talk;
import org.xebia.conference.core.service.TalkService;

@RooGwtLocator("org.xebia.conference.core.domain.Talk")
@Component
public class TalkLocator extends Locator<Talk, Long> {

    @Autowired
    TalkService talkService;

    public Talk create(Class<? extends org.xebia.conference.core.domain.Talk> clazz) {
        return new Talk();
    }

    public Talk find(Class<? extends org.xebia.conference.core.domain.Talk> clazz, Long id) {
        return talkService.findTalk(id);
//    	return ;
    }

    public Class<org.xebia.conference.core.domain.Talk> getDomainType() {
        return Talk.class;
    }

    public Long getId(Talk talk) {
        return talk.getId();
    }

    public Class<java.lang.Long> getIdType() {
        return Long.class;
    }

    public Object getVersion(Talk talk) {
        return talk.getVersion();
    }
}
