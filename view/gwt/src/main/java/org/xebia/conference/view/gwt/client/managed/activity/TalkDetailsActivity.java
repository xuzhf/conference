package org.xebia.conference.view.gwt.client.managed.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.Set;
import org.xebia.conference.view.gwt.client.managed.request.ApplicationRequestFactory;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;
import org.xebia.conference.view.gwt.client.scaffold.activity.IsScaffoldMobileActivity;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyDetailsView;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyListPlace;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyPlace;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyPlace.Operation;

public class TalkDetailsActivity extends TalkDetailsActivity_Roo_Gwt {

    public TalkDetailsActivity(EntityProxyId<org.xebia.conference.view.gwt.client.proxy.TalkProxy> proxyId, ApplicationRequestFactory requests, PlaceController placeController, ProxyDetailsView<org.xebia.conference.view.gwt.client.proxy.TalkProxy> view) {
        this.placeController = placeController;
        this.proxyId = proxyId;
        this.requests = requests;
        view.setDelegate(this);
        this.view = view;
    }

    public void editClicked() {
        placeController.goTo(getEditButtonPlace());
    }

    public Place getBackButtonPlace() {
        return new ProxyListPlace(TalkProxy.class);
    }

    public String getBackButtonText() {
        return "Back";
    }

    public Place getEditButtonPlace() {
        return new ProxyPlace(view.getValue().stableId(), Operation.EDIT);
    }

    public String getTitleText() {
        return "View Talk";
    }

    public boolean hasEditButton() {
        return true;
    }

    public void onCancel() {
        onStop();
    }

    public void onStop() {
        display = null;
    }

    public void start(AcceptsOneWidget displayIn, EventBus eventBus) {
        this.display = displayIn;
        Receiver<EntityProxy> callback = new Receiver<EntityProxy>() {

            public void onSuccess(EntityProxy proxy) {
                if (proxy == null) {
                    placeController.goTo(getBackButtonPlace());
                    return;
                }
                if (display == null) {
                    return;
                }
                view.setValue((TalkProxy) proxy);
                display.setWidget(view);
            }
        };
        find(callback);
    }
}
