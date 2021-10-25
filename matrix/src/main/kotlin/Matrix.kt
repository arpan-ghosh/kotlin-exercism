class Matrix(private val matrixAsString: String) {

    var STRING_MATRIX : MutableList<String> = arrayListOf<String>()
    var INT_MATRIX : MutableList<MutableList<Int>> = arrayListOf<MutableList<Int>>()
    var LINES : List<String>
    var NUM_ROWS : Int = 0
    var NUM_COLS : Int = 0

    init {
        LINES = matrixAsString.split(java.lang.System.lineSeparator())
        NUM_ROWS = LINES.size
        this.cleanLines(LINES)
    }

    fun cleanLines(originalMatrix: List<String>) {
        for (row in originalMatrix) {
            var newRow = row.replace("\\s{2,}".toRegex(), " ").trim()
            newRow = newRow.replace(" ",",")

            var numbers : List<String> = newRow.split(",")
            var numbersInt : MutableList<Int> = arrayListOf<Int>()
            NUM_COLS = numbers.size

            for (number in numbers) {
                numbersInt.add(number.toInt())
            }

            INT_MATRIX.add(numbersInt)
        }

        return;
    }

    fun column(colNr: Int): List<Int> {
        var col : MutableList<Int> = arrayListOf<Int>()

        for (row in INT_MATRIX) {
            col.add(row.get(colNr-1))
        }

        return col
    }

    fun row(rowNr: Int): List<Int> {
        return INT_MATRIX[rowNr-1]
    }
}
