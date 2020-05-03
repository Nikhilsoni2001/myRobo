import java.util.*

fun main() {
//    Initializing the  Robot
    val robot = Robot("ROBO")

//    Introduction
    println("Hey There! I am ${robot.name}. and I will be your Personal Assistant.")
    println()

//  Input Alarm Time
    robot.ringAlarm("7:00 AM")
    println()

//    Make Coffee
    robot.makeCoffee(Coffee(true,3))
    println()

//    Heat Water
    robot.heatWater(60)
    println()

//    Pack bag
    robot.bagPack(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println()

//    Cook Food
    robot.cook()
    println()

//    Iron Clothes
    robot.iron("White","Black")
}