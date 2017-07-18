package com.mojang.authlib;

import java.util.UUID;

public class GameProfile {

    private final PropertyMap properties = new PropertyMap();

    public GameProfile(UUID uuid, String s) {
        // stub method
    }

    public PropertyMap getProperties() {
        return this.properties;
    }

}
