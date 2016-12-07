package com.kiodev.jacksonexample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A model for PokemonSprite data
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonSprites {
    @JsonProperty("front_default")
    private String frontDefaultImgUrl;

    @JsonProperty("front_shiny")
    private String frontShinyImgUrl;

    public String getFrontDefaultImgUrl() {
        return frontDefaultImgUrl;
    }

    public void setFrontDefaultImgUrl(String frontDefaultImgUrl) {
        this.frontDefaultImgUrl = frontDefaultImgUrl;
    }

    public String getFrontShinyImgUrl() {
        return frontShinyImgUrl;
    }

    public void setFrontShinyImgUrl(String frontShinyImgUrl) {
        this.frontShinyImgUrl = frontShinyImgUrl;
    }
}
