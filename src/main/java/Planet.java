public class Planet {

    private String name;
    private int size;

    public Planet(String _name, int _size){
        this.name = _name;
        this.size = _size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void explode(){
       System.out.println("Boom! " + this.name + " has exploded");
    }
}
