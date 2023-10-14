package classicaldesignpattern.builder

import java.lang.IllegalArgumentException

//Private constructor
class User private constructor(
    firstName: String?,
    lastName:String?,
    address: Address?,
    contact:Contact?,
    company:Company?
) {
    val firstName: String?
    val lastName: String?
    val address: Address ?
    val contact: Contact ?
    val company: Company

    init {
        if(firstName.isNullOrBlank()) throw IllegalArgumentException("First name is required")
        if(lastName.isNullOrBlank()) throw IllegalArgumentException("last name is required")
        if(address == null) throw IllegalArgumentException("address is required")
        if(contact == null) throw IllegalArgumentException("contact is required")
        if(company == null) throw IllegalArgumentException("company is required")
        this.firstName = firstName
        this.lastName = lastName
        this.address = address
        this.contact = contact
        this.company = company
    }


    class Builder{
        private var firstName: String? = null
        private var lastName: String? = null
        private var address: Address? = null
        private var contact: Contact? = null
        private var company: Company? = null


        fun setFirstName(firstName:String) = apply {
            this.firstName = firstName
        }

        fun setLastName(lastName:String) = apply {
            this.lastName = lastName
        }
        fun setAddress(address: Address) = apply {
            this.address = address
        }
        fun setCompany(company:Company) = apply {
            this.company = company
        }
        fun setContact(contact: Contact?) = apply {
            this.contact = contact
        }

        fun build(): User{
            return User(
                firstName,
                lastName,
                address,
                contact,
                company
            )
        }

    }
}