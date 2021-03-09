package se.lexicon.g34.bl.recipedatabase.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity (name="RecipeIngredients")
public class RecipeIngredient {
    @Id
    @GeneratedValue(generator="UUID")
    @GenericGenerator(name ="UUID",strategy ="org.hibernate.id.UUIDGenerator")
    private String recipeIngredientId;
    @ManyToOne
    @JoinColumn(name="ingredientId",nullable = false)
    private Ingredient ingredient;
    @Column(name="Amount",nullable = false)
    private double amount;
    @Column(name="Unit",nullable = false)
    private Measurement measurement;
    @ManyToOne
    @JoinColumn(name="recipe_id",nullable = false)
    private Recipe recipe;

//Constructors

    public RecipeIngredient() {
    }

    public RecipeIngredient(String recipeIngredientId, Ingredient ingredient, double amount, Measurement measurement, Recipe recipe) {
        this.recipeIngredientId = recipeIngredientId;
        this.ingredient = ingredient;
        this.amount = amount;
        this.measurement = measurement;
        this.recipe = recipe;
    }

    public RecipeIngredient(Ingredient ingredient, double amount, Measurement measurement, Recipe recipe) {
        this.ingredient = ingredient;
        this.amount = amount;
        this.measurement = measurement;
        this.recipe = recipe;
    }

    public RecipeIngredient(Ingredient ingredient, double amount, Measurement measurement) {
        this.ingredient = ingredient;
        this.amount = amount;
        this.measurement = measurement;
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

    public Measurement getUnit() {
        return measurement;
    }

    public void setUnit(Measurement unit) {
        this.measurement = unit;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

//Overrides

}
