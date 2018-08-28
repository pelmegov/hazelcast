package ru.pelmegov.hazelcast1;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import ru.pelmegov.User;

import java.util.List;

public class ReadUsers {
  
  public static void main(String[] args) {
    HazelcastInstance hz = Hazelcast.newHazelcastInstance();
    
    List<User> users = hz.getList("users111");
    
    for (final User user : users) {
      System.out.println(String.format("It is - %s, %s", user.getName(), user.getAge()));
    }
  }
  
}
