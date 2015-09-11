// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

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

public abstract class ApplicationMasterActivities_Roo_Gwt implements ActivityMapper {

    protected ApplicationRequestFactory requests;

    protected PlaceController placeController;

    public Activity getActivity(Place place) {
        if (!(place instanceof ProxyListPlace)) {
            return null;
        }
        ProxyListPlace listPlace = (ProxyListPlace) place;
        return new ApplicationEntityTypesProcessor<Activity>() {

            @Override
            public void handleSpeaker(SpeakerProxy isNull) {
                setResult(new SpeakerListActivity(requests, ScaffoldApp.isMobile() ? SpeakerMobileListView.instance() : SpeakerListView.instance(), placeController));
            }

            @Override
            public void handleTalk(TalkProxy isNull) {
                setResult(new TalkListActivity(requests, ScaffoldApp.isMobile() ? TalkMobileListView.instance() : TalkListView.instance(), placeController));
            }
        }.process(listPlace.getProxyClass());
    }
}
