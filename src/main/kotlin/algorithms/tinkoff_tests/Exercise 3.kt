package algorithms.tinkoff_tests

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val inputNumbersAndTime = scanner.nextLine()
    val inputFloors = scanner.nextLine()
    val employeeNumber = scanner.nextInt()

    val t = inputNumbersAndTime.split(" ")[1].toInt()
    val floors = inputFloors.split(" ").map { it.toInt() }

    val floorEmployee = floors[employeeNumber - 1]
    val minFloor = floors[0]
    val maxFloor = floors[floors.lastIndex]

    var result = when {
        (floorEmployee - minFloor) <= t || (maxFloor - floorEmployee) <= t -> {
            maxFloor - minFloor
        }

        (maxFloor - minFloor + maxFloor - floorEmployee) < (maxFloor - minFloor + floorEmployee - minFloor) -> {
            maxFloor - minFloor + maxFloor - floorEmployee
        }

        else -> {
            maxFloor - minFloor + floorEmployee - minFloor
        }
    }
    println(result)

}