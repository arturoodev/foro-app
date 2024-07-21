package com.arturocode.appforo.enumeration;

public enum TopicStatus {
    OPEN("Abierto"),
    CLOSED("Cerrado");

    private final String status;

    TopicStatus(String status) {
        this.status = status;
    }

    public static TopicStatus fromString(String text) {
        for (TopicStatus status : TopicStatus.values()) {
            if (status.status.equalsIgnoreCase(text)) {
                return status;
            }
        }
        throw new IllegalArgumentException("No se encontro el estado: " + text);
    }
}
