class PhoneNumber(var phoneNumber: String) {

    var prefixRemovedPhoneNumber : String = "";
    var phoneNumberWhiteSpacesRemoved : String = "";
    var scrubbedNumber : String = "";
    var cleanNumber : String = "";
    val TEN_DIGIT_NUMBER = 10;

    init {
        phoneNumberWhiteSpacesRemoved = phoneNumber.filter { !it.isWhitespace() }
        scrubbedNumber = phoneNumberWhiteSpacesRemoved.replace("""[-,),(,.,+]""".toRegex(),"")

        this.cleanNumber = this.scrubNumber(scrubbedNumber)
    }

    fun scrubNumber(scrubbedNumber : String) : String {
        if ( scrubbedNumber.get(0) == '+' && scrubbedNumber.get(1) == '1' ) {
            cleanNumber = scrubbedNumber.substring(2)
        } else if ( scrubbedNumber.get(0) == '1') {
            cleanNumber = scrubbedNumber.substring(1)
        } else {
            cleanNumber = scrubbedNumber
        }

        if ( cleanNumber.length !== TEN_DIGIT_NUMBER) {
            throw IllegalArgumentException("invalid");
        }

        if ( cleanNumber.get(0) == '0' || cleanNumber.get(0) == '1' ) {
            throw java.lang.IllegalArgumentException("invalid")
        }

        if ( cleanNumber.get(3) == '0' || cleanNumber.get(3) == '1' ) {
            throw java.lang.IllegalArgumentException("invalid")
        }

        return cleanNumber
    }

    val number: String? = this.cleanNumber
}
