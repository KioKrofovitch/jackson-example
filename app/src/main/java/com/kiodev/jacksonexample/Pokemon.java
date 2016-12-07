package com.kiodev.jacksonexample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * A model for Pokemon responses from PokeAPI
 * https://pokeapi.co/
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
    private String name;
    private String weight;
    private PokemonSprites sprites;

    @JsonProperty("types")
    private ArrayList<PokemonFullType> typesList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }

    public ArrayList<PokemonFullType> getTypesList() {
        return typesList;
    }

    public void setTypesList(ArrayList<PokemonFullType> typesList) {
        this.typesList = typesList;
    }
}
