package classicaldesignpattern.factory

import java.lang.Exception

object FileParserFactoryImpl : IFileParserFactory{
    override fun createFileParserForFactory(fileName: String): FileParser =
        when(fileName.substringAfterLast('.')) {
            "xml" -> XmlFileParser()
            "json" -> JsonFileParser()
            else -> throw Exception("Wrong file is parsed")
        }
}