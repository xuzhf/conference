package org.xebia.conference.view.gwt.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import org.xebia.conference.view.gwt.client.managed.request.ApplicationEntityTypesProcessor;
import org.xebia.conference.view.gwt.client.managed.request.ApplicationRequestFactory;
import org.xebia.conference.view.gwt.client.managed.ui.SpeakerListView;
import org.xebia.conference.view.gwt.client.managed.ui.SpeakerMobileListView;
import org.xebia.conference.view.gwt.client.managed.ui.TalkListView;
import org.xebia.conference.view.gwt.client.managed.ui.TalkMobileListView;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;
import org.xebia.conference.view.gwt.client.scaffold.ScaffoldApp;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyListPlace;

public final class ApplicationMasterActivities extends ApplicationMasterActivities_Roo_Gwt {

    @Inject
    public ApplicationMasterActivities(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }
}
