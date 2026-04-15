class ProcessorRunner {

    public static void main(String[] args) {

        Processor processors[] = new Processor[15];

        Processor p1 = new Processor();
        p1.processorId = 601;
        p1.brand = "Intel";
        p1.model = "i3";
        p1.cores = 4;
        p1.speed = 3.6;
        processors[0] = p1;

        Processor p2 = new Processor();
        p2.processorId = 602;
        p2.brand = "Intel";
        p2.model = "i5";
        p2.cores = 6;
        p2.speed = 4.1;
        processors[1] = p2;

        Processor p3 = new Processor();
        p3.processorId = 603;
        p3.brand = "Intel";
        p3.model = "i7";
        p3.cores = 8;
        p3.speed = 4.5;
        processors[2] = p3;

        Processor p4 = new Processor();
        p4.processorId = 604;
        p4.brand = "Intel";
        p4.model = "i9";
        p4.cores = 12;
        p4.speed = 5.0;
        processors[3] = p4;

        Processor p5 = new Processor();
        p5.processorId = 605;
        p5.brand = "AMD";
        p5.model = "Ryzen 3";
        p5.cores = 4;
        p5.speed = 3.8;
        processors[4] = p5;

        Processor p6 = new Processor();
        p6.processorId = 606;
        p6.brand = "AMD";
        p6.model = "Ryzen 5";
        p6.cores = 6;
        p6.speed = 4.2;
        processors[5] = p6;

        Processor p7 = new Processor();
        p7.processorId = 607;
        p7.brand = "AMD";
        p7.model = "Ryzen 7";
        p7.cores = 8;
        p7.speed = 4.6;
        processors[6] = p7;

        Processor p8 = new Processor();
        p8.processorId = 608;
        p8.brand = "AMD";
        p8.model = "Ryzen 9";
        p8.cores = 12;
        p8.speed = 4.9;
        processors[7] = p8;

        Processor p9 = new Processor();
        p9.processorId = 609;
        p9.brand = "Apple";
        p9.model = "M1";
        p9.cores = 8;
        p9.speed = 3.2;
        processors[8] = p9;

        Processor p10 = new Processor();
        p10.processorId = 610;
        p10.brand = "Apple";
        p10.model = "M2";
        p10.cores = 10;
        p10.speed = 3.5;
        processors[9] = p10;

        Processor p11 = new Processor();
        p11.processorId = 611;
        p11.brand = "Qualcomm";
        p11.model = "Snapdragon 8 Gen 1";
        p11.cores = 8;
        p11.speed = 3.0;
        processors[10] = p11;

        Processor p12 = new Processor();
        p12.processorId = 612;
        p12.brand = "Qualcomm";
        p12.model = "Snapdragon 8 Gen 2";
        p12.cores = 8;
        p12.speed = 3.2;
        processors[11] = p12;

        Processor p13 = new Processor();
        p13.processorId = 613;
        p13.brand = "MediaTek";
        p13.model = "Dimensity 9000";
        p13.cores = 8;
        p13.speed = 3.05;
        processors[12] = p13;

        Processor p14 = new Processor();
        p14.processorId = 614;
        p14.brand = "MediaTek";
        p14.model = "Dimensity 9200";
        p14.cores = 8;
        p14.speed = 3.2;
        processors[13] = p14;

        Processor p15 = new Processor();
        p15.processorId = 615;
        p15.brand = "Intel";
        p15.model = "Xeon";
        p15.cores = 16;
        p15.speed = 4.0;
        processors[14] = p15;

     
        for (Processor processor : processors) {
            System.out.println(processor.processorId);
            System.out.println(processor.brand);
            System.out.println(processor.model);
            System.out.println(processor.cores);
            System.out.println(processor.speed);
            System.out.println("----------------------");
        }
    }
}