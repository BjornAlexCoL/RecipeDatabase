package se.lexicon.g34.bl.recipedatabase.respitory;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.g34.bl.recipedatabase.entity.RecipeInstruction;

public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction,String> {
}
