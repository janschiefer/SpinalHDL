package spinal.lib.io

import spinal.core._
import spinal.lib._

/**
  * Define an open drain readable port
  */
case class ReadableOpenDrain[T<: Data](dataType : T) extends Bundle with IMasterSlave{
  val write,read : T = dataType.clone()

  override def asMaster(): this.type = {
    out(write)
    in(read)
    this
  }
}