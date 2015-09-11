package org.xebia.conference.view.gwt.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import java.util.Set;
import org.xebia.conference.view.gwt.client.managed.request.ApplicationRequestFactory;
import org.xebia.conference.view.gwt.client.managed.ui.SpeakerDetailsView;
import org.xebia.conference.view.gwt.client.managed.ui.SpeakerEditView;
import org.xebia.conference.view.gwt.client.managed.ui.SpeakerListView;
import org.xebia.conference.view.gwt.client.managed.ui.SpeakerMobileDetailsView;
import org.xebia.conference.view.gwt.client.managed.ui.SpeakerMobileEditView;
import org.xebia.conference.view.gwt.client.managed.ui.TalkSetEditor;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;
import org.xebia.conference.view.gwt.client.request.SpeakerRequest;
import org.xebia.conference.view.gwt.client.scaffold.ScaffoldApp;
import org.xebia.conference.view.gwt.client.scaffold.place.CreateAndEditProxy;
import org.xebia.conference.view.gwt.client.scaffold.place.FindAndEditProxy;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyPlace;

public class SpeakerActivitiesMapper extends SpeakerActivitiesMapper_Roo_Gwt {

    public SpeakerActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new SpeakerDetailsActivity((EntityProxyId<SpeakerProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? SpeakerMobileDetailsView.instance() : SpeakerDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }
}
