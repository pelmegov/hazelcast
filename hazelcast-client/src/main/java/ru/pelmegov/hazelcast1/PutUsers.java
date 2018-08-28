package ru.pelmegov.hazelcast1;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import ru.pelmegov.User;

import java.util.List;

public class PutUsers {
  
  public static void main(String[] args) {
    HazelcastInstance hz = Hazelcast.newHazelcastInstance();
    List<User> users = hz.getList("users111");
    users.add(new User("anton", 22));
    users.add(new User("vladimir", 41));
    users.add(new User("nikolay", 41));
  }
  
}
