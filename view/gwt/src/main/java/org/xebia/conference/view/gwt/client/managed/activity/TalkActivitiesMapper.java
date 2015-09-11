package org.xebia.conference.view.gwt.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import org.xebia.conference.view.gwt.client.managed.request.ApplicationRequestFactory;
import org.xebia.conference.view.gwt.client.managed.ui.TalkDetailsView;
import org.xebia.conference.view.gwt.client.managed.ui.TalkEditView;
import org.xebia.conference.view.gwt.client.managed.ui.TalkListView;
import org.xebia.conference.view.gwt.client.managed.ui.TalkMobileDetailsView;
import org.xebia.conference.view.gwt.client.managed.ui.TalkMobileEditView;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;
import org.xebia.conference.view.gwt.client.request.TalkRequest;
import org.xebia.conference.view.gwt.client.scaffold.ScaffoldApp;
import org.xebia.conference.view.gwt.client.scaffold.place.CreateAndEditProxy;
import org.xebia.conference.view.gwt.client.scaffold.place.FindAndEditProxy;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyPlace;

public class TalkActivitiesMapper extends TalkActivitiesMapper_Roo_Gwt {

    public TalkActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new TalkDetailsActivity((EntityProxyId<TalkProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? TalkMobileDetailsView.instance() : TalkDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }
}
