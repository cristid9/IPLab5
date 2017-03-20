public class Sala
{
  protected String name;
  protected Integer capacity;
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setCapacity(Integer capacity)
  {
    this.capacity = capacity;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public Integer getCapacity()
  {
    return this.capacity;
  }
  
  public Sala(String name, Integer capacity)
  {
    this.name = name;
    this.capacity = capacity;
  }
}
