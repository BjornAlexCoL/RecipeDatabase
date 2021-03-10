package se.lexicon.g34.bl.recipedatabase.respitory;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.g34.bl.recipedatabase.entity.RecipeCategory;

public interface RecipeCategoryRepository extends CrudRepository<RecipeCategory,Integer> {
}
