package se.lexicon.g34.bl.recipedatabase.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity (name="RecipeIngredients")
public class RecipeIngredient {
    @Id
    @GeneratedValue(generator="UUID")
    @GenericGenerator(name="UUID",strategy ="org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private String recipeIngredientId;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Ingredient ingredient;
    @Column(nullable = false)
    private double amount;
    @Column(nullable = false)
    private Unit unit;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Recipe recipe;

//Constructors

    public RecipeIngredient() {
    }

    public RecipeIngredient(String recipeIngredientId, Ingredient ingredient, double amount, Unit unit, Recipe recipe) {
        this.recipeIngredientId = recipeIngredientId;
        this.ingredient = ingredient;
        this.amount = amount;
        this.unit = unit;
        this.recipe = recipe;
    }

    public RecipeIngredient(Ingredient ingredient, double amount, Unit unit, Recipe recipe) {
        this.ingredient = ingredient;
        this.amount = amount;
        this.unit = unit;
        this.recipe = recipe;
    }

    public RecipeIngredient(Ingredient ingredient, double amount, Unit unit) {
        this.ingredient = ingredient;
        this.amount = amount;
        this.unit = unit;
    }
    //Getters and Setters

    public String getRecipeIngredientId() {
        return recipeIngredientId;
    }

    public void setRecipeIngredientId(String recipeIngredientId) {
        this.recipeIngredientId = recipeIngredientId;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

//Overrides

}
