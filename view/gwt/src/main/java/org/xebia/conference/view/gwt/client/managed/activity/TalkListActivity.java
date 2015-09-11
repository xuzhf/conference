package org.xebia.conference.view.gwt.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import java.util.List;
import org.xebia.conference.view.gwt.client.managed.request.ApplicationRequestFactory;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;
import org.xebia.conference.view.gwt.client.scaffold.ScaffoldMobileApp;
import org.xebia.conference.view.gwt.client.scaffold.activity.IsScaffoldMobileActivity;
import org.xebia.conference.view.gwt.client.scaffold.place.AbstractProxyListActivity;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyListView;

public class TalkListActivity extends TalkListActivity_Roo_Gwt {

    public TalkListActivity(ApplicationRequestFactory requests, ProxyListView<org.xebia.conference.view.gwt.client.proxy.TalkProxy> view, PlaceController placeController) {
        super(placeController, view, TalkProxy.class);
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
        return "Talks";
    }

    public boolean hasEditButton() {
        return false;
    }

    protected Request<java.util.List<org.xebia.conference.view.gwt.client.proxy.TalkProxy>> createRangeRequest(Range range) {
        return requests.talkRequest().findTalkEntries(range.getStart(), range.getLength());
    }
}
