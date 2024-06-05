package lesson11

fun main() {
}

class Ingredients(
    val name: String,
    val unitsOfMeasurement: String,
    ) {}

class RecipeCategory(
    val name: String,
    val cover: String,
    val listOfRecipes: MutableList<Recipe> = mutableListOf(),
) {}

class Recipe(
    val name: String,
    val cover: String,
    val mapIngredients: MutableList<Ingredients> = mutableListOf(),
    val numberOfServings: Int,
    val inFavorite: Boolean,
) {}