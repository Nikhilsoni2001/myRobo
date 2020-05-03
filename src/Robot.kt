import java.util.*

class Robot (val name: String) {


    fun ringAlarm(time: String) =  println("Good Morning!, Its $name. \nPlease wake up, its already $time")


    fun makeCoffee(coffee: Coffee) = if (coffee.black) {
        println("Your black coffee with ${coffee.sugarScoops} scoops of sugar is ready!")
    }else {
        println("Your coffee with ${coffee.sugarScoops} scoops of sugar is ready!")
    }

    fun heatWater(tempreature: Int) = println("Tempreature of \"Bath Water\" is : $tempreature. You can take a Bath now.")


    fun bagPack(day: Int){
        val statement = print("Today, Books to be carried are: ")
        val subjects = mutableListOf("OOP", "Data Structure", "Operating System", "Java", "Android", "Web Development", "Kotlin")
        when (day) {
            Calendar.MONDAY -> println("${statement}, ${subjects[0]} ${subjects[1]}")
            Calendar.TUESDAY -> println("${statement}, ${subjects[2]} ${subjects[3]}")
            Calendar.WEDNESDAY -> println("${statement}, ${subjects[4]} ${subjects[2]}")
            Calendar.THURSDAY -> println("${statement}, ${subjects[5]} ${subjects[6]}")
            Calendar.FRIDAY -> println("${statement}, ${subjects[0]} ${subjects[7]}")
        else -> println("Chill Its Weekend!")
        }

    }

    fun cook(){
        val breakfast = mutableListOf("Sandwich", "Cornflakes", "Bread-Butter", "Bread-Jam", "Parantha","Oats")
        val lunch = mutableListOf("Shahi-Paneer", "Rajma", "Chicken", "Salad", "Grams", "Potatoes", "Cauliflower")
        println("Today's Breakfast is: \"${breakfast.random()}\" & Lunch is: \"${lunch.random()}\"")
    }

    fun iron(shirt: String, trouser: String){
        val shirts = mutableListOf("White", "Black", "Grey", "Brown", "Red","Orange")
        val trousers = mutableListOf("Black", "Grey", "Blue")
        if (shirts.contains(shirt)) {
            print("Today's Dress is: \"$shirt\" Shirt")
            if (trousers.contains(trouser))
                print(" & \"$trouser\" Trouser.")
            else
                print("You don't have Trouser of this \"$trouser\" color")
        }
        else
            print("You don't have shirt of this \"$shirt\" color")
    }
}
