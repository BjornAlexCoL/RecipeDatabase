package se.lexicon.g34.bl.recipedatabase.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity //(name="Instructions")
public class RecipeInstruction {
   @Id
   @GeneratedValue(generator ="UUID")
   @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
   @Column(name ="UUID", updatable = false, nullable = false)
    private String instructionsId;
//    @Column(name = "Instruction", nullable = false)
    private String Instructions;
//Constructors

    public RecipeInstruction() {
    }

    public RecipeInstruction(String instructionsId, String instructions) {
        this.instructionsId = instructionsId;
        Instructions = instructions;
    }

    public RecipeInstruction(String instructions) {
        Instructions = instructions;
    }
    //Getters and Setters

    public String getInstructionsId() {
        return instructionsId;
    }

    public void setInstructionsId(String instruktionsId) {
        this.instructionsId = instruktionsId;
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
        return Objects.equals(instructionsId, that.instructionsId) && Objects.equals(Instructions, that.Instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructionsId, Instructions);
    }
}
