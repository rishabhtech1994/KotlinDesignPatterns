package classicaldesignpattern.factory

interface IFileParserFactory {
    fun createFileParserForFactory(fileName: String)
}