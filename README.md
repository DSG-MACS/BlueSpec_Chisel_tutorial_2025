# Bluepec and Chisel (DSG seminar session) 
In this DSG session, we will give an introduction to Bluespec and Chisel, two modern Hardware Description Languages (HDLs) that utilise the power of functional programming. Our goal is to provide a non-technical hardware audience with the basic knowledge needed to use these languages, alongside fundamental hardware design principles. Hands-on demos will be included, starting from a basic combinational adder circuit to a pipelined hardware design that integrates multiple hardware modules.

## Speakers
- [Yukang Xie](https://github.com/bathtub-01)
- [Akilan Selvacoumar](https://akilan.io)

## Tutorial video: 
[![DSG_TUTORIAL](https://i.ytimg.com/vi/m7ffjc3KdRg/hqdefault.jpg?sqp=-oaymwEnCOADEI4CSFryq4qpAxkIARUAAIhCGAHYAQHiAQoIGBACGAY4AUAB&rs=AOn4CLCbqV_HzH1hPKRAbIdaZUmhxvXd2Q)](https://www.youtube.com/watch?v=m7ffjc3KdRg)

## Bluespec build tutorial
### 1. Install BSC
- https://github.com/B-Lang-org/bsc/blob/main/INSTALL.md

### 2. Install iverilog
- https://steveicarus.github.io/iverilog/usage/installation.html

### 3. Compile BSV pipeline to Verilog
```
cd BlueSpec/Pipeline
make verilog
```
### 4. View Verilog output 
```
cat verilog_dir/mkTop.v
```

## Chisel build tutorial

### 1. Install `sbt` and Chisel dependencies
- https://www.chisel-lang.org/docs/installation

### 2. Compile Chisel to Verilog
```
cd chisel-exp
sbt run
```

Verilog files will be generated under `chisel-exp/generated`

## Resources
1. Visualise digital circuits from Verilog files online: https://digitaljs.tilk.eu/
2. Better in-depth explaination of Bluespec:
   - Introduction: https://www.youtube.com/watch?v=7JffUcHnaDY
   - RISCV Bluespec: https://www.youtube.com/watch?v=6G0xsL1lmrg
   - Describing Combinational Circuits in BSV: https://www.youtube.com/watch?v=2gv39yQqK9g
3. Some learning resource of Chisel:
   - The Chisel Bootcamp: https://github.com/freechipsproject/chisel-bootcamp
   - Digital Design with Chisel (free book): https://github.com/schoeberl/chisel-book
