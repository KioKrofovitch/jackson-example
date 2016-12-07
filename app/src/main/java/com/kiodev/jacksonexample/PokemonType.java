package com.kiodev.jacksonexample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A model for the PokemonType data
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonType {
    private String url;
    private String name;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
