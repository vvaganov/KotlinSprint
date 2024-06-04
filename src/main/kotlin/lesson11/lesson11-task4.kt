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
    val listOfRecipes: MutableList<Any> = mutableListOf(),
) {}

class Recipe(
    val name: String,
    val cover: String,
    val mapIngredients: MutableMap<String, Int> = mutableMapOf(),
    val numberOfServings: Int,
    val inFavorite: Boolean,
) {}