package lesson21

fun main() {

    val experienceMap: Map<String, Int> = mapOf(
        "Archery" to 10,
        "Logistics" to 10,
        "Scouting" to 8,
        "Diplomacy" to 10,
        "Wisdom" to 4,
        "Tactics" to 10 )
    println(experienceMap.maxCategory())

}

fun Map<String, Int>.maxCategory(): String {
    val maxValue = this.values.maxOrNull()
    val maxValueCategoryList = this.filterValues { it == maxValue }
    return maxValueCategoryList.keys.random()
}