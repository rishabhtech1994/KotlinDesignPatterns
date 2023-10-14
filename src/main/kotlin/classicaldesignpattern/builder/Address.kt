package classicaldesignpattern.builder

import java.lang.IllegalArgumentException

class Address private constructor(
    line1:String,
    line2:String,
    city:String,
    state:String,
    country:String,
    pinCode: Int?
) {

    val line1: String
    val line2: String?
    val city: String
    val state: String
    val country: String
    val pinCode: Int

    init {
        if(line1.isNullOrBlank()) throw IllegalArgumentException("Line 1 must not br null")
        if(city.isNullOrBlank()) throw IllegalArgumentException("city must not br null")
        if(state.isNullOrBlank()) throw IllegalArgumentException("state must not br null")
        if(country.isNullOrBlank()) throw IllegalArgumentException("country must not br null")
        if(pinCode == null) throw IllegalArgumentException("pincode must not br null")

        this.line1 = line1
        this.line2 = line2
        this.city = city
        this.state = state
        this.country = country
        this.pinCode= pinCode
    }


    class Builder{
        private var line1: String? = null
        private var line2: String? = null
        private var city: String? = null
        private var state: String? = null
        private var country: String? = null
        private var pinCode: Int? = null


        fun setLine1(line1:String) = apply {
            this.line1 = line1
        }

        fun setLine2(line2:String) = apply {
            this.line2 = line2
        }

        fun setCity(city:String) = apply {
            this.city = city
        }

        fun setCountry(country : String) = apply {
            this.country = country
        }

        fun setState(state: String) = apply {
            this.state = state
        }

        fun setPinCode(pinCode:Int) = apply {
            this.pinCode = pinCode
        }


        fun build() : Address{
            return Address(
                line1!!,
                line2!!,
                city!!,
                country!!,
                state!!,
                pinCode
            )
        }


    }


}