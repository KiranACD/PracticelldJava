# Low Level Design

Low level design deals with details of the software required to implement various components of a web/system application. These software details include classes, attributes and methods in these classes, communication between classes etc.

The activities in a typical working day of a software engineer are the following

1. Meetings/Scrum - Requirements gathering, planning
2. Code Review - Readability is important here to effectively review code.
3. Solve Bugs/Debug - Code should be readable to identify bugs that come up during compile or runtime.
4. Documentation - For future readability. 
5. Testing - Ensure no/fewer bugs in the future.

## How does LLD help here? 

LLD helps you make all the tasks above easier. It helps to make the code readable/understandable. It helps you in requirements gathering. It also helps in making you system extensible and maintainable. 

Extensible: Easy to add new feature. It should not take a lot of time to incrementally add a new feature.

Maintainable: Easy to keep the current system in working condition. Why might a current system break or stop working? Bugs might show up in the system. Updates in OS or third party libraries being used. A maintainable system should make it easy to make the changes in order to keep the system running.

## Introduction to LLD

There are some common paradigms in programming.

1. Procedural programming - This is used by beginners
2. Object-oriented programming - The topic of our discussion
3. Functional programming
4. Reactive programming
5. Declarative programming (SQL)

### Procedural Programming

Procedure is a set of instructions to perform a task or achieve an outcome. This is the same definition as a function. A procedure is nothing but a function/method. We organize our code into a bunch of procedures. Each procedure may internally call other procedures. Execution of a program starts from a special procedure (called main()).

Procedure can be formally defined as a set of instructions that work on a given set of data and may output some data. 

### Cons of Procedural Programing

The basic structure of an english sentence is subject + verb. Subject perform action. Suppose, we want to print details of student. Using the procedural paradigm we might call a function like this
```
print(string name, int age, string gender){
    system.out(name);
    system.out(age);
    system.out(gender);
}
```
In the procedural paradigm, there is a way to combine a set of attributes using something called struct/structure. To create a struct
```
struct Student{
    String name;
    int age;
    String gender;
}
```
A struct has no methods. All the variables in a struct are visible to anyone else. They are not private.

Now we can rewrite the print function as
```
printStudent(Student student){
    system.out(student.name);
    system.out(student.age);
    system.out(student.gender);
}
```
In this case the subject can be considered to be the student and the action can be considered to be printStudent. In procedural paradigm, we see that something is happening to someone. Action is being performed on entity. In real life, entity performs action. In this case it is difference between printStudent(student) vs. student.print(). In the first case, the printStudent method is performing an action on student, whereas in the second, the student is performing the action print.

In procedural programming, everything about an entity is public. What is the problem with this? In the procedural world, there is a controller who makes entities perform actions. The controller has access to all information of entities. So controller can play around in any way with entity's attributes. If by any chance a controller changes the values of some of the entity's attributes, it would be difficult to debug.

Object-oriented programming says that a software system should consist of entities. Each entity controls its attributes and also has a defined behaviour. What would the entity student look like here?
```
class Student{
    String name;
    int age;
    String gender;

    void print(){
        system.out(name);
    }
}
```
As you can see, student is in control of its behaviour. 

To summarize, the cons of procedural programming are:

1. It will be difficult to make sense of a complex system. This is because any action that can be taken on entity will be at difference locations. In contrast, every action that student will perform will be in the class itself.

2. Understandability is difficult.
3. Difficult to debug.
4. Spaghetti code. This means parts of the code relating to an entity are lying in different parts of the filesystem.


### Object Oriented Programming

Principle: Abstraction

Pillars: Inheritance, Encapsulation, Polymorphism

#### What is Abstraction?

The quality of dealing with ideas and not events. It means representing an entity in terms of ideas. In the software world, anything that has attributes (information) or associated behaviour is an idea.

Taking the example of an education web app, we will need to represent students, instructors, classroom, batch, assignment, questions etc. Student has information and also associated behaviours. Student has information like name, university attended etc. Student also has behaviours like attending a class, sending messages, taking exam etc.

An idea can either be a real entity associated with a system or it can be a concept. When you represent something as an idea, others do not need to know the details of these ideas. Consider a car. When we think of a car as a driver, we think of steering wheel etc. Steering wheel has one behaviour that we care about as a driver. That it can turn.  We do not care about how this is achieved. 

Others do not need to know about the detail of implementation of ideas.

#### Encapsulation

Encapsulation is a pillar that helps us achieve abstraction. Encapsulation allows us to store attributes and behaviours of an idea together in a single place. What is this place? It is a class.

There is another benefit to encapsulation. It helps us protect the attributes and behaviours from illegitimate access of other classes. 

#### Terms of OOP

**Class** - Blueprint of an idea. Let's take the idea of a student that we saw earlier. Let's explore some of a student's attributes and ideas.

```
class Student{
    int age;
    String name;
    String batch;
    double psp;
    changeBatch();
    pauseCourse();
    giveMockInterview();
}
```

Class is not a real thing yet. It does not take any space in memory. It is a blueprint that we use to create multiple instances of this class. What are these instances called? Objects.

**Object** - Real instance of the class. Objects will occupy memory. Each object is different from each other. 

```
class Main {
    void main(){
        Student naman = new Student();
        naman.name = "Naman";
        naman.age = 25;
        naman.psp = 0.0;

        Student dinesh = new Student();
        dinesh.name = "Dinesh";
        dinesh.age = 20;
        dinesh.psp = 100.0;
    }
}
```
Two objects of class Student, naman and dinesh, have been instantiated. They occupy space in the memory and are distinct from each other.

**Access Modifiers** - We saw earlier that one of the benefits of encapsulation is that it protects the members from illegitimate access. How is this done? Using access modifiers. 

There are 4 access modifiers:

1. Public

If an attribute or a method has the access modifier public, then anyone outside the class can access thiis attribute or method.

2. Private

This is the exact opposite of access modifier public. It is only accessible within its own class. No one can access it, including the child class.

3. Protected

An attribute or method that has the access modifier protected can be accessed only from anything that is in the same package.

4. Default


            Class   |   Package     | Subclass/child | Subclass/child |   World
                                        (same pkg)        (diff pkg)

private       +            -                -                 -             -

default       +            +                +                 -             - 

protected     +            +                +                 +             -

public        +            +                +                 +             +


**Constructors** - To instantiate an object of a class we run the following
```
Student st = new Student();
```
Student is the datatype. st is the variable name. new Student() is the constructor. To be more specific, this is the default constructor. When we dont create our own constructor in the class, a default constructor is created. This creates a new object of the class and sets the value of each attribute as the default value of that type. 

The constructor code looks like this
```
Student(){
    name = null;
    age = 0;
    psp = 0.0;
    universityName = null;
}
```
This code is generated automatically in case the default constructor is called. 

The constructor looks similar to a method. Default constructor does not take any parameters. It sets every attribute of the class to the default value of the attribute's datatype unless we have already specified a default value. The constructor access modifier is public. The name of the constructor is the name of the class. There is no return type in the constructor. 

Suppose we write our own constructor
```
class Student{
    private int age;
    String name;
    String univName;
    double psp;
    boolean isPlaced;

    public Student(String studentName, String universityName) {
        name = studentName;
        univName = universityName;
    }
}
```
Let us now create a client class.
```
class Client {
    public static void main(String[] args){
        // Student st = new Student(); This will throw an error
        Student st = new Student(studentName: "Naman", universityName: "ABC");
    }
}
```
Let us run this and look at the values that the attributes of these objects take. When a custom constructor is called, all the values of the attributes are initialized to the default value of the corresponding datatype. Then it will start executing the code inside the constructor. The default constructor is not called or created. 

If we set the contructor's access modifier to private, then it is not possible to create an object of the class because neither can the constructor be called from outside the class, nor will a default constructor be created because of the presence of a parametrized constructor.

We can have multiple constructors in the class each parameterized by a different value.

Suppose we want to create a new object that takes the exact values as an older object.

```
class Student{
    private int age = 21;
    String name;
    String univName;
    double psp;
    boolean isPlaced;
    
    public Student(String studentName, String universityName) {
        name = studentName;
        univName = universityName;
    }

    public Student(Student old) {
        name = old.name;
        age = old.age;
        univName = old.univName;
        psp = old.psp;
        isPlaced = old.isPlaced;
    }
}
```
The client code will look like
```
class Client {
    public static void main(String[] args){
        Student st1 = new Student(studentName: "Naman", universityName: "LFG");
        st1.psp = 100.0;
        st1.isPlaced = false;

        Student st2 = new Student(st1);
    }
}
```
Instead of the above, if we run
```
Student st2 = st1;
```
st2 is not a new object as we did not call a constructor. st2 is just a variable pointing to st1.
So if we run
```
st2.name = "Aman"
```
then st1.name will also become Aman.

If we create st2 using the copy constructor, then st2 and st1 will occupy different memory address. 
So, if we run
```
st2.name = "Aman"
```
then st1.name will remain "Naman".

There are 2 types of data in Java.

1. Primitive Types - Integers, double, float etc. 

2. Objects - These are stored in memory. Variable stores the address of object. When we create
```
Student st = new Student();
```
it creates a new object in memory. st stores the address of the object. The name in st is also an object datatype as it is a string. So, java creates an object with value "Naman" in memory and the address to this object will be stored in st.name. In contract st.age will store the value itself in the memory occupied by the object.

In a copy constructor, we create a new object. st2 will be at a different memory location than st1. 

![Java Memory](images/UntitledDiagram.drawio.png)

The above is a Java memory heap. We have two objects that are occupying addresses 1721 and 4741. The name attribute of each object is pointing to the string object at 2141. If we run
```
st2.name = "Hello"
```
Then an object with string "Hello" is created at 41. The name attribute of st2 now starts pointing to address 41. So, the name attribute of st1 will not change. 

Assume strings are mutable in Java, and assume we run the following code instead of the one above.
```
st2.name.add("123")
```
This will go to memory address 2141 and add "123" to "Kiran". This will not create a new object. Now, after making the change, the name attribute of st1 will also change from the previous "Kiran" to "Kiran123".

Even though we created a new object, behind the scenes, the new object still refers to a few attributes of the old object. This means the new and old object still share some data. This means both are not completely seperated. This means we performed a shallow copy. As opposed to shallow copy, deep copy means no attribute will have shared data. 

In Java, it is practically difficult to create a deep copy. Consider a student object that has a list of classes. Assume every class has a name and instructor. Lets look at the memory heap.

![Java Memory](images/JavaMemoryListClasses.png)

There are many pointers as all of the data in the memory are of the type object. Hence, to make a deep copy, we will have recursively make a copy of every object and create a new object. This practically very difficult.

```
doSomething(Student st) {
    st.name = "Naman";
}

st1 = new Student();
doSomething(st1);
```
When we run the above code, st1.name will become "Naman". As Java is pass by value, the value that is passed as argument is the address of the object that is stored in st1. So when wwe run st.name = "Naman", we go to the address and change the name attribute in the object. 

However, consider the following function.
```
doSomething(Student st) {
    st = new Student();
}
st1 = new Student();
doSomething(st1);
```
In this case, assigning a new object to st in the function doSomething does not change the object stored in st1. The variable st gets a new object without changing the value of st1. If Java supported pass-by-reference, then running the above code will change st1 to the same new object created and stored in st. This is because pass-by-reference is actually passing a reflection of the argument. Pass-by-value is passing the value of the argument to a new variable created in the parameter of the function.


**Destructor** - Once, work is done with an object, in languages like Java and Python, garbage collector removes these objects. In languages like C++, which are languages that use pointers, we have to use destructors to free up memory occupied by objects that are not in use anymore. 


#### Inheritance

Object oriented programming is based on thinking about software systems in the same way as we think about the real world. We form hierarchy/relations betweeen different entities inorder to understand them. In the same way, object oriented programming also allows us to form hierachies of categorization.

![Animal Representation](images/AnimalRep.png)

Consider the above categorization. If animals can walk, then does that mean a lab can walk? Yes. Lab is a dog is a mammal is an animal that can walk.

This kind of hierarchy of representation allows us to share behaviours and attributes with specific categories.

Representation of hierarchy in classes is known as inheritance. This takes the form of parent/child relationship between different classes.

Consider the example of scaler platform. A user of the platform can have a hierarchy. 

![Scaler User Representation](images/ScalerUserRep.png)

If a user can login(), then all the user's children can also login. Each child of user will share all the members (attributes and methods) of user class. A child class can have its own attributes and methods as well. Parent class can also be called a super class and a child class can also be called a subclass.

Child classes inherit all the members of the parent classes and may or may not add their own members to them.

```
class User {
    String username;
    void login() {
        system.out("Logging in...");
    }
}

class Instructor extends User {
    String batchName;
    double avgRating;
    void scheduleClass(){
        system.out("Scheduling class...");
    }
}
```

Parent class is a generalization. Child class is a specification.

![Parent Child Representation](images/HighestLevelAbst.png)

Which of these classes has the highest level of abstraction? 

The answer is class A. Abstraction means an idea. Highest level of abstraction means a relatively generalized idea. The least specific class amongst all the classes is class A. 

When an object of the child class is instantiated, it also contains the attributes of the parent class. How are the attributes of the parent class initialized?

There are 2 options.

1. We know how to initialize them. So we can define them in the child class constructor.
```
class User {
    String name;
    String email;
    String password;

    void login() {
        system.out("Logging in...");
    }
}

class Instructor extends User{
    String batch;
    
    public void Instructor() {
        name = "a";
        email = "email@email.com";
        password = "password";
    }
}
```
We might not always know how to initialize the attributes of the parent class. An example would be if the parent class is from a third party library.

2. The constructor of the parent definitely knows how to initialize its attributes. 

![Parent Child Representation](images/ParentChildConst.png)

Suppose we run
```
D d = new D();
```
a. The constructor of D will be called.
b. Before the constructor of D executes, it will call the constructor of C.
c. Before the constructor of C executes, it will call the constructor of B. 
d. Before the constructor of B executes, it will call the constructor of A.

So the execution of the constructor of A completes first, then the one of B completes, then the one of C completes and then the one of D completes.

This example assumes we are calling default constructors. If we want to call a specific constructor we have to use super().
```
class A {
    A() {
        System.out.println("Constructor of A");
    }
}

class B {
    B() {
        System.out.println("Constructor of B");
    }
}

class C {
    C() {
        System.out.println("Constructor of C");
    }

    C(String c){
        System.out.println("Constructor of C with param");
    }
}

class D {
    D() {
        super(c:"Hello");
        System.out.println("Constructor of D");
    }
}
```
The first line of the constructor of D should be super(c:"Hello"). If it is the second line, it will throw an error.
super() -> super can be thought of as the name of the class. So super() is calling the constructor of the class. So, if we dont pass argument in super(), then it calls the default constructor.

#### Polymorphism

