
package Builder;

public abstract class CarBuilder {
    protected Car car;

    //OBTENER PRODUCTO LUEGO DE QUE ESTE HAYA SIDO CREADO
    //METODOS CONCRETOS
    public Car getCar() {
        return car;
    }
    
    // INSTANCIAR CAR
    public void CreateNewCar(){
        car = new Car();
    }

    // SE ENCARGAN DE ASIGNAR VALORES PREDETERMINADOS, PERO NO LOS DEFINE, 
    // SOLAMENTE DECLARA EL PROTOTIPO DE ESTOS METODOS , NO  LES DA UN CUERPO PORQUE ESTE ES EL CONSTRUCTOR ABSTRACTO,
    // LOS QUE SE ENCARGAN DE IMPLEMENTAR ESTOS METODOS SON LOS CONCRETE BUILDER, QUE HEREDAN DE ESTA CLASE BUILDER.
    public abstract void buildmodelo();
    public abstract void buildtipo();
    public abstract void buildcolor();
    
}
