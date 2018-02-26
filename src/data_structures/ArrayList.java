package data_structures;

public class ArrayList {

  private int fillIndex;            // indicates push index, post decrements in add
  private int lastAvailableIndex;
  private int[] array;

  public ArrayList() { this(2); }

  public ArrayList(int capacity) {
    this.lastAvailableIndex = capacity - 1;
    this.fillIndex = 0;
    this.array = new int[capacity];
  }

  public void add(int element) {
    if (fillIndex == lastAvailableIndex) 
      grow();
    array[fillIndex++] = element;
  }

  public void grow() {
    int[] biggerArray = new int[(lastAvailableIndex+1)*2];
    for (int i = 0; i < lastAvailableIndex; i++)
      biggerArray[i] = array[i];
    array = biggerArray;
    lastAvailableIndex = (lastAvailableIndex + 1)*2 - 1;
  }

  public void removeElement(int element) {
    int index = -1;
    for (int i = 0; i < fillIndex; i++) 
      if (array[i] == element) {
        index = i;
        break;
      }
    if (index == -1) return;
    shiftDown(index + 1);
    fillIndex--;
  }

  public void remove(int index) {
    if (index >= fillIndex) return;
    shiftDown(index);
    fillIndex--;
  }

  /**
    Shifts all elements between lowerIndex & upperIndex to one index lower
    @param lowerIndex, a positive integer (inclusive)
    @param upperIndex, a positive integer (exclusive)
  */
  private void shiftDown(int lowerIndex) {
    for (int i = lowerIndex; i < fillIndex - 1; i++) 
      array[i] = array[i+1];
  }

  public void add(int index, int element) {
    if (index > fillIndex)
      return;
    if (fillIndex >= lastAvailableIndex)
      grow();
    shiftUp(index);
    array[index] = element;
    fillIndex++;
  }

  private void shiftUp(int index) {
    for (int i = fillIndex; i > index; i--) 
      array[i] = array[i-1];
  }

  public boolean contains(int element) {
    for (int i = 0; i < fillIndex; i++)
      if (array[i] == element)
        return true;
    return false;
  }

  public boolean isEmpty() {
    return fillIndex == 0;
  }

  public int size() {
    return fillIndex;
  }

  public int get(int index) {
    if (index < fillIndex ) 
      return array[index];
    else
      return -1;
  }
  
  public int indexOf(int element) {
    for (int i = 0; i < fillIndex; i++) 
      if (array[i] == element)
        return i;
    return -1;
  }

  public String toString() {
	  String s = "";
	  for (int i = 0; i < fillIndex; i++) 
		  s = s + " " + array[i];
	  return s;
  }
  
}
