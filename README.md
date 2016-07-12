# EffectiveJavaNotes

## Chapter 1: Object


1. Consider static factory methods instead of constructors
    1. Advantages: 
        1. One advantage of static factory methods is that, unlike constructors, they have names.
        2. A second advantage of static factory methods is that, unlike constructors, they are not required to create a new object each time they're invoked.
        3. A third advantage of static factory methods is that, unlike constructors, they can return an object of any subtype of their return type.
        4. A fourth advantage of static factory methods is that they reduce the verbosity of creating parameterized type instances.
    2. Disadvantages:
        1. The main disadvantage of providing only static factory methods is that classes without public or protected constructors cannot be subclassed.
        2. A second disadvantage of static factory methods is that they are not readily distinguishable from other static methods.
    <br />
    ![](src/main/resources/images/Panda-factory-GIF.gif)
    <br />
2. Consider a builder when faced with many constructor parameters
    1. Telescoping constructor
        1. It is hard to write client code when there are many parameters, and harder still to read it.
    2. JavaBean constructor
        1. It may be in an inconsistent state partway through its construction.
        2. It precludes the possibility of making a class immutable
    3. Builder constructor
        1. It simulates named optional parameters as found in Ada and Python.
        2. It is a good choice when designing classes whose constructors or static factories would have more than a handful of parameters, especially if most of those parameters are optional.
    <br />
    ![](src/main/resources/images/SCExplode.gif)
    <br />
3. Enforce the singleton property with a private constructor or an enum type
    <br />
    ![](src/main/resources/images/nyan_cat.gif)
    <br />
4. Enforce noninstantiability with a private constructor
    <br />
    ![](src/main/resources/images/Public-Private.jpg)
    <br />
5. Avoid creating unnecessary objects
    1. Prefer primitives to boxed primitives. (int better than Integer)
    2. Watch out for unintentional autoboxing. 
    <br />
    ![](src/main/resources/images/gummy_bears.jpg)
    <br />
6. Eliminate obsolete object references
    1. Whenever a class manages its own memory, the programmer should be alert for memory leaks.
    2. Another common source of memory leaks is caches. (Use WeakHashMap)
    3. A third common source of memory leaks is listeners and other callbacks. (Handler.removeCallbacksAndMessages(null);)
    <br />
    ![](src/main/resources/images/boba_fett.jpg)
    <br />
7. Avoid finalizers
    1. Finalizers are unpredictable, often dangerous, and generally unnecessary.
        1. There is no guarantee finalizers will be executed promptly
            Never do anything time-critical in a finalizer.
        2. Also, it provides no guarantee that finalizers will get executed at all.
            Never depend on a finalizer to update critical persistent state.
        3. If an uncaught exception is thrown during finalization: 
            1. The exception is ignored
            2. Finalization of that object terminates 
            3. It won't even print a warning
        4. There is a severe performance penalty for using finalizers.
    2. Solution:
        1. Provide an explicit termination method
        2. Require clients of the class to invoke this method on each instance when it is no longer needed
        3. The instance must keep track of whether it has been terminated
    3. Examples: FileInputStream, FileOutputStream, Timer, and Connection
    <br />
    ![](src/main/resources/images/Finalizer.jpg)
    <br />




*Acknoledgement: Bloch, Joshua (2008-05-08). Effective Java (Java Series). Pearson Education. Kindle Edition.* 