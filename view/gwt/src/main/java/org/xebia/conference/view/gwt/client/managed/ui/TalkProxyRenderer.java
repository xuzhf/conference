package org.xebia.conference.view.gwt.client.managed.ui;

import com.google.web.bindery.requestfactory.gwt.ui.client.ProxyRenderer;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;

public class TalkProxyRenderer extends ProxyRenderer<TalkProxy> {

    private static org.xebia.conference.view.gwt.client.managed.ui.TalkProxyRenderer INSTANCE;

    protected TalkProxyRenderer() {
        super(new String[] { "title" });
    }

    public static org.xebia.conference.view.gwt.client.managed.ui.TalkProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new TalkProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(TalkProxy object) {
        if (object == null) {
            return "";
        }
        return object.getTitle() + " (" + object.getTitle() + ")";
    }
}
