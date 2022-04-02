fun main() {
    // write your code here

    var galacticEmpire = readln().toInt()
    var rebelAlliance = readln().toInt()
    var multipler=0
    while(galacticEmpire>=rebelAlliance)
    {
        galacticEmpire -= rebelAlliance
        multipler+=1
    }
    println(multipler)
}
