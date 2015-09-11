// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

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
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyDetailsView.Delegate;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyListPlace;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyPlace;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyPlace.Operation;

public abstract class TalkDetailsActivity_Roo_Gwt extends AbstractActivity implements Delegate, IsScaffoldMobileActivity {

    protected ApplicationRequestFactory requests;

    protected EntityProxyId<TalkProxy> proxyId;

    protected PlaceController placeController;

    protected AcceptsOneWidget display;

    protected ProxyDetailsView<TalkProxy> view;

    public void deleteClicked() {
        if (!view.confirm("Really delete this entry? You cannot undo this change.")) {
            return;
        }
        requests.talkRequest().deleteTalk(view.getValue()).fire(new Receiver<Void>() {

            public void onSuccess(Void ignore) {
                if (display == null) {
                    return;
                }
                placeController.goTo(getBackButtonPlace());
            }
        });
    }

    protected void find(Receiver<com.google.web.bindery.requestfactory.shared.EntityProxy> callback) {
        requests.find(proxyId).with("speaker").fire(callback);
    }
}