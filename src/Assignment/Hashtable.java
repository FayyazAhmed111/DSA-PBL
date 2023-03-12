package Assignment;

class LinkedHashEntry {

    private int key;

    private int value;

    private LinkedHashEntry next;



    LinkedHashEntry(int key, int value) {

          this.key = key;

          this.value = value;

          this.next = null;

    }



    public int getValue() {

          return value;

    }



    public void setValue(int value) {

          this.value = value;

    }



    public int getKey() {

          return key;

    }



    public LinkedHashEntry getNext() {

          return next;

    }



    public void setNext(LinkedHashEntry next) {

          this.next = next;

    }

}

public class Hashtable {

      private final static int TABLE_SIZE = 128;

 

      LinkedHashEntry[] table;

 

      Hashtable() {

            table = new LinkedHashEntry[TABLE_SIZE];

            for (int i = 0; i < TABLE_SIZE; i++)

                  table[i] = null;

      }

 

      public int get(int key) {

            int hash = (key % TABLE_SIZE);

            if (table[hash] == null)

                  return -1;

            else {

                  LinkedHashEntry entry = table[hash];

                  while (entry != null && entry.getKey() != key)

                        entry = entry.getNext();

                  if (entry == null)

                        return -1;

                  else

                        return entry.getValue();

            }

      }

 

      public void put(int key, int value) {

            int hash = (key % TABLE_SIZE);

            if (table[hash] == null)

                  table[hash] = new LinkedHashEntry(key, value);

            else {

                  LinkedHashEntry entry = table[hash];

                  while (entry.getNext() != null && entry.getKey() != key)

                        entry = entry.getNext();

                  if (entry.getKey() == key)

                        entry.setValue(value);

                  else

                        entry.setNext(new LinkedHashEntry(key, value));

            }

      }

 

      public void remove(int key) {

            int hash = (key % TABLE_SIZE);

            if (table[hash] != null) {

                  LinkedHashEntry prevEntry = null;

                  LinkedHashEntry entry = table[hash];

                  while (entry.getNext() != null && entry.getKey() != key) {

                        prevEntry = entry;

                        entry = entry.getNext();

                  }

                  if (entry.getKey() == key) {

                        if (prevEntry == null)

                             table[hash] = entry.getNext();

                        else

                             prevEntry.setNext(entry.getNext());

                  }

            }

      }

}