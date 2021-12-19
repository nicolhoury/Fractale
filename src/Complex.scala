class Complex (val a:double, val b : double){
  def +(that: Complex) = new Complex(this.a + that.a, this.b + that.b)
  def *(that: Complex) = new Complex(this.a * that.a - this.b * that.b, this.a * that.b + this.b * that.a)
}
