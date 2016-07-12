# EffectiveJavaNotes

1. Consider static factory methods instead of constructors
    1. Advantages: 
        1. One advantage of static factory methods is that, unlike constructors, they have names.
        2. A second advantage of static factory methods is that, unlike constructors, they are not required to create a new object each time they're invoked.
        3. A third advantage of static factory methods is that, unlike constructors, they can return an object of any subtype of their return type.
        4. A fourth advantage of static factory methods is that they reduce the verbosity of creating parameterized type instances.
    2. Disadvantages:
        1. The main disadvantage of providing only static factory methods is that classes without public or protected constructors cannot be subclassed.
        2. A second disadvantage of static factory methods is that they are not readily distinguishable from other static methods.
3. Consider a builder when faced with many constructor parameters
    1. Telescoping constructor
        1. It is hard to write client code when there are many parameters, and harder still to read it.
    2. JavaBean constructor
        1. It may be in an inconsistent state partway through its construction.
        2. It precludes the possibility of making a class immutable
    3. Builder constructor
        1. It simulates named optional parameters as found in Ada and Python.
        2. It is a good choice when designing classes whose constructors or static factories would have more than a handful of parameters, especially if most of those parameters are optional.
           
    
    
    
    
    
    
    
*Acknoledgement: Bloch, Joshua (2008-05-08). Effective Java (Java Series). Pearson Education. Kindle Edition.* 