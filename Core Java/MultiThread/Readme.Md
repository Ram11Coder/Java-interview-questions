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


# Race Condition
https://www.javatpoint.com/what-is-race-condition


Use of synchronisation
protect critical (Shared mutual) data
synchronization = mutual exclusion + reliable thread communication

How to avoid race condition
- Synchronise the process
- Mutual exclusion

Object and class have single lock
Sychronize everywhere where shared var is used



Volatile variable
- Alternate way to ensure memory visibility
- Stored in main memory, not registers or cache
- Used with shared mutual variable


Locking can gurantee both memory visibility and mutual exclusion
Volatile can gurantee memory visibility



Atomic variable

- Better volatile and atomicity like locks
- Introduced in java 5
- Consider atomicity for only single variables, that is not guard the block like synchronisation does.


Synchronisation best practises
- Synchronise everywhere variable is acceessed
- Guard same shared mutable variable with same lock
- Synchronising static fields too
- Synchronize what is needed 
  - Keep synchronized blocks small
  - Try to move time consuming activities out of synchronised blocks without affecting thread safety
 - Not sure then do not synchronize

### Thread co-operation and management
If one thread is in the synchronized region it may not able to progress it’s task unless some other thread performs some other relevant task
Here first thread has to know whether the relevant thread completed its task
So this information captured by some shared state, which meets certain criteria only then first thread continues its action
Volatile is a shared variable

Thread Co-Operation 
- Naive Approach (Via Volatile)
- Wait and notify
- Java 5 Concurrent utilities

Example Scenerio :
Web page indexing
Download the web-page and index the webpage, Once the webpage downloaded only need to index it 

### Naive Approach (Via Volatile)
In this approach, each Weblink has 2 threads

Code will be updated soon!!

### Wait and notify

Wait() - It will suspend the thread and it will move the thread into running the state into a wait state.

Code will be updated soon!!

Thread interuption 
 - java does not allow forcibly stopping the thread 
 - Interruption is a cooperative mechanism for requesting a thread to stop what it is doing
 - Every thread has a boolean interrupted status
 - interrupt() sets interrupt status to true
 - Interrupted is the only method that can used to reset the interrupted status flag
 - If the thread waiting for the some data from source(IO) then the thread is uninterruptible




### Java 5 Concurrent utilities
Code will be updated soon!!



Thread Management 
- Java 5 concurrent utility(Executor Framework)
