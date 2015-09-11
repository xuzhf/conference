package org.xebia.conference.view.gwt.client.managed.ui;

import com.google.web.bindery.requestfactory.gwt.ui.client.ProxyRenderer;
import java.util.Set;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;

public class SpeakerProxyRenderer extends ProxyRenderer<SpeakerProxy> {

    private static org.xebia.conference.view.gwt.client.managed.ui.SpeakerProxyRenderer INSTANCE;

    protected SpeakerProxyRenderer() {
        super(new String[] { "firstname" });
    }

    public static org.xebia.conference.view.gwt.client.managed.ui.SpeakerProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new SpeakerProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(SpeakerProxy object) {
        if (object == null) {
            return "";
        }
        return object.getFirstname() + " (" + object.getFirstname() + ")";
    }
}
