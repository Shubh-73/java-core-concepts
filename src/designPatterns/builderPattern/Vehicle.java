package designPatterns.builderPattern;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private int horsePower;
    private boolean hasSunroof;
    private boolean hasNavigationSystem;
    private int wheels;


    private Vehicle(VehicleBuilder builder) {
        this.type = builder.type;
        this.model = builder.model;
        this.color = builder.color;
        this.horsePower = builder.horsePower;
        this.hasSunroof = builder.hasSunroof;
        this.hasNavigationSystem = builder.hasNavigationSystem;
        this.wheels = builder.wheels;
    }

    private String getType(){
        return this.type;
    }

    private String getModel(){
        return this.model;
    }

    private String getColor(){
        return this.color;
    }

    private int getHorsePower(){
        return this.horsePower;
    }

    private boolean getHasSunroof(){
        return this.hasSunroof;
    }

    private boolean getHasNavigationSystem(){
        return this.hasNavigationSystem;
    }

    private int getWheels(){
        return this.wheels;
    }

    public static class VehicleBuilder {
        private String type;
        private String model;
        private String color;
        private int horsePower;
        private boolean hasSunroof;
        private boolean hasNavigationSystem;
        private int wheels;


        public VehicleBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public VehicleBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public VehicleBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        public VehicleBuilder setHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public VehicleBuilder setHasSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public VehicleBuilder setHasNavigationSystem(boolean hasNavigationSystem) {
            this.hasNavigationSystem = hasNavigationSystem;
            return this;
        }

        public VehicleBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
