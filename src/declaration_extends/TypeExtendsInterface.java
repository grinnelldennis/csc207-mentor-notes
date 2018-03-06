package declaration_extends;
/**
 *  This file will illustrate the purpose of syntax
 *
 *    public class Something<T extends Interface<T>>
 *    e.g. ....... equals<T extends Comparable<T>>
 *
 *  where `extends` is the proper keyword used in the context in reference
 *  to the call to an interface for type checking, not implements.
 *
 */

public class TypeExtendsInterface{

/*
 *  <T extends Comparable<T>> serves as a contract that requires type T
 *   to necessarily extend Comparable so that we could use the method
 *   specified by the interface, in this case, compareTo()
 */
  public static <T extends Comparable<T>> T isBetter(T t1, T t2) {
    if (t1.compareTo(t2) > 0)
      return t1;
    return t2;
  }

  public static void main(String[] args){
	  Person pm = new Person(0);
    Person charlie = new Person(5);
    charlie.hasMoreFriendsThan(pm);

    // TODO: Write another private class that implements Comparable

  }
}
