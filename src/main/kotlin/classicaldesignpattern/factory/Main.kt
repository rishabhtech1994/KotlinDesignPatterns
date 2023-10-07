package classicaldesignpattern.factory

fun main() {
    val parseFile = FileParserFactoryImpl
    parseFile.createFileParserForFactory("abcd.json")
    parseFile.createFileParserForFactory("abcd.xml")

}
