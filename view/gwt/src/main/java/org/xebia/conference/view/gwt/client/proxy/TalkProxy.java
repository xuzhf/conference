// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package org.xebia.conference.view.gwt.client.proxy;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import java.util.Date;
import org.springframework.roo.addon.gwt.RooGwtProxy;

@ProxyForName(value = "org.xebia.conference.core.domain.Talk", locator = "org.xebia.conference.view.gwt.server.locator.TalkLocator")
@RooGwtProxy(value = "org.xebia.conference.core.domain.Talk", readOnly = { "version", "id" }, scaffold = true)
public interface TalkProxy extends EntityProxy {

    abstract Long getId();

    abstract String getTitle();

    abstract void setTitle(String title);

    abstract String getDescription();

    abstract void setDescription(String description);

    abstract Date getCreated();

    abstract void setCreated(Date created);

    abstract SpeakerProxy getSpeaker();

    abstract void setSpeaker(SpeakerProxy speaker);

    abstract Integer getVersion();
}
