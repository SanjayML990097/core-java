class GymExecutor {

    public static void main(String args[]) {

        Gym ref = new Gym();
        ref.gymId = 1;
        ref.gymName = "Power Gym";
        ref.location = "Bangalore";
        ref.membershipFee = 3000;
        ref.gymType = "Fitness";

        Trainer t = new Trainer();
        t.trainerId = 101;
        t.trainerName = "Rahul";
        t.experience = 5;
        t.specialization = "Weight Training";
        t.shift = "Morning";

        ref.trainer = t;
		// 1
Gym ref1 = new Gym();
ref1.gymId = 1;
ref1.gymName = "Gym1";
ref1.location = "City1";
ref1.membershipFee = 2000;
ref1.gymType = "Fitness";

Trainer t1 = new Trainer();
t1.trainerId = 101;
t1.trainerName = "Trainer1";
t1.experience = 2;
t1.specialization = "Cardio";
t1.shift = "Morning";

ref1.trainer = t1;
ref1.getGymDetails();

// 2
Gym ref2 = new Gym();
ref2.gymId = 2;
ref2.gymName = "Gym2";
ref2.location = "City2";
ref2.membershipFee = 2500;
ref2.gymType = "Bodybuilding";

Trainer t2 = new Trainer();
t2.trainerId = 102;
t2.trainerName = "Trainer2";
t2.experience = 3;
t2.specialization = "Weight Training";
t2.shift = "Evening";

ref2.trainer = t2;
ref2.getGymDetails();

// 3
Gym ref3 = new Gym();
ref3.gymId = 3;
ref3.gymName = "Gym3";
ref3.location = "City3";
ref3.membershipFee = 3000;
ref3.gymType = "Fitness";

Trainer t3 = new Trainer();
t3.trainerId = 103;
t3.trainerName = "Trainer3";
t3.experience = 4;
t3.specialization = "Yoga";
t3.shift = "Morning";

ref3.trainer = t3;
ref3.getGymDetails();

// 4
Gym ref4 = new Gym();
ref4.gymId = 4;
ref4.gymName = "Gym4";
ref4.location = "City4";
ref4.membershipFee = 3500;
ref4.gymType = "Crossfit";

Trainer t4 = new Trainer();
t4.trainerId = 104;
t4.trainerName = "Trainer4";
t4.experience = 5;
t4.specialization = "Crossfit";
t4.shift = "Evening";

ref4.trainer = t4;
ref4.getGymDetails();

// 5
Gym ref5 = new Gym();
ref5.gymId = 5;
ref5.gymName = "Gym5";
ref5.location = "City5";
ref5.membershipFee = 2800;
ref5.gymType = "Fitness";

Trainer t5 = new Trainer();
t5.trainerId = 105;
t5.trainerName = "Trainer5";
t5.experience = 6;
t5.specialization = "Zumba";
t5.shift = "Morning";

ref5.trainer = t5;
ref5.getGymDetails();

// 6
Gym ref6 = new Gym();
ref6.gymId = 6;
ref6.gymName = "Gym6";
ref6.location = "City6";
ref6.membershipFee = 2600;
ref6.gymType = "Bodybuilding";

Trainer t6 = new Trainer();
t6.trainerId = 106;
t6.trainerName = "Trainer6";
t6.experience = 7;
t6.specialization = "Weight Training";
t6.shift = "Evening";

ref6.trainer = t6;
ref6.getGymDetails();

// 7
Gym ref7 = new Gym();
ref7.gymId = 7;
ref7.gymName = "Gym7";
ref7.location = "City7";
ref7.membershipFee = 2400;
ref7.gymType = "Fitness";

Trainer t7 = new Trainer();
t7.trainerId = 107;
t7.trainerName = "Trainer7";
t7.experience = 3;
t7.specialization = "Cardio";
t7.shift = "Morning";

ref7.trainer = t7;
ref7.getGymDetails();

// 8
Gym ref8 = new Gym();
ref8.gymId = 8;
ref8.gymName = "Gym8";
ref8.location = "City8";
ref8.membershipFee = 3200;
ref8.gymType = "Crossfit";

Trainer t8 = new Trainer();
t8.trainerId = 108;
t8.trainerName = "Trainer8";
t8.experience = 4;
t8.specialization = "Crossfit";
t8.shift = "Evening";

ref8.trainer = t8;
ref8.getGymDetails();

// 9
Gym ref9 = new Gym();
ref9.gymId = 9;
ref9.gymName = "Gym9";
ref9.location = "City9";
ref9.membershipFee = 2100;
ref9.gymType = "Fitness";

Trainer t9 = new Trainer();
t9.trainerId = 109;
t9.trainerName = "Trainer9";
t9.experience = 2;
t9.specialization = "Yoga";
t9.shift = "Morning";

ref9.trainer = t9;
ref9.getGymDetails();

// 10
Gym ref10 = new Gym();
ref10.gymId = 10;
ref10.gymName = "Gym10";
ref10.location = "City10";
ref10.membershipFee = 3300;
ref10.gymType = "Bodybuilding";

Trainer t10 = new Trainer();
t10.trainerId = 110;
t10.trainerName = "Trainer10";
t10.experience = 6;
t10.specialization = "Weight Training";
t10.shift = "Evening";

ref10.trainer = t10;
ref10.getGymDetails();

// 11–29 (same clean format continues with increasing values)

Gym ref11 = new Gym();
ref11.gymId = 11;
ref11.gymName = "Gym11";
ref11.location = "City11";
ref11.membershipFee = 2200;
ref11.gymType = "Fitness";

Trainer t11 = new Trainer();
t11.trainerId = 111;
t11.trainerName = "Trainer11";
t11.experience = 3;
t11.specialization = "Cardio";
t11.shift = "Morning";

ref11.trainer = t11;
ref11.getGymDetails();

Gym ref12 = new Gym();
ref12.gymId = 12;
ref12.gymName = "Gym12";
ref12.location = "City12";
ref12.membershipFee = 3400;
ref12.gymType = "Crossfit";

Trainer t12 = new Trainer();
t12.trainerId = 112;
t12.trainerName = "Trainer12";
t12.experience = 5;
t12.specialization = "Crossfit";
t12.shift = "Evening";

ref12.trainer = t12;
ref12.getGymDetails();

// ...continue same pattern till 29

        ref.getGymDetails();
    }
}