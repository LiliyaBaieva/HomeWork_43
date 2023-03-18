package Task1_Hause;

public class ApartmentsHouse extends House{
  private int entrances;
  public ApartmentsHouse(String city, String street, int houseNumber, int entrances){
    super(city, street, houseNumber);
    this.entrances = entrances;
  }

  @Override
  public String toString() {
    return String.format("Частны дом в городе %s по улице %s, номер дома - %d, в доме %d подъездов.%n",
        getCity(), getStreet(), getHouseNumber(), entrances);
  }
}
