



import java.util.Set;
import java.util.HashSet;

public class SF
{
  public static <T> Set<T> union(Set<T> setA, Set<T> setB)
   {
    Set<T> tmp = new HashSet<T>(setA);
    tmp.addAll(setB);
    return tmp;
   }
  
public static <T> Set<T> intersection(Set<T> setA, Set<T> setB)
  {
    Set<T> tmp = new HashSet<T>();
    for (T x : setA)
     {   
      if (setB.contains(x))
       {
        tmp.add(x);
       }
     }
    return tmp;
  }

public static <T> Set<T> difference(Set<T> setA, Set<T> setB)
  {
    Set<T> tmp = new HashSet<T>(setA);
    tmp.removeAll(setB);
    return tmp;
  }

public static <T> Set<T> symDifference(Set<T> setA, Set<T> setB)
  {
    Set<T> tmp1;
    Set<T> tmp2;
    tmp1 = union(setA, setB);
    tmp2 = intersection(setA, setB);
    return difference(tmp1, tmp2);
  }

public static <T> boolean isSubset(Set<T> setA, Set<T> setB)
  {
    return setB.containsAll(setA);
  }

public static <T> boolean isSuperset(Set<T> setA, Set<T> setB)
  {
    return setA.containsAll(setB);
  }
}
