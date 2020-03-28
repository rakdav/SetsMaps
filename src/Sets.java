import java.util.*;

class Person
{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class Sets
{
    public static void main(String[] args) {
       HashSet<String> states=new HashSet<>();
       states.add("Germany");
       states.add("France");
       states.add("Italy");
       System.out.println(states);
       states.add("Germany");
       System.out.println(states);
       System.out.println(states.size());
        for (String state:states) {
            System.out.println(state);

        }
        states.remove("Germany");
        System.out.println(states);
        HashSet<Person> peoples=new HashSet<>();
        peoples.add(new Person("Mike"));
        peoples.add(new Person("Tom"));
        peoples.add(new Person("Jerry"));
        for (Person p:peoples) {
            System.out.println(p.getName()+" "+p.hashCode());
        }
        SortedSet<String> sortedSet=new SortedSet<String>() {
            @Override
            public Comparator<? super String> comparator() {
                return null;
            }

            @Override
            public SortedSet<String> subSet(String fromElement, String toElement) {
                return null;
            }

            @Override
            public SortedSet<String> headSet(String toElement) {
                return null;
            }

            @Override
            public SortedSet<String> tailSet(String fromElement) {
                return null;
            }

            @Override
            public String first() {
                return null;
            }

            @Override
            public String last() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
       NavigableSet<String> set=new NavigableSet<String>() {
           @Override
           public String lower(String s) {
               return null;
           }

           @Override
           public String floor(String s) {
               return null;
           }

           @Override
           public String ceiling(String s) {
               return null;
           }

           @Override
           public String higher(String s) {
               return null;
           }

           @Override
           public String pollFirst() {
               return null;
           }

           @Override
           public String pollLast() {
               return null;
           }

           @Override
           public Iterator<String> iterator() {
               return null;
           }

           @Override
           public NavigableSet<String> descendingSet() {
               return null;
           }

           @Override
           public Iterator<String> descendingIterator() {
               return null;
           }

           @Override
           public NavigableSet<String> subSet(String fromElement, boolean fromInclusive, String toElement, boolean toInclusive) {
               return null;
           }

           @Override
           public NavigableSet<String> headSet(String toElement, boolean inclusive) {
               return null;
           }

           @Override
           public NavigableSet<String> tailSet(String fromElement, boolean inclusive) {
               return null;
           }

           @Override
           public SortedSet<String> subSet(String fromElement, String toElement) {
               return null;
           }

           @Override
           public SortedSet<String> headSet(String toElement) {
               return null;
           }

           @Override
           public SortedSet<String> tailSet(String fromElement) {
               return null;
           }

           @Override
           public Comparator<? super String> comparator() {
               return null;
           }

           @Override
           public String first() {
               return null;
           }

           @Override
           public String last() {
               return null;
           }

           @Override
           public int size() {
               return 0;
           }

           @Override
           public boolean isEmpty() {
               return false;
           }

           @Override
           public boolean contains(Object o) {
               return false;
           }

           @Override
           public Object[] toArray() {
               return new Object[0];
           }

           @Override
           public <T> T[] toArray(T[] a) {
               return null;
           }

           @Override
           public boolean add(String s) {
               return false;
           }

           @Override
           public boolean remove(Object o) {
               return false;
           }

           @Override
           public boolean containsAll(Collection<?> c) {
               return false;
           }

           @Override
           public boolean addAll(Collection<? extends String> c) {
               return false;
           }

           @Override
           public boolean retainAll(Collection<?> c) {
               return false;
           }

           @Override
           public boolean removeAll(Collection<?> c) {
               return false;
           }

           @Override
           public void clear() {

           }
       };
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Germany");
        treeSet.add("France");
        treeSet.add("Italy");
        treeSet.add("Spain");
        treeSet.add("Great Britain");
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        SortedSet<String> setNew=treeSet.subSet("Germany","Italy");
        System.out.println(setNew);
        System.out.println(treeSet.higher("Germany"));
        System.out.println(treeSet.lower("Germany"));
        SortedSet<String> navSet=treeSet.descendingSet();
        System.out.println(navSet);
        SortedSet<String> setLower=treeSet.headSet("Germany");
        System.out.println(setLower);
        SortedSet<String> setGreate=treeSet.tailSet("Germany");
        System.out.println(setGreate);
    }
}
