public class RistTahukas extends KorgusegaKujund{
  double kulga;
  double kulgb;
  public RistTahukas(double kulga, double kulgb, double korgus){
    super(korgus);
    this.kulga=kulga;
    this.kulgb=kulgb;
  }
  public double pohjaPindala(){
    return kulga*kulgb;
  }

}
