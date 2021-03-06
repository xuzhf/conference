// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.xebia.conference.view.gwt.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import java.util.Set;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyDetailsView;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyListView;

public abstract class SpeakerDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<SpeakerProxy> {

    @UiField
    SpanElement id;

    @UiField
    SpanElement firstname;

    @UiField
    SpanElement lastname;

    @UiField
    SpanElement email;

    @UiField
    SpanElement organization;

    @UiField
    SpanElement birthdate;

    @UiField
    SpanElement age;

    @UiField
    SpanElement created;

    @UiField
    SpanElement talks;

    @UiField
    SpanElement version;

    SpeakerProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(SpeakerProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        firstname.setInnerText(proxy.getFirstname() == null ? "" : String.valueOf(proxy.getFirstname()));
        lastname.setInnerText(proxy.getLastname() == null ? "" : String.valueOf(proxy.getLastname()));
        email.setInnerText(proxy.getEmail() == null ? "" : String.valueOf(proxy.getEmail()));
        organization.setInnerText(proxy.getOrganization() == null ? "" : String.valueOf(proxy.getOrganization()));
        birthdate.setInnerText(proxy.getBirthdate() == null ? "" : DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT).format(proxy.getBirthdate()));
        age.setInnerText(proxy.getAge() == null ? "" : String.valueOf(proxy.getAge()));
        created.setInnerText(proxy.getCreated() == null ? "" : DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT).format(proxy.getCreated()));
        talks.setInnerText(proxy.getTalks() == null ? "" : org.xebia.conference.view.gwt.client.scaffold.place.CollectionRenderer.of(org.xebia.conference.view.gwt.client.managed.ui.TalkProxyRenderer.instance()).render(proxy.getTalks()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(SpeakerProxyRenderer.instance().render(proxy));
    }
}
