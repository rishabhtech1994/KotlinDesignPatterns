package classicaldesignpattern.factory

fun main() {
    val parseFile = FileParserFactoryImpl
    val parsed = parseFile.createFileParserForFactory("abcd.json")
    println("parsed ${parsed.parseFile()}")
}
