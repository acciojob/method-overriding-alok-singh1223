public class B extends A{

    public String meth(){
        return("Method is overridden in Extendend class B");
    }
    public void fun(){
       // super.getX();
        System.out.println(super.meth());
    }
}
