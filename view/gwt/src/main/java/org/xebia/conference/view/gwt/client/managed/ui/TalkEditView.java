package org.xebia.conference.view.gwt.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.editor.client.EditorError;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.text.shared.AbstractRenderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.LongBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.web.bindery.requestfactory.gwt.client.RequestFactoryEditorDriver;
import com.google.web.bindery.requestfactory.shared.RequestFactory;
import java.util.Collection;
import java.util.List;
import org.xebia.conference.view.gwt.client.managed.activity.TalkEditActivityWrapper;
import org.xebia.conference.view.gwt.client.proxy.SpeakerProxy;
import org.xebia.conference.view.gwt.client.proxy.TalkProxy;
import org.xebia.conference.view.gwt.client.scaffold.place.ProxyEditView;
import org.xebia.conference.view.gwt.client.scaffold.ui.*;

public class TalkEditView extends TalkEditView_Roo_Gwt {

    private static final Binder BINDER = GWT.create(Binder.class);

    private static org.xebia.conference.view.gwt.client.managed.ui.TalkEditView instance;

    @UiField
    Button cancel;

    @UiField
    Button save;

    @UiField
    DivElement errors;

    @UiField
    Element editTitle;

    @UiField
    Element createTitle;

    private Delegate delegate;

    public TalkEditView() {
        initWidget(BINDER.createAndBindUi(this));
    }

    public static org.xebia.conference.view.gwt.client.managed.ui.TalkEditView instance() {
        if (instance == null) {
            instance = new TalkEditView();
        }
        return instance;
    }

    @Override
    public RequestFactoryEditorDriver<org.xebia.conference.view.gwt.client.proxy.TalkProxy, org.xebia.conference.view.gwt.client.managed.ui.TalkEditView> createEditorDriver() {
        RequestFactoryEditorDriver<TalkProxy, TalkEditView> driver = GWT.create(Driver.class);
        driver.initialize(this);
        return driver;
    }

    public void setCreating(boolean creating) {
        if (creating) {
            editTitle.getStyle().setDisplay(Display.NONE);
            createTitle.getStyle().clearDisplay();
        } else {
            editTitle.getStyle().clearDisplay();
            createTitle.getStyle().setDisplay(Display.NONE);
        }
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void setEnabled(boolean enabled) {
        save.setEnabled(enabled);
    }

    public void showErrors(List<com.google.gwt.editor.client.EditorError> errors) {
        SafeHtmlBuilder b = new SafeHtmlBuilder();
        for (EditorError error : errors) {
            b.appendEscaped(error.getPath()).appendEscaped(": ");
            b.appendEscaped(error.getMessage()).appendHtmlConstant("<br>");
        }
        this.errors.setInnerHTML(b.toSafeHtml().asString());
    }

    @UiHandler("cancel")
    void onCancel(ClickEvent event) {
        delegate.cancelClicked();
    }

    @UiHandler("save")
    void onSave(ClickEvent event) {
        delegate.saveClicked();
    }

    interface Binder extends UiBinder<HTMLPanel, TalkEditView> {
    }

    interface Driver extends RequestFactoryEditorDriver<TalkProxy, TalkEditView> {
    }
}
