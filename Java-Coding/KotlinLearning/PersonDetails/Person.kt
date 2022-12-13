package KotlinLearning.PersonDetails

class Person () {
    private var name: String = "NA"
    private var age: Int = -1

    constructor(name:String, age:Int) : this() {
        this.name = name
        this.age = age
    }

    fun getName() {
        println(this.name)
    }
    fun getAge() {
        println(this.age)
    }
}