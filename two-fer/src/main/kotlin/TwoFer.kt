internal fun twofer(name: String? = null): String {
    val pronoun: String?

    when (name) {
        is String -> pronoun = name
        else -> pronoun = "you"
    }

    val verdict: String = "One for ${pronoun}, one for me."

    return verdict
}