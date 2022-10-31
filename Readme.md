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

![Java Memory](images/Untitles Diagram.drawio.png)