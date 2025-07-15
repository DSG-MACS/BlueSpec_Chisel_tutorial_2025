import chisel3._
import chisel3.util._

class Adder(width: Int) extends Module{
  val io = IO(new Bundle {
    val a = Input(UInt(width.W))
    val b = Input(UInt(width.W))
    val out = Output(UInt(width.W))
  })
  io.out := io.a + io.b
}

class Flipper(width: Int) extends Module {
  val io = IO(new Bundle {
    val in = Input(UInt(width.W))
    val out = Output(UInt(width.W))
  })
  io.out := ~io.in
}

class Pipeline(width: Int) extends Module {
  val io = IO(new Bundle {
    val a = Input(UInt(width.W))
    val b = Input(UInt((width + 2).W))
    val out = Output(UInt(width.W))
  })
  val adder = Module(new Adder(width))
  val flipper = Module(new Flipper(width))

  adder.io.a := io.a
  adder.io.b := io.b

  val adder_res = RegNext(adder.io.out)

  flipper.io.in := adder_res

  io.out := flipper.io.out
}

object Main extends App {
  emitVerilog(new Pipeline(16), Array("--target-dir", "generated"))
}


