package shape;

    public  class circle extends Shape{
        public  double radius;
        public  circle(double radius){
            this.radius=radius;
        }
        @Override
    public  double area(){
            return Math.PI*radius*radius;
        }
    }


