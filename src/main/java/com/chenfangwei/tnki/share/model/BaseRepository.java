package com.chenfangwei.tnki.share.model;

import com.chenfangwei.tnki.share.event.DomainEventDao;

import javax.inject.Inject;

public abstract class BaseRepository<AR extends BaseAggregate> {
    @Inject
    private DomainEventDao eventDao;

    public final void save(AR aggregate) {
        eventDao.save(aggregate.get_events());
        aggregate.clearEvents();
        doSave(aggregate);
    }

    protected abstract void doSave(AR aggregate);
}
