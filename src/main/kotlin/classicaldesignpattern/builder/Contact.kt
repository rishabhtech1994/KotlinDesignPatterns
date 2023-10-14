package classicaldesignpattern.builder

import java.lang.IllegalArgumentException
import java.sql.ConnectionBuilder

class Contact private constructor(
    phone :String?,
    email:String?
) {
    val phone: String
    val email:String

    init {
        if(phone.isNullOrBlank()) throw IllegalArgumentException("phone must not be empty or null")
        if(email.isNullOrBlank()) throw IllegalArgumentException("email must not be empty or null")
        this.phone = phone
        this.email = email
    }


    class Builder{


        private var phone: String? = null
        private var email:String? = null

        fun setPhone(phone: String)= apply{
            this.phone = phone
        }

        fun setEmail(email:String) = apply{
            this.email = email
        }

        fun build() : Contact{
            return Contact(phone, email)
        }
    }
}