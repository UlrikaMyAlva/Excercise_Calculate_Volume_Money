public class Cashbunt {


    double height;
    double width;
    double length;


    //Method to determine the size of the bunt.
    public double buntSize () {

        return height * width * length;
    }

    //Method to determine the size of the stack of money that is transferred.
    public double totalSize(double buntSize, double amount) {

        return buntSize * amount;
    }


    //I let the getters stay, if someone would modify this code and use it differently.
    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}


    public double getWidth() {return width;}
    public void setWidth(double width) {this.width = width;}


    public double getLength() {return length;}
    public void setLength(double length) {this.length = length;}


}
