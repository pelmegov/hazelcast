package ru.pelmegov.hazelcast1;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SimpleMapExample {
  
  public static void main(String[] args) {
    HazelcastInstance hz = Hazelcast.newHazelcastInstance();
    
    Map<String, String> capitals = hz.getMap("capitals");
  
    Set<String> cities = hz.getSet("cities");
    cities.addAll(capitals.values());
    cities.add("London");
    cities.add("Rome");
    cities.add("New York");
  
    List<String> countries = hz.getList("countries");
    countries.addAll(capitals.keySet());
    countries.add("CA");
    countries.add("DE");
    countries.add("GB"); // duplicate entry
    
  }
  
}