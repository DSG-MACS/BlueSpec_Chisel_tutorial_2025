package Top;

interface Run_ifc;
  method ActionValue#(Bit#(32)) run(Bit#(32) a, Bit#(32) b);
endinterface

(* synthesize *)
module mkTop(Run_ifc);

  // Definition of the register
  Reg#(Bit#(32)) out <- mkReg(0);

  // A simple function to perform the addition
  function Bit#(32) do_add(Bit#(32) x, Bit#(32) y);
    return x + y;
  endfunction
  
  // A simple function to do a bit flip   
  function Bit#(32) do_bit_flip(Bit#(32) x);
    return ~x;
  endfunction
   
  method ActionValue#(Bit#(32)) run(Bit#(32) a, Bit#(32) b);
    out <= do_add(a, b);
    return do_bit_flip(out);
  endmethod

endmodule

endpackage

