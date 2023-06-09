public class PrivateHouse extends House{
  public PrivateHouse (String city, String street, int houseNumber){
    super(city, street,houseNumber);

  }

  @Override
  public String toString() {
    return String.format("Частный дом в городе %s по улице %s, номер дома - %d%n",
        getCity(), getStreet(), getHouseNumber());
  }

  @Override
  public String destroyHouse() {
    return String.format("Вы снесли частный дом");
  }
}
