package org.xebia.conference.view.mvc.web;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xebia.conference.core.domain.Speaker;

@RequestMapping("/speakers")
@Controller
@RooWebScaffold(path = "speakers", formBackingObject = Speaker.class)
public class SpeakerController {
}
