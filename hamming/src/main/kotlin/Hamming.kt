object Hamming {
    fun compute(leftStrand: String, rightStrand: String): Int {
        if ( !leftStrand.length.equals(rightStrand.length) ) throw IllegalArgumentException("left and right strands must be of equal length")

        var leftStrandLength: Int = leftStrand.count();
        var rightStrandLength: Int = rightStrand.count();

        var hammingDistance: Int = 0
        var i: Int = 0

        while ( i < leftStrand.length ) {
            if (leftStrand[i] != rightStrand[i]) hammingDistance += 1
            i += 1
        }

        return hammingDistance
    }
}
