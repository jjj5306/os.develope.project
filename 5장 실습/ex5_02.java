public class ex5_02 {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);

        iptv.printProperty();
    }
}

class TV{
    private int size;
    public TV(int size){
        this.size = size;
    }
    protected int getSize() {
        return size;
    }
}

class IPTV extends TV{
    private String add;
    private int color;

    IPTV(String add,int size,int color){
        super(size);
        this.add = add;
        this.color = color;
    }

    protected void printProperty(){
        System.out.println("나의 IPTV는 " + add + " 주소의 " + getSize() + "인치 " + color + "컬러");
    }
}
