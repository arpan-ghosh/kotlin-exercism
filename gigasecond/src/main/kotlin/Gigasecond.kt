import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(val localDate: LocalDateTime) {
    constructor(localDate: LocalDate) : this(localDate.atStartOfDay())

    val date: LocalDateTime = localDate.plusSeconds(1_000_000_000)
}