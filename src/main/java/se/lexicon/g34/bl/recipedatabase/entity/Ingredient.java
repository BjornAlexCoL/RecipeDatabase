package se.lexicon.g34.bl.recipedatabase.entity;

import java.util.Objects;

public class Ingredient {
    int ID;
    String ingredient;

//Constructors
    public Ingredient() {
    }

    public Ingredient(int ID, String ingredient) {
        this.ID = ID;
        this.ingredient = ingredient;
    }

    public Ingredient(String ingredient) {
        this.ingredient = ingredient;
    }

//Getters and Setters

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
//Overrides

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return ID == that.ID && Objects.equals(ingredient, that.ingredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, ingredient);
    }
}
