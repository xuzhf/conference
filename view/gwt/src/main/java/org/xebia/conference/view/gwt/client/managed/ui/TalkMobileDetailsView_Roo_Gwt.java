// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package org.xebia.conference.view.gwt.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
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
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyDetailsView;

public abstract class TalkMobileDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<TalkProxy> {

    @UiField
    Element id;

    @UiField
    Element title;

    @UiField
    Element description;

    @UiField
    Element created;

    @UiField
    Element speaker;

    @UiField
    Element version;

    TalkProxy proxy;

    public void setValue(TalkProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        title.setInnerText(proxy.getTitle() == null ? "" : String.valueOf(proxy.getTitle()));
        description.setInnerText(proxy.getDescription() == null ? "" : String.valueOf(proxy.getDescription()));
        created.setInnerText(proxy.getCreated() == null ? "" : DateTimeFormat.getFormat(DateTimeFormat.PredefinedFormat.DATE_SHORT).format(proxy.getCreated()));
        speaker.setInnerText(proxy.getSpeaker() == null ? "" : org.xebia.conference.view.gwt.client.managed.ui.SpeakerProxyRenderer.instance().render(proxy.getSpeaker()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
    }
}
