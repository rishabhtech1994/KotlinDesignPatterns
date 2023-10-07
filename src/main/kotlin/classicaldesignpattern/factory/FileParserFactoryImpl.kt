package classicaldesignpattern.factory

import java.lang.Exception

object FileParserFactoryImpl : IFileParserFactory{
    override fun createFileParserForFactory(fileName: String): Unit =
        when(fileName.substringAfterLast('.')) {
            "xml" -> XmlFileParser().parseFile()
            "json" -> JsonFileParser().parseFile()
            else -> throw Exception("Wrong file is parsed")
        }
}