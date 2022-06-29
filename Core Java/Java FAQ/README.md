### 1.How to access static member in java application?

Accessing static members[Variable,Methods]

1. From static context
- Class name(Yes)
- this(No)
- ObjectReference(Yes)

2. From Non-static context

- Class name(Yes)
- this(Yes)
- ObjectReference(Yes)


### 2.Why we can't use this inside static context?

this - Predefined non-static variable
Every java program have static and non-static context?

1.Static - Free accessible area
Example: Reception
2.Non-static - Restriced access, need to take permission
Ex: class room
permission - ID card required

Objects
room1 - Java 
room2 - Android
room3 - SpringBoot

Scenerios:
Me : where is java class room?


Receptionist can not say this is a class room
Because Receptionist inside the reception so impossible to use this keyword

Then how receptionist address particular class room?
For every object one user defined identity is very important is called user-defined object reference variable

Receptionist can reply room1.java (Room1 java class is going on)
room1 , room2, room3 -> Userdefined obj reference
Using user-defined obj ref to access non-static variable/methods

### 3.Limitation of default constructors?
Compiler provide noarg constructor only if no constructor args provided in java souce code
Compiler does not provide noarg constructor if parameter constructor args are provided in java souce code

### 4. Diff between POJO and Bean?
POJO rules:
- Class is public
- Properties are private
- Default constructor
- Public setter and getter methods

Bean 
- All POjo rules are applied 
- Additionally Bean object can be serialized [Bean must implement java.io.serializable interface]

## 5.Where we use String to Primitive data conversion?

Why we need to convert string into primitive?
Why we need to convert into into String?
just take a simple Calculator GUI as example

` -----------------------`
<br>
Enter num1 : 			      
Enter num2 : 	      	<br>
Result     :          
<br>
			Add button			             
<br>
` ----------------------- `
INput field called as textfield

To collect the integer there is no seperate integer input field or double ip field or float ip field etc.. no such type of input field availble in any technology

If u want to get the input field then go for text field only
Text Field  Collect the information in the form of text ex: Strings 
Procedure:
1. First capture the text input data as string 
2. Convert the string into int using parse() method
3. After adding the number then again convert into string 
4. Then set the value to result

### 6.What is default constructor?
Constructor is a special java method, It is having same name as className 
Return type is not allowed 

Default constructor : By default compiler insert
At the time of Compilation, compiler looking for constructor definition in java source file.
If u are not providing any definition of constructor compiler will add default constructor
It has zero argument and empty body 

### 7.How JVM instantiate parent class in child object creation?
Example:
class Parent{
Parent(){
}
}
class Child extends Parent(){
Child(){
super();//Super will call the parent class
}//Default constructor will inserted by compiler
}

psvm(){
new Child();
}

super() - WIll be the first statement in constructor and call the parent class


### 8. Can we overload main?

Main method can overload with different signature  
JVM looking for only standard main method only 
public static void main(String args[]){
}
overloadded main method:
static void main(){}
static void main(){int args}
remaining main method  you have to execute externally

### 9. What is logical error?
No Compile and runtime error, but provide the unexpected output.

ex:
int x=10,y=3;
float f=x/y;//logical error

### 10. What is syntatical error?
syntatical error is compiler error
Programming language have set of rules , if we violate the rules will get compilation error



### 11 Can we define main() inside abstract class?
Abstract class -> class which is not have full definition, partial definition of object
concrete and abstract methods are allowed

It is acceptable to use main method inside abstract class
example:

<pre>
abstract class Abstract {
	/**
	 * Below 2 method required object to call
	 */
	void test() {}
	abstract void test1();

	public static void main(String[] args) {
		System.out.println("Inside Abstarct!!");
	}
}

public class AbstractMain {
	public static void main(String[] args) {
		System.out.println("Inside main!!");
		Abstract.main(args);
	}
}

</pre>

### 12 Canthis() vs super()
this()
1.used to access current class constructor
2. Use only inside another constructor of same class
3.Call to this() must be the first statement

this()
1.used to access parent class constructor from child class constructor
2.Use only inside child class constructor
3.Call to this() must be the first statement


### 13 CanFinal is a keyword
apply to variable,class ,method,
<pre>
	final keyword
      /		 |	\
class		method	variable
|		|		|	
extends		override	modify
</pre>
all the above things are updation
it restrict the updation permission of object

### 14.Diff bw applets and Swing
Both are used to generate GUI
Applets:
- Run by html
- Applet components are OS dependent
Swings(javax.swing)
- Run by JVM 
- Components creation logic developed by java


### 15.ArrayList vs Vector
ArrayList
- Implements List
- Ordered
- Duplicates allowed 
- Since JDK 1.2
- Not Synchronised by default
- If we want synchonised list then use collections class have 
synchronizedList(List)
- No capacity configuration
Vector
- Implements List
- Ordered
- Duplicates allowed 
- Since JDK 1.0
- Synchronised by default
- Configure capacity 

### 16.When we go for Linkedlist instread of arraylist?
When insertion and deletion is frequently then go for linkedlist

### 17.What is boxing in java?
Wrapper class - Converting primitive data into object
2 ways to do boxing operation
1.Static method
Example:
byte b=12;
Byte x=Byte.valueOf(b);
2.constructor
COnstructor once object is created then constructor retuen the object
example:
byte b=123;
Byte bt=new Byte(b);


pojo bean  mutable and immutable class properties always private### 17.

### 18.What is setter and getter methods?
Property is need to secure, so if we want to communicate we need to use getter and setter methods

### 19.Why we need to set path to jdk?

- OS have CUI and GUI

OS have 2 command modes
1. internal commands - While installing OS befault few softwares are recogonised by DOS
so need to set path to access the sw
ex: mspaint,notepad

2. External command
JDK command contains many .exe files 
until set the path we will message 
ex:
'java' is not recognized as an internal or external command

### 20.Can we apply modifiers to local variables?
No, local variable is inside the block only, no modifiers like static,public,private applicable
<pre>
class Sample
{
public void test{
static int a;// static is global scope and local var scope is inside the block only
private int a;//any level of modifier no use beacuse local var scope is inside the block only
}
</pre>

### 21.What is immutable class and rules?
Once object has been created the state can not be modified 
because the variable are final variables

example 
class sample{
int x;
}
value assigned to 10 then the property value can not be changed it is fixed

Rules:
1. Class is public
2. Properties are private and final
3. Must initialize all the properties through constructor
4. Setter not allowed
5. Only getter allowed

### 22.What is exception or runtime error?

Application executung at runtime facing any error called as exception or runtime error


### 23.What is class/Abstract class/Interface?
class : complete definition of object
only have concrete methods

Abstract class :partial definition of object
concrete method and abstract method are allowed
specification - no body
definition - have body

Interface : complete definition of object
only abstract methods


### 24.What is default exception handler?
whenever exception has raised in our program it will create a expection object and store the details
Exception Object -> details information of exception
we have to handle the exception
if not then jvm will pass control to default exception handle to handle the exception object 

### 25.Where we use try with multiple catch block?
When try block occuring more than one exception

### 26.why when exception occur control won't go back to try block , because subsequent step also occur further exception
example:
<pre>try{
1.File read
2. File write
3. File transfer
}
catch(FileNotFoundException e){}
catch(SecurityException e){}
catch(NetworkException e){}
</pre>

### 27.what is abstract class and why class become abstract?


concrete class - complete representation of object 
All methods must have body

Abstract class - partial representation of object
it contains abstract and concrete methods
abstract methods - Whenever we unable to provide definition


### 28.Why abstract can't be final and static?

<pre>
abstract class Parent{
final abstract void m1();//illegal modifier
static abstract void m2();// static is common and abstract is specific ,we can not combine both static and non-static together
}

class Child extends Parent{}
</pre>

Rule:
If there is any specification in the parent class you have to implement (definition -> overriding) in the child class

Final - restrict the update permission(Fixed object)
So final abstract void m1();
we are overriding in the class is not possible 
illegal combination of final and abstract


Static - common functionality object , more than one object can access
Non static - specific to one object
Abstract - specific to particular child


### 29.can a final class extends abstract class?
yes with some condition

class AbstractClass{
abstract void m1();
abstract void m2();

}
final class FinalClass extends AbstractClass{
}

FinalClass has to override all methods in the AbstractClass
Because FinalClass is final , we can not override further so all the specification should be update

### 30. Static vs Dynamic memory allocation?
Always memory will be allocated in runtime

Static - Fixed in Size
ex: Primitive, Arrays

Dynamic Memory- Size varies
ex: Collections


### 31.Can we define main() inside interface?
in Jdk 1.7 not allowed
in Jdk 1.8 is allowed static method but non-static method not allowed


### 32.Can we place instance variable inside the interface?
Not allowed 
Reason:
We can not create object for interface [No constructor definition]
interface In{
int x; //public static final int x;
}
if you create the variable inside the interface bydefault public static final

### 33.How to instantiate class/AbstractClass/Interface?

|Object creation of |Using "new" keyword|Through child class |
:---: | :---:|:---: |
Class |yes via new keyword|Yes through child class|
Abstract Class |no because class is partial definition|Yes through child class|
Interface |No|No|

By creating of object constructor calling is important but can not create constructor inside the interface
What is the useof constructor inside the abstract class?
- To initialize the variable of abstract class if present
Note: If uu create a object for child class then parent class object also will be created 

### 34.Can we call static method directly?
yes in some situation 
if the static method inside the same class we can access directly

static method outside oof class then access via class name or object

### 35.WHy class can't be private and protected?
class - representation of object
private - visible inside the class only
private class then object is also private so no one can communicate with this 
Java is working way to communicate one object to another 

if object is private then no use to communicate it
##### example
<pre>
private  class GrandParent{
}
Parent exends GrandParent{
}
</pre>
Protected - access within the hierarchy order(Family member)
##### example
<pre>
protected  class GrandParent{
}
Parent exends GrandParent{
}
</pre>
Protected class then entire life it will be visible to their family members only
Whenever outside person trying access will get error such type of object not present in this world

### 36. Diff bw hashmap, LinkedHashmap and TreeMap?
HashMap - Does not maintain insertion order
LinkedHashmap - It will maintain insertion order of elements
TreeMap - Maintain sorted order of keys(elements not in ascending order)

### 37.How element store into hashtable?
Searching and processing element is bit fast compared with linkedList

LinkedList
17->32->76->9->81->93
Need to iterate whole list to find the element

hashtable
element % size => index
17%6 -> 
|0|->
|1|->
|2|->32
|3|->9->81->93
|4|->76
|5|->17

### 38. What is the diff bw Array and Collections?
Array
- Static in size
- Array can store only homogenous elements
- Array hold primitive and Objects

Collections
- Dynamic in size
- Collections can store hetrogenous elements 
- Hold only Object

### 39. Diff bw hashSet, LinkedHashSet and TreeSet?
Duplicates not allowed
HashSet
- Intro in 1.2
- Not maintain Insertion order

LinkedHashSet
- Inro in 1.4
- Maintain insertion order

TreeSet
- SortedSet
- Maintain Ascending order

### 40. Method Overriding? Why can't we override constructor?

Defining same name and signature in child class
override - rewriting the logic 
constructor belong same class so we can not override to child class

### 41 What is inheritance?
- Defining object with help of existing object
Features
- Accessing existing object or functionality
- Adding new features 
- Updating existing object functionality

### 42 Types of inheritance?
Java Supports
- Single inheritance
- MultiLevel Inheritane
- Hierarchical inheritance
Java does'nt support
- Multiple Inheritance
- Hybrid Inheritance

### 42 Multiple inheritance using interfaces?
interfaces is set of specifications
inteface extends another interface not extends reason is class and abstractClass only can do implementation not interface
<pre>
Interface(I1)		Interface(I1)
	|fun()		 	|fun()
		    |(Extends)
		Interface(I3)
		    |fun()
		    |(Implements)
	Abstract class or class
</pre>

### 43 When we call super() explicitly?
- As per java rule if it is a normal var then we can access directly,if it is a non-static var access via this keyword
- super() -invoking parent class constructor with child class
- In the process of child object creation want to provide initial value to parent class we use super method from child class constructor

example
<pre>
class Parent{
int x;
Parent(int x){
this.x=x;
}

}
class Child extends Parent{
Child(int x){
super(x);
}
}
public static void main(String args[]){
new Child(10);
}


</pre>

### 44.checked and unchecked exception?

unchecked exception
- Java application is not connected to outer resource
- Compiler not check the exception whether handling or not handling
- Handling exception is optional
- If we are handling then no abnormal termination
- If not then abnormal termination
- Compiler will not involve any action
checked exception
- Checked by compiler
- IF don't handle compiler throw error

### 45 Why we can not handle child type exception after handling parent type?
<pre>
try{
}
catch(Exception e){
}
catch(ArthmeticExeption e){
}
</pre>
Basically can not handle same exception more than one time, Because parent class caught the child exception so then no need to handle child exception again

### 46. How can we handle child type exception using its parent class reference variable?
It is possible of runtime polymorphism concept

<pre>
try{
int a=10/0;
}catch(ArithmeticException ae){}
catch(RuntimeException re){}
catch(Exception e){}
catch(Throwable t){}


</pre>
Example we are handling catch with Exception
In compile time compiler does not know which exception it pointing
So runtime time when exception raise using runtime binding concept JVM will check

### 47.Why we can't handle errors in java?
Exception is runtime error , once the app is running we will get some exception
Error : 
In case of error we can not run the application
example:
NosuchMethodError
OutOfMemoryError
ClassDefNotFoundError

### 48. Why can't we handle same exception more than one time>

<pre>
	try {
		int a=10,b=10;
		System.out.println(a/b);
		int x=10,y=10;
		System.out.println(x/y);
	} catch (ArithmeticException e) {
		// TODO: handle exception
	} catch (ArithmeticException e) {
		// TODO: handle exception
	}
	</pre>
In both scenerios first catch block going to execute so 2nd catch block is unreachable code
### 49. Will jvm create a seperate object for parent in child obj creation?
<pre>

class Parent{
Parent() {
System.out.println("Parent is "+this);
	}
}
class Child extends Parent{
 Child() {
System.out.println("Child is "+this);
	}
}
public class Test {
public static void main(String[] args) {
	new Child();
}
}
</pre>
outPut:
Parent is arrays.Child@76ccd017
Child is arrays.Child@76ccd017

So ans is no parent object is created


### 50. Can we override static method in java?
Static means common
Static method is belongs to specific class , can not override by child class
<pre>
class samsung{
static void m1(){}
}
class edge extends Samsung{
static void m1(){}
}
</pre>

### 51.What is immutable object in java?
Once object has been created state can not be modified
Example: String

<Pre>
			String s1="Hello",s2="World";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s1=s2;
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s2=s1.concat(s2);//It will create new object pointing to s2
		System.out.println(s2);
		System.out.println(s1.concat(s2));
	</pre>
	
### 52.Rules to create immutable class?
- Make a class public and final (Not allow child class to change the state of object)
- Initialize the values inside the class as final private
- Using constructor to initialize the final private variable
- Don't allow setter method
- (Note : If no updation allowed then how new values are assigned to the variable ex: String)


### 53.What is GC?
- Garbage collector is daemon thread,runs behind the application
- it is a service thread, provide the service 
- To whom provide service
- For all non-Daemon threads which is executes application logic
- It will remove non-reference object in heap memory and free up the space
- JVM only start and stop the GC thread

### 54. How to create daemon thread?

There is a method available in Thread class to convert non-Daemon to daemon
ex: setDaemon(boolean b){}

<pre>

class Test extends Thread{
psvm(){
Test thread =new Test();
thread.setDaemon(true);
}
}
</pre>
note:
- what is daemon and non-Daemon threads?
- All the thread create as soon as behave like non-Daemon
### 55.can we convert behaviour of main thread from non-Daemon to daemon?

Before starting thread only  we can change the behaviour from non-daemon to Daemon
So only user thread behaviour can change to non-Daemon to daemon, main thread behaviour can not change

### 56.When JVM starts GC thread?
- JVM starts the GC thread when heap memory running low, less stress on processer and increase the performance
- In multithread already so many threads are running if GC is running automatically then deecrease the performance, so the GC thread not run frequently
Only it requires JVM will starts gc thread

### 57.When we use runnable interface to create thread?
 
In IS-A relation if the parent class extends the Thread class then child class also get the thread functionality

in IS-A relationship we only want to create the thread for child, we can not extends thread class because multiple inheritance not support in java 

So implementing Runnable interface only child class able to create the thread

### 57. How to create thread in java?
- Using Thread class
- - Using Runnable interface
We need to override the run() method provide user defined thread logic
Thread implements runnable interface too

### 58. What are the default identities of threads?

For each thread, Thread constructor creates default identies ex: Thread - 0
Using thread identites only JVM will invoke the specific thread to be executed


### 59. Multi-tasking vs Multi-Threading?
Multi-tasking
- Performing N number of tasks required N number of process space required 
example:
A person have multiple place multiple tasks needs to do
switch one place to another take more cpu power
Multi-Threading
- Performing N number of tasks required one process space required 
example:
A person have Single room multiple tasks needs to do

note:
tasks -threads
room - process 
### 60. Need of multi-tasking?
- Optimum utilization of CPU
context switching between multiple process

### 61.What is multi-tasking>
- Performing more than one task parallelly or concurrently called as multi-tasking
- There is no multi-tasking processer in the world, one processor can execute one instruction at a time
- In CPU there is Control unit that is take care of multi-tasking
- It uses
  - Time Slicing (It will set some time frame for specific task)
  - Context switching  (It will switch one context space to another context space)

### 62. What is super class of all classes and why?
Object class
- class is representation of object if u create any object how it behave like a object means it getting behaviour from Object class , so need to apply object behaviour to all class each time

### 63. When we cast object address into interface type?
- Interface is standard set of specification 
- How it is allowing internally because of object of casting 

<pre>


interface Lenovo {
	void spec();
}

class LocalSeller implements Lenovo {
	@Override
	public void spec() {
		System.out.println("LocalSeller Specification");

	}
}

class RamLaptops implements Lenovo {
	@Override
	public void spec() {
		System.out.println("RamLaptops Specification");

	}
}

public class Test {
	static void calling(Lenovo l) {
		l.spec();
	}

	public static void main(String[] args) {
		LocalSeller ls = new LocalSeller();

		ls.spec();
		calling(ls);

		RamLaptops r = new RamLaptops();
		calling(r);
	}
}

</pre>

### 64. Why run can't throw interruptedException?

<pre>

class ThreadTest implements Runnable {
	@Override
	public void run() throws InterruptedException {

		/**
		 * Exception InterruptedException is not compatible with throws clause in
		 * Runnable.run()
		 */

		Thread.sleep(1000);

		System.out.println("Running....");
	}
}

public class Test {

	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		Thread t = new Thread(t1);
		t.start();
	}

}

</pre>

### 

One of Rule of overriding 
we Should not change the prototype of run() method in runnable interface
That's why we can throw InterruptedException because that is not defined in runnable interface

### 65. Why we can not call run() method explicitly?
Thread.start() to call run() method 

1. To allocate thread space in memory
2. Fetch run() method logic
3. Execute in the allocated space
4. IF we directly call the run() method it act like normal method only
5. we can create the thread space logic in program but it hard to implement that why we go for available resource

### 66. What is daemon thread?
It is running as background thread to provide service to non-daemon thread
Non-daemon thread executes fore-ground of logic
All the non-daemon thread execution is completed then JVM forcefully stop the daemon thread



### 67.How to find the details of current thread?
Thread.CurrentThread() 



### 68. How to set identity to a thread?
using child class constructor to set the thread identity 
<pre>
public class Test extends Thread {
	public Test(String s) {
		super(s);
	}

	@Override
		public void run() {
		System.out.println(Thread.currentThread().getName());

		}
	public static void main(String[] args) {
		Test t1 = new Test("Test-Thread");
		t1.start();
		System.out.println(t1.getName());
		System.out.println(Thread.currentThread().getName());
	}

}


</pre>


### 69. Diff bw sleep() and Join()?

Sleep() - Waits specific time frame and do the process
Join() - It will wait till other thread complete work
<pre>
public class Test extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i + "Hello world..");
		}

	}

	public static void main(String[] args) throws InterruptedException {
		Test t1 = new Test();
		t1.start();

		Thread.sleep(10);// it make main thread sleep for 10 ms

		// t1.join();//Main thread will wait till t1 complete it job
		System.out.println(t1.getName());
		System.out.println(Thread.currentThread().getName());
	}

}
</pre>


### 70.What is finalize() method?
How to release the resource before destruction of object

### 71. What is the use of 'throw' keyword?
- User can create custom checked and unchecked exception
- Custom exception using Extends exception
- Custom unchecked exception using runtime exception

class MyException extends Exception{
checked
}

Throw keyword used throw user defined exception mostly and predefined exception also , it used throw exception object externally
Predefined object exception object created automatically, JVM throw exception object
User defined exception we only create and throw exception using throw keyword

### 72. Why finalize method is protected?

GC thread invoke finalize() method before destruction of any object, implicitly finalize method executes
Analogy:
We can allow our property to ourself and heritance that why finalize make it as protected, we are not outside people destroy our property

real time : Our object can be destroy process only allow (IS-A relation class only not others)

If required we can override to increase the priviledge like protected to public also 


### 73. What is the use of System.gc()?

It runs the GC externally

JVM calls the GC thread unnecessarily because it reduces the performance 
JVM calls GC thrad only heap memory occupied heaviliy

### 74. What is serialization?
It is converting object state into persistent state
We usually store the data permanently go with file system r db

Using Object stream to convert object into serialization file (Binary data with extension .ser)
ex: ObjectOutputStream using

Which call u want to serialize must implement serializable interface

### 75.What is transient modifier?
If you make variable as transient then it will not participate on serialization process
When we try serialize it will get default value like 0

### 76. What is de-serialization ?
Converting persistent state into object state 
ex: ObjectInputStream

### 77. WHat is the process of serialization in Has-A relation?

If One class dependends another class in a Has-a relationship then both class should implements serializable
OtherWise get NotSerializableException

### 78.What is inner class?
- Defining class inside another class called as inner class
<pre>
class Outer{

classs Inner{
}

}

</pre>

Adv:
- Setting dependencies of object
- Class file generate Outer$inner.class
- If you want to access the inner class need to get the permission of outer class

### 79.What are the limitation of  local inner class?

Local inner class - defining class inside the block /method/constructor called as local inner class

- Scope of local inner class inside the block only, object should create inside the block only
- Access modifier not applicable for inside the block because no use for modifiers
- local inner class can not be static


### 80.What is annonymous inner class?
- Provide definition for interfaces
- defining class with no identity, inside the method only
- Compiler will create  a class file inner$1.class

- If you want to define 2 class with same identity with single java application we can go fo local inner class 
Ofcourse we can use fully qualify name and packages 

<Pre>
class Test{

static{
class LocalInner{
logic
}
}}


static{
class LocalInner{
logic
}
}}


</Pre>

- There is no colision in class file Test.class, Test$1LocalInner.class, Test$2LocalInner.class


### 81.How to instantiate non-static inner class?

<pre>
class Outer{

class Inner{
void m(){
}
}
main(String a[]){

Outer obj1 =new Outer();
Outer.Inner obj2=obj1.new Inner();
obj2.m();
}

}
</pre>

### 82. How to pass interface object as a parameters?
- By passing interface as annonymous inner class .

<pre>

interface In {
	void m1();
}

public class Sample {

	static void catchInterface(In in ) {
		in.m1();// calling m1 method in annonymous inner class
	}

	public static void main(String[] args) {
		Sample.catchInterface(/* annonymous inner class */new In() {
			@Override
			public void m1() {
				System.out.println("Inside m1() ...");

			}
		});
	}
}
</pre>
