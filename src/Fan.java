public class Fan {
    int[] rangSpeed;
    int speed ;

    boolean on ;
    private double radius;
    private String color ;

//    Fan (){};
    Fan (int[] _rangSpeed, boolean _f, double _radius, String _color ){
        this.rangSpeed= _rangSpeed ;
        this.speed=this.rangSpeed[0];
        this.on =_f;
        this.radius = _radius;
        this.color = _color;
    };

    public void setOn(){
        this.on =!this.on;
    };
    public boolean getOn (){
        return this.on;
    };
    String getColor(){
        return this.color;
    };
    double getRadius(){
        return this.radius;
    }
    public void  setSpeed (int index){
        this.speed = this.rangSpeed[index];
    }
    public int getSpeed(){
        return this.speed;
    }



    public String toString(){
        String print1 ;
        if (getOn()){
            print1 =""+ getSpeed() + getColor() + getRadius() + "Fan is ON";
        } else {
            print1 ="" + getColor() + getRadius() + "Fan is OFF";
        }
        return print1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        Fan fan1=new Fan(arr,true, 10, "Yellow");
        Fan fan2=new Fan(arr,false, 5, "Blue");

//        Fan fan1=new Fan({1,2,3},true, 10, "Yellow");
//        Fan fan2=new Fan({1,2,3},false, 5, "Blue");
//
        fan1.setSpeed(2);
        fan2.setSpeed(1);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }

}
