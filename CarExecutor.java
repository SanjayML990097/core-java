class CarExecutor {

    public static void main(String[] args) {

        Car cars[] = new Car[15];

        Car c1 = new Car();
        c1.carId = 1301;
        c1.brand = "Toyota";
        c1.model = "Innova";
        c1.price = 1800000;
        c1.color = "White";
        cars[0] = c1;

        Car c2 = new Car();
        c2.carId = 1302;
        c2.brand = "Honda";
        c2.model = "City";
        c2.price = 1500000;
        c2.color = "Black";
        cars[1] = c2;

        Car c3 = new Car();
        c3.carId = 1303;
        c3.brand = "Hyundai";
        c3.model = "Creta";
        c3.price = 1700000;
        c3.color = "Grey";
        cars[2] = c3;

        Car c4 = new Car();
        c4.carId = 1304;
        c4.brand = "Maruti";
        c4.model = "Swift";
        c4.price = 800000;
        c4.color = "Red";
        cars[3] = c4;

        Car c5 = new Car();
        c5.carId = 1305;
        c5.brand = "Kia";
        c5.model = "Seltos";
        c5.price = 1600000;
        c5.color = "Blue";
        cars[4] = c5;

        Car c6 = new Car();
        c6.carId = 1306;
        c6.brand = "Tata";
        c6.model = "Nexon";
        c6.price = 1400000;
        c6.color = "White";
        cars[5] = c6;

        Car c7 = new Car();
        c7.carId = 1307;
        c7.brand = "Mahindra";
        c7.model = "XUV700";
        c7.price = 2000000;
        c7.color = "Black";
        cars[6] = c7;

        Car c8 = new Car();
        c8.carId = 1308;
        c8.brand = "Ford";
        c8.model = "EcoSport";
        c8.price = 1200000;
        c8.color = "Silver";
        cars[7] = c8;

        Car c9 = new Car();
        c9.carId = 1309;
        c9.brand = "Volkswagen";
        c9.model = "Polo";
        c9.price = 900000;
        c9.color = "Blue";
        cars[8] = c9;

        Car c10 = new Car();
        c10.carId = 1310;
        c10.brand = "Skoda";
        c10.model = "Octavia";
        c10.price = 2500000;
        c10.color = "White";
        cars[9] = c10;

        Car c11 = new Car();
        c11.carId = 1311;
        c11.brand = "BMW";
        c11.model = "X1";
        c11.price = 4500000;
        c11.color = "Black";
        cars[10] = c11;

        Car c12 = new Car();
        c12.carId = 1312;
        c12.brand = "Audi";
        c12.model = "A4";
        c12.price = 5000000;
        c12.color = "Grey";
        cars[11] = c12;

        Car c13 = new Car();
        c13.carId = 1313;
        c13.brand = "Mercedes";
        c13.model = "C-Class";
        c13.price = 5500000;
        c13.color = "White";
        cars[12] = c13;

        Car c14 = new Car();
        c14.carId = 1314;
        c14.brand = "Tesla";
        c14.model = "Model 3";
        c14.price = 6000000;
        c14.color = "Red";
        cars[13] = c14;

        Car c15 = new Car();
        c15.carId = 1315;
        c15.brand = "Renault";
        c15.model = "Kwid";
        c15.price = 600000;
        c15.color = "Yellow";
        cars[14] = c15;

        for (Car car : cars) {
            System.out.println(car.carId);
            System.out.println(car.brand);
            System.out.println(car.model);
            System.out.println(car.price);
            System.out.println(car.color);
            System.out.println("----------------------");
        }
    }
}