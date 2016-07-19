# Effective Java Notes

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
   
8. Obey the general contract when overriding "equals"
    Only overiding "equals" when it is a "value class"
    1. Avoid overiding "equals" when:
        1. Each instance of the class is inherently unique
        2. You don't care whether the class provides a "logical equality" test.
        3. A superclass has already overridden equals, and the superclass behavior is appropriate for this class.
        4. The class is private or package-private, and you are certain that its equals method will never be invoked.
    2. Obey mathematical equivalency:
        1. Reflexivity: a=1
        2. Symmetry: a=b => b=a
        3. Transitivity: a=b, b=c => a=c
        4. Consistency: a=b forever
        5. Non-nullity: a!=null (No object should equal to null)
    3. There is no way to extend an instantiable class and add a value component while preserving the equals contract.
        1. Timestamp extends Date. It's a bad implementation. Don't use them together.
        2. you can add a value component to a subclass of an abstract class without violating the equals contract.
    4. The Liskov substitution principle says that any important property of a type should also hold for its subtypes, so that any method written for the type should work equally well on its subtypes
    5. A good equals method should:
        1. Use the == operator to check if the argument is a reference to this object.
        2. Use the instanceof operator to check if the argument has the correct type.
        3. Cast the argument to the correct type.
        4. For each "significant" field in the class, check if that field of the argument matches the corresponding field of this object.
        5. When you are finished writing your equals method, ask yourself three questions: Is it symmetric? Is it transitive? Is it consistent? (Write unit test for them)
        6. Always override hashCode when you override equals
    <br />
    ![](src/main/resources/images/contract.jpg)
    <br />
    
9. Always override hashCode when you override equals
    1. Equal objects must have equal hash codes. (Inequal object can have equal hash codes)
    2. How to compute hash code:
        1. Store some constant nonzero value, say, 17, in an int variable called result. 
        2. For each significant field f in your object (each field taken into account by the equals method, that is), do the following: 
            1. Compute an int hash code c for the field: 
                1. If the field is a boolean, compute (f ? 1 : 0). 
                2. If the field is a byte, char, short, or int, compute (int) f. 
                3. If the field is a long, compute (int) (f ^ (f > > > 32)). 
                4. If the field is a float, compute Float.floatToIntBits( f). 
                5. If the field is a double, compute Double.doubleToLongBits( f), and then hash the resulting long as in step 2. a.iii. 
                6. If the field is an object reference and this class's equals method compares the field by recursively invoking equals, recursively invoke hashCode on the field. If a more complex comparison is required, compute a "canonical representation" for this field and invoke hashCode on the canonical representation. If the value of the field is null, return 0 (or some other constant, but 0 is traditional). 
                7. If the field is an array, treat it as if each element were a separate field. That is, compute a hash code for each significant element by applying these rules recursively, and combine these values per step 2. b. If every element in an array field is significant, you can use one of the Arrays.hashCode methods added in release 1.5. 
            2. Combine the hash code c computed in step 2. a into result as follows: 
                result = 31 * result + c; 
        3. Return result.
        4. When you are finished writing the hashCode method, ask yourself whether equal instances have equal hash codes. Write unit tests to verify your intuition! If equal instances have unequal hash codes, figure out why and fix the problem.
    3. If the object is immutable, use lazy initialization.
    <br />
    ![](src/main/resources/images/fist.png)
    <br />
    
10. Always override toString
    
    
*Acknoledgement: Bloch, Joshua (2008-05-08). Effective Java (Java Series). Pearson Education. Kindle Edition.* 