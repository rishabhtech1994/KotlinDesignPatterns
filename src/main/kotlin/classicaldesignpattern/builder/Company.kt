package classicaldesignpattern.builder

import java.lang.IllegalArgumentException

class Company private constructor(
    name :String?
) {

    val name: String?
    init {
        if(name.isNullOrBlank()) throw IllegalArgumentException("Name mut not be null or empty")
        this.name = name
    }

    class Builder{
        private var name: String? = null

        fun setName(name:String)  = apply{
            this.name = name
        }


        fun build(): Company{
            return Company(name)
        }
    }
}