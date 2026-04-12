class DressRunner{
    public static void main(String[] args){

    Dress dress = new Dress();
    dress.dressName = "Kurti";
    dress.price = 1200;

    Cloth cloth = new Cloth();
    dress.cloth = cloth;

    cloth.clothType = "Cotton";
    cloth.color = "Blue";

    dress.getDressDetails();
    }
}