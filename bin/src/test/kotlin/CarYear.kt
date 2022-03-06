import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.mockito.InjectMocks;

import example.model.Car;
import example.service.*

class CarYear {
  @InjectMocks
  val service = CarServiceImpl();
  
  @Then("Car year should be 0")
  fun checkYear() {
    val car = service.createCar();
     Assert.assertEquals(car.year, 0);
  }
}
