package org.xebia.conference.view.gwt.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.List;
import java.util.Set;
import org.xebia.conference.view.gwt.client.managed.request.ApplicationRequestFactory;
import org.xebia.conference.view.gwt.client.managed.ui.TalkSetEditor;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;
import org.xebia.conference.view.gwt.client.scaffold.ScaffoldMobileApp;
import org.xebia.conference.view.gwt.client.scaffold.activity.IsScaffoldMobileActivity;
import org.xebia.conference.view.gwt.client.scaffold.place.AbstractProxyListActivity;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyListView;

public class SpeakerListActivity extends SpeakerListActivity_Roo_Gwt {

    public SpeakerListActivity(ApplicationRequestFactory requests, ProxyListView<org.xebia.conference.view.gwt.client.proxy.SpeakerProxy> view, PlaceController placeController) {
        super(placeController, view, SpeakerProxy.class);
        this.requests = requests;
    }

    public Place getBackButtonPlace() {
        return ScaffoldMobileApp.ROOT_PLACE;
    }

    public String getBackButtonText() {
        return "Entities";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return "Speakers";
    }

    public boolean hasEditButton() {
        return false;
    }

    protected Request<java.util.List<org.xebia.conference.view.gwt.client.proxy.SpeakerProxy>> createRangeRequest(Range range) {
        return requests.speakerRequest().findSpeakerEntries(range.getStart(), range.getLength());
    }
}
