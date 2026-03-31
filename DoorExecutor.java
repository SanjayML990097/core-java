class DoorExecutor
{
    public static void main(String args[])
    {
        System.out.println("Door Details Fetching...");

        Door d1 = new Door(); Lock l1 = new Lock();
        l1.lockId=1; l1.type="Key"; l1.material="Steel"; l1.isSecure=true; l1.brand="Godrej";
        d1.doorId=1; d1.material="Wood"; d1.color="Brown"; d1.price=5000; d1.lock=l1;

        Door d2 = new Door(); Lock l2 = new Lock();
        l2.lockId=2; l2.type="Digital"; l2.material="Alloy"; l2.isSecure=true; l2.brand="Yale";
        d2.doorId=2; d2.material="Steel"; d2.color="Black"; d2.price=7000; d2.lock=l2;

        Door d3 = new Door(); Lock l3 = new Lock();
        l3.lockId=3; l3.type="Key"; l3.material="Iron"; l3.isSecure=false; l3.brand="Europa";
        d3.doorId=3; d3.material="PVC"; d3.color="White"; d3.price=4000; d3.lock=l3;

        Door d4 = new Door(); Lock l4 = new Lock();
        l4.lockId=4; l4.type="Smart"; l4.material="Steel"; l4.isSecure=true; l4.brand="Samsung";
        d4.doorId=4; d4.material="Wood"; d4.color="Teak"; d4.price=8000; d4.lock=l4;

        Door d5 = new Door(); Lock l5 = new Lock();
        l5.lockId=5; l5.type="Key"; l5.material="Brass"; l5.isSecure=true; l5.brand="Godrej";
        d5.doorId=5; d5.material="Wood"; d5.color="Dark Brown"; d5.price=5500; d5.lock=l5;

        Door d6 = new Door(); Lock l6 = new Lock();
        l6.lockId=6; l6.type="Digital"; l6.material="Alloy"; l6.isSecure=true; l6.brand="Yale";
        d6.doorId=6; d6.material="Steel"; d6.color="Grey"; d6.price=7500; d6.lock=l6;

        Door d7 = new Door(); Lock l7 = new Lock();
        l7.lockId=7; l7.type="Key"; l7.material="Iron"; l7.isSecure=false; l7.brand="Europa";
        d7.doorId=7; d7.material="PVC"; d7.color="Cream"; d7.price=4200; d7.lock=l7;

        Door d8 = new Door(); Lock l8 = new Lock();
        l8.lockId=8; l8.type="Smart"; l8.material="Steel"; l8.isSecure=true; l8.brand="Samsung";
        d8.doorId=8; d8.material="Wood"; d8.color="Walnut"; d8.price=8200; d8.lock=l8;

        Door d9 = new Door(); Lock l9 = new Lock();
        l9.lockId=9; l9.type="Key"; l9.material="Brass"; l9.isSecure=true; l9.brand="Godrej";
        d9.doorId=9; d9.material="Wood"; d9.color="Brown"; d9.price=5600; d9.lock=l9;

        Door d10 = new Door(); Lock l10 = new Lock();
        l10.lockId=10; l10.type="Digital"; l10.material="Alloy"; l10.isSecure=true; l10.brand="Yale";
        d10.doorId=10; d10.material="Steel"; d10.color="Black"; d10.price=7800; d10.lock=l10;

        Door d11 = new Door(); Lock l11 = new Lock();
        l11.lockId=11; l11.type="Key"; l11.material="Iron"; l11.isSecure=false; l11.brand="Europa";
        d11.doorId=11; d11.material="PVC"; d11.color="White"; d11.price=4300; d11.lock=l11;

        Door d12 = new Door(); Lock l12 = new Lock();
        l12.lockId=12; l12.type="Smart"; l12.material="Steel"; l12.isSecure=true; l12.brand="Samsung";
        d12.doorId=12; d12.material="Wood"; d12.color="Teak"; d12.price=8400; d12.lock=l12;

        Door d13 = new Door(); Lock l13 = new Lock();
        l13.lockId=13; l13.type="Key"; l13.material="Brass"; l13.isSecure=true; l13.brand="Godrej";
        d13.doorId=13; d13.material="Wood"; d13.color="Dark Brown"; d13.price=5700; d13.lock=l13;

        Door d14 = new Door(); Lock l14 = new Lock();
        l14.lockId=14; l14.type="Digital"; l14.material="Alloy"; l14.isSecure=true; l14.brand="Yale";
        d14.doorId=14; d14.material="Steel"; d14.color="Grey"; d14.price=7900; d14.lock=l14;

        Door d15 = new Door(); Lock l15 = new Lock();
        l15.lockId=15; l15.type="Key"; l15.material="Iron"; l15.isSecure=false; l15.brand="Europa";
        d15.doorId=15; d15.material="PVC"; d15.color="Cream"; d15.price=4400; d15.lock=l15;

        Door d16 = new Door(); Lock l16 = new Lock();
        l16.lockId=16; l16.type="Smart"; l16.material="Steel"; l16.isSecure=true; l16.brand="Samsung";
        d16.doorId=16; d16.material="Wood"; d16.color="Walnut"; d16.price=8600; d16.lock=l16;

        Door d17 = new Door(); Lock l17 = new Lock();
        l17.lockId=17; l17.type="Key"; l17.material="Brass"; l17.isSecure=true; l17.brand="Godrej";
        d17.doorId=17; d17.material="Wood"; d17.color="Brown"; d17.price=5800; d17.lock=l17;

        Door d18 = new Door(); Lock l18 = new Lock();
        l18.lockId=18; l18.type="Digital"; l18.material="Alloy"; l18.isSecure=true; l18.brand="Yale";
        d18.doorId=18; d18.material="Steel"; d18.color="Black"; d18.price=8000; d18.lock=l18;

        Door d19 = new Door(); Lock l19 = new Lock();
        l19.lockId=19; l19.type="Key"; l19.material="Iron"; l19.isSecure=false; l19.brand="Europa";
        d19.doorId=19; d19.material="PVC"; d19.color="White"; d19.price=4500; d19.lock=l19;

        Door d20 = new Door(); Lock l20 = new Lock();
        l20.lockId=20; l20.type="Smart"; l20.material="Steel"; l20.isSecure=true; l20.brand="Samsung";
        d20.doorId=20; d20.material="Wood"; d20.color="Teak"; d20.price=8800; d20.lock=l20;

        System.out.println(d1.material+" - "+d1.lock.type);
        System.out.println(d2.material+" - "+d2.lock.type);
        System.out.println(d3.material+" - "+d3.lock.type);
        System.out.println(d4.material+" - "+d4.lock.type);
        System.out.println(d5.material+" - "+d5.lock.type);
        System.out.println(d6.material+" - "+d6.lock.type);
        System.out.println(d7.material+" - "+d7.lock.type);
        System.out.println(d8.material+" - "+d8.lock.type);
        System.out.println(d9.material+" - "+d9.lock.type);
        System.out.println(d10.material+" - "+d10.lock.type);
        System.out.println(d11.material+" - "+d11.lock.type);
        System.out.println(d12.material+" - "+d12.lock.type);
        System.out.println(d13.material+" - "+d13.lock.type);
        System.out.println(d14.material+" - "+d14.lock.type);
        System.out.println(d15.material+" - "+d15.lock.type);
        System.out.println(d16.material+" - "+d16.lock.type);
        System.out.println(d17.material+" - "+d17.lock.type);
        System.out.println(d18.material+" - "+d18.lock.type);
        System.out.println(d19.material+" - "+d19.lock.type);
        System.out.println(d20.material+" - "+d20.lock.type);
    }
}