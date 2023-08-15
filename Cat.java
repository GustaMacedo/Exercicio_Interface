public class Cat extends Animal implements Pet {
    public String Name;

    public String getName(){
           
        return Name;
    }

    public void setName(String Name){
             this.Name=Name;
    }

    public   Cat(String Name){
        super(4);
        this.Name=Name;
}
   public Cat(){
    this("");
   }
     

  public void eat(){}

  public void play(){}

}
