package Builder;

//CLASE DIRECTOR
public class Factory {

    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder CB) {
        carBuilder = CB;
    }

    public Car getCar() {
        return carBuilder.getCar();
    }

    public void BuilderCar() {
        carBuilder.CreateNewCar();
        carBuilder.buildmodelo();
        carBuilder.buildtipo();
        carBuilder.buildcolor();
    }

    

}
