package classicaldesignpattern.factory

class JsonFileParser : FileParser {
    override fun parseFile() {
        println("Json File is to be parsed")
    }
}