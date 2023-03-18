package Task1_Hause;

public class ApartmentsHouse extends House{
  private int entrances;
  public ApartmentsHouse(String city, String street, int houseNumber, int entrances){
    super(city, street, houseNumber);
    this.entrances = entrances;
  }


}
