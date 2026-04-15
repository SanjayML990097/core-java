class EngineRunner {

    public static void main(String[] args) {

        Engine engines[] = new Engine[15];

        Engine e1 = new Engine();
        e1.engineId = 1001;
        e1.type = "Inline-4";
        e1.horsepower = 150;
        e1.fuelType = "Petrol";
        e1.manufacturer = "Toyota";
        engines[0] = e1;

        Engine e2 = new Engine();
        e2.engineId = 1002;
        e2.type = "V6";
        e2.horsepower = 250;
        e2.fuelType = "Diesel";
        e2.manufacturer = "Ford";
        engines[1] = e2;

        Engine e3 = new Engine();
        e3.engineId = 1003;
        e3.type = "V8";
        e3.horsepower = 400;
        e3.fuelType = "Petrol";
        e3.manufacturer = "BMW";
        engines[2] = e3;

        Engine e4 = new Engine();
        e4.engineId = 1004;
        e4.type = "Electric";
        e4.horsepower = 300;
        e4.fuelType = "Electric";
        e4.manufacturer = "Tesla";
        engines[3] = e4;

        Engine e5 = new Engine();
        e5.engineId = 1005;
        e5.type = "Hybrid";
        e5.horsepower = 200;
        e5.fuelType = "Hybrid";
        e5.manufacturer = "Honda";
        engines[4] = e5;

        Engine e6 = new Engine();
        e6.engineId = 1006;
        e6.type = "Inline-3";
        e6.horsepower = 120;
        e6.fuelType = "Petrol";
        e6.manufacturer = "Hyundai";
        engines[5] = e6;

        Engine e7 = new Engine();
        e7.engineId = 1007;
        e7.type = "V12";
        e7.horsepower = 600;
        e7.fuelType = "Petrol";
        e7.manufacturer = "Ferrari";
        engines[6] = e7;

        Engine e8 = new Engine();
        e8.engineId = 1008;
        e8.type = "Boxer";
        e8.horsepower = 350;
        e8.fuelType = "Petrol";
        e8.manufacturer = "Subaru";
        engines[7] = e8;

        Engine e9 = new Engine();
        e9.engineId = 1009;
        e9.type = "Rotary";
        e9.horsepower = 280;
        e9.fuelType = "Petrol";
        e9.manufacturer = "Mazda";
        engines[8] = e9;

        Engine e10 = new Engine();
        e10.engineId = 1010;
        e10.type = "Inline-6";
        e10.horsepower = 320;
        e10.fuelType = "Diesel";
        e10.manufacturer = "Mercedes";
        engines[9] = e10;

        Engine e11 = new Engine();
        e11.engineId = 1011;
        e11.type = "V6 Turbo";
        e11.horsepower = 370;
        e11.fuelType = "Petrol";
        e11.manufacturer = "Nissan";
        engines[10] = e11;

        Engine e12 = new Engine();
        e12.engineId = 1012;
        e12.type = "Hybrid Turbo";
        e12.horsepower = 220;
        e12.fuelType = "Hybrid";
        e12.manufacturer = "Kia";
        engines[11] = e12;

        Engine e13 = new Engine();
        e13.engineId = 1013;
        e13.type = "Electric Dual Motor";
        e13.horsepower = 450;
        e13.fuelType = "Electric";
        e13.manufacturer = "Tesla";
        engines[12] = e13;

        Engine e14 = new Engine();
        e14.engineId = 1014;
        e14.type = "Inline-4 Turbo";
        e14.horsepower = 180;
        e14.fuelType = "Petrol";
        e14.manufacturer = "Volkswagen";
        engines[13] = e14;

        Engine e15 = new Engine();
        e15.engineId = 1015;
        e15.type = "V8 Supercharged";
        e15.horsepower = 550;
        e15.fuelType = "Petrol";
        e15.manufacturer = "Jaguar";
        engines[14] = e15;

        for (Engine engine : engines) {
            System.out.println(engine.engineId);
            System.out.println(engine.type);
            System.out.println(engine.horsepower);
            System.out.println(engine.fuelType);
            System.out.println(engine.manufacturer);
            System.out.println("----------------------");
        }
    }
}