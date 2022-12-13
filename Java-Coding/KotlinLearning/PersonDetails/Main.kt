package KotlinLearning.PersonDetails

fun main() {
    val one = Person()
    one.getAge()
    one.getName()

    val two = Person("B", 2)
    two.getAge()
    two.getName()
}