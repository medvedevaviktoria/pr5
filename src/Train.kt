import kotlin.random.Random
import kotlin.random.nextInt

//класс, который рандомит вагоны(кол-во мест в нём)


class Train(people: Int) {

    var vagonNum = 0

    init {
        var remainingPassengers = people //оставшиеся пассажиры без места в вагоне
        while (remainingPassengers > 0) { //пока пассажиров без места больше нуля выполняем:
            vagonNum++
            val places = Random.nextInt(5..25)

            var passengersInWagon : Int
            if (remainingPassengers >= places)
            { // если пассажиров без места >= количества мест в вагоне, то пассажиров в вагоне столько же, сколько и мест в нём, иначе пассажиров в вагоне столько, сколько всего осталось пассажиров без места
                passengersInWagon = places
            }
            else
            {
                passengersInWagon = remainingPassengers
            }
            remainingPassengers -= passengersInWagon // вычитаем из пассажиров без места столько, сколько пассажиров только что село в вагон
            println("В вагоне номер $vagonNum вместимость $passengersInWagon пассажиров")
        }
    }
}

