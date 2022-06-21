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
