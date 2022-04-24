fun main(){
    Cars()
    languages()
    marks()

}
fun Cars(){
    var vehicles= arrayOf("Range Rover", "BMW","Bugatti", "Ford", "Mazda")
    for (vehicle in vehicles)
        println(vehicle)
}
fun languages(){
    var language = arrayOf("Swahili", "English", "German", "Spanish")
    for (lang in language.indices)
        println(lang)

}
fun marks(){
    var studentsMarks = arrayOf(96,92,74,88,75,93,100)
    for (mark in studentsMarks)
        println(mark)
}