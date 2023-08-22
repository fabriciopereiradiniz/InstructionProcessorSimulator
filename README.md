# 💻 InstructionProcessorSimulator
This project was developed as part of the "Computer Architecture and Organization" course to provide a hands-on experience with the fundamental concepts of instruction processing. The simulator allows you to explore the inner workings of a simplified processor, focusing on instruction fetching, decoding, and execution.

Check the technical report [HERE](./relatorio.pdf).

## Compilation and Execution of the Program

Make sure you have the Java Development Kit (JDK) installed on your machine. Open a terminal or command prompt and navigate to the directory where the program folder `scr` is located.

Compile the source code by entering the following command:

`javac entities/Simulator.java application/Program.java`

After compilation, execute the program by typing the following command:

`java application.Program`

## Limitations

The simulator has certain limitations regarding its memory and the number of instructions it can handle. Currently, it is designed to work with a maximum of 250 memory positions and can accommodate up to 250 instructions. These limitations are due to the initial configuration of the `posicoes`, `opcode`, `op1`, and `op2` arrays.

The `posicoes` array represents the memory positions, and the `opcode`, `op1`, and `op2` arrays store information about the instructions. While these arrays are set to handle 250 elements, it's important to note that these values can be modified to suit different requirements.

For instance, if you need more memory positions or the ability to handle more instructions, you can adjust the size of these arrays accordingly. However, keep in mind that increasing the size of these arrays will also impact the memory usage and processing time of the simulator.

To make changes to the limitations, you can modify the array sizes like this:

`public class Simulator extends Program {
    public double[] posicoes = new double[MAX_MEMORY_SIZE]; // Adjust MAX_MEMORY_SIZE as needed
    public String[] opcode = new String[MAX_INSTRUCTIONS];   // Adjust MAX_INSTRUCTIONS as needed
    public int[] op1 = new int[MAX_INSTRUCTIONS];            // Adjust MAX_INSTRUCTIONS as needed
    public int[] op2 = new int[MAX_INSTRUCTIONS];            // Adjust MAX_INSTRUCTIONS as needed
    // Other fields and methods...
}`

By adjusting `MAX_MEMORY_SIZE` and `MAX_INSTRUCTIONS` to larger values, you can expand the memory capacity and the number of instructions that the simulator can handle. Just remember that larger arrays will require more memory and may affect performance, so it's important to strike a balance based on your simulation's requirements

## Program Usage

When you run the program, you will see a menu with various options. Select the option corresponding to what you want to do:

- Option 1: Insert instructions interactively.
- Option 2: View a list of available instructions.
- Option 3: View stored instructions.
- Option 4: Execute stored instructions.
- Option 5: Clear the simulator's state.
- Option 6: Exit the program.

Follow the on-screen instructions to interact with the simulator.
