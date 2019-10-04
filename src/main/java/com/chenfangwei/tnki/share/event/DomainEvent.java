package com.chenfangwei.tnki.share.event;

import com.chenfangwei.tnki.share.utils.UuidGenerator;
import java.time.Instant;
import static java.time.Instant.now;

public abstract class DomainEvent {
    private String _id = UuidGenerator.newUuid();
    private Instant _createdAt = now();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + _id + "]";
    }
}
