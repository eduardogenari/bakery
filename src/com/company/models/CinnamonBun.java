package com.company.models;

import com.company.Utils;

import java.util.List;

public class CinnamonBun implements Cake {

    private final List<Pack> packs;

    public CinnamonBun(List<Pack> packs) {
        this.packs = packs;
    }

    @Override
    public String code() {
        return "CB";
    }

    @Override
    public String name() {
        return "Cinnamon Bun";
    }

    @Override
    public float price(int number) {
        return new Utils().calculatePrice(number, packs);
    }

}