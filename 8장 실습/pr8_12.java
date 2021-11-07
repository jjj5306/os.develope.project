import java.io.*;
import java.util.*;

public class pr8_12 {
    private static Vector<String> lineVector = new Vector<String>();
    private static File targetFile = null;

    private static Vector<Integer> searchWord(String word) {
        Vector<Integer> noVector = new Vector<Integer>();
        for(int i=0; i<lineVector.size(); i++) {
            String line = lineVector.get(i);
            if(line.indexOf(word) != -1)
                noVector.add(i);
        }
        return noVector;
    }

    public static void main(String[] args) {
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("대상 파일명 입력>> ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        targetFile = new File(fileName);
        try {
            Scanner fScanner = new Scanner(new FileReader(targetFile));
            while(fScanner.hasNext()) {
                String line = fScanner.nextLine();
                lineVector.add(line);
            }
            fScanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(true) {
            System.out.print("검색할 단어나 문장>> ");
            String line = scanner.nextLine();
            if(line.equals("그만"))
                break;
            Vector<Integer> noVector = searchWord(line);

            for(int i=0; i<noVector.size(); i++) {
                int lineNo = noVector.get(i);
                String linet = lineVector.get(lineNo);
                System.out.println(lineNo + ":" + linet);
            }

        }
        scanner.close();
        System.out.println("프로그램을 종료합니다.");
    }
}
