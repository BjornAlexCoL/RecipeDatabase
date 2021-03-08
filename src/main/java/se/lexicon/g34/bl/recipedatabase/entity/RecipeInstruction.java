package se.lexicon.g34.bl.recipedatabase.entity;

import java.util.Objects;

public class RecipeInstruction {
    String UUID;
    String Instructions;
//Constructors

    public RecipeInstruction() {
    }

    public RecipeInstruction(String UUID, String instructions) {
        this.UUID = UUID;
        Instructions = instructions;
    }

    public RecipeInstruction(String instructions) {
        Instructions = instructions;
    }
    //Getters and Setters

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String instructions) {
        Instructions = instructions;
    }

//Overrides

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return Objects.equals(UUID, that.UUID) && Objects.equals(Instructions, that.Instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UUID, Instructions);
    }
}
