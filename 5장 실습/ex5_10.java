public class ex5_10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}

abstract class PairMap{
    protected String keyArray []; //key저장 배열
    protected String valueArray []; //value저장 배열

    abstract String get(String key);
    //key값을 가진 value 리턴, 없다면 null 리턴
    abstract void put(String key, String value);
    //key, value 쌍으로 push, 기존애 존재하던 key라면 value 수정
    abstract String delete(String key);
    //key, value 쌍으로 pop, 삭제된 값 리턴
    abstract int length();
}

class Dictionary extends PairMap{
    Dictionary(int x){
        super();
        keyArray = new String[x];
        valueArray = new String[x];
    }
    private int count;
    public String get(String key){
        for(int i=0; i < count; i++)
            if(key.equals(keyArray[i])) {
                return valueArray[i];
            }

        return "null";
    }

    protected int get2(String key){
        for(int i=0; i < count; i++){
            if(key.equals(keyArray[i])) {
               return i;
            }
        }
        return -1;
    }

    public void put(String key, String value){
        int index = get2(key);
        if(index == -1){
            keyArray[count] = key;
            valueArray[count] = value;
            count++;
        }
        else{
            valueArray[index] = value;
        }
    }

    public String delete(String key){
        int index = get2(key);
        if(index == -1)
            return null;
        else{
            String temp = valueArray[index];
            valueArray[index] = "null";
            count--;
            return temp;
        }
    }

    public int length(){
        return count;
    }
}
