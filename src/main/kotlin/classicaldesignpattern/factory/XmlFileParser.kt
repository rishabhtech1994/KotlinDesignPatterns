package classicaldesignpattern.factory

class XmlFileParser : FileParser{
    override fun parseFile() {
        println("Xml file needs to be parsed")
    }
}