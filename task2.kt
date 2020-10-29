fun main(){
    val f1 = Fraction(2F,24F)
    val f2 = Fraction(1F,12F)

    println(f1 == f2)
    println(f1.toString())
    println(f1.multiplication(f1))
    println(f1.division(f2))
    println(f1.shortering())
}

class Fraction(n: Float, d:Float) {
    var numerator: Float = n
    var denominator: Float = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if ((numerator * other.denominator) / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator, $denominator"
    }

    fun multiplication(fraction: Fraction): Float {
        return ((numerator * fraction.numerator) / (denominator * fraction.denominator))
    }

    fun division(fraction: Fraction): Float {
        return ((numerator * fraction.denominator / denominator * fraction.numerator))
    }

    fun shortering(): String {
        for (i in 0..10000000000000) {
            if (numerator * i == denominator)
                println(denominator / numerator )
        }
        return ""
    }

}


