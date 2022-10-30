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

Class - Blueprint of an idea. Let's take the idea of a student that we saw earlier. Let's explore some of a student's attributes and ideas.

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

Object - Real instance of the class. Objects will occupy memory. Each object is different from each other. 