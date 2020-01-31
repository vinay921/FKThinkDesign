class Bicycle
{
    String size;
    Parts2 parts;

    void spares() {
        if (parts.spares() == true) {
            System.out.println("need of spare object ");
        } else
            System.out.println("no need of spare object ");


    }
}
class Parts{
    Part part;

    boolean spares() {

        return part.need_spare;
    }
}
class Part{

    String name;
    String description;
    Boolean need_spare = true;

}

