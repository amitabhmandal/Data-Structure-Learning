package arrays.learning;

import java.lang.reflect.Type;
import java.util.Arrays;

/* +++++++++++++++++++++++++++++++++
 * What is an Array
 * +++++++++++++++++++++++++++++++++
 * It is a collection of elements /values each identified by an array index or key
 * 
 * ++++++++++
 * properties
 * ++++++++++
 * Because of the indexes random access is possible
 * 
 * Multi dimensional arrays is possible which can be used for mathematical computation
 * such as matrices
 * 
 * 
 * We are able to store data of the same type.
 * Child[] child1 = new Child[5]; 
 * child1[0] = new Child(); // allowed
 * child1[1] = new Parent();// not allowed
 * 
 * Since arrays are objects in Java, we can find their length using member length.
 * 
 * A Java array variable can also be declared like other variables with
 *  [] after the data type.
 *  
 * The variables in the array are ordered and each have an index beginning from 0.
 * 
 * 
 * Java array can be also be used as a static field, a local variable or a method parameter.
 * 
 * The size of an array must be specified by an int value and not long or short.
 * 
 * The direct superclass of an array type is Object.
 * 
 * 
 * Every array type implements the interfaces Cloneable and java.io.Serializable.
 * 
 * The elements in the array allocated by new will automatically be initialized 
 * to zero (for numeric types), false (for boolean), or null (for reference types).
 * 
 * 
 * Obtaining an array is a two-step process. First, you must declare a variable of 
 * the desired array type. Second, you must allocate the memory that will hold the 
 * array, using new, and assign it to the array variable. 
 * Thus, in Java all arrays are dynamically allocated.
 * 
 * 
 * Every array type implements the interfaces Cloneable and java.io.Serializable
 * A clone on an array just copies the array (shallow copy, not cloning the contents).
 * 
 * 
 * The following array declarations do not create arrays Objects
 * int[] ai; // array of int
 * short[][] as; // array of array of short
 * 
 * short s, // scalar short
 * aas[][]; // array of array of short
 * 
 * Object[] ao, // array of Object
 * 
 * Collection<?>[] ca; // array of Collection of unknown type
 * 
 * The following are examples of declarations of array variables that do create array objects:
 * 
 * Exception ae[] = new Exception[3];
 * Object aao[][] = new Exception[2][3];
 * int[] factorial = { 1, 1, 2, 6, 24, 120, 720, 5040 };
 * 
 * Once an array object is created, its length never changes. To make an array variable
 * refer to an array of different length, a reference to a different array must be assigned
 * to the variable
 * 
 * 
 * Arrays must be indexed by int values; short, byte, or char values may also
 * be used as index values because they are subjected to unary numeric promotion
 * and become int values.
 * 
 * An attempt to access an array component with a long index value results in a
 * compile-time error.
 * 
 * All array accesses are checked at run time; an attempt to use an index that
 * is less than zero or greater than or equal to the length of the array causes an
 * ArrayIndexOutOfBoundsException to be thrown.
 * 
 * For an array whose type is A[], where A is a reference type, an assignment to
 * a component of the array is checked at run time to ensure that the value being
 * assigned is assignable to the component.
 * If the type of the value being assigned is not assignment-compatible  with
 * the component type, an ArrayStoreException is thrown.
 * 
 * The length of the array to be constructed is equal to the number of variable
 * initializers immediately enclosed by the braces of the array initializer
 * 
 * Space is allocated for a new array of that length. If there is insufficient 
 * space to allocate the array, evaluation of the array initializer completes 
 * abruptly by throwing an OutOfMemoryError.
 * 
 * 
 * The members of an array type are all of the following:
 * 
 * #1
 * The fact that subarrays are shared when a multidimensional array is cloned is shown by
 * this program:
 * 
 * #2
 * The public final field length, which contains the number of components of
 * the array. length may be positive or zero.
 * 
 * #3
 * The public method clone, which overrides the method of the same name in
 * class Object and throws no checked exceptions. The return type of the clone
 * method of an array type T[] is T[].
 * 
 * #4
 * A clone of a multidimensional array is shallow, which is to say that it creates
 * only a single new array. Subarrays are shared.
 * 
 * #5
 * All the members inherited from class Object; the only method of Object that is
 * not inherited is its clone method.
 * 
 * concept about cloning
 * java.util.Arrays is a class containing utilities that operate on Java arrays, and is 
 * not to be confused with arrays themselves.

An array is a container object that holds a fixed number of values of a single type. 
They are a special type of Object defined explicitly in the Java language. All Java arrays 
implement java.lang.Cloneable and java.io.Serializable.

java.util.Arrays, on the other hand, does not implement these interfaces, and only 
provides static methods that implement common functions performed on arrays.

When you clone a single dimensional array, such as Object[], a "deep copy" is 
performed with the new array containing copies of the original array's elements as 
opposed to references.

A clone of a multidimensional array (like Object[][]) is a "shallow copy" however, 
which is to say that it creates only a single new array with each element array a 
reference to an original element array.
 * 
 * An Array of Characters is Not a String
 * In the Java programming language, unlike C, an array of char is not a String,
 * and neither a String nor an array of char is terminated by '\u0000' (the NUL
 * character).
 * A String object is immutable, that is, its contents never change, while an array of
 * char has mutable elements
 * 
 * 
 * 
 * Because arrays cannot be extended as normal objects. 
 * The only way to make an array Cloneable was to implement Cloneable interface 
 * from the start. For the same reason an array implements by default Serializable.
 * 
 * An array is implemented as an instance of a dynamically created class by the JVM. 
 * That class has a special name and it implements the Cloneable and Serializable 
 * interfaces as noted by other posters above. (It also has a public final field named length...).
 * 
 * That class also has a concrete and public implementation of the protected Object.clone() 
 * method. Java allows the access level of a method (public, private, protected & the default
 *  package-protected access levels) to be made less restrictive when that method is 
 *  overridden. In other words, a protected method can be made public in a subclass and 
 *  that is what the JVM does with the protected clone() method for the array class
 *   implementation.
 *   
 *   
 * Why doesn't Collection extend Cloneable and Serializable?
 * Collection is an interface that specifies a group of objects known as elements. 
 * The details of how the group of elements is maintained is left up to the concrete 
 * implementations of Collection. For example, some Collection implementations like List 
 * allow duplicate elements whereas other implementations like Set don't.
 *  A lot of the Collection implementations have a public clone method. However, 
 *  it does't really make sense to include it in all implementations of Collection. 
 *  This is because Collection is an abstract representation. What matters is the 
 *  implementation. The semantics and the implications of either cloning or serializing
 *   come into play when dealing with the actual implementation; that is, the concrete 
 *   implementation should decide how it should be cloned or serialized, or even if it 
 *   can be cloned or serialized. In some cases, depending on what the actual 
 *   backing-implementation is, cloning and serialization may not make much sense. 
 *   So mandating cloning and serialization in all implementations is actually 
 *   less flexible and more restrictive. The specific implementation should make 
 *   the decision as to whether it can be cloned or serialized.  
 * 
 * Many Collection implementations (including all of the ones provided by the JDK) 
 * will have a public clone method, but it would be mistake to require it of all Collections. 
 * For example, what does it mean to clone a Collection that's backed by a terabyte 
 * SQL database? Should the method call cause the company to requisition a new disk 
 * farm? Similar arguments hold for serializable.

If the client doesn't know the actual type of a Collection, it's much more flexible and 
less error prone to have the client decide what type of Collection is desired, 
create an empty Collection of this type, and use the addAll method to copy the 
elements of the original collection into the new one
 * 
 * ============
 * Applications
 * ============
 * Lookup Tables
 * Hashtables
 * Heaps
 * 
 * ==========
 * Advantages
 * ==========
 * 
 * 
 * 
class [I
class java.lang.Object
class [B
class [S
class [Ljava.lang.String;
 * The string “[I” is the run-time type signature for the class object 
 * “array with component type int“.
 * 
 * The only direct superclass of any array type is java.lang.Object.
 * 
 * The string “[B” is the run-time type signature for the class object 
 * “array with component type byte“.
 * 
 * The string “[S” is the run-time type signature for the class object “
 * array with component type short“.
 * 
 * The string “[L” is the run-time type signature for the class object
 *  “array with component type of a Class”. The Class name is then followed.
 * 
 * 
 * 
 * 
 */

class Parent {
};

class Child extends Parent {
};

public class ArraysLearning {

    public static void main(String[] args) {
        float[][] f[][], g[][][], h[];

        float[][] x[][][];

        Parent[] parent = new Parent[5];
        parent[0] = new Child();
        parent[1] = new Parent();

        Child[] child1 = new Child[5];
        child1[0] = new Child();

        // Following is not allowed and leads to compilation error
        // child1[1] = new Parent();
        Object[] s = new Integer[4];
        // s[0] = 4.4;

        int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];

        // array of Strings
        String[] strArray = new String[3];

        System.out.println(intArray.getClass());

        // This shows by default arrays inherit from object class implicitly
        System.out.println(intArray.getClass()
            .getSuperclass());
        System.out.println(intArray.getClass()
            .getInterfaces()
            .toString());

        // This shows arrays implement cloneable and serializable interfaces implicitly
        Type[] interfaces = intArray.getClass()
            .getInterfaces();
        System.out.println(interfaces[0]);
        System.out.println(interfaces[1]);

        System.out.println(byteArray.getClass());
        System.out.println(shortsArray.getClass());
        System.out.println(strArray.getClass());

        // example of arraystoreexception

        ColoredPoint[] cpa = new ColoredPoint[10];
        Point[] pa = cpa;
        System.out.println(pa[1] == null);
        try {
            // pa[0] = new Point();

        } catch (ArrayStoreException e) {
            System.out.println(e);
        }

        ArrayCloneableTest.arrayCloneTest();
        SharedSubarraysAfterClone.shareSubArrayAfterClone();

        JaggedArray.jaggedArrayDemo1();
        JaggedArray.jaggedArrayDemo2();

        // So a final array means that the array variable which is actually a
        // reference to an object,
        // cannot be changed to refer to anything else, but the members of array can be
        // modified.

        FinalArraysChangeValues.finalArraysChangeValuesDemo();
        FinalArraysChangeValues.checkingFinalObjectValuesCanBeChanged();

        // Array Comparison
        ArrayEqualComparison.checkingThroughArraysEquals();
        ArrayEqualComparison.checkingThroughArraysEqualsForMultiDimensionNotWorking();
        ArrayEqualComparison.checkingThroughArraysEqualsForMultiDimensionWorking();
        ArrayEqualComparison.checkingThroughDoubleEqualOperator();

        // Demo default values
        DefaultArrayValues.demoDefaultValues();

    }

}

class ArrayEqualComparison {

    // In the above program, arr1 and arr2 are two references to two different objects.
    // So when we compare arr1 and arr2, two reference variables are compared,
    // therefore we get the output as “Not Same”
    public static void checkingThroughDoubleEqualOperator() {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 1, 2, 3 };
        if (arr1 == arr2) // Same as arr1.equals(arr2)
            System.out.println("Same");
        else
            System.out.println("Not same");
    }

    // This is checking through single dimension arrays
    public static void checkingThroughArraysEquals() {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 1, 2, 3 };
        if (Arrays.equals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }

    public static void checkingThroughArraysEqualsForMultiDimensionNotWorking() {

        // inarr1 and inarr2 have same values
        int inarr1[] = { 1, 2, 3 };
        int inarr2[] = { 1, 2, 3 };
        Object[] arr1 = { inarr1 }; // arr1 contains only one element
        Object[] arr2 = { inarr2 }; // arr2 also contains only one element
        if (Arrays.equals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }

    public static void checkingThroughArraysEqualsForMultiDimensionWorking() {

        int inarr1[] = { 1, 2, 3 };
        int inarr2[] = { 1, 2, 3 };
        Object[] arr1 = { inarr1 }; // arr1 contains only one element
        Object[] arr2 = { inarr2 }; // arr2 also contains only one element
        if (Arrays.deepEquals(arr1, arr2))
            System.out.println("Same");
        else
            System.out.println("Not same");
    }

    // How does deep equals work
    /*
    Use the reference below to include DeepEquals and a few other powerful utilities in your project. <dependency> <groupId>com.cedarsoftware</groupId> <artifactId>java-util</artifactId> <version>1.8.0</version> </dependency>
    
    Use DeepEquals.deepEquals(a, b) to compare two Java objects for semantic equality. This will compare the objects using any custom equals() methods they may have (if they have an equals() method implemented other than Object.equals()). If not, this method will then proceed to compare the objects field by field, recursively. As each field is encountered, it will attempt to use the derived equals() if it exists, otherwise it will continue to recurse further.
    
    This method will work on a cyclic Object graph like this: A->B->C->A. It has cycle detection so ANY two objects can be compared, and it will never enter into an endless loop.
    
    Use DeepEquals.hashCode(obj) to compute a hashCode() for any object. Like deepEquals(), it will attempt to call the hashCode() method if a custom hashCode() method (below Object.hashCode()) is implemented, otherwise it will compute the hashCode field by field, recursively (Deep). Also like deepEquals(), this method will handle Object graphs with cycles. For example, A->B->C->A. In this case, hashCode(A) == hashCode(B) == hashCode(C). DeepEquals.deepHashCode() has cycle detection and therefore will work on ANY object graph.
    
    When would you use it?
    
    If you had two 'Person' objects (person1, person2) with firstName, lastName, with the same values for these fields, yet the actual Person instance was different, and this Person object did not have a custom equals() or hashCode() method on it, then calling person1.equals(person2) will return false, because it will default to Object.equals() which relies on the storage location of the object (identity hash). In most cases, you would rather these objects be considered equals. In these cases, calling DeepEquals.deepEquals(person1, person2) will return true. This allows you to properly handle (essentially fix) objects that do not have equals() and hashCode() methods implemented on them.     
     */
}

class DefaultArrayValues {
    public static void demoDefaultValues() {
        System.out.println("String array default values:");
        String str[] = new String[5];
        for (String s : str)
            System.out.print(s + " ");

        System.out.println("\n\nInteger array default values:");
        int num[] = new int[5];
        for (int val : num)
            System.out.print(val + " ");

        System.out.println("\n\nDouble array default values:");
        double dnum[] = new double[5];
        for (double val : dnum)
            System.out.print(val + " ");

        System.out.println("\n\nBoolean array default values:");
        boolean bnum[] = new boolean[5];
        for (boolean val : bnum)
            System.out.print(val + " ");

        System.out.println("\n\nReference Array default values:");
        DefaultArrayValues ademo[] = new DefaultArrayValues[5];
        for (DefaultArrayValues val : ademo)
            System.out.print(val + " ");
    }
}

class ForEachConcept {
    // Limitations of for-each loop

    // For-each loops are not appropriate when you want to modify the array:

    /*
    for (int num : marks) 
    {
        // only changes num, not the array element
        num = num*2; 
    }
    */

    // For-each loops do not keep track of index. So we can not obtain array index
    // using For-Each loop

    /*
    for(int num:numbers)
    { 
        if (num == target) 
        {
            return ???;   // do not know the index of num
        }
    */

    // For-each only iterates forward over the array in single steps

    // cannot be converted to a for-each loop
    /*
    for (int i=numbers.length-1; i>0; i--) 
    {
          System.out.println(numbers[i]);
    }*/

    // For-each cannot process two decision making statements at once
    /*
     
     // cannot be easily converted to a for-each loop 
    for (int i=0; i<numbers.length; i++) 
    {
    if (numbers[i] == arr[i]) 
    { ...
    } 
    }
     
     */

    public static void main(String[] arg) {
        {
            int[] marks = { 125, 132, 95, 116, 110 };

            int highest_marks = maximum(marks);
            System.out.println("The highest score is " + highest_marks);
        }
    }

    public static int maximum(int[] numbers) {
        int maxSoFar = numbers[0];

        // for each loop
        for (int num : numbers) {
            if (num > maxSoFar) {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }

}

class Point {
    int x, y;
}

class ColoredPoint extends Point {
    int color;
}

class ArrayCloneableTest {

    public static void arrayCloneTest() {
        int ia1[] = { 1, 2 };
        int ia2[] = ia1.clone();
        System.out.print((ia1 == ia2) + " ");
        ia1[1]++;
        System.out.println(ia2[1]);
        // showing that the components of the arrays referenced by ia1 and ia2 are different
        // variables
        System.out.println("int ia1[] " + Arrays.toString(ia1));
        System.out.println("int ia2[] " + Arrays.toString(ia2));

        System.out.println("HashCode ia1[]  " + ia1);
        System.out.println("HashCode ia2[] " + ia2);
        // HashCode ia1[] [I@5c647e05
        // HashCode ia2[] [I@33909752
    }

}

class SharedSubarraysAfterClone {

    public static void shareSubArrayAfterClone() {
        int ia[][] = { { 1, 2 }, null };
        int ja[][] = ia.clone();
        System.out.println("HashCode ia[][]  " + ia);
        // HashCode ia[][] [[I@55f96302

        System.out.println("HashCode ja[][] " + ja);
        // HashCode ja[][] [[I@3d4eac69

        System.out.println("HashCode ia[0]" + ia[0]);
        // HashCode ia[0][I@42a57993

        System.out.println("HashCode ja[0]" + ja[0]);
        // HashCode ja[0][I@42a57993

        System.out.print("(ia == ja) = " + (ia == ja) + " ");
        System.out.println(ia[0] == ja[0] && ia[1] == ja[1]);
        System.out.println("ia[][]  " + Arrays.deepToString(ia));
        System.out.println("ja[][] " + Arrays.deepToString(ja));
    }

}

class JaggedArray {
    public static void jaggedArrayDemo1() {
        int arr[][] = new int[2][];

        // Making the above array Jagged

        // First row has 3 columns
        arr[0] = new int[3];

        // Second row has 2 columns
        arr[1] = new int[2];

        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;

        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

    }

    public static void jaggedArrayDemo2() {
        int r = 5;

        // Declaring 2-D array with 5 rows
        int arr[][] = new int[r][];

        // Creating a 2D array such that first row
        // has 1 element, second row has two
        // elements and so on.
        for (int i = 0; i < arr.length; i++)
            arr[i] = new int[i + 1];

        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;

        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

    }
}

class FinalArraysChangeValues {
    int p = 20;

    public static void finalArraysChangeValuesDemo() {
        final int arr[] = { 1, 2, 3, 4, 5 }; // Note: arr is final
        System.out.println("Before Change: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 10;
            System.out.println(arr[i]);
        }
        System.out.println("After Change: " + Arrays.toString(arr));
    }

    public static void checkingFinalObjectValuesCanBeChanged() {
        final FinalArraysChangeValues t = new FinalArraysChangeValues();
        t.p = 30;
        System.out.println(t.p);
    }

    public static void checkingFinalObjectReferencesCannotBeChanged() {
        final FinalArraysChangeValues t = new FinalArraysChangeValues();
        FinalArraysChangeValues t1 = new FinalArraysChangeValues();
        // t = t1;
        // cannot assign a value to final variable t
        // t = t1;
        t.p = 30;
        System.out.println(t.p);
    }
}
