package com.arturocode.appforo.domain.profile;

public enum ProfileType {
    ADMIN("admin"),
    USER("user");

    private final String type;

    ProfileType(String type) {
        this.type = type;
    }

    public static ProfileType fromString(String type) {
        for (ProfileType type1 : ProfileType.values()) {
            if (type1.type.equalsIgnoreCase(type)) {
                return type1;
            }
        }
        throw new IllegalArgumentException("No se encontro el estado: " + type);
    }
}
