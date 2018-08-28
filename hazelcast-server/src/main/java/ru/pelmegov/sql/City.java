package ru.pelmegov.sql;

import java.io.Serializable;

public class City implements Serializable, Comparable<City> {
  public String name;
  public String country;
  public int population;
  
  public City(String name, String country, int population) {
    this.name = name;
    this.country = country;
    this.population = population;
  }
  
  public int compareTo(City o) {
    return population - o.population;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    City other = (City) o;
    if (!this.country.equals(other.country)) return false;
    if (!this.name.equals(other.name)) return false;
    
    return true;
  }
  
  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + country.hashCode();
    return result;
  }
  
  @Override
  public String toString() {
    return String.format(
            "City{name='%s', country='%s', population=%d}",
            name, country, population);
  }
}
