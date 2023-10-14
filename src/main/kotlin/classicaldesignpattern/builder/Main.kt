package classicaldesignpattern.builder

fun main(){
    val getAddress = getAddress()
    val getCompany = getCompany()
    val getContact = getContact()


    var user = User.Builder()
        .setFirstName("Rishabh")
        .setLastName("Gupta")
        .setAddress(getAddress)
        .setContact(getContact)
        .setCompany(getCompany)
        .build()

    var user1 = User.Builder()
        .setFirstName("ABCD")
        .setLastName("XYZ")
        .setAddress(getAddress)
        .setContact(getContact)
        .setCompany(getCompany)
        .build()

    var user2 = User.Builder()
        .setFirstName("ABCD")
        .setLastName("XYZ")
        .setAddress(getAddress)
        .setContact(getContact)
        .setCompany(getCompany)
        .build()

}

private fun getAddress():Address {
    return Address.Builder()
        .setLine1("Chinappahalli")
        .setLine2("Street")
        .setCity("Bangalore")
        .setPinCode(500036)
        .setState("Karnataka")
        .setCountry("India")
        .build()
}


private fun getCompany(): Company {
    return Company.Builder()
        .setName("MBRDI")
        .build()
}

private fun getContact() = Contact.Builder()
    .setEmail("abc@gmail.com")
    .setPhone("21354667")
    .build()