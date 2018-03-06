package declaration_extends;


class Person implements Comparable<Person>, Identifiable {
	
	public String name;
    public int numberOfFriends;

    public Person(int numberOfFriends) {
      this.numberOfFriends = numberOfFriends;
    }

    @Override
    public int compareTo(Person p) {
      // compareTo can compare (or not compare) anything really.
      // This class compare two people based on number of friends
    	return numberOfFriends - p.numberOfFriends;
    }
    
    public String getName() {
    	return name;
    }

    public boolean hasMoreFriendsThan(Person p){ return compareTo(p) > 0; }
  }
