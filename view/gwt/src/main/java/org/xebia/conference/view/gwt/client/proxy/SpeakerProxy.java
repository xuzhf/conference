// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package org.xebia.conference.view.gwt.client.proxy;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import java.util.Date;
import java.util.Set;
import org.springframework.roo.addon.gwt.RooGwtProxy;

@ProxyForName(value = "org.xebia.conference.core.domain.Speaker", locator = "org.xebia.conference.view.gwt.server.locator.SpeakerLocator")
@RooGwtProxy(value = "org.xebia.conference.core.domain.Speaker", readOnly = { "version", "id", "created" }, scaffold = true)
public interface SpeakerProxy extends EntityProxy {

    abstract Long getId();

    abstract String getFirstname();

    abstract void setFirstname(String firstname);

    abstract String getLastname();

    abstract void setLastname(String lastname);

    abstract String getEmail();

    abstract void setEmail(String email);

    abstract String getOrganization();

    abstract void setOrganization(String organization);

    abstract Date getBirthdate();

    abstract void setBirthdate(Date birthdate);

    abstract Long getAge();

    abstract void setAge(Long age);

    abstract Date getCreated();

    abstract Set<org.xebia.conference.view.gwt.client.proxy.TalkProxy> getTalks();

    abstract void setTalks(Set<org.xebia.conference.view.gwt.client.proxy.TalkProxy> talks);

    abstract Integer getVersion();
}
