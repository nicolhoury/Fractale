import scala.math.sqrt

class Complex(val a: Double, val b: Double) {
  def +(that: Complex) = new Complex(this.a + that.a, this.b + that.b)
  def *(that: Complex) = new Complex( this.a * that.a - this.b * that.b, this.a * that.b + this.b * that.a)
  def module: Double = sqrt(this.a * this.a + this.b * this.b)

}