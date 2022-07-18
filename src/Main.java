public class Main {
    public static void main(String[] args) {
                Passenger passenger = new Passenger(10,180,1000,"BMW", 4,8,"Sedan", 5);
                System.out.println( passenger.toString());
                passenger.method1(3);
                Cargo cargo = new Cargo (10, 180,2000,"Volvo",4,20,100);
                cargo.cargoPower(100);
                Military military = new Military(50,1500,3000,"IL-76", 50,500,false,4);
                military.shot();
                military.isHasEjectionSystem();
                Civil civil = new Civil(50,1000,5000,"Embraer",100,1000,90, true);
                civil.passenger—apacity(90);
                System.out.println(civil.toString());

            }
        }


