
open class Shape {

    constructor (_name: String) {

        when (_name) {
            "Square" -> {
                val sq = Square(_name = "")
                sq.setDimensions()
                sq.printDimensions()
                sq.getArea()
            }
            "Circle" -> {
                val cir = Circle(_name = "")
                cir.setDimensions()
                cir.printDimensions()
                cir.getArea()
            }
            "Triangle" -> {
                val tri = Triangle(_name = "")
                tri.setDimensions()
                tri.printDimensions()
                tri.getArea()
            }

            "EquilateralTriangle" -> {
                val equi = EquilateralTriangle(_name = "")
                equi.setDimensions()
                equi.printDimensions()
                equi.getArea()
            }

        }


    }


    open fun getArea() {
        println("Area is 0.0")
    }

    open fun printDimensions() {
        println("No dimensions");
    }

    open fun setDimensions() {
        println("No dimensions");
    }

    //Square class inherited from Shape
    open class Square(_name: String) : Shape(_name) {
        private var length = 0.0;

        // getArea, setDimensions and printDimensions methods are Shape class methods. To
        //override them in child classes
        override fun getArea() {
            println("Area is : " + length * length)
        }

        // overriding setDimensions() method
        override fun setDimensions() {
            println("Enter The Side Length of Square : ")
            length = readLine()?.toDouble() ?: 0.0
        }

        // overriding printDimensions() method
        override fun printDimensions() {
            println("The Side Length is : $length")
        }
    }

    open class Circle(_name: String) : Shape(_name) {
        private var radius = 0.0;

        //overriding getArea() method for Circle class
        override fun getArea() {
            println("An Area is " + Math.PI * radius * radius)
        }

        // overriding setDimensions() method for Circle class
        override fun setDimensions() {
            println("Enter The Radius of Circle : ")
            radius = readLine()?.toDouble() ?: 0.0
        }

        // overriding printDimensions() method for Circle class
        override fun printDimensions() {
            println("The Radius is : $radius")
        }
    }


    open class Triangle(_name: String) : Shape(_name) {
        // declaring variables as 'protected' for Triangle class
        //so that EquilateralTriangle class can access them directly
        protected var a = 0.0;
        protected var b = 0.0;
        protected var c = 0.0;

        //overriding getArea() method for Triangle class
        override fun getArea() {
            val s = (a + b + c) / 2.0;
            println("An Area is " + Math.sqrt(s * (s - a) * (s - b) * (s - c)))
        }

        // overriding setDimensions() method for Triangle class
        override fun setDimensions() {
            println("Enter The First side of Triangle : ")
            a = readLine()?.toDouble() ?: 0.0
            println("Enter The Second side of Triangle : ")
            b = readLine()?.toDouble() ?: 0.0
            println("Enter The Third side of Triangle : ")
            c = readLine()?.toDouble() ?: 0.0
        }

        // overriding printDimensions() method for Triangle class
        override fun printDimensions() {
            //Earlier the print statement for EquilateralTriangle class was used.
            println("The First Side of Triangle is : $a")
            println("The Second Side of Triangle is : $b")
            println("The Third Side of Triangle is : $c")
        }

    }

    // Implemented EquilateralTriangle class, inherited from Triangle class
    open class EquilateralTriangle(_name: String) : Triangle(_name) {

        //overriding setDimensions method
        override fun setDimensions() {
            //asking and reading only one side's value
            println("Enter The Side of Equilateral Triangle : ")
            a = readLine()?.toDouble() ?: 0.0
            //assigning value of a to b and c
            b = a
            c = a
        }

        //overriding printDimensions method
        override fun printDimensions() {
            println("The Side of Equilateral triangle is : $a")
        }

    }
}



