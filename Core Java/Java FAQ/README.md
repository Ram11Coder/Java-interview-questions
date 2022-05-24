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
