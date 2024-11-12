import kotlin.random.Random
import kotlin.random.nextInt



// класс, рандомящий количество купленных билетов



class CashDesk(minPeople: Int, maxPeople : Int) {
    val people  = Random.nextInt(minPeople..maxPeople)
    init {
        println("Количество пассажиров, купивших билет: $people")
    }
}