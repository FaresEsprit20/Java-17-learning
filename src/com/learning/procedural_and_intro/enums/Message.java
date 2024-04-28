package com.learning.procedural_and_intro.enums;

import static com.learning.procedural_and_intro.enums.Priority.*;

public enum Message {

    A(Priority.HIGH), B(Priority.MEDIUM), C(Priority.LOW), D(Priority.LOW);

    private final Priority priority;

    private Message(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return this.priority;
    }



}
