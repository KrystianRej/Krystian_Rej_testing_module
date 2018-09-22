package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients;

    private BigMac(final String bun, final int burgers, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }
    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            if (bun.equals("pelno ziarnista") || bun.equals("pszenna")) {
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("There is no such type of a bun");
            }
        }

        public BigMacBuilder burgers(int numberOfBurgers) {
            this.burgers = numberOfBurgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            if(sauce.equals("standard") || sauce.equals("1000 wysp") || sauce.equals("barbacue")) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("There is no such type of sauce");
            }
        }

        public BigMacBuilder ingredients(String ingredient) {
            PossibleIngredients checkIngredients = new PossibleIngredients();
            if(checkIngredients.getIngredients().contains(ingredient)) {
                this.ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("There is no such type of extra ingredient");
            }
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
