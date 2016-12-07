package com.kiodev.jacksonexample;

import android.support.annotation.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A model for PokemonFullType data
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonFullType implements Comparable<PokemonFullType> {
    private Integer slot;
    private PokemonType type;

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    @Override
    public int compareTo(@NonNull PokemonFullType type) {
        if(this.slot > type.slot) return 1;
        if(this.slot < type.slot) return -1;
        return 0;
    }
}
