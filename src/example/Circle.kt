package example

class Circle {

    fun calculateArea(radius: Double): Double {
        require(radius > 0) { "Radius must be greater than 0" }
        return Math.PI * Math.pow(radius, 2.0)
    }
}