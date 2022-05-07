# Java Multithreading

Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU

What is process?
Running programs or program instance,Gets own memory,file handling etc.

what is multiprocessor?

what is multitasking?
Switching CPU from process to another, does not imply parallelism 

What is concurrency?
Concurreny acheive through multitasking, better resource utilization

What is parallelism?


### Thread
Each part of such program is called a thread. So, threads are light-weight processes within a process
Thread is part of process
- Single sequential flow of control within a process
- Light weight process
- Thread share process wide resources e.g: memory
- Thread has own PC, stack and local variable

### Thread benefits
- Exploiting multiple processors
- Allow loosly coupled design
- Better throughput even in single CPU machines

### Thread types
- Daemon
  - Background thread for tasks such as GC   
- Non-Daemon
  - main thread - created by JVM to run main()
  - JVM will not terminate atleast one non-daemon thread is running

### Analogy
Thread - Worker
Runnable - work

Threads can be created by using two mechanisms : 

- Extending the Thread class 
- Implementing the Runnable Interface

Code pending

### Thread class vs Runnable Interface


### Thread lifecycle

### Thread scheduler
Makes decision on who runs and how long they run
no gurantee! never rely on scheduler behaviour



