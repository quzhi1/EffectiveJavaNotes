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
    
    
    
    
    
    
    
    
*Acknoledgement: Bloch, Joshua (2008-05-08). Effective Java (Java Series). Pearson Education. Kindle Edition.* 