package org.xebia.conference.view.gwt.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.xebia.conference.view.gwt.client.managed.request.ApplicationRequestFactory;
import org.xebia.conference.view.gwt.client.managed.ui.TalkSetEditor;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;
import org.xebia.conference.view.gwt.client.scaffold.activity.IsScaffoldMobileActivity;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyEditView;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyListPlace;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyPlace;

public class SpeakerEditActivityWrapper extends SpeakerEditActivityWrapper_Roo_Gwt {

    private final EntityProxyId<SpeakerProxy> proxyId;

    public SpeakerEditActivityWrapper(ApplicationRequestFactory requests, View<?> view, Activity activity, EntityProxyId<org.xebia.conference.view.gwt.client.proxy.SpeakerProxy> proxyId) {
        this.requests = requests;
        this.view = view;
        this.wrapped = activity;
        this.proxyId = proxyId;
    }

    public Place getBackButtonPlace() {
        return (proxyId == null) ? new ProxyListPlace(SpeakerProxy.class) : new ProxyPlace(proxyId, ProxyPlace.Operation.DETAILS);
    }

    public String getBackButtonText() {
        return "Cancel";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return (proxyId == null) ? "New Speaker" : "Edit Speaker";
    }

    public boolean hasEditButton() {
        return false;
    }

    @Override
    public String mayStop() {
        return wrapped.mayStop();
    }

    @Override
    public void onCancel() {
        wrapped.onCancel();
    }

    @Override
    public void onStop() {
        wrapped.onStop();
    }

    public interface View<V extends org.xebia.conference.view.gwt.client.scaffold.place.ProxyEditView<org.xebia.conference.view.gwt.client.proxy.SpeakerProxy, V>> extends ProxyEditView<SpeakerProxy, V> {

        void setTalksPickerValues(Collection<org.xebia.conference.view.gwt.client.proxy.TalkProxy> values);
    }
}
