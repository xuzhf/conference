package org.xebia.conference.core.repository;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;
import org.xebia.conference.core.domain.Speaker;

@RooJpaRepository(domainType = Speaker.class)
public interface SpeakerRepository {
}
